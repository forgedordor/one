package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbzq {
    public final int c;
    public final ReentrantReadWriteLock d;
    public volatile int e;
    public volatile Future f;
    public long g;
    public final Map h;
    public dbzj i;
    public final LinkedHashSet j;
    public final dcmy l;
    private final String m;
    private final dbyl n;
    private ScheduledExecutorService o;
    private volatile dbzm p;
    public static final dbzh k = new dbzh();
    static final dbzj a = new dbzj();
    public static final dbzj b = new dbzj();

    public dbzq(dbyl dbylVar, String str, int i) {
        this(dbylVar, str, i, dcmy.a);
    }

    public static long a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final dbze b(String str, ejxr ejxrVar) {
        this.d.writeLock().lock();
        try {
            dbze dbzeVar = (dbze) ejxrVar.get();
            this.h.put(str, dbzeVar);
            return dbzeVar;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final dbzi c(final String str) {
        ReentrantReadWriteLock.WriteLock writeLock;
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Object obj = (dbze) this.h.get(str);
            if (obj == null) {
                obj = (dbzi) b(str, new ejxr() { // from class: dbyz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return new dbzi(this.a, str);
                    }
                });
                writeLock = this.d.writeLock();
            } else {
                writeLock = reentrantReadWriteLock.writeLock();
            }
            writeLock.unlock();
            return (dbzi) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final dbzl d(final String str) {
        ReentrantReadWriteLock.WriteLock writeLock;
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Object obj = (dbze) this.h.get(str);
            if (obj == null) {
                obj = (dbzl) b(str, new ejxr() { // from class: dbzb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return new dbzl(this.a, str);
                    }
                });
                writeLock = this.d.writeLock();
            } else {
                writeLock = reentrantReadWriteLock.writeLock();
            }
            writeLock.unlock();
            return (dbzl) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final dbzn e(final String str) {
        dbzf dbzfVar;
        final dbzh dbzhVar = k;
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            dbze dbzeVar = (dbze) this.h.get(str);
            if (dbzeVar == null) {
                dbzfVar = (dbzn) b(str, new ejxr() { // from class: dbza
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return new dbzn(this.a, str, dbzhVar);
                    }
                });
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                try {
                    dbzf dbzfVar2 = (dbzf) dbzeVar;
                    if (!dbzhVar.equals(dbzfVar2.f)) {
                        throw new IllegalArgumentException(a.v(str, "alias mismatch: "));
                    }
                    this.d.writeLock().unlock();
                    dbzfVar = dbzfVar2;
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(a.v(str, "another type of counter exists with name: "), e);
                }
            }
            return (dbzn) dbzfVar;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final defn f() throws NoSuchAlgorithmException {
        this.d.writeLock().lock();
        try {
            dbzq dbzqVar = new dbzq(this);
            this.d.writeLock().unlock();
            LinkedHashSet linkedHashSet = dbzqVar.j;
            int size = linkedHashSet.size();
            dbyk[] dbykVarArr = new dbyk[size];
            Iterator it = linkedHashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                dbzj dbzjVar = (dbzj) it.next();
                dbyl dbylVar = dbzqVar.n;
                dclh.m(dbzjVar);
                Map map = dbzqVar.h;
                ArrayList arrayList = new ArrayList(map.size());
                for (dbze dbzeVar : map.values()) {
                    if (dbzeVar.c.containsKey(dbzjVar)) {
                        arrayList.add(dbzeVar);
                    }
                }
                eyet eyetVar = (eyet) eyeu.a.createBuilder();
                long j = dbzqVar.g;
                eyetVar.copyOnWrite();
                eyeu eyeuVar = (eyeu) eyetVar.instance;
                eyeuVar.b |= 1;
                eyeuVar.c = j;
                dclh.h(!b.equals(dbzjVar));
                if (!a.equals(dbzjVar)) {
                    evuh evuhVar = dbzjVar.a;
                    dclh.m(evuhVar);
                    evqs byteString = evuhVar.toByteString();
                    eyetVar.copyOnWrite();
                    eyeu eyeuVar2 = (eyeu) eyetVar.instance;
                    byteString.getClass();
                    eyeuVar2.b |= 4;
                    eyeuVar2.e = byteString;
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    dbze dbzeVar2 = (dbze) arrayList.get(i2);
                    ctz ctzVar = (ctz) dbzeVar2.c.get(dbzjVar);
                    dclh.m(ctzVar);
                    eyer eyerVar = (eyer) eyes.a.createBuilder();
                    long jA = a(dbzeVar2.a);
                    eyerVar.copyOnWrite();
                    eyes eyesVar = (eyes) eyerVar.instance;
                    Iterator it2 = it;
                    eyesVar.b = 1;
                    eyesVar.c = Long.valueOf(jA);
                    ArrayList arrayList2 = new ArrayList(ctzVar.b());
                    dbyk[] dbykVarArr2 = dbykVarArr;
                    int i3 = 0;
                    while (i3 < ctzVar.b()) {
                        eyep eyepVar = (eyep) eyeq.a.createBuilder();
                        int i4 = i;
                        dbzj dbzjVar2 = dbzjVar;
                        long j2 = ((long[]) ctzVar.e(i3))[0];
                        eyepVar.copyOnWrite();
                        ArrayList arrayList3 = arrayList;
                        eyeq eyeqVar = (eyeq) eyepVar.instance;
                        int i5 = size2;
                        eyeqVar.b |= 2;
                        eyeqVar.d = j2;
                        long jC = ctzVar.c(i3);
                        if (dbzeVar2 instanceof dbzi) {
                            dclh.h(jC == 0);
                        } else {
                            eyepVar.copyOnWrite();
                            eyeq eyeqVar2 = (eyeq) eyepVar.instance;
                            eyeqVar2.b |= 1;
                            eyeqVar2.c = jC;
                        }
                        arrayList2.add((eyeq) eyepVar.build());
                        i3++;
                        arrayList = arrayList3;
                        i = i4;
                        dbzjVar = dbzjVar2;
                        size2 = i5;
                    }
                    int i6 = i;
                    dbzj dbzjVar3 = dbzjVar;
                    ArrayList arrayList4 = arrayList;
                    int i7 = size2;
                    Collections.sort(arrayList2, new Comparator() { // from class: dbzk
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return Long.compare(((eyeq) obj).c, ((eyeq) obj2).c);
                        }
                    });
                    eyerVar.copyOnWrite();
                    eyes eyesVar2 = (eyes) eyerVar.instance;
                    evtg evtgVar = eyesVar2.d;
                    if (!evtgVar.c()) {
                        eyesVar2.d = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(arrayList2, eyesVar2.d);
                    eyes eyesVar3 = (eyes) eyerVar.build();
                    eyetVar.copyOnWrite();
                    eyeu eyeuVar3 = (eyeu) eyetVar.instance;
                    eyesVar3.getClass();
                    evtg evtgVar2 = eyeuVar3.d;
                    if (!evtgVar2.c()) {
                        eyeuVar3.d = evsn.mutableCopy(evtgVar2);
                    }
                    eyeuVar3.d.add(eyesVar3);
                    i2++;
                    dbykVarArr = dbykVarArr2;
                    arrayList = arrayList4;
                    it = it2;
                    i = i6;
                    dbzjVar = dbzjVar3;
                    size2 = i7;
                }
                int i8 = i;
                i = i8 + 1;
                dbykVarArr[i8] = dbylVar.j((eyeu) eyetVar.build());
                it = it;
            }
            dbyk[] dbykVarArr3 = dbykVarArr;
            defn defnVarC = null;
            for (int i9 = 0; i9 < size; i9++) {
                dbyk dbykVar = dbykVarArr3[i9];
                dbykVar.k = dbzqVar.m;
                defnVarC = dbykVar.c();
            }
            return defnVarC != null ? defnVarC : degc.c(null);
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final void g() {
        this.d.writeLock().lock();
        try {
            Future future = this.f;
            if (future != null) {
                future.cancel(false);
            }
            this.f = this.o.schedule(new Runnable() { // from class: dbyy
                @Override // java.lang.Runnable
                public final void run() throws NoSuchAlgorithmException {
                    dbzq dbzqVar = this.a;
                    dbzqVar.d.writeLock().lock();
                    try {
                        dbzqVar.f = null;
                        dbzqVar.d.writeLock().unlock();
                        dbzqVar.f();
                    } catch (Throwable th) {
                        dbzqVar.d.writeLock().unlock();
                        throw th;
                    }
                }
            }, this.e, TimeUnit.MILLISECONDS);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void h(ScheduledExecutorService scheduledExecutorService, int i) {
        this.d.writeLock().lock();
        try {
            this.o = scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.e = i;
                g();
            } else {
                this.e = 0;
            }
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void i(evuh evuhVar) {
        this.d.writeLock().lock();
        try {
            this.i = dbzj.a(evuhVar);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.d.readLock().lock();
        try {
            sb.append("{");
            new ejwc(", ").i(sb, this.j);
            sb.append("}\n");
            new ejwc("\n").i(sb, this.h.values());
            this.d.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public dbzq(dbyl dbylVar, String str, int i, dcmy dcmyVar) {
        this.d = new ReentrantReadWriteLock();
        this.h = new TreeMap();
        this.i = a;
        this.j = new LinkedHashSet();
        this.p = null;
        this.n = dbylVar;
        this.m = str;
        dclh.a(true);
        this.c = i;
        this.l = dcmyVar;
        this.g = SystemClock.elapsedRealtime();
    }

    private dbzq(dbzq dbzqVar) {
        dbze dbzgVar;
        this(dbzqVar.n, dbzqVar.m, dbzqVar.c, dbzqVar.l);
        ReentrantReadWriteLock.WriteLock writeLock = dbzqVar.d.writeLock();
        writeLock.lock();
        try {
            this.i = dbzqVar.i;
            this.g = dbzqVar.g;
            for (Map.Entry entry : dbzqVar.h.entrySet()) {
                Map map = this.h;
                String str = (String) entry.getKey();
                dbze dbzeVar = (dbze) entry.getValue();
                if (dbzeVar instanceof dbzi) {
                    dbzgVar = new dbzi(this, (dbzi) dbzeVar);
                } else if (dbzeVar instanceof dbzp) {
                    dbzgVar = new dbzp(this, (dbzp) dbzeVar);
                } else if (dbzeVar instanceof dbzl) {
                    dbzgVar = new dbzl(this, (dbzl) dbzeVar);
                } else if (dbzeVar instanceof dbzn) {
                    dbzgVar = new dbzn(this, (dbzn) dbzeVar);
                } else if (dbzeVar instanceof dbzg) {
                    dbzgVar = new dbzg(this, (dbzg) dbzeVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(dbzeVar))));
                }
                map.put(str, dbzgVar);
            }
            this.j.addAll(dbzqVar.j);
            dbzqVar.j.clear();
            dbzqVar.g = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}

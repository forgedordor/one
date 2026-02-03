package defpackage;

import android.util.Log;
import java.util.LinkedHashSet;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbze {
    public final String a;
    public final Object b;
    cvw c;
    public int d;
    final /* synthetic */ dbzq e;

    protected dbze(dbzq dbzqVar, dbze dbzeVar) {
        this(dbzqVar, dbzeVar.a);
        synchronized (dbzeVar.b) {
            this.d = dbzeVar.d;
            cvw cvwVar = this.c;
            this.c = dbzeVar.c;
            dbzeVar.c = cvwVar;
            dbzeVar.d = 0;
        }
    }

    public final void a(final long j, final long j2, dbzj dbzjVar) {
        if (dbzjVar == null) {
            dbzjVar = dbzq.a;
        }
        ejvr ejvrVar = new ejvr() { // from class: dbzd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                long j3 = j;
                dbzj dbzjVar2 = (dbzj) obj;
                dbze dbzeVar = this.a;
                synchronized (dbzeVar.b) {
                    ctz ctzVar = (ctz) dbzeVar.c.get(dbzjVar2);
                    if (ctzVar == null) {
                        ctzVar = new ctz();
                        dbzeVar.c.put(dbzjVar2, ctzVar);
                    }
                    int i = dbzeVar.d;
                    int i2 = dbzeVar.e.c;
                    if (i >= i2) {
                        if (i == i2 && Log.isLoggable("Counters", 3)) {
                            Log.d("Counters", "exceeded sample count in " + dbzeVar.a);
                        }
                        return false;
                    }
                    dbzeVar.d = i + 1;
                    long[] jArr = (long[]) ctzVar.d(j3);
                    long j4 = j2;
                    if (jArr == null) {
                        ctzVar.h(j3, new long[]{j4});
                    } else {
                        jArr[0] = jArr[0] + j4;
                    }
                    return false;
                }
            }
        };
        dclh.m(dbzjVar);
        if (dbzq.b.equals(dbzjVar)) {
            dbzjVar = this.e.i;
        }
        dbzq dbzqVar = this.e;
        ReentrantReadWriteLock reentrantReadWriteLock = dbzqVar.d;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            LinkedHashSet linkedHashSet = dbzqVar.j;
            if (!linkedHashSet.contains(dbzjVar)) {
                lock.unlock();
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                lock.lock();
                try {
                    linkedHashSet.add(dbzjVar);
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            ((Boolean) ejvrVar.apply(dbzjVar)).booleanValue();
            Future future = this.e.f;
            lock.unlock();
            dbzq dbzqVar2 = this.e;
            if (dbzqVar2.e <= 0 || future != null) {
                return;
            }
            dbzqVar2.g();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            int i = 0;
            while (true) {
                cvw cvwVar = this.c;
                if (i < cvwVar.d) {
                    ctz ctzVar = (ctz) cvwVar.g(i);
                    sb.append(this.c.d(i));
                    sb.append(" -> [");
                    for (int i2 = 0; i2 < ctzVar.b(); i2++) {
                        sb.append(ctzVar.c(i2));
                        sb.append(" = ");
                        sb.append(((long[]) ctzVar.e(i2))[0]);
                        sb.append(", ");
                    }
                    sb.append("], ");
                    i++;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected dbze(dbzq dbzqVar, String str) {
        this.e = dbzqVar;
        this.b = new Object();
        this.c = new cvw();
        dclh.j(!dbzqVar.h.containsKey(str), "counter/histogram already exists: %s", str);
        this.a = str;
    }
}

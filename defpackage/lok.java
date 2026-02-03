package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lok {
    private static final Object k = new Object();
    private static volatile lok l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final lod e;
    final loi f;
    public final boolean g;
    final boolean h;
    final int[] i;
    public final lof j;

    private lok(loe loeVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.g = loeVar.b;
        this.h = loeVar.c;
        this.i = loeVar.d;
        this.f = loeVar.a;
        this.j = loeVar.f;
        this.d = new Handler(Looper.getMainLooper());
        css cssVar = new css();
        this.b = cssVar;
        Set set = loeVar.e;
        if (set != null && !set.isEmpty()) {
            cssVar.addAll(set);
        }
        lod lodVar = new lod(this);
        this.e = lodVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() == 0) {
                try {
                    lodVar.c.f.a(new loc(lodVar));
                } catch (Throwable th) {
                    lodVar.c.e(th);
                }
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public static lok b() {
        lok lokVar;
        synchronized (k) {
            lcg.d(l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            lokVar = l;
        }
        return lokVar;
    }

    public static void h(loe loeVar) {
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    l = new lok(loeVar);
                }
            }
        }
    }

    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        return i(charSequence, charSequence == null ? 0 : charSequence.length());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00f8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:31:0x0075, B:34:0x007a, B:36:0x007e, B:38:0x008d, B:41:0x0098, B:43:0x00a2, B:47:0x00a8, B:49:0x00b4, B:50:0x00b7, B:52:0x00c6, B:58:0x00d5, B:59:0x00e3, B:63:0x00fc, B:68:0x0108, B:71:0x0114, B:72:0x0119, B:73:0x0123, B:75:0x012a, B:76:0x012f, B:78:0x013b, B:80:0x0141, B:84:0x014b, B:87:0x0157, B:88:0x015d, B:39:0x0093), top: B:104:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence d(java.lang.CharSequence r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lok.d(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            Set set = this.b;
            arrayList.addAll(set);
            set.clear();
            this.a.writeLock().unlock();
            this.d.post(new loh(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(log logVar) {
        lcg.j(logVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            int i = this.c;
            if (i == 1 || i == 2) {
                Handler handler = this.d;
                lcg.j(logVar, "initCallback cannot be null");
                handler.post(new loh(Arrays.asList(logVar), i, null));
            } else {
                this.b.add(logVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final boolean g() {
        return a() == 1;
    }

    public final CharSequence i(CharSequence charSequence, int i) {
        return d(charSequence, 0, i, Alert.DURATION_SHOW_INDEFINITELY, 0);
    }
}

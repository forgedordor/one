package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbw implements bkw, baa {
    public final Object a;
    public final bhr b;
    public int c;
    public boolean d;
    bkv e;
    public final LongSparseArray f;
    private final bkv g;
    private final bkw h;
    private Executor i;
    private final LongSparseArray j;
    private int k;
    private final List l;
    private final List m;

    public bbw(int i, int i2, int i3, int i4) {
        aym aymVar = new aym(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new bbv(this);
        this.c = 0;
        this.g = new bkv() { // from class: bbt
            @Override // defpackage.bkv
            public final void a(bkw bkwVar) {
                bbw bbwVar = this.a;
                synchronized (bbwVar.a) {
                    bbwVar.c++;
                }
                bbwVar.l(bkwVar);
            }
        };
        this.d = false;
        this.f = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.h = aymVar;
        this.k = 0;
        this.l = new ArrayList(c());
    }

    @Override // defpackage.bkw
    public final int a() {
        int iA;
        synchronized (this.a) {
            iA = this.h.a();
        }
        return iA;
    }

    @Override // defpackage.bkw
    public final int b() {
        int iB;
        synchronized (this.a) {
            iB = this.h.b();
        }
        return iB;
    }

    @Override // defpackage.bkw
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.h.c();
        }
        return iC;
    }

    @Override // defpackage.bkw
    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.h.d();
        }
        return iD;
    }

    @Override // defpackage.bkw
    public final Surface e() {
        Surface surfaceE;
        synchronized (this.a) {
            surfaceE = this.h.e();
        }
        return surfaceE;
    }

    @Override // defpackage.bkw
    public final bbm f() {
        synchronized (this.a) {
            List list = this.l;
            if (list.isEmpty()) {
                return null;
            }
            if (this.k >= list.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size() - 1; i++) {
                if (!this.m.contains(list.get(i))) {
                    arrayList.add((bbm) list.get(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bbm) it.next()).close();
            }
            int size = list.size();
            this.k = size;
            bbm bbmVar = (bbm) list.get(size - 1);
            this.m.add(bbmVar);
            return bbmVar;
        }
    }

    @Override // defpackage.bkw
    public final bbm g() {
        synchronized (this.a) {
            List list = this.l;
            if (list.isEmpty()) {
                return null;
            }
            if (this.k >= list.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            int i = this.k;
            this.k = i + 1;
            bbm bbmVar = (bbm) list.get(i);
            this.m.add(bbmVar);
            return bbmVar;
        }
    }

    @Override // defpackage.bkw
    public final void h() {
        synchronized (this.a) {
            this.h.h();
            this.e = null;
            this.i = null;
            this.c = 0;
        }
    }

    @Override // defpackage.bkw
    public final void i() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            List list = this.l;
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                ((bbm) it.next()).close();
            }
            list.clear();
            this.h.i();
            this.d = true;
        }
    }

    @Override // defpackage.bkw
    public final void j(bkv bkvVar, Executor executor) {
        synchronized (this.a) {
            this.e = bkvVar;
            lcg.i(executor);
            this.i = executor;
            this.h.j(this.g, executor);
        }
    }

    @Override // defpackage.baa
    public final void k(bbm bbmVar) {
        Object obj = this.a;
        synchronized (obj) {
            synchronized (obj) {
                List list = this.l;
                int iIndexOf = list.indexOf(bbmVar);
                if (iIndexOf >= 0) {
                    list.remove(iIndexOf);
                    int i = this.k;
                    if (iIndexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(bbmVar);
                if (this.c > 0) {
                    l(this.h);
                }
            }
        }
    }

    final void l(bkw bkwVar) {
        bbm bbmVarG;
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            int size = this.j.size() + this.l.size();
            if (size >= bkwVar.c()) {
                bbs.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    bbmVarG = bkwVar.g();
                    if (bbmVarG != null) {
                        this.c--;
                        this.j.put(bbmVarG.e().a(), bbmVarG);
                        m();
                        size++;
                    }
                } catch (IllegalStateException e) {
                    bbs.b("MetadataImageReader", "Failed to acquire next image.", e);
                    bbmVarG = null;
                }
                if (bbmVarG == null || this.c <= 0) {
                    break;
                }
            } while (size < bkwVar.c());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r5 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r3.execute(new defpackage.bbu(r10, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r5.a(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.a
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r10.f     // Catch: java.lang.Throwable -> Ld8
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Ld8
        L9:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L65
            java.lang.Object r3 = r1.valueAt(r2)     // Catch: java.lang.Throwable -> Ld8
            bbh r3 = (defpackage.bbh) r3     // Catch: java.lang.Throwable -> Ld8
            long r4 = r3.a()     // Catch: java.lang.Throwable -> Ld8
            android.util.LongSparseArray r6 = r10.j     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r7 = r6.get(r4)     // Catch: java.lang.Throwable -> Ld8
            bbm r7 = (defpackage.bbm) r7     // Catch: java.lang.Throwable -> Ld8
            if (r7 == 0) goto L9
            r6.remove(r4)     // Catch: java.lang.Throwable -> Ld8
            r1.removeAt(r2)     // Catch: java.lang.Throwable -> Ld8
            bcq r4 = new bcq     // Catch: java.lang.Throwable -> Ld8
            r5 = 0
            r4.<init>(r7, r5, r3)     // Catch: java.lang.Throwable -> Ld8
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Ld8
            java.util.List r3 = r10.l     // Catch: java.lang.Throwable -> L62
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L62
            int r7 = r10.c()     // Catch: java.lang.Throwable -> L62
            if (r6 >= r7) goto L45
            r4.g(r10)     // Catch: java.lang.Throwable -> L62
            r3.add(r4)     // Catch: java.lang.Throwable -> L62
            bkv r5 = r10.e     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.Executor r3 = r10.i     // Catch: java.lang.Throwable -> L62
            goto L50
        L45:
            java.lang.String r3 = "TAG"
            java.lang.String r6 = "Maximum image number reached."
            defpackage.bbs.a(r3, r6)     // Catch: java.lang.Throwable -> L62
            r4.close()     // Catch: java.lang.Throwable -> L62
            r3 = r5
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L9
            if (r3 == 0) goto L5e
            bbu r4 = new bbu     // Catch: java.lang.Throwable -> Ld8
            r4.<init>()     // Catch: java.lang.Throwable -> Ld8
            r3.execute(r4)     // Catch: java.lang.Throwable -> Ld8
            goto L9
        L5e:
            r5.a(r10)     // Catch: java.lang.Throwable -> Ld8
            goto L9
        L62:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r1     // Catch: java.lang.Throwable -> Ld8
        L65:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Ld8
            android.util.LongSparseArray r2 = r10.j     // Catch: java.lang.Throwable -> Ld5
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Ld5
            if (r3 == 0) goto Ld2
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Ld5
            if (r3 != 0) goto L75
            goto Ld2
        L75:
            r3 = 0
            long r4 = r2.keyAt(r3)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Ld5
            long r7 = r1.keyAt(r3)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Ld5
            boolean r9 = r3.equals(r6)     // Catch: java.lang.Throwable -> Ld5
            r9 = r9 ^ 1
            defpackage.lcg.a(r9)     // Catch: java.lang.Throwable -> Ld5
            r3.getClass()     // Catch: java.lang.Throwable -> Ld5
            r6.getClass()     // Catch: java.lang.Throwable -> Ld5
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto Lb9
            int r1 = r2.size()     // Catch: java.lang.Throwable -> Ld5
        L9d:
            int r1 = r1 + (-1)
            if (r1 < 0) goto Ld0
            long r4 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> Ld5
            r3.getClass()     // Catch: java.lang.Throwable -> Ld5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto Lb8
            java.lang.Object r4 = r2.valueAt(r1)     // Catch: java.lang.Throwable -> Ld5
            bbm r4 = (defpackage.bbm) r4     // Catch: java.lang.Throwable -> Ld5
            r4.close()     // Catch: java.lang.Throwable -> Ld5
            r2.removeAt(r1)     // Catch: java.lang.Throwable -> Ld5
        Lb8:
            goto L9d
        Lb9:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Ld5
        Lbd:
            int r2 = r2 + (-1)
            if (r2 < 0) goto Ld0
            long r7 = r1.keyAt(r2)     // Catch: java.lang.Throwable -> Ld5
            r6.getClass()     // Catch: java.lang.Throwable -> Ld5
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 >= 0) goto Lcf
            r1.removeAt(r2)     // Catch: java.lang.Throwable -> Ld5
        Lcf:
            goto Lbd
        Ld0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld5
            goto Ld3
        Ld2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld5
        Ld3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld8
            return
        Ld5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld5
            throw r1     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld8
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbw.m():void");
    }
}

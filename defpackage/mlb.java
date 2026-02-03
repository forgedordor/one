package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlb implements mda {
    public static final /* synthetic */ int n = 0;
    public final may b;
    public final boolean c;
    public final EGLDisplay d;
    public final mmp e;
    public final mou f;
    public final mcz g;
    public final mlx h;
    public final mem j;
    public final mno k;
    public volatile boolean l;
    public volatile boolean m;
    private final Context o;
    private final Executor p;
    private final boolean q;
    private mla r;
    private mla s;
    private boolean t;
    private final mag w;
    private final maj x;
    private volatile max y;
    private final List u = new ArrayList();
    private final Object v = new Object();
    public final List i = new ArrayList();

    static {
        mbp.b("media3.effect");
    }

    public mlb(Context context, may mayVar, boolean z, EGLDisplay eGLDisplay, mmp mmpVar, mou mouVar, mcz mczVar, Executor executor, mlx mlxVar, boolean z2, mag magVar, maj majVar, mno mnoVar) {
        this.o = context;
        this.b = mayVar;
        this.c = z;
        this.d = eGLDisplay;
        this.e = mmpVar;
        this.f = mouVar;
        this.g = mczVar;
        this.p = executor;
        this.q = z2;
        this.w = magVar;
        this.k = mnoVar;
        this.x = majVar;
        this.h = mlxVar;
        mem memVar = new mem();
        this.j = memVar;
        memVar.e();
        mkx mkxVar = new mkx(this, executor, mczVar, mnoVar);
        mlxVar.f.g();
        mlxVar.v = mkxVar;
    }

    public static Pair k(may mayVar, EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext eGLContextA = mayVar.a(eGLDisplay, i, iArr);
        return Pair.create(eGLContextA, mayVar.c(eGLContextA, eGLDisplay));
    }

    @Override // defpackage.mda
    public final int a() {
        mmp mmpVar = this.e;
        if (mmpVar.c()) {
            return mmpVar.a().d();
        }
        return 0;
    }

    @Override // defpackage.mda
    public final Surface b() {
        SparseArray sparseArray = this.e.g;
        mee.c(mgb.U(sparseArray, 1));
        return ((mmo) sparseArray.get(1)).a.v();
    }

    @Override // defpackage.mda
    public final void c() throws InterruptedException {
        mmp mmpVar = this.e;
        if (mmpVar.c()) {
            this.l = false;
            try {
                moj mojVarA = mmpVar.a();
                mojVarA.l();
                final mou mouVar = this.f;
                synchronized (mouVar.a) {
                    mouVar.c = true;
                    mouVar.b.clear();
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                mouVar.h(new mot() { // from class: mor
                    @Override // defpackage.mot
                    public final void a() {
                        mou mouVar2 = mouVar;
                        synchronized (mouVar2.a) {
                            mouVar2.c = false;
                        }
                        countDownLatch.countDown();
                    }
                }, false);
                countDownLatch.await();
                mojVarA.o();
                final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                mojVarA.s(new mot() { // from class: mko
                    @Override // defpackage.mot
                    public final void a() {
                        countDownLatch2.countDown();
                    }
                });
                mou mouVar2 = this.f;
                final mlx mlxVar = this.h;
                mouVar2.d(new mot() { // from class: mkp
                    @Override // defpackage.mot
                    public final void a() {
                        mlxVar.c();
                    }
                });
                countDownLatch2.await();
                mojVarA.s(null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            m();
        }
    }

    @Override // defpackage.mda
    public final void d(int i, mau mauVar, List list, long j) {
        mau mauVar2;
        if (this.m) {
            return;
        }
        int i2 = mjr.a;
        float f = mauVar.B;
        if (f > 1.0f) {
            mat matVar = new mat(mauVar);
            matVar.t = (int) (mauVar.v * f);
            matVar.z = 1.0f;
            mauVar2 = new mau(matVar);
        } else if (f < 1.0f) {
            mat matVar2 = new mat(mauVar);
            matVar2.u = (int) (mauVar.w / f);
            matVar2.z = 1.0f;
            mauVar2 = new mau(matVar2);
        } else {
            mauVar2 = mauVar;
        }
        this.y = new max(mauVar2, j);
        try {
            this.j.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.p.execute(new Runnable() { // from class: mkl
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g.b(mcw.a(e));
                }
            });
        }
        synchronized (this.v) {
            final mla mlaVar = new mla(i, mauVar, list, j);
            if (this.t) {
                this.s = mlaVar;
                this.j.f();
                this.e.b();
            } else {
                this.t = true;
                this.j.f();
                this.f.d(new mot() { // from class: mkn
                    @Override // defpackage.mot
                    public final void a() throws mcw {
                        this.a.l(mlaVar, true);
                    }
                });
            }
        }
    }

    @Override // defpackage.mda
    public final void e() {
        this.m = true;
        try {
            this.f.c(new mot() { // from class: mkt
                @Override // defpackage.mot
                public final void a() {
                    mlb mlbVar = this.a;
                    try {
                        try {
                            mmp mmpVar = mlbVar.e;
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                SparseArray sparseArray = mmpVar.g;
                                if (i2 >= sparseArray.size()) {
                                    break;
                                }
                                mmo mmoVar = (mmo) sparseArray.get(sparseArray.keyAt(i2));
                                if (!mmoVar.e) {
                                    mmoVar.e = true;
                                    mmoVar.a.g();
                                    mlc mlcVar = mmoVar.b;
                                    if (mlcVar != null) {
                                        mlcVar.e();
                                    }
                                }
                                i2++;
                            }
                            while (true) {
                                List list = mlbVar.i;
                                if (i >= list.size()) {
                                    break;
                                }
                                ((mmk) list.get(i)).e();
                                i++;
                            }
                            mlbVar.h.e();
                        } catch (Exception e) {
                            mff.d("DefaultFrameProcessor", "Error releasing shader program", e);
                        }
                        if (mlbVar.c) {
                            try {
                                mlbVar.b.e(mlbVar.d);
                            } catch (meu e2) {
                                mff.d("DefaultFrameProcessor", "Error releasing GL objects", e2);
                            }
                        }
                    } catch (Throwable th) {
                        if (mlbVar.c) {
                            try {
                                mlbVar.b.e(mlbVar.d);
                            } catch (meu e3) {
                                mff.d("DefaultFrameProcessor", "Error releasing GL objects", e3);
                            }
                        }
                        throw th;
                    }
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.mda
    public final void f(final long j) {
        mee.d(!this.q, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        this.f.f(new mot() { // from class: mkr
            @Override // defpackage.mot
            public final void a() {
                mlb mlbVar = this.a;
                mlx mlxVar = mlbVar.h;
                mlxVar.f.g();
                if (mlxVar.m != null) {
                    return;
                }
                mee.c(!mlxVar.n);
                Queue queue = mlxVar.i;
                if (queue.isEmpty()) {
                    return;
                }
                long j2 = j;
                may mayVar = mlbVar.b;
                mol molVar = (mol) queue.remove();
                mlxVar.a(mayVar, molVar.a, molVar.b, j2);
                if (queue.isEmpty() && mlxVar.o) {
                    mkx mkxVar = mlxVar.v;
                    mee.f(mkxVar);
                    mkxVar.b();
                    mlxVar.o = false;
                }
            }
        });
    }

    @Override // defpackage.mda
    public final void g(final mch mchVar) throws ExecutionException, TimeoutException {
        final mlx mlxVar = this.h;
        try {
            mlxVar.f.b(new mot() { // from class: mlq
                /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
                @Override // defpackage.mot
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a() {
                    /*
                        r7 = this;
                        mlx r0 = r1
                        mml r1 = r0.m
                        if (r1 == 0) goto L7
                        goto L69
                    L7:
                        mch r1 = r2
                        mch r2 = r0.s
                        boolean r2 = j$.util.Objects.equals(r2, r1)
                        if (r2 != 0) goto L69
                        mch r2 = r0.s
                        r3 = 1
                        if (r2 == 0) goto L4b
                        if (r1 == 0) goto L22
                        android.view.Surface r4 = r1.a
                        android.view.Surface r2 = r2.a
                        boolean r2 = r2.equals(r4)
                        if (r2 != 0) goto L4b
                    L22:
                        android.opengl.EGLSurface r2 = r0.u
                        if (r2 == 0) goto L4b
                        r2 = 0
                        android.opengl.EGLDisplay r4 = r0.c     // Catch: java.lang.Throwable -> L38 defpackage.meu -> L3a
                        android.opengl.EGLContext r5 = r0.d     // Catch: java.lang.Throwable -> L38 defpackage.meu -> L3a
                        android.opengl.EGLSurface r6 = r0.e     // Catch: java.lang.Throwable -> L38 defpackage.meu -> L3a
                        defpackage.mev.t(r4, r5, r6, r3, r3)     // Catch: java.lang.Throwable -> L38 defpackage.meu -> L3a
                        android.opengl.EGLSurface r5 = r0.u     // Catch: java.lang.Throwable -> L38 defpackage.meu -> L3a
                        defpackage.mev.s(r4, r5)     // Catch: java.lang.Throwable -> L38 defpackage.meu -> L3a
                        r0.u = r2
                        goto L4b
                    L38:
                        r1 = move-exception
                        goto L48
                    L3a:
                        r4 = move-exception
                        java.util.concurrent.Executor r5 = r0.g     // Catch: java.lang.Throwable -> L38
                        mlu r6 = new mlu     // Catch: java.lang.Throwable -> L38
                        r6.<init>()     // Catch: java.lang.Throwable -> L38
                        r5.execute(r6)     // Catch: java.lang.Throwable -> L38
                        r0.u = r2
                        goto L4b
                    L48:
                        r0.u = r2
                        throw r1
                    L4b:
                        mch r2 = r0.s
                        if (r2 == 0) goto L65
                        if (r1 == 0) goto L65
                        int r4 = r1.b
                        int r5 = r2.b
                        if (r5 != r4) goto L65
                        int r4 = r2.c
                        int r5 = r1.c
                        if (r4 != r5) goto L65
                        int r2 = r2.d
                        int r4 = r1.d
                        if (r2 == r4) goto L64
                        goto L65
                    L64:
                        r3 = 0
                    L65:
                        r0.r = r3
                        r0.s = r1
                    L69:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mlq.a():void");
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            mlxVar.g.execute(new Runnable() { // from class: mlr
                @Override // java.lang.Runnable
                public final void run() {
                    mlxVar.h.b(mcw.a(e));
                }
            });
        }
    }

    @Override // defpackage.mda
    public final void h() {
        int i = mjr.a;
        mee.c(!this.l);
        this.l = true;
        if (this.m) {
            return;
        }
        this.e.b();
    }

    @Override // defpackage.mda
    public final boolean i() {
        mee.c(!this.l);
        mee.h(this.y, "registerInputStream must be called before registering input frames");
        if (!this.j.d() || this.m) {
            return false;
        }
        this.e.a().n(this.y);
        return true;
    }

    @Override // defpackage.mda
    public final boolean j(Bitmap bitmap, men menVar) {
        mee.c(!this.l);
        boolean z = false;
        if (!this.j.d() || this.m) {
            return false;
        }
        if (mag.i(this.w)) {
            if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                z = true;
            }
            mee.b(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        max maxVar = this.y;
        mee.f(maxVar);
        this.e.a().j(bitmap, maxVar, menVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(final defpackage.mla r19, boolean r20) throws defpackage.mcw {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlb.l(mla, boolean):void");
    }

    public final void m() {
        synchronized (this.v) {
            final mla mlaVar = this.s;
            if (mlaVar != null) {
                this.f.d(new mot() { // from class: mks
                    @Override // defpackage.mot
                    public final void a() throws mcw {
                        this.a.l(mlaVar, false);
                    }
                });
                this.s = null;
            }
        }
    }
}

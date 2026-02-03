package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mln extends moj {
    public static final long a;
    private static final int[] o = {2, 3, 6, 7, 8, 9, 11, 14};
    private static final int[] p = {1920, 1088};
    public mlc b;
    public final SurfaceTexture c;
    public final Queue d;
    public int e;
    public int f;
    public boolean g;
    public max h;
    public max i;
    public boolean j;
    public CountDownLatch k;
    public volatile boolean l;
    public volatile RuntimeException m;
    private final may q;
    private final int r;
    private final Surface s;
    private final float[] t;
    private final ScheduledExecutorService u;
    private Future v;

    static {
        a = true != mgb.ab() ? 500L : 20000L;
    }

    public mln(may mayVar, final mou mouVar, boolean z) throws mcw {
        super(mouVar);
        this.q = mayVar;
        this.j = z;
        try {
            int iA = mev.a();
            this.r = iA;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iA);
            this.c = surfaceTexture;
            this.t = new float[16];
            this.d = new ConcurrentLinkedQueue();
            this.u = mgb.S("ExtTexMgr:Timer");
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: mlg
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    final mln mlnVar = this.a;
                    mouVar.e(new mot() { // from class: mlh
                        @Override // defpackage.mot
                        public final void a() {
                            int i = mjr.a;
                            mln mlnVar2 = mlnVar;
                            if (mlnVar2.j) {
                                Queue queue = mlnVar2.d;
                                max maxVar = mlnVar2.i;
                                mee.f(maxVar);
                                queue.add(maxVar);
                            }
                            if (!mlnVar2.l) {
                                if (mlnVar2.g) {
                                    mlnVar2.q();
                                }
                                mlnVar2.f++;
                                mlnVar2.m();
                                return;
                            }
                            mlnVar2.c.updateTexImage();
                            Queue queue2 = mlnVar2.d;
                            queue2.poll();
                            if (mlnVar2.k == null || !queue2.isEmpty()) {
                                return;
                            }
                            mlnVar2.k.countDown();
                        }
                    }, false);
                }
            });
            this.s = new Surface(surfaceTexture);
        } catch (meu e) {
            throw new mcw(e);
        }
    }

    private static float t(float f, int i) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 += i3) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (u(i4, f, i) < u(i2, f, i)) {
                i2 = i4;
            }
        }
        int[] iArr = p;
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = iArr[i5];
            if (i6 >= i && u(i6, f, i) < u(i2, f, i)) {
                i2 = i6;
            }
        }
        return u(i2, f, i) > 1.0E-9f ? f : i / i2;
    }

    private static float u(int i, float f, int i2) {
        float fAbs = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f2 = ((i2 - i3) / i) - f;
            if (Math.abs(f2) < fAbs) {
                fAbs = Math.abs(f2);
            }
        }
        return fAbs;
    }

    @Override // defpackage.moj, defpackage.mmi
    public final void b(maz mazVar) {
        this.n.d(new mot() { // from class: mll
            @Override // defpackage.mot
            public final void a() {
                mln mlnVar = this.a;
                mlnVar.h = null;
                if (!mlnVar.g || !mlnVar.d.isEmpty()) {
                    mlnVar.m();
                    return;
                }
                mlnVar.g = false;
                mlc mlcVar = mlnVar.b;
                mee.f(mlcVar);
                mlcVar.j();
                int i = mjr.a;
                mlnVar.k();
            }
        });
    }

    @Override // defpackage.moj, defpackage.mmi
    public final void c() {
        this.n.d(new mot() { // from class: mlm
            @Override // defpackage.mot
            public final void a() {
                mln mlnVar = this.a;
                mlnVar.e++;
                mlnVar.m();
            }
        });
    }

    @Override // defpackage.moj
    public final int d() {
        return this.d.size();
    }

    @Override // defpackage.moj
    protected final void e() {
        this.e = 0;
        this.h = null;
        this.d.clear();
        this.i = null;
        super.e();
    }

    @Override // defpackage.moj
    public final void g() {
        this.c.release();
        this.s.release();
        this.u.shutdownNow();
    }

    @Override // defpackage.moj
    public final void h(final mmk mmkVar) {
        mee.c(true);
        this.n.d(new mot() { // from class: mld
            /* JADX WARN: Type inference failed for: r1v1, types: [mlc, mmk] */
            @Override // defpackage.mot
            public final void a() {
                mln mlnVar = this.a;
                mlnVar.e = 0;
                mlnVar.b = mmkVar;
            }
        });
    }

    @Override // defpackage.moj
    public final void i() {
        this.n.d(new mot() { // from class: mle
            @Override // defpackage.mot
            public final void a() {
                mln mlnVar = this.a;
                if (mlnVar.j) {
                    mlnVar.l = true;
                }
                if (!mlnVar.d.isEmpty() || mlnVar.h != null) {
                    mlnVar.g = true;
                    mlnVar.q();
                    return;
                }
                mlc mlcVar = mlnVar.b;
                mee.f(mlcVar);
                mlcVar.j();
                int i = mjr.a;
                mlnVar.k();
            }
        });
    }

    public final void k() {
        Future future = this.v;
        if (future != null) {
            future.cancel(false);
        }
        this.v = null;
    }

    @Override // defpackage.moj
    public final void l() {
        this.l = true;
    }

    public final void m() {
        int i;
        if (this.e == 0 || this.f == 0 || this.h != null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.c;
        surfaceTexture.updateTexImage();
        this.f--;
        Queue queue = this.d;
        max maxVar = (max) queue.element();
        this.h = maxVar;
        this.e--;
        float[] fArr = this.t;
        surfaceTexture.getTransformMatrix(fArr);
        long timestamp = (surfaceTexture.getTimestamp() / 1000) + maxVar.b;
        mau mauVar = maxVar.a;
        int i2 = mauVar.v;
        int i3 = mauVar.w;
        int[] iArr = o;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= 8) {
                break;
            }
            if (Math.abs(fArr[iArr[i4]]) <= 1.0E-9f) {
                i = 0;
            }
            i5 |= i;
            i4++;
        }
        int i6 = (Math.abs(fArr[10] + (-1.0f)) > 1.0E-9f ? 1 : 0) | i5 | (Math.abs(fArr[15] + (-1.0f)) > 1.0E-9f ? 1 : 0);
        char c = '\f';
        char c2 = '\r';
        char c3 = 4;
        if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
            i = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i6 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
            c3 = 5;
        } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
            c = 65535;
            c = 65535;
            c2 = 65535;
            c3 = 65535;
        } else {
            c2 = '\f';
            c = '\r';
            c = 1;
            i = i6 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? (char) 1 : (char) 0);
        }
        if (i != 0) {
            int i7 = mjr.a;
        } else {
            float f = fArr[c];
            float f2 = fArr[c];
            if (Math.abs(f) + 1.0E-9f < 1.0f) {
                float fCopySign = Math.copySign(t(Math.abs(f), i2), f);
                float f3 = ((f - fCopySign) * 0.5f) + f2;
                int i8 = mjr.a;
                fArr[c] = fCopySign;
                fArr[c] = f3;
            }
            float f4 = fArr[c3];
            float f5 = fArr[c2];
            if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                float fCopySign2 = Math.copySign(t(Math.abs(f4), i3), f4);
                float f6 = ((f4 - fCopySign2) * 0.5f) + f5;
                int i9 = mjr.a;
                fArr[c3] = fCopySign2;
                fArr[c2] = f6;
            }
        }
        mlc mlcVar = this.b;
        mee.f(mlcVar);
        ((mka) mlcVar).f.g("uTexTransformationMatrix", fArr);
        mlc mlcVar2 = this.b;
        mee.f(mlcVar2);
        mlcVar2.d(this.q, new maz(this.r, -1, i2, i3), timestamp);
        mee.g((max) queue.remove());
        int i10 = mjr.a;
    }

    @Override // defpackage.moj
    public final void n(max maxVar) {
        this.i = maxVar;
        if (!this.j) {
            this.d.add(maxVar);
        }
        this.n.d(new mot() { // from class: mlf
            @Override // defpackage.mot
            public final void a() {
                this.a.l = false;
            }
        });
    }

    @Override // defpackage.moj
    public final void o() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.k = countDownLatch;
        this.n.d(new mot() { // from class: mlj
            @Override // defpackage.mot
            public final void a() {
                mln mlnVar = this.a;
                try {
                    mlnVar.p();
                } catch (RuntimeException e) {
                    mlnVar.m = e;
                    mff.d("ExtTexMgr", "Failed to remove texture frames", e);
                    CountDownLatch countDownLatch2 = mlnVar.k;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                }
            }
        });
        try {
            if (!countDownLatch.await(a, TimeUnit.MILLISECONDS)) {
                mff.f("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            mff.f("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.k = null;
        if (this.m != null) {
            throw this.m;
        }
    }

    public final void p() {
        while (true) {
            int i = this.f;
            if (i <= 0) {
                break;
            }
            this.f = i - 1;
            this.c.updateTexImage();
            this.d.remove();
        }
        if (this.k == null || !this.d.isEmpty()) {
            return;
        }
        this.k.countDown();
    }

    public final void q() {
        k();
        this.v = this.u.schedule(new Runnable() { // from class: mli
            @Override // java.lang.Runnable
            public final void run() {
                final mln mlnVar = this.a;
                mlnVar.n.d(new mot() { // from class: mlk
                    @Override // defpackage.mot
                    public final void a() {
                        mln mlnVar2 = mlnVar;
                        int i = mlnVar2.f;
                        Queue queue = mlnVar2.d;
                        if (i == queue.size()) {
                            return;
                        }
                        mff.f("ExtTexMgr", mgb.I("Forcing EOS after missing %d frames for %d ms, with available frame count: %d", Integer.valueOf(queue.size()), Long.valueOf(mln.a), Integer.valueOf(mlnVar2.f)));
                        mlnVar2.g = false;
                        mlnVar2.h = null;
                        mlnVar2.l = true;
                        mlnVar2.p();
                        queue.clear();
                        mlnVar2.i();
                    }
                });
            }
        }, a, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.moj
    public final void r(max maxVar, boolean z) {
        this.j = z;
        if (z) {
            this.i = maxVar;
            SurfaceTexture surfaceTexture = this.c;
            mau mauVar = maxVar.a;
            surfaceTexture.setDefaultBufferSize(mauVar.v, mauVar.w);
        }
    }

    @Override // defpackage.moj
    public final Surface v() {
        return this.s;
    }
}

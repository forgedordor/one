package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlx implements mmk, mmm {
    private mka A;
    private mft B;
    public final EGLDisplay c;
    public final EGLContext d;
    public final EGLSurface e;
    public final mou f;
    public final Executor g;
    public final mcz h;
    public final mok j;
    public final mfh k;
    public final mfh l;
    public final mml m;
    public final boolean n;
    public boolean o;
    public boolean q;
    public boolean r;
    public mch s;
    public EGLSurface u;
    public mkx v;
    private final Context w;
    private final mag x;
    private int y;
    private int z;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public mmi p = new mlw();
    public final Queue i = new ConcurrentLinkedQueue();
    public long t = -9223372036854775807L;

    public mlx(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, mag magVar, mou mouVar, Executor executor, mcz mczVar, mml mmlVar, int i, boolean z) {
        this.w = context;
        this.c = eGLDisplay;
        this.d = eGLContext;
        this.e = eGLSurface;
        this.x = magVar;
        this.f = mouVar;
        this.g = executor;
        this.h = mczVar;
        this.m = mmlVar;
        this.n = z;
        this.j = new mok(mag.i(magVar), i);
        this.k = new mfh(i);
        this.l = new mfh(i);
    }

    private final int b() {
        if (this.m == null) {
            return 1;
        }
        return this.j.a();
    }

    private final boolean k() {
        return this.t != -9223372036854775807L;
    }

    public final void a(may mayVar, maz mazVar, long j, long j2) {
        boolean z;
        boolean z2;
        mch mchVar;
        long j3;
        if (j2 != -2) {
            try {
                int i = mazVar.d;
                int i2 = mazVar.e;
                z = true;
                z2 = (this.y == i && this.z == i2 && this.B != null) ? false : true;
                if (z2) {
                    this.y = i;
                    this.z = i2;
                    final mft mftVarA = mmu.a(i, i2, this.a);
                    if (!Objects.equals(this.B, mftVarA)) {
                        this.B = mftVarA;
                        this.g.execute(new Runnable() { // from class: mlp
                            @Override // java.lang.Runnable
                            public final void run() {
                                mcz mczVar = this.a.h;
                                mft mftVar = mftVarA;
                                mczVar.e(mftVar.c, mftVar.d);
                            }
                        });
                    }
                }
                mee.f(this.B);
                mchVar = this.s;
            } catch (mcw | meu e) {
                this.g.execute(new Runnable() { // from class: mlo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h.b(mcw.a(e));
                    }
                });
            }
            if (mchVar == null && this.m == null) {
                if (this.u != null) {
                    z = false;
                }
                mee.c(z);
                mka mkaVar = this.A;
                if (mkaVar != null) {
                    mkaVar.e();
                    this.A = null;
                }
                mff.f("FinalShaderWrapper", "Output surface and size not set, dropping frame.");
            } else {
                int i3 = mchVar == null ? this.B.c : mchVar.b;
                int i4 = mchVar == null ? this.B.d : mchVar.c;
                if (mchVar != null && this.u == null) {
                    this.u = mayVar.b(this.c, mchVar.a, this.x.e, mchVar.e);
                }
                mml mmlVar = this.m;
                if (mmlVar != null) {
                    this.j.d(mayVar, i3, i4);
                }
                mka mkaVar2 = this.A;
                if (mkaVar2 != null && (this.r || z2 || this.q)) {
                    mkaVar2.e();
                    this.A = null;
                    this.r = false;
                    this.q = false;
                }
                if (this.A == null) {
                    mch mchVar2 = this.s;
                    int i5 = mchVar2 == null ? 0 : mchVar2.d;
                    ekfw ekfwVar = new ekfw();
                    ekfwVar.j(this.a);
                    if (i5 != 0) {
                        float f = i5 % 360.0f;
                        if (f < 0.0f) {
                            f += 360.0f;
                        }
                        ekfwVar.h(new mnq(f));
                    }
                    ekfwVar.h(mnm.i(i3, i4));
                    mka mkaVarN = mka.n(this.w, ekfwVar.g(), this.b, this.x, 0);
                    mft mftVarA2 = mkaVarN.a(this.y, this.z);
                    mch mchVar3 = this.s;
                    if (mchVar3 != null) {
                        mee.c(mftVarA2.c == mchVar3.b);
                        mee.c(mftVarA2.d == mchVar3.c);
                    }
                    this.A = mkaVarN;
                    this.r = false;
                }
                if (!k() || j == this.t) {
                    if (this.s != null) {
                        EGLSurface eGLSurface = this.u;
                        mee.f(eGLSurface);
                        mch mchVar4 = this.s;
                        mee.f(mchVar4);
                        mka mkaVar3 = this.A;
                        mee.f(mkaVar3);
                        EGLDisplay eGLDisplay = this.c;
                        mev.t(eGLDisplay, this.d, eGLSurface, mchVar4.b, mchVar4.c);
                        mev.o();
                        mkaVar3.b(mazVar.b, j);
                        if (j2 == -3) {
                            if (j == -9223372036854775807L) {
                                z = false;
                            }
                            mee.c(z);
                            j3 = 1000 * j;
                        } else {
                            j3 = j2;
                        }
                        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j3);
                        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                        mkx mkxVar = this.v;
                        mee.f(mkxVar);
                        mkxVar.a(j);
                        int i6 = mjr.a;
                    } else if (mmlVar != null) {
                        maz mazVarB = this.j.b();
                        this.k.c(j);
                        mev.u(mazVarB.c, mazVarB.d, mazVarB.e);
                        mev.o();
                        mka mkaVar4 = this.A;
                        mee.f(mkaVar4);
                        mkaVar4.b(mazVar.b, j);
                        this.l.c(mev.e());
                        mnk mnkVar = ((mmy) mmlVar).a;
                        int i7 = ((mmy) mmlVar).b;
                        int i8 = mjr.a;
                        mom momVar = mnkVar.h;
                        mee.f(momVar);
                        momVar.b(i7, this, mazVarB, mnkVar.a, j);
                    }
                    this.p.b(mazVar);
                    return;
                }
            }
        }
        this.p.b(mazVar);
        if (j2 == -2) {
            mkx mkxVar2 = this.v;
            mee.f(mkxVar2);
            mkxVar2.a(j);
        }
    }

    @Override // defpackage.mmk
    public final void c() {
        this.f.g();
        if (this.m != null) {
            this.j.e();
            this.k.d();
            this.l.d();
        }
        this.i.clear();
        this.o = false;
        mka mkaVar = this.A;
        if (mkaVar != null) {
            mkaVar.c();
        }
        this.p.w();
        for (int i = 0; i < b(); i++) {
            this.p.c();
        }
    }

    @Override // defpackage.mmk
    public final void d(may mayVar, maz mazVar, final long j) {
        mlx mlxVar;
        this.f.g();
        if (!k()) {
            this.g.execute(new Runnable() { // from class: mls
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h.c(j, false);
                }
            });
        }
        if (this.m != null) {
            long j2 = j * 1000;
            mee.c(this.j.a() > 0);
            a(mayVar, mazVar, j, j2);
            return;
        }
        if (this.n) {
            a(mayVar, mazVar, j, j * 1000);
            mlxVar = this;
        } else {
            mlxVar = this;
            Queue queue = mlxVar.i;
            queue.add(new mol(mazVar, j));
            if (k()) {
                if (j == mlxVar.t) {
                    mlxVar.t = -9223372036854775807L;
                    mlxVar.g.execute(new Runnable() { // from class: mlt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.h.c(j, true);
                        }
                    });
                    mlxVar.a(mayVar, mazVar, j, System.nanoTime());
                    queue.clear();
                } else {
                    mlxVar.p.b(mazVar);
                }
            }
        }
        mlxVar.p.c();
    }

    @Override // defpackage.mmk
    public final void e() throws mcw {
        this.f.g();
        mka mkaVar = this.A;
        if (mkaVar != null) {
            mkaVar.e();
        }
        try {
            this.j.c();
            mev.s(this.c, this.u);
            mev.m();
        } catch (meu e) {
            throw new mcw(e);
        }
    }

    @Override // defpackage.mmk
    public final void f(maz mazVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mmk
    public final void g(Executor executor, mmh mmhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mmk
    public final void h(mmi mmiVar) {
        this.f.g();
        this.p = mmiVar;
        for (int i = 0; i < b(); i++) {
            mmiVar.c();
        }
    }

    @Override // defpackage.mmk
    public final void i(mmj mmjVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mmk
    public final void j() {
        this.f.g();
        if (!this.i.isEmpty()) {
            mee.c(!this.n);
            this.o = true;
        } else {
            mkx mkxVar = this.v;
            mee.f(mkxVar);
            mkxVar.b();
            this.o = false;
        }
    }
}

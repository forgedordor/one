package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joe implements jfe {
    private static final fdat a = joc.a;
    private final AndroidComposeView b;
    private fdat c;
    private fdae d;
    private boolean e;
    private boolean g;
    private boolean h;
    private ikb i;
    private final jmk m;
    private int n;
    private final jnt f = new jnt();
    private final jnn j = new jnn(a);
    private final ijc k = new ijc();
    private long l = ikz.a;

    public joe(AndroidComposeView androidComposeView, fdat fdatVar, fdae fdaeVar) {
        this.b = androidComposeView;
        this.c = fdatVar;
        this.d = fdaeVar;
        jmk jobVar = Build.VERSION.SDK_INT >= 29 ? new job() : new joa(androidComposeView);
        jobVar.M();
        jobVar.s(false);
        this.m = jobVar;
    }

    private final void n(boolean z) {
        if (z != this.e) {
            this.e = z;
            this.b.I(this, z);
        }
    }

    private final void o() {
        jpx.a(this.b);
    }

    @Override // defpackage.jfe
    public final long a(long j, boolean z) {
        return z ? this.j.b(this.m, j) : this.j.a(this.m, j);
    }

    @Override // defpackage.jfe
    public final void b() {
        jmk jmkVar = this.m;
        if (jmkVar.K()) {
            jmkVar.i();
        }
        this.c = null;
        this.d = null;
        this.g = true;
        n(false);
        AndroidComposeView androidComposeView = this.b;
        androidComposeView.L();
        androidComposeView.R(this);
    }

    @Override // defpackage.jfe
    public final void c(ijb ijbVar, ini iniVar) {
        Canvas canvasA = iid.a(ijbVar);
        if (canvasA.isHardwareAccelerated()) {
            j();
            jmk jmkVar = this.m;
            boolean z = jmkVar.b() > 0.0f;
            this.h = z;
            if (z) {
                ijbVar.i();
            }
            jmkVar.j(canvasA);
            if (this.h) {
                ijbVar.c();
                return;
            }
            return;
        }
        jmk jmkVar2 = this.m;
        float fE = jmkVar2.e();
        float fG = jmkVar2.g();
        float f = jmkVar2.f();
        float fC = jmkVar2.c();
        if (jmkVar2.a() < 1.0f) {
            ikb iiiVar = this.i;
            if (iiiVar == null) {
                iiiVar = new iii();
                this.i = iiiVar;
            }
            iiiVar.i(jmkVar2.a());
            canvasA.saveLayer(fE, fG, f, fC, ((iii) iiiVar).a);
        } else {
            ijbVar.l();
        }
        ijbVar.o(fE, fG);
        ijbVar.b(this.j.h(jmkVar2));
        if (jmkVar2.J() || jmkVar2.I()) {
            this.f.c(ijbVar);
        }
        fdat fdatVar = this.c;
        if (fdatVar != null) {
            fdatVar.a(ijbVar, null);
        }
        ijbVar.j();
        n(false);
    }

    @Override // defpackage.jfe
    public final void d(float[] fArr) {
        float[] fArrG = this.j.g(this.m);
        if (fArrG != null) {
            iju.e(fArr, fArrG);
        }
    }

    @Override // defpackage.jfe
    public final void e(ihp ihpVar, boolean z) {
        if (z) {
            this.j.e(this.m, ihpVar);
        } else {
            this.j.d(this.m, ihpVar);
        }
    }

    @Override // defpackage.jfe
    public final void f(long j) {
        jmk jmkVar = this.m;
        int iE = jmkVar.e();
        int iG = jmkVar.g();
        int iB = kjb.b(j);
        int iA = kjb.a(j);
        if (iE == iA && iG == iB) {
            return;
        }
        if (iE != iA) {
            jmkVar.l(iA - iE);
        }
        if (iG != iB) {
            jmkVar.m(iB - iG);
        }
        o();
        this.j.c();
    }

    @Override // defpackage.jfe
    public final void g(long j) {
        int i = (int) (j >> 32);
        float fA = ikz.a(this.l) * i;
        jmk jmkVar = this.m;
        jmkVar.x(fA);
        int i2 = (int) (j & 4294967295L);
        jmkVar.y(ikz.b(this.l) * i2);
        if (jmkVar.L(jmkVar.e(), jmkVar.g(), jmkVar.e() + i, jmkVar.g() + i2)) {
            jmkVar.w(this.f.a());
            invalidate();
            this.j.c();
        }
    }

    @Override // defpackage.jfe
    public final void h(fdat fdatVar, fdae fdaeVar) {
        this.j.f();
        n(false);
        this.g = false;
        this.h = false;
        this.l = ikz.a;
        this.c = fdatVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.jfe
    public final void i(float[] fArr) {
        iju.e(fArr, this.j.h(this.m));
    }

    @Override // defpackage.jfe
    public final void invalidate() {
        if (this.e || this.g) {
            return;
        }
        this.b.invalidate();
        n(true);
    }

    @Override // defpackage.jfe
    public final void j() {
        if (this.e || !this.m.K()) {
            jmk jmkVar = this.m;
            ikd ikdVarB = null;
            if (jmkVar.J()) {
                jnt jntVar = this.f;
                if (!jntVar.d()) {
                    ikdVarB = jntVar.b();
                }
            }
            fdat fdatVar = this.c;
            if (fdatVar != null) {
                jmkVar.n(this.k, ikdVarB, new jod(fdatVar));
            }
            n(false);
        }
    }

    @Override // defpackage.jfe
    public final void k(ikl iklVar) {
        fdae fdaeVar;
        int i = iklVar.a | this.n;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.l = iklVar.n;
        }
        jmk jmkVar = this.m;
        boolean z = jmkVar.J() && !this.f.d();
        if ((i & 1) != 0) {
            jmkVar.D(iklVar.b);
        }
        if ((i & 2) != 0) {
            jmkVar.E(iklVar.c);
        }
        if ((i & 4) != 0) {
            jmkVar.o(iklVar.d);
        }
        if ((i & 8) != 0) {
            jmkVar.G(iklVar.e);
        }
        if ((i & 16) != 0) {
            jmkVar.H(iklVar.f);
        }
        if ((i & 32) != 0) {
            jmkVar.v(iklVar.g);
        }
        if ((i & 64) != 0) {
            jmkVar.p(ijg.b(iklVar.h));
        }
        if ((i & 128) != 0) {
            jmkVar.F(ijg.b(iklVar.i));
        }
        if ((i & 1024) != 0) {
            jmkVar.C(iklVar.l);
        }
        if ((i & 256) != 0) {
            jmkVar.A(iklVar.j);
        }
        if ((i & 512) != 0) {
            jmkVar.B(iklVar.k);
        }
        if ((i & 2048) != 0) {
            jmkVar.r(iklVar.m);
        }
        if (i2 != 0) {
            jmkVar.x(ikz.a(this.l) * jmkVar.h());
            jmkVar.y(ikz.b(this.l) * jmkVar.d());
        }
        boolean z2 = iklVar.p && iklVar.o != ikj.a;
        if ((i & 24576) != 0) {
            jmkVar.t(z2);
            jmkVar.s(iklVar.p && iklVar.o == ikj.a);
        }
        if ((131072 & i) != 0) {
            jmkVar.z(iklVar.u);
        }
        if ((262144 & i) != 0) {
            ijf ijfVar = iklVar.v;
            jmkVar.N();
        }
        if ((524288 & i) != 0) {
            jmkVar.q(iklVar.w);
        }
        if ((32768 & i) != 0) {
            jmkVar.u(iklVar.q);
        }
        jnt jntVar = this.f;
        boolean zF = jntVar.f(iklVar.x, iklVar.d, z2, iklVar.g, iklVar.r);
        if (jntVar.a) {
            jmkVar.w(jntVar.a());
        }
        boolean z3 = z2 && !jntVar.d();
        if (z != z3 || (z3 && zF)) {
            invalidate();
        } else {
            o();
        }
        if (!this.h && jmkVar.b() > 0.0f && (fdaeVar = this.d) != null) {
            fdaeVar.invoke();
        }
        if ((i & 7963) != 0) {
            this.j.c();
        }
        this.n = iklVar.a;
    }

    @Override // defpackage.jfe
    public final boolean l(long j) {
        jmk jmkVar = this.m;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (jmkVar.I()) {
            return fIntBitsToFloat >= 0.0f && fIntBitsToFloat < ((float) jmkVar.h()) && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat2 < ((float) jmkVar.d());
        }
        if (jmkVar.J()) {
            return this.f.e(j);
        }
        return true;
    }

    @Override // defpackage.jfe
    public final float[] m() {
        return this.j.h(this.m);
    }
}

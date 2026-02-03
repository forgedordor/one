package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgnp extends fgnq {
    private static final long serialVersionUID = -6728465968995518215L;
    private transient fgms A;
    private transient fgms B;
    private transient fgms C;
    private transient fgms D;
    private transient fgms E;
    private transient fgms F;
    private transient fgms G;
    private transient fgms I;
    private transient fgms J;
    private transient fgms K;
    public final fgmq a;
    public final Object b;
    public transient fgna c;
    public transient fgna d;
    public transient fgna e;
    public transient fgna f;
    public transient fgna g;
    public transient fgna h;
    public transient fgms i;
    public transient fgms j;
    public transient fgms k;
    public transient fgms l;
    public transient fgms m;
    public transient fgms n;
    private transient fgna o;
    private transient fgna p;
    private transient fgna q;
    private transient fgna r;
    private transient fgna s;
    private transient fgna t;
    private transient fgms u;
    private transient fgms v;
    private transient fgms w;
    private transient fgms wI;
    private transient fgms x;
    private transient fgms y;
    private transient fgms z;

    protected fgnp(fgmq fgmqVar, Object obj) {
        this.a = fgmqVar;
        this.b = obj;
        N();
    }

    private final void N() {
        fgno fgnoVar = new fgno();
        fgmq fgmqVar = this.a;
        if (fgmqVar != null) {
            fgna fgnaVarF = fgmqVar.F();
            if (fgno.b(fgnaVarF)) {
                fgnoVar.a = fgnaVarF;
            }
            fgna fgnaVarI = fgmqVar.I();
            if (fgno.b(fgnaVarI)) {
                fgnoVar.b = fgnaVarI;
            }
            fgna fgnaVarG = fgmqVar.G();
            if (fgno.b(fgnaVarG)) {
                fgnoVar.c = fgnaVarG;
            }
            fgna fgnaVarE = fgmqVar.E();
            if (fgno.b(fgnaVarE)) {
                fgnoVar.d = fgnaVarE;
            }
            fgna fgnaVarD = fgmqVar.D();
            if (fgno.b(fgnaVarD)) {
                fgnoVar.e = fgnaVarD;
            }
            fgna fgnaVarB = fgmqVar.B();
            if (fgno.b(fgnaVarB)) {
                fgnoVar.f = fgnaVarB;
            }
            fgna fgnaVarJ = fgmqVar.J();
            if (fgno.b(fgnaVarJ)) {
                fgnoVar.g = fgnaVarJ;
            }
            fgna fgnaVarK = fgmqVar.K();
            if (fgno.b(fgnaVarK)) {
                fgnoVar.h = fgnaVarK;
            }
            fgna fgnaVarH = fgmqVar.H();
            if (fgno.b(fgnaVarH)) {
                fgnoVar.i = fgnaVarH;
            }
            fgna fgnaVarL = fgmqVar.L();
            if (fgno.b(fgnaVarL)) {
                fgnoVar.j = fgnaVarL;
            }
            fgna fgnaVarA = fgmqVar.A();
            if (fgno.b(fgnaVarA)) {
                fgnoVar.k = fgnaVarA;
            }
            fgna fgnaVarC = fgmqVar.C();
            if (fgno.b(fgnaVarC)) {
                fgnoVar.l = fgnaVarC;
            }
            fgms fgmsVarN = fgmqVar.n();
            if (fgno.a(fgmsVarN)) {
                fgnoVar.m = fgmsVarN;
            }
            fgms fgmsVarM = fgmqVar.m();
            if (fgno.a(fgmsVarM)) {
                fgnoVar.n = fgmsVarM;
            }
            fgms fgmsVarS = fgmqVar.s();
            if (fgno.a(fgmsVarS)) {
                fgnoVar.o = fgmsVarS;
            }
            fgms fgmsVarR = fgmqVar.r();
            if (fgno.a(fgmsVarR)) {
                fgnoVar.p = fgmsVarR;
            }
            fgms fgmsVarP = fgmqVar.p();
            if (fgno.a(fgmsVarP)) {
                fgnoVar.q = fgmsVarP;
            }
            fgms fgmsVarO = fgmqVar.o();
            if (fgno.a(fgmsVarO)) {
                fgnoVar.r = fgmsVarO;
            }
            fgms fgmsVarK = fgmqVar.k();
            if (fgno.a(fgmsVarK)) {
                fgnoVar.s = fgmsVarK;
            }
            fgms fgmsVarD = fgmqVar.d();
            if (fgno.a(fgmsVarD)) {
                fgnoVar.t = fgmsVarD;
            }
            fgms fgmsVarL = fgmqVar.l();
            if (fgno.a(fgmsVarL)) {
                fgnoVar.u = fgmsVarL;
            }
            fgms fgmsVarE = fgmqVar.e();
            if (fgno.a(fgmsVarE)) {
                fgnoVar.v = fgmsVarE;
            }
            fgms fgmsVarJ = fgmqVar.j();
            if (fgno.a(fgmsVarJ)) {
                fgnoVar.w = fgmsVarJ;
            }
            fgms fgmsVarG = fgmqVar.g();
            if (fgno.a(fgmsVarG)) {
                fgnoVar.x = fgmsVarG;
            }
            fgms fgmsVarF = fgmqVar.f();
            if (fgno.a(fgmsVarF)) {
                fgnoVar.y = fgmsVarF;
            }
            fgms fgmsVarH = fgmqVar.h();
            if (fgno.a(fgmsVarH)) {
                fgnoVar.z = fgmsVarH;
            }
            fgms fgmsVarT = fgmqVar.t();
            if (fgno.a(fgmsVarT)) {
                fgnoVar.A = fgmsVarT;
            }
            fgms fgmsVarU = fgmqVar.u();
            if (fgno.a(fgmsVarU)) {
                fgnoVar.B = fgmsVarU;
            }
            fgms fgmsVarV = fgmqVar.v();
            if (fgno.a(fgmsVarV)) {
                fgnoVar.C = fgmsVarV;
            }
            fgms fgmsVarQ = fgmqVar.q();
            if (fgno.a(fgmsVarQ)) {
                fgnoVar.D = fgmsVarQ;
            }
            fgms fgmsVarW = fgmqVar.w();
            if (fgno.a(fgmsVarW)) {
                fgnoVar.E = fgmsVarW;
            }
            fgms fgmsVarY = fgmqVar.y();
            if (fgno.a(fgmsVarY)) {
                fgnoVar.F = fgmsVarY;
            }
            fgms fgmsVarX = fgmqVar.x();
            if (fgno.a(fgmsVarX)) {
                fgnoVar.G = fgmsVarX;
            }
            fgms fgmsVarC = fgmqVar.c();
            if (fgno.a(fgmsVarC)) {
                fgnoVar.H = fgmsVarC;
            }
            fgms fgmsVarI = fgmqVar.i();
            if (fgno.a(fgmsVarI)) {
                fgnoVar.I = fgmsVarI;
            }
        }
        M(fgnoVar);
        fgna fgnaVarF2 = fgnoVar.a;
        if (fgnaVarF2 == null) {
            fgnaVarF2 = super.F();
        }
        this.o = fgnaVarF2;
        fgna fgnaVarI2 = fgnoVar.b;
        if (fgnaVarI2 == null) {
            fgnaVarI2 = super.I();
        }
        this.p = fgnaVarI2;
        fgna fgnaVarG2 = fgnoVar.c;
        if (fgnaVarG2 == null) {
            fgnaVarG2 = super.G();
        }
        this.q = fgnaVarG2;
        fgna fgnaVarE2 = fgnoVar.d;
        if (fgnaVarE2 == null) {
            fgnaVarE2 = super.E();
        }
        this.r = fgnaVarE2;
        fgna fgnaVarD2 = fgnoVar.e;
        if (fgnaVarD2 == null) {
            fgnaVarD2 = super.D();
        }
        this.s = fgnaVarD2;
        fgna fgnaVarB2 = fgnoVar.f;
        if (fgnaVarB2 == null) {
            fgnaVarB2 = super.B();
        }
        this.c = fgnaVarB2;
        fgna fgnaVarJ2 = fgnoVar.g;
        if (fgnaVarJ2 == null) {
            fgnaVarJ2 = super.J();
        }
        this.d = fgnaVarJ2;
        fgna fgnaVarK2 = fgnoVar.h;
        if (fgnaVarK2 == null) {
            fgnaVarK2 = super.K();
        }
        this.e = fgnaVarK2;
        fgna fgnaVarH2 = fgnoVar.i;
        if (fgnaVarH2 == null) {
            fgnaVarH2 = super.H();
        }
        this.f = fgnaVarH2;
        fgna fgnaVarL2 = fgnoVar.j;
        if (fgnaVarL2 == null) {
            fgnaVarL2 = super.L();
        }
        this.g = fgnaVarL2;
        fgna fgnaVarA2 = fgnoVar.k;
        if (fgnaVarA2 == null) {
            fgnaVarA2 = super.A();
        }
        this.t = fgnaVarA2;
        fgna fgnaVarC2 = fgnoVar.l;
        if (fgnaVarC2 == null) {
            fgnaVarC2 = super.C();
        }
        this.h = fgnaVarC2;
        fgms fgmsVarN2 = fgnoVar.m;
        if (fgmsVarN2 == null) {
            fgmsVarN2 = super.n();
        }
        this.u = fgmsVarN2;
        fgms fgmsVarM2 = fgnoVar.n;
        if (fgmsVarM2 == null) {
            fgmsVarM2 = super.m();
        }
        this.i = fgmsVarM2;
        fgms fgmsVarS2 = fgnoVar.o;
        if (fgmsVarS2 == null) {
            fgmsVarS2 = super.s();
        }
        this.v = fgmsVarS2;
        fgms fgmsVarR2 = fgnoVar.p;
        if (fgmsVarR2 == null) {
            fgmsVarR2 = super.r();
        }
        this.w = fgmsVarR2;
        fgms fgmsVarP2 = fgnoVar.q;
        if (fgmsVarP2 == null) {
            fgmsVarP2 = super.p();
        }
        this.x = fgmsVarP2;
        fgms fgmsVarO2 = fgnoVar.r;
        if (fgmsVarO2 == null) {
            fgmsVarO2 = super.o();
        }
        this.y = fgmsVarO2;
        fgms fgmsVarK2 = fgnoVar.s;
        if (fgmsVarK2 == null) {
            fgmsVarK2 = super.k();
        }
        this.z = fgmsVarK2;
        fgms fgmsVarD2 = fgnoVar.t;
        if (fgmsVarD2 == null) {
            fgmsVarD2 = super.d();
        }
        this.A = fgmsVarD2;
        fgms fgmsVarL2 = fgnoVar.u;
        if (fgmsVarL2 == null) {
            fgmsVarL2 = super.l();
        }
        this.B = fgmsVarL2;
        fgms fgmsVarE2 = fgnoVar.v;
        if (fgmsVarE2 == null) {
            fgmsVarE2 = super.e();
        }
        this.C = fgmsVarE2;
        fgms fgmsVarJ2 = fgnoVar.w;
        if (fgmsVarJ2 == null) {
            fgmsVarJ2 = super.j();
        }
        this.D = fgmsVarJ2;
        fgms fgmsVarG2 = fgnoVar.x;
        if (fgmsVarG2 == null) {
            fgmsVarG2 = super.g();
        }
        this.j = fgmsVarG2;
        fgms fgmsVarF2 = fgnoVar.y;
        if (fgmsVarF2 == null) {
            fgmsVarF2 = super.f();
        }
        this.k = fgmsVarF2;
        fgms fgmsVarH2 = fgnoVar.z;
        if (fgmsVarH2 == null) {
            fgmsVarH2 = super.h();
        }
        this.E = fgmsVarH2;
        fgms fgmsVarT2 = fgnoVar.A;
        if (fgmsVarT2 == null) {
            fgmsVarT2 = super.t();
        }
        this.l = fgmsVarT2;
        fgms fgmsVarU2 = fgnoVar.B;
        if (fgmsVarU2 == null) {
            fgmsVarU2 = super.u();
        }
        this.F = fgmsVarU2;
        fgms fgmsVarV2 = fgnoVar.C;
        if (fgmsVarV2 == null) {
            fgmsVarV2 = super.v();
        }
        this.G = fgmsVarV2;
        fgms fgmsVarQ2 = fgnoVar.D;
        if (fgmsVarQ2 == null) {
            fgmsVarQ2 = super.q();
        }
        this.m = fgmsVarQ2;
        fgms fgmsVarW2 = fgnoVar.E;
        if (fgmsVarW2 == null) {
            fgmsVarW2 = super.w();
        }
        this.n = fgmsVarW2;
        fgms fgmsVarY2 = fgnoVar.F;
        if (fgmsVarY2 == null) {
            fgmsVarY2 = super.y();
        }
        this.wI = fgmsVarY2;
        fgms fgmsVarX2 = fgnoVar.G;
        if (fgmsVarX2 == null) {
            fgmsVarX2 = super.x();
        }
        this.I = fgmsVarX2;
        fgms fgmsVarC2 = fgnoVar.H;
        if (fgmsVarC2 == null) {
            fgmsVarC2 = super.c();
        }
        this.J = fgmsVarC2;
        fgms fgmsVarI2 = fgnoVar.I;
        if (fgmsVarI2 == null) {
            fgmsVarI2 = super.i();
        }
        this.K = fgmsVarI2;
        if (fgmqVar == null) {
            return;
        }
        if (this.z == fgmqVar.k() && this.x == fgmqVar.p() && this.v == fgmqVar.s()) {
            fgmqVar.n();
        }
        fgmqVar.m();
        if (this.n == fgmqVar.w() && this.m == fgmqVar.q()) {
            fgmqVar.f();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        N();
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna A() {
        return this.t;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna B() {
        return this.c;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna C() {
        return this.h;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna D() {
        return this.s;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna E() {
        return this.r;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna F() {
        return this.o;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna G() {
        return this.q;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna H() {
        return this.f;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna I() {
        return this.p;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna J() {
        return this.d;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna K() {
        return this.e;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgna L() {
        return this.g;
    }

    protected abstract void M(fgno fgnoVar);

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms c() {
        return this.J;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms d() {
        return this.A;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms e() {
        return this.C;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms f() {
        return this.k;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms g() {
        return this.j;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms h() {
        return this.E;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms i() {
        return this.K;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms j() {
        return this.D;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms k() {
        return this.z;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms l() {
        return this.B;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms m() {
        return this.i;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms n() {
        return this.u;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms o() {
        return this.y;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms p() {
        return this.x;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms q() {
        return this.m;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms r() {
        return this.w;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms s() {
        return this.v;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms t() {
        return this.l;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms u() {
        return this.F;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms v() {
        return this.G;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms w() {
        return this.n;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms x() {
        return this.I;
    }

    @Override // defpackage.fgnq, defpackage.fgmq
    public final fgms y() {
        return this.wI;
    }

    @Override // defpackage.fgmq
    public fgmz z() {
        fgmq fgmqVar = this.a;
        if (fgmqVar != null) {
            return fgmqVar.z();
        }
        return null;
    }
}

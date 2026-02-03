package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxt {
    public ekyj a;
    int b;
    private ekyj c;
    private ekyj d;
    private ekyj e;
    private int f;
    private boolean g;
    private ekyj h;
    private ekyj i;

    public ekxt() {
    }

    private static int e(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3, ekyj ekyjVar4) {
        int iA = ekyp.a(ekyjVar4, ekyjVar3);
        return iA == 0 ? ekyp.b(ekyjVar, ekyjVar2, ekyjVar3) : iA;
    }

    public final int a(ekyj ekyjVar) {
        int iA = ekyp.a(this.e, ekyjVar);
        int i = -iA;
        int i2 = -1;
        if (this.f == i && iA != 0) {
            this.a = ekyjVar;
            this.f = i;
            return -1;
        }
        this.b = iA;
        if (!this.g) {
            ekyj ekyjVarM = ekyj.m(ekzo.a(this.c, this.d));
            this.h = ekyj.j(this.c, ekyjVarM);
            this.i = ekyj.j(ekyjVarM, this.d);
            this.g = true;
        }
        double dSqrt = ((1.0d / Math.sqrt(3.0d)) + 1.5d) * 2.220446049250313E-16d;
        if ((this.a.a(this.h) <= dSqrt || ekyjVar.a(this.h) <= dSqrt) && (this.a.a(this.i) <= dSqrt || ekyjVar.a(this.i) <= dSqrt)) {
            if (this.c.p(this.a) || this.c.p(ekyjVar) || this.d.p(this.a) || this.d.p(ekyjVar)) {
                i2 = 0;
            } else if (!this.c.p(this.d) && !this.a.p(ekyjVar)) {
                if (this.f == 0) {
                    this.f = -ekyp.b(this.c, this.d, this.a);
                }
                int iB = this.b;
                if (iB == 0) {
                    iB = ekyp.b(this.c, this.d, ekyjVar);
                    this.b = iB;
                }
                if (iB == this.f) {
                    ekyj ekyjVarJ = ekyj.j(this.a, ekyjVar);
                    if ((-e(this.a, ekyjVar, this.d, ekyjVarJ)) == this.f && e(this.a, ekyjVar, this.c, ekyjVarJ) == this.f) {
                        i2 = 1;
                    }
                }
            }
        }
        this.a = ekyjVar;
        this.f = -this.b;
        return i2;
    }

    public final void b(ekyj ekyjVar, ekyj ekyjVar2) {
        this.c = ekyjVar;
        this.d = ekyjVar2;
        this.a = null;
        this.e = ekyj.j(ekyjVar, ekyjVar2);
        this.g = false;
    }

    public final void c(ekyj ekyjVar) {
        this.a = ekyjVar;
        this.f = -ekyp.a(this.e, ekyjVar);
    }

    public final boolean d(ekyj ekyjVar) {
        ekyj ekyjVar2 = this.a;
        int iA = a(ekyjVar);
        if (iA < 0) {
            return false;
        }
        if (iA > 0) {
            return true;
        }
        ekyj ekyjVar3 = this.c;
        ekyj ekyjVar4 = this.d;
        double d = ekxv.a;
        if (ekyjVar3.p(ekyjVar4) || ekyjVar2.p(ekyjVar)) {
            return false;
        }
        if (ekyjVar3.p(ekyjVar)) {
            return ekyq.b(ekxm.c(ekyjVar3), ekyjVar2, ekyjVar4, ekyjVar3);
        }
        if (ekyjVar4.p(ekyjVar2)) {
            return ekyq.b(ekxm.c(ekyjVar4), ekyjVar, ekyjVar3, ekyjVar4);
        }
        if (ekyjVar3.p(ekyjVar2)) {
            return ekyq.b(ekxm.c(ekyjVar3), ekyjVar, ekyjVar4, ekyjVar3);
        }
        if (ekyjVar4.p(ekyjVar)) {
            return ekyq.b(ekxm.c(ekyjVar4), ekyjVar2, ekyjVar3, ekyjVar4);
        }
        return false;
    }

    public ekxt(ekyj ekyjVar, ekyj ekyjVar2) {
        b(ekyjVar, ekyjVar2);
    }

    public ekxt(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3) {
        this(ekyjVar, ekyjVar2);
        c(ekyjVar3);
    }
}

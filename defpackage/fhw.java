package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fhw {
    public final kel a;
    public final fno b;
    public long c;
    public final juo d;
    private final juo e;
    private final long f;
    private final jyi g;

    public fhw(juo juoVar, long j, jyi jyiVar, kel kelVar, fno fnoVar) {
        this.e = juoVar;
        this.f = j;
        this.g = jyiVar;
        this.a = kelVar;
        this.b = fnoVar;
        this.c = j;
        this.d = juoVar;
    }

    private final void A() {
        int iA;
        this.b.a();
        if (f().length() <= 0 || (iA = a()) == -1) {
            return;
        }
        g(iA, iA);
    }

    private final void B() {
        Integer numD;
        this.b.a();
        if (f().length() <= 0 || (numD = d()) == null) {
            return;
        }
        int iIntValue = numD.intValue();
        g(iIntValue, iIntValue);
    }

    private final void C() {
        this.b.a();
        if (f().length() > 0) {
            juo juoVar = this.d;
            int iB = fba.b(juoVar.b, jyo.a(this.c));
            if (iB != -1) {
                g(iB, iB);
            }
        }
    }

    private final void D() {
        Integer numE;
        this.b.a();
        if (f().length() <= 0 || (numE = e()) == null) {
            return;
        }
        int iIntValue = numE.intValue();
        g(iIntValue, iIntValue);
    }

    private final int x(int i) {
        return fddu.g(i, f().length() - 1);
    }

    private final int y(jyi jyiVar, int i) {
        int iZ = z();
        fno fnoVar = this.b;
        if (fnoVar.a == null) {
            fnoVar.a = Float.valueOf(jyiVar.n(iZ).b);
        }
        int iH = jyiVar.h(iZ) + i;
        if (iH < 0) {
            return 0;
        }
        if (iH >= jyiVar.f()) {
            return f().length();
        }
        float fB = jyiVar.b(iH) - 1.0f;
        Float f = fnoVar.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((h() && fFloatValue >= jyiVar.d(iH)) || (!h() && fFloatValue <= jyiVar.c(iH))) {
            return jyiVar.g(iH, true);
        }
        return this.a.b(jyiVar.k((Float.floatToRawIntBits(f.floatValue()) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L)));
    }

    private final int z() {
        return this.a.a(jyo.a(this.c));
    }

    public final int a() {
        return fba.a(this.d.b, jyo.a(this.c));
    }

    public final Integer b() {
        jyi jyiVar = this.g;
        if (jyiVar == null) {
            return null;
        }
        kel kelVar = this.a;
        return Integer.valueOf(kelVar.b(jyiVar.g(jyiVar.h(kelVar.a(jyo.c(this.c))), true)));
    }

    public final Integer c() {
        jyi jyiVar = this.g;
        if (jyiVar == null) {
            return null;
        }
        kel kelVar = this.a;
        return Integer.valueOf(kelVar.b(jyiVar.j(jyiVar.h(kelVar.a(jyo.d(this.c))))));
    }

    public final Integer d() {
        int iA;
        jyi jyiVar = this.g;
        if (jyiVar == null) {
            return null;
        }
        int iZ = z();
        while (true) {
            juo juoVar = this.e;
            if (iZ < juoVar.a()) {
                long jL = jyiVar.l(x(iZ));
                if (jyo.a(jL) > iZ) {
                    iA = this.a.b(jyo.a(jL));
                    break;
                }
                iZ++;
            } else {
                iA = juoVar.a();
                break;
            }
        }
        return Integer.valueOf(iA);
    }

    public final Integer e() {
        int iB;
        jyi jyiVar = this.g;
        if (jyiVar == null) {
            return null;
        }
        int iZ = z();
        while (true) {
            if (iZ > 0) {
                long jL = jyiVar.l(x(iZ));
                if (jyo.e(jL) < iZ) {
                    iB = this.a.b(jyo.e(jL));
                    break;
                }
                iZ--;
            } else {
                iB = 0;
                break;
            }
        }
        return Integer.valueOf(iB);
    }

    public final String f() {
        return this.d.b;
    }

    public final void g(int i, int i2) {
        long jA = jyp.a(i, i2);
        long j = jyo.a;
        this.c = jA;
    }

    public final boolean h() {
        jyi jyiVar = this.g;
        return jyiVar == null || jyiVar.u(z()) != 2;
    }

    public final void i() {
        if (f().length() > 0) {
            long j = this.f;
            long j2 = jyo.a;
            this.c = jyp.a(jyo.e(j), jyo.a(this.c));
        }
    }

    public final void j() {
        jyi jyiVar;
        if (f().length() <= 0 || (jyiVar = this.g) == null) {
            return;
        }
        int iY = y(jyiVar, 1);
        g(iY, iY);
    }

    public final void k() {
        this.b.a();
        if (f().length() > 0) {
            if (h()) {
                C();
            } else {
                A();
            }
        }
    }

    public final void l() {
        this.b.a();
        if (f().length() > 0) {
            if (h()) {
                D();
            } else {
                B();
            }
        }
    }

    public final void m() {
        this.b.a();
        if (f().length() > 0) {
            int iA = faz.a(f(), jyo.c(this.c));
            if (iA == jyo.c(this.c) && iA != f().length()) {
                iA = faz.a(f(), iA + 1);
            }
            g(iA, iA);
        }
    }

    public final void n() {
        this.b.a();
        if (f().length() > 0) {
            int iB = faz.b(f(), jyo.d(this.c));
            if (iB == jyo.d(this.c) && iB != 0) {
                iB = faz.b(f(), iB - 1);
            }
            g(iB, iB);
        }
    }

    public final void o() {
        this.b.a();
        if (f().length() > 0) {
            if (h()) {
                A();
            } else {
                C();
            }
        }
    }

    public final void p() {
        this.b.a();
        if (f().length() > 0) {
            if (h()) {
                B();
            } else {
                D();
            }
        }
    }

    public final void q() {
        this.b.a();
        if (f().length() > 0) {
            int length = f().length();
            g(length, length);
        }
    }

    public final void r() {
        this.b.a();
        if (f().length() > 0) {
            g(0, 0);
        }
    }

    public final void s() {
        Integer numB;
        this.b.a();
        if (f().length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        g(iIntValue, iIntValue);
    }

    public final void t() {
        this.b.a();
        if (f().length() > 0) {
            if (h()) {
                v();
            } else {
                s();
            }
        }
    }

    public final void u() {
        this.b.a();
        if (f().length() > 0) {
            if (h()) {
                s();
            } else {
                v();
            }
        }
    }

    public final void v() {
        Integer numC;
        this.b.a();
        if (f().length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        g(iIntValue, iIntValue);
    }

    public final void w() {
        jyi jyiVar;
        if (f().length() <= 0 || (jyiVar = this.g) == null) {
            return;
        }
        int iY = y(jyiVar, -1);
        g(iY, iY);
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bh {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    bh ab;
    bh ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final bg i;
    final bg j;
    final bg k;
    final bg l;
    final bg m;
    final bg n;
    final bg o;
    final bg p;
    protected final ArrayList q;
    public bh r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public bh() {
        bg bgVar = new bg(this, 2);
        this.i = bgVar;
        bg bgVar2 = new bg(this, 3);
        this.j = bgVar2;
        bg bgVar3 = new bg(this, 4);
        this.k = bgVar3;
        bg bgVar4 = new bg(this, 5);
        this.l = bgVar4;
        bg bgVar5 = new bg(this, 6);
        this.m = bgVar5;
        bg bgVar6 = new bg(this, 8);
        this.n = bgVar6;
        bg bgVar7 = new bg(this, 9);
        this.o = bgVar7;
        this.p = new bg(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(bgVar);
        arrayList.add(bgVar2);
        arrayList.add(bgVar3);
        arrayList.add(bgVar4);
        arrayList.add(bgVar6);
        arrayList.add(bgVar7);
        arrayList.add(bgVar5);
    }

    private final void A(bc bcVar, boolean z, boolean z2, bg bgVar, bg bgVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        be beVarE = bcVar.e(bgVar);
        be beVarE2 = bcVar.e(bgVar2);
        be beVarE3 = bcVar.e(bgVar.b);
        be beVarE4 = bcVar.e(bgVar2.b);
        int iA = bgVar.a();
        int iA2 = bgVar2.a();
        int i8 = this.K;
        boolean z5 = i8 != 8;
        int i9 = i8 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (beVarE3 == null && beVarE4 == null) {
            az azVarA = bcVar.a();
            azVarA.g(beVarE, i);
            bcVar.g(azVarA);
            if (z3) {
                return;
            }
            if (z) {
                bcVar.g(bc.c(bcVar, beVarE2, beVarE, i4, true));
                return;
            } else {
                if (z6) {
                    bcVar.g(bc.c(bcVar, beVarE2, beVarE, i9, false));
                    return;
                }
                az azVarA2 = bcVar.a();
                azVarA2.g(beVarE2, i2);
                bcVar.g(azVarA2);
                return;
            }
        }
        if (beVarE3 != null && beVarE4 == null) {
            az azVarA3 = bcVar.a();
            azVarA3.h(beVarE, beVarE3, iA);
            bcVar.g(azVarA3);
            if (z) {
                bcVar.g(bc.c(bcVar, beVarE2, beVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                az azVarA4 = bcVar.a();
                azVarA4.h(beVarE2, beVarE, i9);
                bcVar.g(azVarA4);
                return;
            } else {
                az azVarA5 = bcVar.a();
                azVarA5.g(beVarE2, i2);
                bcVar.g(azVarA5);
                return;
            }
        }
        if (beVarE3 == null) {
            az azVarA6 = bcVar.a();
            azVarA6.h(beVarE2, beVarE4, -iA2);
            bcVar.g(azVarA6);
            if (z) {
                bcVar.g(bc.c(bcVar, beVarE2, beVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                az azVarA7 = bcVar.a();
                azVarA7.h(beVarE2, beVarE, i9);
                bcVar.g(azVarA7);
                return;
            } else {
                az azVarA8 = bcVar.a();
                azVarA8.g(beVarE, i);
                bcVar.g(azVarA8);
                return;
            }
        }
        if (!z6) {
            int i10 = i6;
            if (z3) {
                bcVar.i(beVarE, beVarE3, iA, 3);
                bcVar.j(beVarE2, beVarE4, -iA2, 3);
                bcVar.g(bc.b(bcVar, beVarE, beVarE3, iA, f, beVarE4, beVarE2, iA2, true));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -iA2;
            if (i5 == 1) {
                if (i10 <= i9) {
                    i10 = i9;
                }
                if (i7 > 0) {
                    if (i7 < i10) {
                        i10 = i7;
                    } else {
                        bcVar.j(beVarE2, beVarE, i7, 3);
                    }
                }
                bcVar.n(beVarE2, beVarE, i10, 3);
                bcVar.i(beVarE, beVarE3, iA, 2);
                bcVar.j(beVarE2, beVarE4, i11, 2);
                bcVar.m(beVarE, beVarE3, iA, f, beVarE4, beVarE2, iA2);
                return;
            }
            if (i10 != 0 || i7 != 0) {
                if (i7 > 0) {
                    bcVar.j(beVarE2, beVarE, i7, 3);
                }
                bcVar.i(beVarE, beVarE3, iA, 2);
                bcVar.j(beVarE2, beVarE4, i11, 2);
                bcVar.m(beVarE, beVarE3, iA, f, beVarE4, beVarE2, iA2);
                return;
            }
            az azVarA9 = bcVar.a();
            azVarA9.h(beVarE, beVarE3, iA);
            bcVar.g(azVarA9);
            az azVarA10 = bcVar.a();
            azVarA10.h(beVarE2, beVarE4, i11);
            bcVar.g(azVarA10);
            return;
        }
        if (z) {
            bcVar.g(bc.c(bcVar, beVarE2, beVarE, i4, true));
        } else {
            az azVarA11 = bcVar.a();
            azVarA11.h(beVarE2, beVarE, i9);
            bcVar.g(azVarA11);
        }
        int i12 = bgVar.h;
        if (i12 != bgVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                az azVarA12 = bcVar.a();
                azVarA12.h(beVarE, beVarE3, iA);
                bcVar.g(azVarA12);
                be beVarF = bcVar.f();
                az azVarA13 = bcVar.a();
                azVarA13.j(beVarE2, beVarE4, beVarF, i13);
                bcVar.g(azVarA13);
                return;
            }
            be beVarF2 = bcVar.f();
            az azVarA14 = bcVar.a();
            azVarA14.i(beVarE, beVarE3, beVarF2, iA);
            bcVar.g(azVarA14);
            az azVarA15 = bcVar.a();
            azVarA15.h(beVarE2, beVarE4, i13);
            bcVar.g(azVarA15);
            return;
        }
        if (beVarE3 == beVarE4) {
            bcVar.g(bc.b(bcVar, beVarE, beVarE3, 0, 0.5f, beVarE4, beVarE2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = bgVar.i;
        be beVarF3 = bcVar.f();
        az azVarA16 = bcVar.a();
        azVarA16.i(beVarE, beVarE3, beVarF3, iA);
        if (i15 != 2) {
            bcVar.k(azVarA16, (int) (-azVarA16.d.a(beVarF3)));
        }
        bcVar.g(azVarA16);
        int i16 = bgVar2.i;
        be beVarF4 = bcVar.f();
        az azVarA17 = bcVar.a();
        azVarA17.j(beVarE2, beVarE4, beVarF4, i14);
        if (i16 != 2) {
            bcVar.k(azVarA17, (int) (-azVarA17.d.a(beVarF4)));
        }
        bcVar.g(azVarA17);
        bcVar.g(bc.b(bcVar, beVarE, beVarE3, iA, f, beVarE4, beVarE2, iA2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int iMax = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                iMax = Math.max(this.g, iMax);
            } else {
                iMax = this.g;
                if (iMax > 0) {
                    this.t = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.h;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public final int f() {
        int iMax = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                iMax = Math.max(this.e, iMax);
            } else {
                iMax = this.e;
                if (iMax > 0) {
                    this.s = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.f;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public void j(ba baVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }

    public final void k(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void l(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void n(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void o(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void p(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void q(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void r() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean s() {
        return this.C > 0;
    }

    public final boolean t() {
        return this.r == null;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public bg u(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final void v(int i, bh bhVar, int i2, int i3, int i4) {
        u(i).d(bhVar.u(i2), i3, i4, 2, 0, true);
    }

    public final void w(int i) {
        this.ad = i;
        if (i == 2) {
            q(this.F);
        }
    }

    public final void x(int i) {
        this.ae = i;
        if (i == 2) {
            k(this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.bc r45) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.y(bc):void");
    }

    public void z() {
        int i;
        int i2;
        int iP = bc.p(this.i);
        int iP2 = bc.p(this.j);
        int iP3 = bc.p(this.k) - iP;
        int iP4 = bc.p(this.l) - iP2;
        this.w = iP;
        this.x = iP2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iP3 < (i2 = this.s)) {
            iP3 = i2;
        }
        if (this.ae == 1 && iP4 < (i = this.t)) {
            iP4 = i;
        }
        this.s = iP3;
        this.t = iP4;
        int i3 = this.E;
        if (iP4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iP3 < i4) {
            this.s = i4;
        }
    }
}

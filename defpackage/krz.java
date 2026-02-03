package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krz {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int[] E;
    public int F;
    public int G;
    public float H;
    public int I;
    public int J;
    public float K;
    int L;
    float M;
    public final int[] N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public final kry T;
    public final kry U;
    public final kry V;
    public final kry W;
    public final kry X;
    final kry Y;
    final kry Z;
    private boolean a;
    public final int[] aA;
    public final kry aa;
    public final kry[] ab;
    protected final ArrayList ac;
    public final boolean[] ad;
    public krz ae;
    int af;
    public int ag;
    public float ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public float ao;
    public float ap;
    public Object aq;
    public int ar;
    public String as;
    public int at;
    public int au;
    public final float[] av;
    protected final krz[] aw;
    protected final krz[] ax;
    public int ay;
    public int az;
    public boolean l;
    public ksm m;
    public ksm n;
    public ksv o;
    public ksx p;
    public final boolean[] q;
    public boolean r;
    public int s;
    public int t;
    public final krk u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public krz() {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new krk(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        kry kryVar = new kry(this, 2);
        this.T = kryVar;
        kry kryVar2 = new kry(this, 3);
        this.U = kryVar2;
        kry kryVar3 = new kry(this, 4);
        this.V = kryVar3;
        kry kryVar4 = new kry(this, 5);
        this.W = kryVar4;
        kry kryVar5 = new kry(this, 6);
        this.X = kryVar5;
        this.Y = new kry(this, 8);
        this.Z = new kry(this, 9);
        kry kryVar6 = new kry(this, 7);
        this.aa = kryVar6;
        this.ab = new kry[]{kryVar, kryVar3, kryVar2, kryVar4, kryVar5, kryVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.af = 0;
        this.ag = 0;
        this.ah = 0.0f;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new krz[]{null, null};
        this.ax = new krz[]{null, null};
        this.ay = -1;
        this.az = -1;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b9 A[PHI: r2
      0x04b9: PHI (r2v34 int) = (r2v33 int), (r2v38 int), (r2v38 int), (r2v38 int) binds: [B:284:0x04a9, B:286:0x04af, B:287:0x04b1, B:289:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ae(defpackage.kqe r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.kqj r34, defpackage.kqj r35, int r36, boolean r37, defpackage.kry r38, defpackage.kry r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krz.ae(kqe, boolean, boolean, boolean, boolean, kqj, kqj, int, boolean, kry, kry, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private final void b() {
        ArrayList arrayList = this.ac;
        arrayList.add(this.T);
        arrayList.add(this.U);
        arrayList.add(this.V);
        arrayList.add(this.W);
        arrayList.add(this.Y);
        arrayList.add(this.Z);
        arrayList.add(this.aa);
        arrayList.add(this.X);
    }

    private final boolean c(int i) {
        kry kryVar;
        kry kryVar2;
        kry[] kryVarArr = this.ab;
        int i2 = i + i;
        kry kryVar3 = kryVarArr[i2];
        kry kryVar4 = kryVar3.e;
        return (kryVar4 == null || kryVar4.e == kryVar3 || (kryVar2 = (kryVar = kryVarArr[i2 + 1]).e) == null || kryVar2.e != kryVar) ? false : true;
    }

    public final void A(int i, int i2) {
        if (this.a) {
            return;
        }
        this.T.f(i);
        this.V.f(i2);
        this.aj = i;
        this.af = i2 - i;
        this.a = true;
    }

    public final void B(int i, int i2) {
        if (this.w) {
            return;
        }
        this.U.f(i);
        this.W.f(i2);
        this.ak = i;
        this.ag = i2 - i;
        if (this.P) {
            this.X.f(i + this.al);
        }
        this.w = true;
    }

    public final void C(int i) {
        this.ag = i;
        int i2 = this.an;
        if (i < i2) {
            this.ag = i2;
        }
    }

    public final void D(int i, int i2, int i3, float f) {
        this.C = i;
        this.F = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.G = i3;
        this.H = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.C = 2;
    }

    public final void E(float f) {
        this.av[0] = f;
    }

    protected final void F(int i, boolean z) {
        this.ad[i] = z;
    }

    public final void G(int i, int i2) {
        this.R = i;
        this.S = i2;
        this.r = false;
    }

    public final void H(int i) {
        this.N[1] = i;
    }

    public final void I(int i) {
        this.N[0] = i;
    }

    public final void J(int i) {
        if (i < 0) {
            this.an = 0;
        } else {
            this.an = i;
        }
    }

    public final void K(int i) {
        if (i < 0) {
            this.am = 0;
        } else {
            this.am = i;
        }
    }

    public final void L(int i, int i2, int i3, float f) {
        this.D = i;
        this.I = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.J = i3;
        this.K = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.D = 2;
    }

    public final void M(float f) {
        this.av[1] = f;
    }

    public final void N(int i) {
        this.af = i;
        int i2 = this.am;
        if (i < i2) {
            this.af = i2;
        }
    }

    public void O(boolean z, boolean z2) {
        int i;
        int i2;
        ksv ksvVar = this.o;
        boolean z3 = z & ksvVar.h;
        ksx ksxVar = this.p;
        boolean z4 = z2 & ksxVar.h;
        int i3 = ksvVar.i.f;
        int i4 = ksxVar.i.f;
        int i5 = ksvVar.j.f;
        int i6 = ksxVar.j.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aj = i3;
        }
        if (z4) {
            this.ak = i4;
        }
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.aA[0] == 1 && i8 < (i2 = this.af)) {
                i8 = i2;
            }
            this.af = i8;
            int i9 = this.am;
            if (i8 < i9) {
                this.af = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.aA[1] == 1 && i10 < (i = this.ag)) {
                i10 = i;
            }
            this.ag = i10;
            int i11 = this.an;
            if (i10 < i11) {
                this.ag = i11;
            }
        }
    }

    final boolean P() {
        return (this instanceof ksg) || (this instanceof ksd);
    }

    public final boolean Q(int i) {
        if (i == 0) {
            return (this.T.e != null ? 1 : 0) + (this.V.e != null ? 1 : 0) < 2;
        }
        return ((this.U.e != null ? 1 : 0) + (this.W.e != null ? 1 : 0)) + (this.X.e != null ? 1 : 0) < 2;
    }

    public final boolean R(int i, int i2) {
        kry kryVar;
        kry kryVar2;
        kry kryVar3;
        kry kryVar4;
        if (i == 0) {
            kry kryVar5 = this.T;
            kry kryVar6 = kryVar5.e;
            return kryVar6 != null && kryVar6.c && (kryVar4 = (kryVar3 = this.V).e) != null && kryVar4.c && (kryVar4.a() - kryVar3.b()) - (kryVar5.e.a() + kryVar5.b()) >= i2;
        }
        kry kryVar7 = this.U;
        kry kryVar8 = kryVar7.e;
        if (kryVar8 != null && kryVar8.c && (kryVar2 = (kryVar = this.W).e) != null && kryVar2.c && (kryVar2.a() - kryVar.b()) - (kryVar7.e.a() + kryVar7.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        kry kryVar = this.T;
        kry kryVar2 = kryVar.e;
        if (kryVar2 != null && kryVar2.e == kryVar) {
            return true;
        }
        kry kryVar3 = this.V;
        kry kryVar4 = kryVar3.e;
        return kryVar4 != null && kryVar4.e == kryVar3;
    }

    public final boolean T() {
        kry kryVar = this.U;
        kry kryVar2 = kryVar.e;
        if (kryVar2 != null && kryVar2.e == kryVar) {
            return true;
        }
        kry kryVar3 = this.W;
        kry kryVar4 = kryVar3.e;
        return kryVar4 != null && kryVar4.e == kryVar3;
    }

    public final boolean U() {
        return this.r && this.ar != 8;
    }

    public kry V(int i) {
        switch (i - 1) {
            case 1:
                return this.T;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.X;
            case 6:
                return this.aa;
            case 7:
                return this.Y;
            default:
                return this.Z;
        }
    }

    public final int W(int i) {
        return i == 0 ? X() : Y();
    }

    public final int X() {
        return this.aA[0];
    }

    public final int Y() {
        return this.aA[1];
    }

    public final void Z(int i, krz krzVar, int i2, int i3) {
        int i4;
        boolean z;
        int i5 = 4;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2) {
                    i2 = 2;
                } else if (i2 != 4) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return;
                        } else {
                            i2 = 5;
                        }
                    }
                    Z(3, krzVar, i2, 0);
                    Z(5, krzVar, i2, 0);
                    V(7).l(krzVar.V(i2), 0);
                    return;
                }
                Z(2, krzVar, i2, 0);
                Z(4, krzVar, i2, 0);
                V(7).l(krzVar.V(i2), 0);
                return;
            }
            kry kryVarV = V(2);
            kry kryVarV2 = V(4);
            kry kryVarV3 = V(3);
            kry kryVarV4 = V(5);
            boolean z2 = true;
            if ((kryVarV == null || !kryVarV.j()) && (kryVarV2 == null || !kryVarV2.j())) {
                Z(2, krzVar, 2, 0);
                Z(4, krzVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((kryVarV3 == null || !kryVarV3.j()) && (kryVarV4 == null || !kryVarV4.j())) {
                Z(3, krzVar, 3, 0);
                Z(5, krzVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                V(7).l(krzVar.V(7), 0);
                return;
            } else if (z) {
                V(8).l(krzVar.V(8), 0);
                return;
            } else {
                if (z2) {
                    V(9).l(krzVar.V(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8) {
            if (i2 == 2) {
                i4 = 2;
            } else if (i2 == 4) {
                i4 = 4;
            } else {
                i = 8;
            }
            kry kryVarV5 = V(2);
            kry kryVarV6 = krzVar.V(i4);
            kry kryVarV7 = V(4);
            kryVarV5.l(kryVarV6, 0);
            kryVarV7.l(kryVarV6, 0);
            V(8).l(kryVarV6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            kry kryVarV8 = krzVar.V(i2);
            V(3).l(kryVarV8, 0);
            V(5).l(kryVarV8, 0);
            V(9).l(kryVarV8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            V(2).l(krzVar.V(2), 0);
            V(4).l(krzVar.V(4), 0);
            V(8).l(krzVar.V(8), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            V(3).l(krzVar.V(3), 0);
            V(5).l(krzVar.V(5), 0);
            V(9).l(krzVar.V(9), 0);
            return;
        }
        kry kryVarV9 = V(i);
        kry kryVarV10 = krzVar.V(i2);
        if (kryVarV9.k(kryVarV10)) {
            if (i == 6) {
                kry kryVarV11 = V(3);
                kry kryVarV12 = V(5);
                if (kryVarV11 != null) {
                    kryVarV11.e();
                }
                if (kryVarV12 != null) {
                    kryVarV12.e();
                }
            } else if (i == 3 || i == 5) {
                kry kryVarV13 = V(6);
                if (kryVarV13 != null) {
                    kryVarV13.e();
                }
                kry kryVarV14 = V(7);
                if (kryVarV14.e != kryVarV10) {
                    kryVarV14.e();
                }
                kry kryVarC = V(i).c();
                kry kryVarV15 = V(9);
                if (kryVarV15.j()) {
                    kryVarC.e();
                    kryVarV15.e();
                }
            } else {
                if (i == 2) {
                    i5 = i;
                } else if (i == 4) {
                }
                kry kryVarV16 = V(7);
                if (kryVarV16.e != kryVarV10) {
                    kryVarV16.e();
                }
                kry kryVarC2 = V(i5).c();
                kry kryVarV17 = V(8);
                if (kryVarV17.j()) {
                    kryVarC2.e();
                    kryVarV17.e();
                }
            }
            kryVarV9.l(kryVarV10, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v44, types: [ksa] */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.kqe r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krz.a(kqe, boolean):void");
    }

    public final void aa(int i, krz krzVar, int i2, int i3, int i4) {
        V(i).n(krzVar.V(i2), i3, i4, true);
    }

    public final void ab(int i) {
        this.aA[0] = i;
    }

    public final void ac(int i) {
        this.aA[1] = i;
    }

    public void ad(boolean z) {
        int i;
        ksx ksxVar;
        ksv ksvVar;
        int iO = kqe.o(this.T);
        int iO2 = kqe.o(this.U);
        int iO3 = kqe.o(this.V);
        int iO4 = kqe.o(this.W);
        if (z && (ksvVar = this.o) != null) {
            ksp kspVar = ksvVar.i;
            if (kspVar.i) {
                ksp kspVar2 = ksvVar.j;
                if (kspVar2.i) {
                    iO = kspVar.f;
                    iO3 = kspVar2.f;
                }
            }
        }
        if (z && (ksxVar = this.p) != null) {
            ksp kspVar3 = ksxVar.i;
            if (kspVar3.i) {
                ksp kspVar4 = ksxVar.j;
                if (kspVar4.i) {
                    iO2 = kspVar3.f;
                    iO4 = kspVar4.f;
                }
            }
        }
        if (iO3 - iO < 0 || iO4 - iO2 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO = 0;
            iO2 = 0;
            iO3 = 0;
            iO4 = 0;
        }
        this.aj = iO;
        this.ak = iO2;
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        int i2 = iO3 - iO;
        int[] iArr = this.aA;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.af;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = iO4 - iO2;
        if (iArr[1] == 1 && i5 < (i = this.ag)) {
            i5 = i;
        }
        this.af = i2;
        this.ag = i5;
        int i6 = this.an;
        if (i5 < i6) {
            this.ag = i6;
        }
        int i7 = this.am;
        if (i2 < i7) {
            this.af = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.G;
        if (i8 > 0 && i3 == 3) {
            this.af = Math.min(i7, i8);
        }
        int i9 = this.J;
        if (i9 > 0 && iArr[1] == 3) {
            this.ag = Math.min(this.ag, i9);
        }
        int i10 = this.af;
        if (i2 != i10) {
            this.s = i10;
        }
        int i11 = this.ag;
        if (i5 != i11) {
            this.t = i11;
        }
    }

    public boolean ay() {
        return this.ar != 8;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        return this.T.c && this.V.c;
    }

    public boolean f() {
        if (this.w) {
            return true;
        }
        return this.U.c && this.W.c;
    }

    public final int g() {
        return l() + this.ag;
    }

    public final int h() {
        if (this.ar == 8) {
            return 0;
        }
        return this.ag;
    }

    public final int i() {
        return k() + this.af;
    }

    public final int j() {
        if (this.ar == 8) {
            return 0;
        }
        return this.af;
    }

    public final int k() {
        krz krzVar = this.ae;
        return (krzVar == null || !(krzVar instanceof ksa)) ? this.aj : ((ksa) krzVar).g + this.aj;
    }

    public final int l() {
        krz krzVar = this.ae;
        return (krzVar == null || !(krzVar instanceof ksa)) ? this.ak : ((ksa) krzVar).h + this.ak;
    }

    public final krz m(int i) {
        kry kryVar;
        kry kryVar2;
        if (i == 0) {
            kry kryVar3 = this.V;
            kryVar2 = kryVar3.e;
            if (kryVar2 == null || kryVar2.e != kryVar3) {
                return null;
            }
        } else if (i != 1 || (kryVar2 = (kryVar = this.W).e) == null || kryVar2.e != kryVar) {
            return null;
        }
        return kryVar2.d;
    }

    public final krz n(int i) {
        kry kryVar;
        kry kryVar2;
        if (i == 0) {
            kry kryVar3 = this.T;
            kryVar2 = kryVar3.e;
            if (kryVar2 == null || kryVar2.e != kryVar3) {
                return null;
            }
        } else if (i != 1 || (kryVar2 = (kryVar = this.U).e) == null || kryVar2.e != kryVar) {
            return null;
        }
        return kryVar2.d;
    }

    public final kta o(int i) {
        if (i == 0) {
            return this.o;
        }
        if (i == 1) {
            return this.p;
        }
        return null;
    }

    public final void p(ksa ksaVar, kqe kqeVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            ksf.a(ksaVar, kqeVar, this);
            hashSet.remove(this);
            a(kqeVar, ksaVar.aj(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.T.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((kry) it.next()).d.p(ksaVar, kqeVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.V.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((kry) it2.next()).d.p(ksaVar, kqeVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.U.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((kry) it3.next()).d.p(ksaVar, kqeVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.W.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((kry) it4.next()).d.p(ksaVar, kqeVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.X.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((kry) it5.next()).d.p(ksaVar, kqeVar, hashSet, 1, true);
            }
        }
    }

    public final void q(kry kryVar, kry kryVar2, int i) {
        if (kryVar.d == this) {
            Z(kryVar.i, kryVar2.d, kryVar2.i, i);
        }
    }

    public final void r(krz krzVar, float f, int i) {
        aa(7, krzVar, 7, i, 0);
        this.O = f;
    }

    public final void s(kqe kqeVar) {
        kqeVar.b(this.T);
        kqeVar.b(this.U);
        kqeVar.b(this.V);
        kqeVar.b(this.W);
        if (this.al > 0) {
            kqeVar.b(this.X);
        }
    }

    public final void t() {
        if (this.o == null) {
            this.o = new ksv(this);
        }
        if (this.p == null) {
            this.p = new ksx(this);
        }
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.as != null) {
            str = "id: " + this.as + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.aj);
        sb.append(", ");
        sb.append(this.ak);
        sb.append(") - (");
        sb.append(this.af);
        sb.append(" x ");
        sb.append(this.ag);
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.T.e();
        this.U.e();
        this.V.e();
        this.W.e();
        this.X.e();
        this.Y.e();
        this.Z.e();
        this.aa.e();
        this.ae = null;
        this.O = Float.NaN;
        this.af = 0;
        this.ag = 0;
        this.ah = 0.0f;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        int[] iArr = this.aA;
        iArr[0] = 1;
        iArr[1] = 1;
        this.aq = null;
        this.ar = 0;
        this.at = 0;
        this.au = 0;
        float[] fArr = this.av;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.z = -1;
        this.A = -1;
        int[] iArr2 = this.N;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.C = 0;
        this.D = 0;
        this.H = 1.0f;
        this.K = 1.0f;
        this.G = Alert.DURATION_SHOW_INDEFINITELY;
        this.J = Alert.DURATION_SHOW_INDEFINITELY;
        this.F = 0;
        this.I = 0;
        this.L = -1;
        this.M = 1.0f;
        boolean[] zArr = this.q;
        zArr[0] = true;
        zArr[1] = true;
        this.Q = false;
        boolean[] zArr2 = this.ad;
        zArr2[0] = false;
        zArr2[1] = false;
        this.r = true;
        int[] iArr3 = this.E;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.s = -1;
        this.t = -1;
    }

    public final void v() {
        krz krzVar = this.ae;
        if (krzVar != null && (krzVar instanceof ksa)) {
        }
        ArrayList arrayList = this.ac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kry) arrayList.get(i)).e();
        }
    }

    public final void w() {
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        ArrayList arrayList = this.ac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kry kryVar = (kry) arrayList.get(i);
            kryVar.c = false;
            kryVar.b = 0;
        }
    }

    public void x(kqd kqdVar) {
        this.T.m();
        this.U.m();
        this.V.m();
        this.W.m();
        this.X.m();
        this.aa.m();
        this.Y.m();
        this.Z.m();
    }

    public final void y(int i) {
        this.al = i;
        this.P = i > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[PHI: r0
      0x0089: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:47:0x0089, B:37:0x0082, B:25:0x0054, B:27:0x005a, B:29:0x0066, B:31:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0089 -> B:41:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r10) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L93
            int r1 = r10.length()
            if (r1 != 0) goto Lb
            goto L93
        Lb:
            int r1 = r10.length()
            r2 = 44
            int r2 = r10.indexOf(r2)
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 <= 0) goto L3b
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L3b
            java.lang.String r6 = r10.substring(r4, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r4 = r3
            goto L36
        L35:
            r4 = r5
        L36:
            int r2 = r2 + r3
            r8 = r4
            r4 = r2
            r2 = r8
            goto L3c
        L3b:
            r2 = r5
        L3c:
            r6 = 58
            int r6 = r10.indexOf(r6)
            if (r6 < 0) goto L7a
            int r1 = r1 + r5
            if (r6 >= r1) goto L7a
            java.lang.String r1 = r10.substring(r4, r6)
            int r6 = r6 + r3
            java.lang.String r10 = r10.substring(r6)
            int r4 = r1.length()
            if (r4 <= 0) goto L89
            int r4 = r10.length()
            if (r4 <= 0) goto L89
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L89
            float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.lang.NumberFormatException -> L89
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 <= 0) goto L89
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L89
            if (r2 != r3) goto L74
            float r10 = r10 / r1
            float r10 = java.lang.Math.abs(r10)     // Catch: java.lang.NumberFormatException -> L89
            goto L8a
        L74:
            float r1 = r1 / r10
            float r10 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L89
            goto L8a
        L7a:
            java.lang.String r10 = r10.substring(r4)
            int r1 = r10.length()
            if (r1 <= 0) goto L89
            float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.lang.NumberFormatException -> L89
            goto L8a
        L89:
            r10 = r0
        L8a:
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L92
            r9.ah = r10
            r9.ai = r2
        L92:
            return
        L93:
            r9.ah = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krz.z(java.lang.String):void");
    }

    public krz(int i, int i2) {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new krk(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        kry kryVar = new kry(this, 2);
        this.T = kryVar;
        kry kryVar2 = new kry(this, 3);
        this.U = kryVar2;
        kry kryVar3 = new kry(this, 4);
        this.V = kryVar3;
        kry kryVar4 = new kry(this, 5);
        this.W = kryVar4;
        kry kryVar5 = new kry(this, 6);
        this.X = kryVar5;
        this.Y = new kry(this, 8);
        this.Z = new kry(this, 9);
        kry kryVar6 = new kry(this, 7);
        this.aa = kryVar6;
        this.ab = new kry[]{kryVar, kryVar3, kryVar2, kryVar4, kryVar5, kryVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.ah = 0.0f;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new krz[]{null, null};
        this.ax = new krz[]{null, null};
        this.ay = -1;
        this.az = -1;
        this.af = i;
        this.ag = i2;
        b();
    }
}

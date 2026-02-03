package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmw implements hml {
    public long A;
    public hxi B;
    public iwm C;
    private final Set D;
    private hpp F;
    private int G;
    private int H;
    private int I;
    private cuf K;
    private int M;
    private final hmu N;
    private final ArrayList O;
    private hlv P;
    private hso Q;
    private final ibk R;
    private ibh S;
    public final hlw a;
    public final hnb b;
    public final hra c;
    public final hsm d;
    public final hsm e;
    public final hnq f;
    public int[] g;
    public boolean h;
    public boolean i;
    public cuh k;
    public boolean l;
    public boolean n;
    public int p;
    public boolean q;
    public boolean r;
    public hqz s;
    public hra t;
    public hre u;
    public boolean v;
    public hsm w;
    public final hsn x;
    public final fcyh y;
    public boolean z;
    private final ArrayList E = new ArrayList();
    private final hog J = new hog();
    public final List j = new ArrayList();
    private final hog L = new hog();
    private hxi T = hxi.d;
    public final hog m = new hog();
    public int o = -1;

    public hmw(hlw hlwVar, hnb hnbVar, hra hraVar, Set set, hsm hsmVar, hsm hsmVar2, hnq hnqVar) {
        this.a = hlwVar;
        this.b = hnbVar;
        this.c = hraVar;
        this.D = set;
        this.d = hsmVar;
        this.e = hsmVar2;
        this.f = hnqVar;
        this.q = hnbVar.s() || hnbVar.q();
        this.N = new hmu(this);
        this.O = new ArrayList();
        hqz hqzVarC = hraVar.c();
        hqzVarC.r();
        this.s = hqzVarC;
        hra hraVar2 = new hra();
        if (hnbVar.s()) {
            hraVar2.f();
        }
        if (hnbVar.q()) {
            hraVar2.e();
        }
        this.t = hraVar2;
        hre hreVarD = hraVar2.d();
        hreVarD.A(true);
        this.u = hreVarD;
        this.x = new hsn(this, hsmVar);
        hqz hqzVarC2 = this.t.c();
        try {
            hlv hlvVarG = hqzVarC2.g(0);
            hqzVarC2.r();
            this.P = hlvVarG;
            this.Q = new hso();
            this.R = new ibk(this);
            fcyh fcyhVarD = hnbVar.d();
            fcyh fcyhVarQ = Q();
            this.y = fcyhVarD.plus(fcyhVarQ == null ? fcyi.a : fcyhVarQ);
        } catch (Throwable th) {
            hqzVarC2.r();
            throw th;
        }
    }

    private static final void aA(hmw hmwVar, List list, int i) {
        int iC = hmwVar.s.c(i) + i;
        int iC2 = i + 1;
        while (iC2 < iC) {
            if (hmwVar.s.y(iC2)) {
                how howVarAr = ar(hmwVar, iC2);
                if (howVarAr != null) {
                    list.add(howVarAr);
                }
            } else if (hmwVar.s.w(iC2)) {
                aA(hmwVar, list, iC2);
            }
            iC2 += hmwVar.s.c(iC2);
        }
    }

    private final void aB() {
        hqz hqzVar = this.s;
        int i = hqzVar.h;
        this.H = i >= 0 ? hqzVar.b[(i * 5) + 1] & 67108863 : 0;
        hqzVar.u();
    }

    private final void aC(int i) {
        ad(i, null, 0, null);
    }

    private final void aD(boolean z, Object obj) {
        if (z) {
            hqz hqzVar = this.s;
            if (hqzVar.i <= 0) {
                if ((hqzVar.b[(hqzVar.f * 5) + 1] & 1073741824) == 0) {
                    hpq.a("Expected a node group");
                }
                hqzVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.s.h() != obj) {
            hsn hsnVar = this.x;
            hsnVar.j(false);
            huf hufVar = hsnVar.a.a;
            hufVar.c(htt.a);
            hue.a(hufVar, 0, obj);
        }
        this.s.v();
    }

    private final void aE(int i, int i2) {
        int iO = O(i);
        if (iO != i2) {
            ArrayList arrayList = this.E;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iO2 = O(i) + (i2 - iO);
                ah(i, iO2);
                int i3 = size;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    hpp hppVar = (hpp) arrayList.get(i3);
                    if (hppVar != null && hppVar.d(i, iO2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                if (i < 0) {
                    i = this.s.h;
                } else if (this.s.B(i)) {
                    return;
                } else {
                    i = this.s.e(i);
                }
            }
        }
    }

    private final void aF(Object obj) {
        R();
        ai(obj);
    }

    private final void aG() {
        if (!this.i) {
            hmz.j("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.i = false;
    }

    private final void aH() {
        if (this.i) {
            hmz.j("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final hxi aI(int i) {
        hxi hxiVar;
        if (this.z && this.v) {
            int iL = this.u.s;
            while (iL > 0) {
                if (this.u.i(iL) == 202 && fdbq.f(this.u.v(iL), hmz.c)) {
                    Object objU = this.u.u(iL);
                    objU.getClass();
                    hxi hxiVar2 = (hxi) objU;
                    this.B = hxiVar2;
                    return hxiVar2;
                }
                iL = this.u.l(iL);
            }
        }
        if (this.s.c > 0) {
            while (i > 0) {
                if (this.s.b(i) == 202 && fdbq.f(this.s.m(i), hmz.c)) {
                    cuh cuhVar = this.k;
                    if (cuhVar == null || (hxiVar = (hxi) cuhVar.a(i)) == null) {
                        Object objJ = this.s.j(i);
                        objJ.getClass();
                        hxiVar = (hxi) objJ;
                    }
                    this.B = hxiVar;
                    return hxiVar;
                }
                i = this.s.e(i);
            }
        }
        hxi hxiVar3 = this.T;
        this.B = hxiVar3;
        return hxiVar3;
    }

    private static final int aJ(int i) {
        return (-2) - i;
    }

    private final int ap(int i) {
        int iE = this.s.e(i) + 1;
        int i2 = 0;
        while (iE < i) {
            if (!this.s.z(iE)) {
                i2++;
            }
            iE += this.s.c(iE);
        }
        return i2;
    }

    private static final int aq(hmw hmwVar, int i, int i2, boolean z, int i3) {
        hqz hqzVar = hmwVar.s;
        if (!hqzVar.y(i2)) {
            if (!hqzVar.w(i2)) {
                if (hqzVar.B(i2)) {
                    return 1;
                }
                return hqzVar.d(i2);
            }
            int iC = hqzVar.c(i2) + i2;
            int iAq = 0;
            for (int iC2 = i2 + 1; iC2 < iC; iC2 += hqzVar.c(iC2)) {
                boolean zB = hqzVar.B(iC2);
                if (zB) {
                    hsn hsnVar = hmwVar.x;
                    hsnVar.i();
                    hsnVar.d(hqzVar.o(iC2));
                }
                iAq += aq(hmwVar, i, iC2, zB || z, zB ? 0 : i3 + iAq);
                if (zB) {
                    hsn hsnVar2 = hmwVar.x;
                    hsnVar2.i();
                    hsnVar2.f();
                }
            }
            if (hqzVar.B(i2)) {
                return 1;
            }
            return iAq;
        }
        int iB = hqzVar.b(i2);
        Object objM = hqzVar.m(i2);
        if (iB == 126665345) {
            if (objM instanceof hot) {
                how howVarAr = ar(hmwVar, i2);
                if (howVarAr != null) {
                    hnb hnbVar = hmwVar.b;
                    hnbVar.f(howVarAr);
                    hsn hsnVar3 = hmwVar.x;
                    hsnVar3.k();
                    hnq hnqVar = hmwVar.f;
                    huf hufVar = hsnVar3.a.a;
                    hufVar.c(htj.a);
                    hue.c(hufVar, hnqVar, hnbVar, howVarAr);
                }
                if (!z || i2 == i) {
                    return hqzVar.d(i2);
                }
                hsn hsnVar4 = hmwVar.x;
                hsnVar4.i();
                hsnVar4.g();
                int iD = hsnVar4.a().B(i2) ? 1 : hsnVar4.a().d(i2);
                if (iD <= 0) {
                    return 0;
                }
                hsnVar4.l(i3, iD);
                return 0;
            }
        } else if (iB == 206 && fdbq.f(objM, hmz.e)) {
            Object objL = hqzVar.l(i2, 0);
            hms hmsVar = objL instanceof hms ? (hms) objL : null;
            if (hmsVar != null) {
                for (hmw hmwVar2 : hmsVar.a.a) {
                    hra hraVar = hmwVar2.c;
                    if (hraVar.b > 0 && (hraVar.a[1] & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                        hnq hnqVar2 = hmwVar2.f;
                        synchronized (((hne) hnqVar2).b) {
                            Object andSet = ((hne) hnqVar2).a.getAndSet(fcvq.a);
                            if (!fdbq.f(andSet, hnf.a) && andSet != null) {
                                if (andSet instanceof Set) {
                                    ((hne) hnqVar2).h((Set) andSet, false);
                                } else {
                                    if (!(andSet instanceof Object[])) {
                                        AtomicReference atomicReference = ((hne) hnqVar2).a;
                                        Objects.toString(atomicReference);
                                        hmz.h("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                        throw new fcta();
                                    }
                                    for (Set set : (Set[]) andSet) {
                                        ((hne) hnqVar2).h(set, false);
                                    }
                                }
                            }
                            cuz cuzVarF = ((hne) hnqVar2).f();
                            try {
                                ((hne) hnqVar2).k.ag(cuzVarF);
                            } catch (Throwable th) {
                                ((hne) hnqVar2).g = cuzVarF;
                                throw th;
                            }
                        }
                        hsm hsmVar = new hsm();
                        hmwVar2.w = hsmVar;
                        hqz hqzVarC = hraVar.c();
                        try {
                            hmwVar2.s = hqzVarC;
                            hsn hsnVar5 = hmwVar2.x;
                            hsm hsmVar2 = hsnVar5.a;
                            try {
                                hsnVar5.a = hsmVar;
                                hmwVar2.az(0);
                                hsnVar5.g();
                                if (hsnVar5.b) {
                                    hsnVar5.m();
                                    hsnVar5.b();
                                }
                            } finally {
                            }
                        } finally {
                            hqzVarC.r();
                        }
                    }
                    hmwVar.b.m(hmwVar2.f);
                }
            }
            return hqzVar.d(i2);
        }
        if (hqzVar.B(i2)) {
            return 1;
        }
        return hqzVar.d(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.how ar(defpackage.hmw r13, int r14) {
        /*
            hqz r0 = r13.s
            int r0 = r0.b(r14)
            hqz r1 = r13.s
            java.lang.Object r1 = r1.m(r14)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L88
            boolean r0 = r1 instanceof defpackage.hot
            if (r0 == 0) goto L88
            hqz r0 = r13.s
            boolean r0 = r0.w(r14)
            if (r0 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            aA(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r12 = r0
            goto L30
        L2f:
            r12 = r3
        L30:
            hqz r0 = r13.s
            java.lang.Object r0 = r0.m(r14)
            r0.getClass()
            r5 = r0
            hot r5 = (defpackage.hot) r5
            hqz r0 = r13.s
            r1 = 0
            java.lang.Object r6 = r0.l(r14, r1)
            hqz r0 = r13.s
            hlv r9 = r0.g(r14)
            hqz r0 = r13.s
            int r0 = r0.c(r14)
            int r0 = r0 + r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r1 = r13.j
            int r2 = defpackage.hmz.c(r1, r14)
        L5b:
            int r3 = r1.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r1.get(r2)
            hoh r3 = (defpackage.hoh) r3
            int r4 = r3.b
            if (r4 >= r0) goto L7a
            hpx r4 = r3.a
            java.lang.Object r3 = r3.c
            fcti r7 = new fcti
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L5b
        L7a:
            hnq r7 = r13.f
            hra r8 = r13.c
            how r4 = new how
            hxi r11 = r13.aI(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.ar(hmw, int):how");
    }

    private final void as(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        as(this.s.e(i), i2);
        if (this.s.B(i)) {
            this.x.d(this.s.o(i));
        }
    }

    private final void at() {
        if (this.u.t) {
            hre hreVarD = this.t.d();
            this.u = hreVarD;
            hreVarD.K();
            this.v = false;
            this.B = null;
        }
    }

    private final void au(boolean z, hpp hppVar) {
        this.E.add(this.F);
        this.F = hppVar;
        hog hogVar = this.J;
        hogVar.d(this.H);
        hogVar.d(this.I);
        hogVar.d(this.G);
        if (z) {
            this.G = 0;
        }
        this.H = 0;
        this.I = 0;
    }

    private final void av() {
        hra hraVar = new hra();
        if (this.q) {
            hraVar.f();
        }
        if (this.b.q()) {
            hraVar.e();
        }
        this.t = hraVar;
        hre hreVarD = hraVar.d();
        hreVarD.A(true);
        this.u = hreVarD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (defpackage.hpx.p((defpackage.hnu) r12, r5) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aw() {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.aw():void");
    }

    private final void ax() {
        az(this.s.f);
        hsn hsnVar = this.x;
        hsnVar.h();
        hsnVar.a.a.c(htl.a);
        int i = hsnVar.e;
        hqz hqzVarA = hsnVar.a();
        hsnVar.e = i + hrc.a(hqzVarA.b, hqzVarA.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ay(int r7, int r8, int r9) {
        /*
            r6 = this;
            hqz r0 = r6.s
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.hmz.b(r0, r7, r9)
            int r9 = defpackage.hmz.b(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = r3
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.B(r7)
            if (r1 == 0) goto L64
            hsn r1 = r6.x
            r1.f()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.as(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.ay(int, int, int):void");
    }

    private final void az(int i) {
        boolean zB = this.s.B(i);
        if (zB) {
            hsn hsnVar = this.x;
            hsnVar.i();
            hsnVar.d(this.s.o(i));
        }
        aq(this, i, i, zB, 0);
        hsn hsnVar2 = this.x;
        hsnVar2.i();
        if (zB) {
            hsnVar2.f();
        }
    }

    @Override // defpackage.hml
    public final boolean A(float f) {
        Object objR = R();
        if ((objR instanceof Float) && f == ((Number) objR).floatValue()) {
            return false;
        }
        ai(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.hml
    public final boolean B(int i) {
        Object objR = R();
        if ((objR instanceof Integer) && i == ((Number) objR).intValue()) {
            return false;
        }
        ai(Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.hml
    public final boolean C(long j) {
        Object objR = R();
        if ((objR instanceof Long) && j == ((Number) objR).longValue()) {
            return false;
        }
        ai(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.hml
    public final boolean D(Object obj) {
        if (fdbq.f(R(), obj)) {
            return false;
        }
        ai(obj);
        return true;
    }

    @Override // defpackage.hml
    public final boolean E(boolean z) {
        Object objR = R();
        if ((objR instanceof Boolean) && z == ((Boolean) objR).booleanValue()) {
            return false;
        }
        ai(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.hml
    public final boolean F(Object obj) {
        if (R() == obj) {
            return false;
        }
        ai(obj);
        return true;
    }

    @Override // defpackage.hml
    public final boolean G() {
        if (!I() || this.l) {
            return true;
        }
        hpx hpxVarP = P();
        return (hpxVarP == null || (hpxVarP.a & 4) == 0) ? false : true;
    }

    @Override // defpackage.hml
    public final boolean H() {
        return this.z;
    }

    @Override // defpackage.hml
    public final boolean I() {
        hpx hpxVarP;
        return (this.z || this.n || this.l || (hpxVarP = P()) == null || (hpxVarP.a & 8) != 0) ? false : true;
    }

    @Override // defpackage.hml
    public final boolean J(boolean z, int i) {
        return (i == 0 && (this.z || this.n)) || z || !I();
    }

    @Override // defpackage.hml
    public final void K(Object obj) {
        if (!this.z && this.s.a() == 207 && !fdbq.f(this.s.h(), obj) && this.o < 0) {
            this.o = this.s.f;
            this.n = true;
        }
        ad(207, null, 0, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[EDGE_INSN: B:54:0x0070->B:29:0x0070 BREAK  A[LOOP:0: B:15:0x0030->B:28:0x006d], EDGE_INSN: B:55:0x0070->B:29:0x0070 BREAK  A[LOOP:0: B:15:0x0030->B:28:0x006d]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // defpackage.hml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hpx L() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.L():hpx");
    }

    @Override // defpackage.hml
    public final hxi N() {
        return ak();
    }

    public final int O(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.g;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.s.d(i) : i2;
        }
        cuf cufVar = this.K;
        if (cufVar == null || cufVar.a(i) < 0) {
            return 0;
        }
        int iA = cufVar.a(i);
        if (iA < 0) {
            cwh.d(a.g(i, "Cannot find value for key "));
        }
        return cufVar.c[iA];
    }

    public final hpx P() {
        if (this.p != 0) {
            return null;
        }
        ArrayList arrayList = this.O;
        if (hse.b(arrayList)) {
            return (hpx) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final ibk Q() {
        if (this.q) {
            return this.R;
        }
        return null;
    }

    public final Object R() {
        if (this.z) {
            aH();
            return hmk.a;
        }
        Object objN = this.s.n();
        return (!this.n || (objN instanceof hms)) ? objN : hmk.a;
    }

    public final Object S() {
        if (this.z) {
            aH();
            return hmk.a;
        }
        Object objN = this.s.n();
        return (!this.n || (objN instanceof hms)) ? objN instanceof hqu ? ((hqu) objN).a : objN : hmk.a;
    }

    public final List T() {
        RandomAccess arrayList;
        if (!this.q) {
            return fcvo.a;
        }
        ArrayList arrayList2 = new ArrayList();
        hre hreVar = this.u;
        arrayList2.addAll(ibe.d(hreVar, hreVar.q, null));
        hqz hqzVar = this.s;
        if (hqzVar.e || hqzVar.c == 0) {
            arrayList = fcvo.a;
        } else {
            arrayList = new ArrayList();
            int iE = hqzVar.h;
            Object objValueOf = Integer.valueOf(hqzVar.j - hrc.e(hqzVar.b, iE));
            while (iE >= 0) {
                ibd.a(hqzVar.a.b(iE), objValueOf);
                objValueOf = hqzVar.g(iE);
                iE = hqzVar.e(iE);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList2.addAll(U());
        return arrayList2;
    }

    public final List U() {
        hnb hnbVar = this.b;
        hna hnaVarB = hnbVar.b();
        if (true != (hnaVarB instanceof hne)) {
            hnaVarB = null;
        }
        if (hnaVarB == null) {
            return fcvo.a;
        }
        hne hneVar = (hne) hnaVarB;
        hqz hqzVarC = hneVar.d.c();
        try {
            Integer numA = ibe.a(hqzVarC, hnbVar, 0, hqzVarC.c);
            if (numA == null) {
                return fcvo.a;
            }
            try {
                return ibe.b(hneVar.d.c(), numA.intValue(), 0);
            } finally {
            }
        } finally {
        }
    }

    public final void V() {
        W();
        this.E.clear();
        this.J.c();
        this.L.c();
        this.m.c();
        this.k = null;
        hso hsoVar = this.Q;
        hsoVar.b.a();
        hsoVar.a.a();
        this.A = 0L;
        this.p = 0;
        this.i = false;
        this.z = false;
        this.n = false;
        this.r = false;
        this.o = -1;
        hqz hqzVar = this.s;
        if (!hqzVar.e) {
            hqzVar.r();
        }
        if (this.u.t) {
            return;
        }
        av();
    }

    public final void W() {
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.A = 0L;
        this.i = false;
        hsn hsnVar = this.x;
        hsnVar.b = false;
        hsnVar.c.c();
        hsnVar.e = 0;
        this.O.clear();
        this.g = null;
        this.K = null;
    }

    public final void X() {
        if (!this.u.t) {
            hmz.j("Check failed");
        }
        av();
    }

    public final void Y() {
        this.O.clear();
        this.j.clear();
        this.d.a();
        this.k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:7:0x002c, B:9:0x005b, B:10:0x0061, B:12:0x0065, B:15:0x007c, B:17:0x0088, B:18:0x0092, B:21:0x00a5, B:22:0x00a8, B:69:0x01e3, B:71:0x0203, B:72:0x0208, B:74:0x0210, B:75:0x0215, B:80:0x0238, B:81:0x023f, B:14:0x006d, B:23:0x00ae, B:25:0x00b5, B:26:0x00c2, B:29:0x00c8, B:31:0x00d0, B:32:0x00e3, B:34:0x00eb, B:35:0x00f0, B:39:0x0109, B:41:0x0111, B:50:0x016e, B:54:0x017f, B:58:0x018e, B:60:0x0196, B:61:0x01a8, B:63:0x01ac, B:64:0x01bb, B:66:0x01bf, B:67:0x01d2, B:43:0x0129, B:44:0x013b, B:46:0x013f, B:47:0x0155, B:48:0x0158), top: B:91:0x002c, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(defpackage.cuz r17, defpackage.fdat r18) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.Z(cuz, fdat):void");
    }

    @Override // defpackage.hml
    public final /* synthetic */ int a() {
        long j = this.A;
        return (int) (j ^ (j >>> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ec  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aa(boolean r38) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.aa(boolean):void");
    }

    public final void ab() {
        aa(false);
    }

    public final void ac() {
        this.H += this.s.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ad(int i, Object obj, int i2, Object obj2) {
        int iHashCode;
        long j;
        int i3;
        int i4;
        hpp hppVar;
        boolean z;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        long[] jArr3;
        char c;
        long[] jArr4;
        char c2;
        int i7;
        long jRotateLeft;
        Object obj3 = obj;
        aH();
        int i8 = this.I;
        if (obj3 == null) {
            long j2 = i8;
            if (obj2 != null) {
                i3 = 207;
                i7 = i;
                if (i7 == 207) {
                    if (!fdbq.f(obj2, hmk.a)) {
                        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.A, 3) ^ obj2.hashCode(), 3);
                    }
                    this.A = j2 ^ jRotateLeft;
                }
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.A, 3) ^ i3, 3);
                this.A = j2 ^ jRotateLeft;
            } else {
                i7 = i;
            }
            i3 = i7;
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.A, 3) ^ i3, 3);
            this.A = j2 ^ jRotateLeft;
        } else {
            if (obj3 instanceof Enum) {
                iHashCode = ((Enum) obj3).ordinal();
                j = this.A;
            } else {
                iHashCode = obj3.hashCode();
                j = this.A;
            }
            this.A = Long.rotateLeft(Long.rotateLeft(j, 3) ^ iHashCode, 3);
            i3 = i;
        }
        int i9 = 1;
        boolean z2 = true;
        if (obj3 == null) {
            this.I++;
        }
        boolean z3 = i2 != 0;
        int i10 = -1;
        if (this.z) {
            this.s.q();
            hre hreVar = this.u;
            int i11 = hreVar.q;
            if (z3) {
                hreVar.O(i3, hmk.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = hmk.a;
                    }
                    hreVar.L(i3, obj3, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = hmk.a;
                    }
                    hreVar.N(i3, obj3);
                }
                z2 = false;
            }
            hpp hppVar2 = this.F;
            if (hppVar2 != null) {
                hoj hojVar = new hoj(i3, -1, aJ(i11), -1);
                hppVar2.c(hojVar, this.G - hppVar2.b);
                hppVar2.e(hojVar);
            }
            au(z2, null);
            return;
        }
        Object[] objArr = i2 == 1 && this.n;
        if (this.F == null) {
            int iA = this.s.a();
            if (objArr != true && iA == i3 && fdbq.f(obj3, this.s.i())) {
                aD(z3, obj2);
                i4 = -1;
            } else {
                hqz hqzVar = this.s;
                ArrayList arrayList = new ArrayList();
                if (hqzVar.i <= 0) {
                    int iA2 = hqzVar.f;
                    while (iA2 < hqzVar.g) {
                        int[] iArr = hqzVar.b;
                        int i12 = iA2 * 5;
                        int i13 = i10;
                        int i14 = iArr[i12];
                        Object objP = hqzVar.p(iArr, iA2);
                        int i15 = iArr[i12 + 1];
                        if ((i15 & 1073741824) == 0) {
                            i9 = i15 & 67108863;
                        }
                        arrayList.add(new hoj(i14, objP, iA2, i9));
                        iA2 += hrc.a(iArr, iA2);
                        i10 = i13;
                        i9 = 1;
                    }
                }
                i4 = i10;
                this.F = new hpp(arrayList, this.G);
            }
        } else {
            i4 = -1;
        }
        hpp hppVar3 = this.F;
        if (hppVar3 != null) {
            Object hoiVar = obj3 != null ? new hoi(Integer.valueOf(i3), obj3) : Integer.valueOf(i3);
            cuz cuzVar = ((hui) hppVar3.f.a()).a;
            Object objF = cuzVar.f(hoiVar);
            if (objF == null) {
                objF = null;
            } else if (objF instanceof cuu) {
                cuu cuuVar = (cuu) objF;
                Object objA = cuuVar.a(0);
                if (cuuVar.o()) {
                    cuzVar.b(hoiVar);
                }
                if (cuuVar.c == 1) {
                    cuzVar.e(hoiVar, cuuVar.k());
                }
                objF = objA;
            } else {
                cuzVar.b(hoiVar);
            }
            hoj hojVar2 = (hoj) objF;
            if (objArr == true || hojVar2 == null) {
                boolean z4 = z3;
                this.s.q();
                boolean z5 = true;
                this.z = true;
                this.B = null;
                at();
                this.u.z();
                hre hreVar2 = this.u;
                int i16 = hreVar2.q;
                if (z4) {
                    hreVar2.O(i3, hmk.a);
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = hmk.a;
                        }
                        hreVar2.L(i3, obj3, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = hmk.a;
                        }
                        hreVar2.N(i3, obj3);
                    }
                    z5 = false;
                }
                this.P = this.u.r(i16);
                hoj hojVar3 = new hoj(i3, Integer.valueOf(i4), aJ(i16), i4);
                hppVar3.c(hojVar3, this.G - hppVar3.b);
                hppVar3.e(hojVar3);
                hppVar = new hpp(new ArrayList(), z5 ? 0 : this.G);
                z3 = z5;
            } else {
                hppVar3.e(hojVar2);
                this.G = hppVar3.a(hojVar2) + hppVar3.b;
                cuh cuhVar = hppVar3.e;
                int i17 = hojVar2.c;
                hod hodVar = (hod) cuhVar.a(i17);
                int i18 = hodVar != null ? hodVar.a : i4;
                int i19 = hppVar3.c;
                int i20 = i18 - i19;
                if (i18 > i19) {
                    Object[] objArr2 = cuhVar.c;
                    long[] jArr5 = cuhVar.a;
                    int length = jArr5.length - 2;
                    if (length >= 0) {
                        int i21 = 0;
                        char c3 = 7;
                        while (true) {
                            long j3 = jArr5[i21];
                            z = z3;
                            if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length)) >>> 31);
                                int i23 = 0;
                                while (i23 < i22) {
                                    if ((j3 & 255) < 128) {
                                        c2 = c3;
                                        hod hodVar2 = (hod) objArr2[(i21 << 3) + i23];
                                        jArr4 = jArr5;
                                        int i24 = hodVar2.a;
                                        if (i24 == i18) {
                                            hodVar2.a = i19;
                                        } else if (i19 <= i24 && i24 < i18) {
                                            hodVar2.a = i24 + 1;
                                        }
                                    } else {
                                        jArr4 = jArr5;
                                        c2 = c3;
                                    }
                                    j3 >>= 8;
                                    i23++;
                                    jArr5 = jArr4;
                                    c3 = c2;
                                }
                                jArr3 = jArr5;
                                c = c3;
                                if (i22 != 8) {
                                    break;
                                }
                            } else {
                                jArr3 = jArr5;
                                c = c3;
                            }
                            if (i21 == length) {
                                break;
                            }
                            i21++;
                            z3 = z;
                            jArr5 = jArr3;
                            c3 = c;
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    if (i19 > i18) {
                        Object[] objArr3 = cuhVar.c;
                        long[] jArr6 = cuhVar.a;
                        int length2 = jArr6.length - 2;
                        if (length2 >= 0) {
                            int i25 = 0;
                            while (true) {
                                long j4 = jArr6[i25];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        if ((j4 & 255) < 128) {
                                            hod hodVar3 = (hod) objArr3[(i25 << 3) + i27];
                                            jArr2 = jArr6;
                                            int i28 = hodVar3.a;
                                            if (i28 == i18) {
                                                hodVar3.a = i19;
                                            } else {
                                                i6 = i18;
                                                if (i6 + 1 <= i28 && i28 < i19) {
                                                    hodVar3.a = i28 - 1;
                                                }
                                                j4 >>= 8;
                                                i27++;
                                                jArr6 = jArr2;
                                                i18 = i6;
                                            }
                                        } else {
                                            jArr2 = jArr6;
                                        }
                                        i6 = i18;
                                        j4 >>= 8;
                                        i27++;
                                        jArr6 = jArr2;
                                        i18 = i6;
                                    }
                                    jArr = jArr6;
                                    i5 = i18;
                                    if (i26 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr6;
                                    i5 = i18;
                                }
                                if (i25 == length2) {
                                    break;
                                }
                                i25++;
                                jArr6 = jArr;
                                i18 = i5;
                            }
                        }
                    }
                }
                hsn hsnVar = this.x;
                hsnVar.e(i17);
                this.s.t(i17);
                if (i20 > 0) {
                    hsnVar.h();
                    huf hufVar = hsnVar.a.a;
                    hufVar.c(htg.a);
                    hufVar.c[hufVar.d - hufVar.a[hufVar.b - 1].b] = i20;
                }
                aD(z, obj2);
                z3 = z;
                hppVar = null;
            }
        } else {
            hppVar = null;
        }
        au(z3, hppVar);
    }

    public final void ae(int i, Object obj) {
        ad(i, obj, 0, null);
    }

    public final void af(Object obj) {
        int i;
        hqz hqzVar;
        int i2;
        hre hreVar;
        if (obj instanceof hqt) {
            hqt hqtVar = (hqt) obj;
            hlv hlvVarG = null;
            if (this.z) {
                hre hreVar2 = this.u;
                int i3 = hreVar2.q;
                if (i3 > hreVar2.s + 1) {
                    int i4 = i3 - 1;
                    int iL = hreVar2.l(i4);
                    while (true) {
                        i2 = i4;
                        i4 = iL;
                        hreVar = this.u;
                        if (i4 == hreVar.s || i4 < 0) {
                            break;
                        } else {
                            iL = hreVar.l(i4);
                        }
                    }
                    hlvVarG = hreVar.r(i2);
                }
            } else {
                hqz hqzVar2 = this.s;
                int i5 = hqzVar2.f;
                if (i5 > hqzVar2.h + 1) {
                    int i6 = i5 - 1;
                    int iE = hqzVar2.e(i6);
                    while (true) {
                        i = i6;
                        i6 = iE;
                        hqzVar = this.s;
                        if (i6 == hqzVar.h || i6 < 0) {
                            break;
                        } else {
                            iE = hqzVar.e(i6);
                        }
                    }
                    hlvVarG = hqzVar.g(i);
                }
            }
            hqu hquVar = new hqu(hqtVar, hlvVarG);
            if (this.z) {
                huf hufVar = this.x.a.a;
                hufVar.c(htk.a);
                hue.a(hufVar, 0, hquVar);
            }
            this.D.add(obj);
            obj = hquVar;
        }
        ai(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ag(defpackage.cuz r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r3 = r1.c
            long[] r1 = r1.a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L61
            r6 = 0
        L10:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5c
            int r9 = r6 - r4
            r10 = 0
        L23:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]
            r11 = r3[r11]
            r13.getClass()
            hpx r13 = (defpackage.hpx) r13
            hlv r14 = r13.c
            if (r14 == 0) goto L56
            java.util.List r15 = r0.j
            int r14 = r14.a
            hqy r5 = defpackage.hqy.a
            if (r11 != r5) goto L4e
            r11 = 0
        L4e:
            hoh r5 = new hoh
            r5.<init>(r13, r14, r11)
            r15.add(r5)
        L56:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L23
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r6 == r4) goto L61
            int r6 = r6 + 1
            goto L10
        L61:
            java.util.List r1 = r0.j
            java.util.Comparator r2 = defpackage.hmz.f
            defpackage.fcva.s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.ag(cuz):void");
    }

    public final void ah(int i, int i2) {
        if (O(i) != i2) {
            if (i < 0) {
                cuf cufVar = this.K;
                if (cufVar == null) {
                    cufVar = new cuf((byte[]) null);
                    this.K = cufVar;
                }
                cufVar.d(i, i2);
                return;
            }
            int[] iArr = this.g;
            if (iArr == null) {
                iArr = new int[this.s.c];
                Arrays.fill(iArr, 0, iArr.length, -1);
                this.g = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void ai(Object obj) {
        if (this.z) {
            this.u.aa(obj);
            return;
        }
        hqz hqzVar = this.s;
        if (!hqzVar.l) {
            hsn hsnVar = this.x;
            hlv hlvVarG = hqzVar.g(hqzVar.h);
            huf hufVar = hsnVar.a.a;
            hufVar.c(hsq.a);
            hue.b(hufVar, 0, hlvVarG, 1, obj);
            return;
        }
        int iE = hqzVar.j - hrc.e(hqzVar.b, hqzVar.h);
        hsn hsnVar2 = this.x;
        int i = iE - 1;
        if (hsnVar2.a().h - hsnVar2.e >= 0) {
            hsnVar2.j(true);
            huf hufVar2 = hsnVar2.a.a;
            hufVar2.c(htv.a);
            hue.a(hufVar2, 0, obj);
            hufVar2.c[hufVar2.d - hufVar2.a[hufVar2.b - 1].b] = i;
            return;
        }
        hqz hqzVar2 = this.s;
        hlv hlvVarG2 = hqzVar2.g(hqzVar2.h);
        huf hufVar3 = hsnVar2.a.a;
        hufVar3.c(hts.a);
        hue.b(hufVar3, 0, obj, 1, hlvVarG2);
        hufVar3.c[hufVar3.d - hufVar3.a[hufVar3.b - 1].b] = i;
    }

    public final boolean aj(hpx hpxVar, Object obj) {
        hlv hlvVar = hpxVar.c;
        if (hlvVar == null) {
            return false;
        }
        int iA = this.s.a.a(hlvVar);
        if (!this.r || iA < this.s.f) {
            return false;
        }
        List list = this.j;
        int iD = hmz.d(list, iA);
        if (iD < 0) {
            int i = iD + 1;
            if (true != (obj instanceof hnu)) {
                obj = null;
            }
            list.add(-i, new hoh(hpxVar, iA, obj));
        } else {
            hoh hohVar = (hoh) list.get(iD);
            if (obj instanceof hnu) {
                Object obj2 = hohVar.c;
                if (obj2 == null) {
                    hohVar.c = obj;
                } else if (obj2 instanceof cva) {
                    ((cva) obj2).g(obj);
                } else {
                    int i2 = cvs.a;
                    cva cvaVar = new cva(2);
                    cvaVar.e(obj2);
                    cvaVar.e(obj);
                    hohVar.c = cvaVar;
                }
            } else {
                hohVar.c = null;
            }
        }
        return true;
    }

    public final hxi ak() {
        hxi hxiVar = this.B;
        return hxiVar != null ? hxiVar : aI(this.s.h);
    }

    public final hxi al(hxi hxiVar, hxi hxiVar2) {
        hxh hxhVar = new hxh(hxiVar);
        hxhVar.putAll(hxiVar2);
        hxi hxiVarA = hxhVar.a();
        ae(204, hmz.d);
        aF(hxiVarA);
        aF(hxiVar2);
        ab();
        return hxiVarA;
    }

    public final void am(hxi hxiVar) {
        cuh cuhVar = this.k;
        if (cuhVar == null) {
            cuhVar = new cuh((byte[]) null);
            this.k = cuhVar;
        }
        cuhVar.f(this.s.f, hxiVar);
    }

    public final void an(hot hotVar, hxi hxiVar, Object obj) {
        u(126665345, hotVar);
        aF(obj);
        long j = this.A;
        try {
            this.A = 126665345L;
            if (this.z) {
                hre.Y(this.u);
            }
            boolean z = (this.z || fdbq.f(this.s.h(), hxiVar)) ? false : true;
            if (z) {
                am(hxiVar);
            }
            ad(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, hmz.c, 0, hxiVar);
            this.B = null;
            boolean z2 = this.l;
            this.l = z;
            hxf.a(this, new hxd(316014703, true, new hmv()));
            this.l = z2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:16:0x0036, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:24:0x0062, B:25:0x0063, B:27:0x0069, B:20:0x004a), top: B:33:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ao(defpackage.hnq r9, defpackage.hnq r10, java.lang.Integer r11, java.util.List r12, defpackage.fdae r13) {
        /*
            r8 = this;
            boolean r0 = r8.r
            int r1 = r8.G
            r2 = 1
            r8.r = r2     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r8.G = r2     // Catch: java.lang.Throwable -> L71
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L71
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L71
            fcti r6 = (defpackage.fcti) r6     // Catch: java.lang.Throwable -> L71
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L71
            hpx r7 = (defpackage.hpx) r7     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L24
            r8.aj(r7, r6)     // Catch: java.lang.Throwable -> L71
            goto L27
        L24:
            r8.aj(r7, r5)     // Catch: java.lang.Throwable -> L71
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L69
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L71
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L63
            boolean r12 = defpackage.fdbq.f(r10, r9)     // Catch: java.lang.Throwable -> L71
            if (r12 != 0) goto L63
            if (r11 < 0) goto L63
            hne r10 = (defpackage.hne) r10     // Catch: java.lang.Throwable -> L71
            r12 = r9
            hne r12 = (defpackage.hne) r12     // Catch: java.lang.Throwable -> L71
            r12.h = r10     // Catch: java.lang.Throwable -> L71
            r10 = r9
            hne r10 = (defpackage.hne) r10     // Catch: java.lang.Throwable -> L71
            r10.i = r11     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L58
            r11 = r9
            hne r11 = (defpackage.hne) r11     // Catch: java.lang.Throwable -> L71
            r11.h = r5     // Catch: java.lang.Throwable -> L71
            hne r9 = (defpackage.hne) r9     // Catch: java.lang.Throwable -> L71
            r9.i = r2     // Catch: java.lang.Throwable -> L71
            goto L67
        L58:
            r10 = move-exception
            r11 = r9
            hne r11 = (defpackage.hne) r11     // Catch: java.lang.Throwable -> L71
            r11.h = r5     // Catch: java.lang.Throwable -> L71
            hne r9 = (defpackage.hne) r9     // Catch: java.lang.Throwable -> L71
            r9.i = r2     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L63:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L71
        L67:
            if (r10 != 0) goto L6c
        L69:
            r13.invoke()     // Catch: java.lang.Throwable -> L71
        L6c:
            r8.r = r0
            r8.G = r1
            return
        L71:
            r9 = move-exception
            r8.r = r0
            r8.G = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmw.ao(hnq, hnq, java.lang.Integer, java.util.List, fdae):void");
    }

    @Override // defpackage.hml
    public final long b() {
        return this.A;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [hnq, hpz] */
    /* JADX WARN: Type inference failed for: r5v16, types: [hnq, hpz] */
    @Override // defpackage.hml
    public final hml c(int i) {
        hpx hpxVar;
        boolean z;
        v(i);
        if (this.z) {
            hpx hpxVar2 = new hpx(this.f);
            this.O.add(hpxVar2);
            ai(hpxVar2);
            hpxVar2.h(this.M);
            return this;
        }
        hoh hohVarF = hmz.f(this.j, this.s.h);
        Object objN = this.s.n();
        if (fdbq.f(objN, hmk.a)) {
            hpxVar = new hpx(this.f);
            ai(hpxVar);
        } else {
            objN.getClass();
            hpxVar = (hpx) objN;
        }
        if (hohVarF == null) {
            int i2 = hpxVar.a;
            if ((i2 & 64) != 0) {
                hpxVar.a = i2 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        hpxVar.d(z);
        this.O.add(hpxVar);
        hpxVar.h(this.M);
        int i3 = hpxVar.a;
        if ((i3 & 256) != 0) {
            hpxVar.a = i3 & (-257);
            hpxVar.f(true);
            huf hufVar = this.x.a.a;
            hufVar.c(htq.a);
            hue.a(hufVar, 0, hpxVar);
        }
        return this;
    }

    @Override // defpackage.hml
    public final ibh d() {
        ibh ibhVar = this.S;
        if (ibhVar != null) {
            return ibhVar;
        }
        hnd hndVar = new hnd(this.f);
        this.S = hndVar;
        return hndVar;
    }

    @Override // defpackage.hml
    public final Object e(hng hngVar) {
        return hnl.b(ak(), hngVar);
    }

    @Override // defpackage.hml
    public final Object f() {
        return S();
    }

    @Override // defpackage.hml
    public final fcyh g() {
        return this.y;
    }

    @Override // defpackage.hml
    public final void h(Object obj, fdat fdatVar) {
        if (this.z) {
            huf hufVar = this.Q.a;
            hufVar.c(htu.a);
            hue.a(hufVar, 0, obj);
            fdatVar.getClass();
            fdcm.e(fdatVar, 2);
            hue.a(hufVar, 1, fdatVar);
            return;
        }
        hsn hsnVar = this.x;
        hsnVar.g();
        huf hufVar2 = hsnVar.a.a;
        hufVar2.c(htu.a);
        fdatVar.getClass();
        fdcm.e(fdatVar, 2);
        hue.b(hufVar2, 0, obj, 1, fdatVar);
    }

    @Override // defpackage.hml
    public final void i() {
        this.h = true;
        this.q = true;
        this.c.f();
        this.t.f();
        hre hreVar = this.u;
        hra hraVar = hreVar.a;
        hreVar.e = hraVar.i;
        hreVar.f = hraVar.j;
    }

    @Override // defpackage.hml
    public final void j(fdae fdaeVar) {
        aG();
        if (!this.z) {
            hmz.j("createNode() can only be called when inserting");
        }
        int i = this.J.a[r0.b - 1];
        hre hreVar = this.u;
        hlv hlvVarR = hreVar.r(hreVar.s);
        this.H++;
        hso hsoVar = this.Q;
        huf hufVar = hsoVar.a;
        hufVar.c(htd.a);
        hue.a(hufVar, 0, fdaeVar);
        hufVar.c[hufVar.d - hufVar.a[hufVar.b - 1].b] = i;
        hue.a(hufVar, 1, hlvVarR);
        huf hufVar2 = hsoVar.b;
        hufVar2.c(hti.a);
        hufVar2.c[hufVar2.d - hufVar2.a[hufVar2.b - 1].b] = i;
        hue.a(hufVar2, 0, hlvVarR);
    }

    @Override // defpackage.hml
    public final void k(boolean z) {
        if (this.H != 0) {
            hmz.j("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.z) {
            return;
        }
        if (!z) {
            aB();
            return;
        }
        hqz hqzVar = this.s;
        int i = hqzVar.f;
        int i2 = hqzVar.g;
        hsn hsnVar = this.x;
        hsnVar.j(false);
        hsnVar.a.a.c(hsu.a);
        hmz.m(this.j, i, i2);
        this.s.u();
    }

    @Override // defpackage.hml
    public final void l() {
        ab();
        hpx hpxVarP = P();
        if (hpxVarP == null || !hpxVarP.k()) {
            return;
        }
        hpxVarP.a |= 2;
    }

    @Override // defpackage.hml
    public final void m() {
        ab();
    }

    @Override // defpackage.hml
    public final void n() {
        aa(true);
    }

    @Override // defpackage.hml
    public final void o() {
        ab();
    }

    @Override // defpackage.hml
    public final void p() {
        ab();
    }

    @Override // defpackage.hml
    public final void q() {
        if (this.n && this.s.h == this.o) {
            this.o = -1;
            this.n = false;
        }
        aa(false);
    }

    @Override // defpackage.hml
    public final void r(fdae fdaeVar) {
        huf hufVar = this.x.a.a;
        hufVar.c(hto.a);
        hue.a(hufVar, 0, fdaeVar);
    }

    @Override // defpackage.hml
    public final void s() {
        if (this.H != 0) {
            hmz.j("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.z) {
            return;
        }
        hpx hpxVarP = P();
        if (hpxVarP != null && !hpxVarP.i()) {
            hpxVarP.g(true);
        }
        if (this.j.isEmpty()) {
            aB();
        } else {
            aw();
        }
    }

    @Override // defpackage.hml
    public final void t() {
        ad(NetError.ERR_PROXY_AUTH_REQUESTED, null, 0, null);
    }

    @Override // defpackage.hml
    public final void u(int i, Object obj) {
        ad(i, obj, 0, null);
    }

    @Override // defpackage.hml
    public final void v(int i) {
        int i2;
        if (this.F != null) {
            ad(i, null, 0, null);
            return;
        }
        aH();
        this.A = Long.rotateLeft(Long.rotateLeft(this.A, 3) ^ i, 3) ^ this.I;
        this.I++;
        hqz hqzVar = this.s;
        if (this.z) {
            hqzVar.q();
            this.u.N(i, hmk.a);
            au(false, null);
            return;
        }
        if (hqzVar.a() == i && ((i2 = hqzVar.f) >= hqzVar.g || (hqzVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            hqzVar.v();
            au(false, null);
            return;
        }
        if (!hqzVar.A()) {
            int i3 = this.G;
            int i4 = hqzVar.f;
            ax();
            this.x.l(i3, hqzVar.f());
            hmz.m(this.j, i4, hqzVar.f);
        }
        hqzVar.q();
        this.z = true;
        this.B = null;
        at();
        hre hreVar = this.u;
        hreVar.z();
        int i5 = hreVar.q;
        hreVar.N(i, hmk.a);
        this.P = hreVar.r(i5);
        au(false, null);
    }

    @Override // defpackage.hml
    public final void w(int i) {
        ad(i, null, 0, null);
    }

    @Override // defpackage.hml
    public final void x() {
        ad(125, null, 2, null);
        this.i = true;
    }

    @Override // defpackage.hml
    public final void y(Object obj) {
        af(obj);
    }

    @Override // defpackage.hml
    public final void z() {
        aG();
        if (this.z) {
            hmz.j("useNode() called while inserting");
        }
        hqz hqzVar = this.s;
        Object objO = hqzVar.o(hqzVar.h);
        hsn hsnVar = this.x;
        hsnVar.d(objO);
        if (this.n && (objO instanceof hmh)) {
            hsnVar.g();
            hsnVar.a.a.c(htx.a);
        }
    }

    @Override // defpackage.hml
    public final void M() {
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flg {
    public final flw a;
    public fdap b;
    public iqa c;
    public fdap d;
    public final igr e;
    public ihs f;
    public ivy g;
    public final hox h;
    public final hox i;
    public fjz j;
    public jkd k;
    private final hox l;
    private final hox m;
    private final hox n;
    private final hox o;
    private final hox p;
    private final hox q;
    private final hox r;
    private final hox s;
    private boolean t;

    public flg(flw flwVar) {
        this.a = flwVar;
        hsi hsiVar = hsi.a;
        this.l = new hpl(null, hsiVar);
        this.m = new hpl(true, hsiVar);
        this.b = new fdap() { // from class: fkv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                this.a.u((fil) obj);
                return fctx.a;
            }
        };
        this.e = new igr();
        this.n = new hpl(false, hsiVar);
        fdae fdaeVar = new fdae() { // from class: fkw
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.i();
            }
        };
        hxn hxnVar = hrp.a;
        new hnt(fdaeVar, null);
        this.h = new hpl(fctx.a, hpb.a);
        this.o = new hpl(new ihs(0L), hsiVar);
        this.p = new hpl(new ihs(0L), hsiVar);
        this.q = new hpl(null, hsiVar);
        this.r = new hpl(null, hsiVar);
        this.s = new hpl(null, hsiVar);
        this.i = new hpl(null, hsiVar);
        flwVar.e = new fdap() { // from class: fkx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                long jLongValue = ((Long) obj).longValue();
                flg flgVar = this.a;
                if (flgVar.a.b().b(jLongValue)) {
                    flgVar.h.b(fctx.a);
                    flgVar.x();
                    flgVar.y();
                }
                return fctx.a;
            }
        };
        flwVar.f = new fdav() { // from class: fky
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ivy ivyVar = (ivy) obj2;
                fit fitVar = (fit) obj4;
                long jG = ivyVar.g();
                ihu ihuVar = new ihu(0.0f, 0.0f, (int) (jG >> 32), (int) (jG & 4294967295L));
                long jFloatToRawIntBits = ((ihs) obj3).a;
                if (!flh.c(ihuVar, jFloatToRawIntBits)) {
                    float fIntBitsToFloat = ihuVar.b;
                    int i = (int) (jFloatToRawIntBits >> 32);
                    if (Float.intBitsToFloat(i) >= fIntBitsToFloat) {
                        fIntBitsToFloat = ihuVar.d;
                        if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                            fIntBitsToFloat = Float.intBitsToFloat(i);
                        }
                    }
                    float fIntBitsToFloat2 = ihuVar.c;
                    int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                    if (Float.intBitsToFloat(i2) >= fIntBitsToFloat2) {
                        fIntBitsToFloat2 = ihuVar.e;
                        if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                        }
                    }
                    jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }
                flg flgVar = this.a;
                long jA = flgVar.a(ivyVar, jFloatToRawIntBits);
                if ((9223372034707292159L & jA) != 9205357640488583168L) {
                    flgVar.t(zBooleanValue);
                    flgVar.j = null;
                    flgVar.F(jA, 9205357640488583168L, false, fitVar);
                    flgVar.e.a(new igq());
                    flgVar.v(false);
                }
                return fctx.a;
            }
        };
        flwVar.g = new fdax() { // from class: fkn
            @Override // defpackage.fdax
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ivy ivyVar = (ivy) obj2;
                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                long j = ((ihs) obj3).a;
                flg flgVar = this.a;
                long jA = flgVar.a(ivyVar, j);
                long jA2 = flgVar.a(ivyVar, ((ihs) obj4).a);
                flgVar.t(zBooleanValue);
                return Boolean.valueOf(flgVar.G(new ihs(jA), jA2, zBooleanValue2, (fit) obj6));
            }
        };
        flwVar.h = new fdae() { // from class: fko
            @Override // defpackage.fdae
            public final Object invoke() {
                flg flgVar = this.a;
                flgVar.v(true);
                flgVar.q(null);
                flgVar.n(null);
                return fctx.a;
            }
        };
        flwVar.i = new fdap() { // from class: fkp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                long jLongValue = ((Long) obj).longValue();
                flg flgVar = this.a;
                if (flgVar.a.b().b(jLongValue)) {
                    flgVar.l();
                    flgVar.u(null);
                }
                return fctx.a;
            }
        };
        flwVar.j = new fdap() { // from class: fkq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fik fikVar;
                fik fikVar2;
                long jLongValue = ((Long) obj).longValue();
                flg flgVar = this.a;
                fil filVarF = flgVar.f();
                if (filVarF != null && (fikVar2 = filVarF.a) != null && jLongValue == fikVar2.b) {
                    flgVar.w(null);
                }
                fil filVarF2 = flgVar.f();
                if (filVarF2 != null && (fikVar = filVarF2.b) != null && jLongValue == fikVar.b) {
                    flgVar.r(null);
                }
                if (flgVar.a.b().b(jLongValue)) {
                    flgVar.y();
                }
                return fctx.a;
            }
        };
    }

    public final boolean A() {
        return d() != null;
    }

    public final boolean B() {
        flw flwVar = this.a;
        List listJ = flwVar.j(j());
        if (listJ.isEmpty()) {
            return true;
        }
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            fii fiiVar = (fii) listJ.get(i);
            juo juoVarL = fiiVar.l();
            if (juoVarL.a() != 0) {
                fil filVar = (fil) flwVar.b().a(fiiVar.h());
                if (filVar == null) {
                    return false;
                }
                if (Math.abs(filVar.a.a - filVar.b.a) != juoVarL.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean C() {
        return ((Boolean) this.m.a()).booleanValue();
    }

    public final boolean D() {
        fil filVarF = f();
        if (filVarF == null) {
            return false;
        }
        fik fikVar = filVarF.a;
        fik fikVar2 = filVarF.b;
        if (!fdbq.f(fikVar, fikVar2)) {
            if (fikVar.b == fikVar2.b) {
                return true;
            }
            flw flwVar = this.a;
            List listJ = flwVar.j(j());
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                fil filVar = (fil) flwVar.b().a(((fii) listJ.get(i)).h());
                if (filVar != null) {
                    if (filVar.a.a != filVar.b.a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean E() {
        fil filVarF = f();
        if (filVarF == null) {
            return true;
        }
        return fdbq.f(filVarF.a, filVarF.b);
    }

    public final boolean F(long j, long j2, boolean z, fit fitVar) {
        q(z ? ezl.b : ezl.c);
        n(new ihs(j));
        ivy ivyVarJ = j();
        flw flwVar = this.a;
        List listJ = flwVar.j(ivyVarJ);
        int i = ctr.a;
        fjz fmdVar = null;
        cuk cukVar = new cuk((byte[]) null);
        int size = listJ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cukVar.c(((fii) listJ.get(i3)).h(), i3);
        }
        fka fkaVar = new fka(j, j2, ivyVarJ, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : f(), new fkz(cukVar));
        int size2 = listJ.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((fii) listJ.get(i4)).m(fkaVar);
        }
        int i5 = fkaVar.k + 1;
        List list = fkaVar.h;
        int size3 = list.size();
        if (size3 != 0) {
            if (size3 != 1) {
                cuk cukVar2 = fkaVar.g;
                int i6 = fkaVar.i;
                if (i6 == -1) {
                    i6 = i5;
                }
                int i7 = fkaVar.j;
                if (i7 != -1) {
                    i5 = i7;
                }
                fmdVar = new fie(cukVar2, list, i6, i5, fkaVar.d, fkaVar.e);
            } else {
                fij fijVar = (fij) fcva.X(list);
                int i8 = fkaVar.i;
                int i9 = i8 == -1 ? i5 : i8;
                int i10 = fkaVar.j;
                fmdVar = new fmd(fkaVar.d, i9, i10 != -1 ? i10 : i5, fkaVar.e, fijVar);
            }
        }
        if (fmdVar == null || !fmdVar.m(this.j)) {
            return false;
        }
        fil filVarA = fitVar.a(fmdVar);
        if (!fdbq.f(filVarA, f())) {
            if (C()) {
                List list2 = flwVar.b;
                int size4 = list2.size();
                while (true) {
                    if (i2 >= size4) {
                        break;
                    }
                    if (((fii) list2.get(i2)).l().a() > 0) {
                        iqa iqaVar = this.c;
                        if (iqaVar != null) {
                            iqaVar.a(9);
                        }
                    } else {
                        i2++;
                    }
                }
            }
            flwVar.k(fmdVar.d(filVarA));
            this.b.invoke(filVarA);
        }
        this.j = fmdVar;
        return true;
    }

    public final boolean G(ihs ihsVar, long j, boolean z, fit fitVar) {
        return F(ihsVar.a, j, z, fitVar);
    }

    public final long a(ivy ivyVar, long j) {
        ivy ivyVar2 = this.g;
        if (ivyVar2 == null || !ivyVar2.u()) {
            return 9205357640488583168L;
        }
        return j().h(ivyVar, j);
    }

    public final long b() {
        return ((ihs) this.o.a()).a;
    }

    public final long c() {
        return ((ihs) this.p.a()).a;
    }

    public final ezl d() {
        return (ezl) this.s.a();
    }

    public final fii e(fik fikVar) {
        return (fii) this.a.c.a(fikVar.b);
    }

    public final fil f() {
        return (fil) this.l.a();
    }

    public final ihs g() {
        return (ihs) this.r.a();
    }

    public final ihs h() {
        return (ihs) this.q.a();
    }

    public final ihu i() {
        ivy ivyVar;
        ihu ihuVar;
        ihu ihuVar2;
        float f;
        List list;
        float f2;
        float f3;
        float f4;
        boolean z;
        ivy ivyVarK;
        int[] iArr;
        this.h.a();
        if (f() != null && (ivyVar = this.g) != null && ivyVar.u()) {
            flw flwVar = this.a;
            List listJ = flwVar.j(j());
            List arrayList = new ArrayList(listJ.size());
            int size = listJ.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                fii fiiVar = (fii) listJ.get(i2);
                fil filVar = (fil) flwVar.b().a(fiiVar.h());
                fcti fctiVar = filVar != null ? new fcti(fiiVar, filVar) : null;
                if (fctiVar != null) {
                    arrayList.add(fctiVar);
                }
            }
            int size2 = arrayList.size();
            if (size2 != 0 && size2 != 1) {
                arrayList = fcva.g(fcva.N(arrayList), fcva.S(arrayList));
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    ihuVar2 = flh.a;
                    ihuVar = null;
                } else {
                    ihu ihuVar3 = flh.a;
                    float f5 = ihuVar3.b;
                    float f6 = ihuVar3.c;
                    float f7 = ihuVar3.d;
                    float f8 = ihuVar3.e;
                    int size3 = arrayList.size();
                    float fMax = f8;
                    int i3 = 0;
                    float fMin = f5;
                    float fMin2 = f6;
                    float fMax2 = f7;
                    ihuVar = null;
                    while (i3 < size3) {
                        int i4 = i;
                        fcti fctiVar2 = (fcti) arrayList.get(i3);
                        fii fiiVar2 = (fii) fctiVar2.a;
                        fil filVar2 = (fil) fctiVar2.b;
                        int i5 = filVar2.a.a;
                        int i6 = filVar2.b.a;
                        if (i5 == i6 || (ivyVarK = fiiVar2.k()) == null) {
                            f = f8;
                            list = arrayList;
                            f2 = f5;
                            f3 = f6;
                            f4 = f7;
                            z = true;
                        } else {
                            f = f8;
                            int iMin = Math.min(i5, i6);
                            int iMax = Math.max(i5, i6) - 1;
                            if (iMin == iMax) {
                                iArr = new int[1];
                                iArr[i4] = iMin;
                                z = true;
                            } else {
                                z = true;
                                int[] iArr2 = new int[2];
                                iArr2[i4] = iMin;
                                iArr2[1] = iMax;
                                iArr = iArr2;
                            }
                            list = arrayList;
                            float fMin3 = f5;
                            f2 = fMin3;
                            float fMin4 = f6;
                            f3 = fMin4;
                            float fMax3 = f7;
                            f4 = fMax3;
                            float fMax4 = f;
                            for (int i7 = i4; i7 < iArr.length; i7++) {
                                ihu ihuVarJ = fiiVar2.j(iArr[i7]);
                                fMin3 = Math.min(fMin3, ihuVarJ.b);
                                fMin4 = Math.min(fMin4, ihuVarJ.c);
                                fMax3 = Math.max(fMax3, ihuVarJ.d);
                                fMax4 = Math.max(fMax4, ihuVarJ.e);
                            }
                            long jFloatToRawIntBits = Float.floatToRawIntBits(fMin3);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMin4);
                            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMax3);
                            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMax4);
                            long jH = ivyVar.h(ivyVarK, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                            long jH2 = ivyVar.h(ivyVarK, (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L));
                            fMin = Math.min(fMin, Float.intBitsToFloat((int) (jH >> 32)));
                            fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jH & 4294967295L)));
                            fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jH2 >> 32)));
                            fMax = Math.max(fMax, Float.intBitsToFloat((int) (jH2 & 4294967295L)));
                        }
                        i3++;
                        i = i4;
                        f8 = f;
                        arrayList = list;
                        f5 = f2;
                        f6 = f3;
                        f7 = f4;
                    }
                    ihuVar2 = new ihu(fMin, fMin2, fMax2, fMax);
                }
                if (fdbq.f(ihuVar2, flh.a)) {
                    return ihuVar;
                }
                ihu ihuVarD = flh.b(ivyVar).d(ihuVar2);
                if (ihuVarD.d - ihuVarD.b < 0.0f || ihuVarD.e - ihuVarD.c < 0.0f) {
                    return ihuVar;
                }
                ihu ihuVarF = ihuVarD.f(ivz.a(ivyVar));
                return ihu.j(ihuVarF, 0.0f, 0.0f, ihuVarF.e + 100.0f, 7);
            }
        }
        return null;
    }

    public final ivy j() {
        ivy ivyVar = this.g;
        if (ivyVar == null) {
            ebs.a("null coordinates");
            throw new fcta();
        }
        if (!ivyVar.u()) {
            ebs.c("unattached coordinates");
        }
        return ivyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r10 = this;
            fil r0 = r10.f()
            r1 = 0
            if (r0 == 0) goto L6a
            flw r0 = r10.a
            ctu r2 = r0.b()
            boolean r2 = r2.c()
            if (r2 == 0) goto L14
            goto L6a
        L14:
            jul r2 = new jul
            r2.<init>(r1)
            ivy r3 = r10.j()
            java.util.List r3 = r0.j(r3)
            int r4 = r3.size()
            r5 = 0
        L26:
            if (r5 >= r4) goto L65
            java.lang.Object r6 = r3.get(r5)
            fii r6 = (defpackage.fii) r6
            ctu r7 = r0.b()
            long r8 = r6.h()
            java.lang.Object r7 = r7.a(r8)
            fil r7 = (defpackage.fil) r7
            if (r7 == 0) goto L62
            juo r6 = r6.l()
            boolean r8 = r7.c
            if (r8 == 0) goto L53
            fik r8 = r7.b
            fik r7 = r7.a
            int r8 = r8.a
            int r7 = r7.a
            juo r6 = r6.subSequence(r8, r7)
            goto L5f
        L53:
            fik r8 = r7.a
            fik r7 = r7.b
            int r8 = r8.a
            int r7 = r7.a
            juo r6 = r6.subSequence(r8, r7)
        L5f:
            r2.e(r6)
        L62:
            int r5 = r5 + 1
            goto L26
        L65:
            juo r0 = r2.b()
            goto L6b
        L6a:
            r0 = r1
        L6b:
            if (r0 == 0) goto L7e
            int r2 = r0.a()
            if (r2 > 0) goto L74
            goto L75
        L74:
            r1 = r0
        L75:
            if (r1 == 0) goto L7e
            fdap r0 = r10.d
            if (r0 == 0) goto L7e
            r0.invoke(r1)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flg.k():void");
    }

    public final void l() {
        iqa iqaVar;
        this.a.k(ctv.a());
        v(false);
        if (f() != null) {
            this.b.invoke(null);
            if (!C() || (iqaVar = this.c) == null) {
                return;
            }
            iqaVar.a(9);
        }
    }

    public final void m() {
        flw flwVar = this.a;
        List listJ = flwVar.j(j());
        if (listJ.isEmpty()) {
            return;
        }
        int i = ctv.a;
        cun cunVar = new cun((byte[]) null);
        int size = listJ.size();
        fil filVar = null;
        fil filVar2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            fii fiiVar = (fii) listJ.get(i2);
            fil filVarI = fiiVar.i();
            if (filVarI != null) {
                if (filVar == null) {
                    filVar = filVarI;
                }
                cunVar.g(fiiVar.h(), filVarI);
                filVar2 = filVarI;
            }
        }
        if (cunVar.c()) {
            return;
        }
        if (filVar != filVar2) {
            filVar.getClass();
            filVar2.getClass();
            filVar = new fil(filVar.a, filVar2.b, false);
        }
        flwVar.k(cunVar);
        this.b.invoke(filVar);
        this.j = null;
    }

    public final void n(ihs ihsVar) {
        this.i.b(ihsVar);
    }

    public final void o(long j) {
        this.o.b(new ihs(j));
    }

    public final void p(long j) {
        this.p.b(new ihs(j));
    }

    public final void q(ezl ezlVar) {
        this.s.b(ezlVar);
    }

    public final void r(ihs ihsVar) {
        this.r.b(ihsVar);
    }

    public final void s(boolean z) {
        this.n.b(Boolean.valueOf(z));
    }

    public final void t(boolean z) {
        hox hoxVar = this.m;
        if (((Boolean) hoxVar.a()).booleanValue() != z) {
            hoxVar.b(Boolean.valueOf(z));
            y();
        }
    }

    public final void u(fil filVar) {
        this.l.b(filVar);
        if (filVar != null) {
            x();
        }
    }

    public final void v(boolean z) {
        this.t = z;
        y();
    }

    public final void w(ihs ihsVar) {
        this.q.b(ihsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r17 = this;
            r0 = r17
            fil r1 = r0.f()
            ivy r2 = r0.g
            r3 = 0
            if (r1 == 0) goto L14
            fik r4 = r1.a
            if (r4 == 0) goto L14
            fii r4 = r0.e(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            fik r5 = r1.b
            if (r5 == 0) goto L20
            fii r5 = r0.e(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            ivy r6 = r4.k()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            ivy r7 = r5.k()
            goto L31
        L30:
            r7 = r3
        L31:
            if (r1 == 0) goto La4
            if (r2 == 0) goto La4
            boolean r8 = r2.u()
            if (r8 == 0) goto La4
            if (r6 != 0) goto L3f
            if (r7 == 0) goto La4
        L3f:
            ihu r8 = defpackage.flh.b(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L74
            r13 = 1
            long r13 = r4.f(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L5b
            goto L74
        L5b:
            long r13 = r2.h(r6, r13)
            ihs r4 = new ihs
            r4.<init>(r13)
            long r13 = r4.a
            ezl r6 = r0.d()
            ezl r15 = defpackage.ezl.b
            if (r6 == r15) goto L75
            boolean r6 = defpackage.flh.c(r8, r13)
            if (r6 != 0) goto L75
        L74:
            r4 = r3
        L75:
            r0.w(r4)
            if (r7 == 0) goto La0
            r4 = 0
            long r4 = r5.f(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L85
            goto La0
        L85:
            long r1 = r2.h(r7, r4)
            ihs r4 = new ihs
            r4.<init>(r1)
            long r1 = r4.a
            ezl r5 = r0.d()
            ezl r6 = defpackage.ezl.c
            if (r5 == r6) goto L9f
            boolean r1 = defpackage.flh.c(r8, r1)
            if (r1 != 0) goto L9f
            goto La0
        L9f:
            r3 = r4
        La0:
            r0.r(r3)
            return
        La4:
            r0.w(r3)
            r0.r(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flg.x():void");
    }

    public final void y() {
        jkd jkdVar;
        if (z() && (jkdVar = this.k) != null) {
            if (!this.t || !C()) {
                if (jkdVar.b == 1) {
                    jkdVar.a();
                }
            } else {
                ihu ihuVarI = i();
                if (ihuVarI != null) {
                    jkdVar.b(ihuVarI, D() ? new fle(this) : null, null, null, B() ? null : new flf(this), null);
                }
            }
        }
    }

    public final boolean z() {
        return ((Boolean) this.n.a()).booleanValue();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxyt implements cxwl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/debug/cloudstore/analysisui/RpcPlaygroundPage");
    public final cxze b;
    private final String c = "RPC playground";

    public cxyt(cxze cxzeVar) {
        this.b = cxzeVar;
    }

    public static final String c(hox hoxVar) {
        return (String) hoxVar.a();
    }

    @Override // defpackage.cxwl
    public final String a() {
        return this.c;
    }

    @Override // defpackage.cxwl
    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1436333741);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl("", hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            ics icsVarD = egq.d(efy.j(ics.e, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA = cxyi.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            int i4 = (i2 << 3) & 112;
            d(hoxVar, hmlVarC, i4);
            fpf.a(null, 0L, 0.0f, hmlVarC, 0, 15);
            e((String) hoxVar.a(), hmlVarC, i4);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxyj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    this.a.b((hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final hox hoxVar, hml hmlVar, final int i) {
        int i2;
        final hox hoxVar2;
        final cxyt cxytVar = this;
        hoxVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1912339816);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(hoxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(cxytVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hoxVar2 = hoxVar;
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ics icsVarC = dpc.c(icoVar, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            int iA = cxyi.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(fdjxVar);
            boolean z = (i2 & 14) == 4;
            boolean zF2 = zF | z | hmlVarC.F(cxytVar);
            Object objS2 = hmwVar.S();
            if (zF2 || objS2 == obj) {
                objS2 = new fdae() { // from class: cxyk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        auvw.k(fdjxVar, null, null, new cxyp(hoxVar, cxytVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            boolean z2 = z;
            dtdi.a((fdae) objS2, joj.a(icoVar, "exportUserDataReferenceButton"), false, null, null, null, null, null, cxxh.a, hmlVarC, 805306416, 508);
            ics icsVarG = egq.g(icoVar, 80.0f);
            ixm ixmVarA2 = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA2 = cxyi.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarG);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar = new hpl("testCorrelationId", hsi.a);
                hmwVar.af(hplVar);
                objS3 = hplVar;
            }
            final hox hoxVar3 = (hox) objS3;
            hmwVar.ab();
            String strC = c(hoxVar3);
            ics icsVarA = joj.a(egq.d(icoVar, 0.5f), "correlationIdTextField");
            long jL = fqq.a(hmlVarC).l();
            long jF = ijg.f(ije.d(jL), ije.c(jL), ije.b(jL), 0.3f, ije.f(jL));
            long j = ((ije) hmlVarC.e(C0001for.a)).i;
            long jF2 = ijg.f(ije.d(j), ije.c(j), ije.b(j), ((Number) hmlVarC.e(fop.a)).floatValue(), ije.f(j));
            long jF3 = ijg.f(ije.d(jF2), ije.c(jF2), ije.b(jF2), fon.a(hmlVarC), ije.f(jF2));
            long jH = fqq.a(hmlVarC).h();
            long jB = fqq.a(hmlVarC).b();
            long jH2 = fqq.a(hmlVarC).h();
            long jF4 = ijg.f(ije.d(jH2), ije.c(jH2), ije.b(jH2), fon.b(hmlVarC), ije.f(jH2));
            long jG = fqq.a(hmlVarC).g();
            long jF5 = ijg.f(ije.d(jG), ije.c(jG), ije.b(jG), 0.42f, ije.f(jG));
            long jF6 = ijg.f(ije.d(jF5), ije.c(jF5), ije.b(jF5), fon.a(hmlVarC), ije.f(jF5));
            long jB2 = fqq.a(hmlVarC).b();
            long jG2 = fqq.a(hmlVarC).g();
            long jF7 = ijg.f(ije.d(jG2), ije.c(jG2), ije.b(jG2), 0.54f, ije.f(jG2));
            long jF8 = ijg.f(ije.d(jF7), ije.c(jF7), ije.b(jF7), fon.a(hmlVarC), ije.f(jF7));
            long jG3 = fqq.a(hmlVarC).g();
            long jF9 = ijg.f(ije.d(jG3), ije.c(jG3), ije.b(jG3), 0.54f, ije.f(jG3));
            long jF10 = ijg.f(ije.d(jF9), ije.c(jF9), ije.b(jF9), fon.a(hmlVarC), ije.f(jF9));
            long jB3 = fqq.a(hmlVarC).b();
            long jH3 = fqq.a(hmlVarC).h();
            long jF11 = ijg.f(ije.d(jH3), ije.c(jH3), ije.b(jH3), fon.b(hmlVarC), ije.f(jH3));
            long jG4 = fqq.a(hmlVarC).g();
            long jF12 = ijg.f(ije.d(jG4), ije.c(jG4), ije.b(jG4), fon.c(hmlVarC), ije.f(jG4));
            long jF13 = ijg.f(ije.d(jF12), ije.c(jF12), ije.b(jF12), fon.a(hmlVarC), ije.f(jF12));
            long jB4 = fqq.a(hmlVarC).b();
            long jG5 = fqq.a(hmlVarC).g();
            long jF14 = ijg.f(ije.d(jG5), ije.c(jG5), ije.b(jG5), fon.c(hmlVarC), ije.f(jG5));
            foz fozVar = new foz(jF2, jF3, jH, jB, jF4, jF5, jB2, jF6, jF7, jF8, jF7, jF9, jF10, jB3, jF, jF11, jF12, jF13, jB4, jF14, ijg.f(ije.d(jF14), ije.c(jF14), ije.b(jF14), fon.a(hmlVarC), ije.f(jF14)));
            hmlVarC.v(5004770);
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new fdap() { // from class: cxyl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        String str = (String) obj2;
                        str.getClass();
                        hoxVar3.b(str);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            fvd.c(strC, (fdap) objS4, icsVarA, false, null, cxxh.b, null, null, null, 0, 0, null, fozVar, hmlVarC, 1573296, 0);
            hmlVarC = hmlVarC;
            hmlVarC.v(-1224400529);
            boolean zF3 = hmlVarC.F(fdjxVar) | z2 | hmlVarC.F(this);
            Object objS5 = hmwVar.S();
            if (zF3 || objS5 == obj) {
                hoxVar2 = hoxVar;
                objS5 = new fdae() { // from class: cxym
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        auvw.k(fdjxVar, null, null, new cxyq(hoxVar2, this, hoxVar3, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            } else {
                hoxVar2 = hoxVar;
            }
            hmwVar.ab();
            cxytVar = this;
            dtdi.a((fdae) objS5, joj.a(icoVar, "getConversationByCorrelationIdButton"), false, null, null, null, null, null, cxxh.c, hmlVarC, 805306416, 508);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxyn
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cxyt cxytVar2 = this.a;
                    int i4 = i;
                    cxytVar2.d(hoxVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void e(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        str.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(131156580);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            fst.a(efy.f(ics.e, 20.0f, 10.0f, 20.0f, 10.0f), null, cxxh.d, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hxe.d(1703650082, new cxys(str), hmlVarC), hmlVar2, 384, 12582912, 131066);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxyo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxyt cxytVar = this.a;
                    int i4 = i;
                    cxytVar.e(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

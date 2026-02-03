package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfe {
    public static final void a(final gwd gwdVar, final int i, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(767754407);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(gwdVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS2 = hplVar;
            }
            final hox hoxVar = (hox) objS2;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar2 = new hpl(null, hsi.a);
                hmwVar.af(hplVar2);
                objS3 = hplVar2;
            }
            final hox hoxVar2 = (hox) objS3;
            hmwVar.ab();
            ico icoVar = ics.e;
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(fdjxVar) | ((i3 & 112) == 32);
            Object objS4 = hmwVar.S();
            if (zF || objS4 == obj) {
                objS4 = new fdav() { // from class: dlet
                    @Override // defpackage.fdav
                    public final Object a(Object obj2, Object obj3, Object obj4, Object obj5) {
                        ixp ixpVar = (ixp) obj2;
                        ixk ixkVar = (ixk) obj3;
                        final kil kilVar = (kil) obj4;
                        List list = (List) obj5;
                        ixpVar.getClass();
                        ixkVar.getClass();
                        list.getClass();
                        gwp gwpVar = (gwp) list.get(i);
                        float f = gwpVar.b;
                        float f2 = gwpVar.a;
                        hox hoxVar3 = hoxVar;
                        ddp ddpVar = (ddp) hoxVar3.a();
                        if (ddpVar == null) {
                            ddpVar = new ddp(new kir(f), diu.c, null, 4);
                            hoxVar3.b(ddpVar);
                        }
                        hox hoxVar4 = hoxVar2;
                        final ddp ddpVar2 = (ddp) hoxVar4.a();
                        if (ddpVar2 == null) {
                            ddpVar2 = new ddp(new kir(f2), diu.c, null, 4);
                            hoxVar4.b(ddpVar2);
                        }
                        fdjx fdjxVar2 = fdjxVar;
                        if (!kir.b(((kir) ddpVar.c()).a, f)) {
                            fdil.d(fdjxVar2, null, null, new dlew(ddpVar, f, null), 3);
                        }
                        if (!kir.b(((kir) ddpVar2.c()).a, f2)) {
                            fdil.d(fdjxVar2, null, null, new dlex(ddpVar2, f2, null), 3);
                        }
                        int iEp = ixpVar.ep(((kir) ddpVar.d()).a - 32.0f);
                        int iEp2 = ixpVar.ep(((kir) ddpVar.d()).a - 32.0f);
                        int iEp3 = ixpVar.ep(3.0f);
                        int iEp4 = ixpVar.ep(3.0f);
                        long j = kilVar.a;
                        final iyl iylVarE = ixkVar.e(kil.l(iEp2, iEp, iEp3, iEp4));
                        return ixpVar.ej(kil.b(j), kil.a(j), fcvp.a, new fdap() { // from class: dles
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj6) {
                                iyk iykVar = (iyk) obj6;
                                iykVar.getClass();
                                iyk.A(iykVar, iylVarE, kin.f(iykVar, ((kir) ddpVar2.d()).a), kil.a(kilVar.a) - kin.f(iykVar, 3.0f));
                                return fctx.a;
                            }
                        });
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            ics icsVarC = egq.c(egq.z(gwdVar.a(icoVar, (fdav) objS4), ibw.g, 2), 1.0f);
            hmlVarC.v(1849434622);
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                objS5 = new fdau() { // from class: dleu
                    @Override // defpackage.fdau
                    public final Object a(Object obj2, Object obj3, Object obj4) {
                        ikd ikdVar = (ikd) obj2;
                        ikdVar.getClass();
                        ((kji) obj4).getClass();
                        long j = ((ihz) obj3).a;
                        int i5 = (int) (4294967295L & j);
                        ikdVar.f(0.0f, Float.intBitsToFloat(i5));
                        ikdVar.d(0.0f, Float.intBitsToFloat(i5) / 2.0f, Float.intBitsToFloat(i5) / 2.0f, 0.0f, Float.intBitsToFloat(i5), 0.0f);
                        int i6 = (int) (j >> 32);
                        ikdVar.e(Float.intBitsToFloat(i6) - Float.intBitsToFloat(i5), 0.0f);
                        ikdVar.d(Float.intBitsToFloat(i6) - (Float.intBitsToFloat(i5) / 2.0f), 0.0f, Float.intBitsToFloat(i6), Float.intBitsToFloat(i5) / 2.0f, Float.intBitsToFloat(i6), Float.intBitsToFloat(i5));
                        ikdVar.f(0.0f, Float.intBitsToFloat(i5));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            ecz.b(dkl.a(iex.a(icsVarC, new evj((fdau) objS5)), glz.a(hmlVarC).a, ikj.a), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlev
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    gwd gwdVar2 = gwdVar;
                    int i5 = i2;
                    dlfe.a(gwdVar2, i, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dleo dleoVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        long jA;
        final ics icsVar2;
        long j;
        hml hmlVarC = hmlVar.c(2075779516);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dleoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            final ico icoVar = ics.e;
            Object[] objArr = new Object[0];
            hmlVarC.v(5004770);
            int i4 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: dlep
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hph(dleoVar.b);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hri hriVar = (hri) hxy.a(objArr, (fdae) objS, hmlVarC, 0);
            if (hriVar.c() == -1) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dleq
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dleo dleoVar2 = dleoVar;
                            int i5 = i;
                            dlfe.b(dleoVar2, icoVar, (hml) obj, hpy.a(i5 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(hriVar) | (i4 == 4);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new dley(dleoVar, hriVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(dleoVar, (fdat) objS2, hmlVarC);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j2;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            int iC = hriVar.c();
            if (((Boolean) hmlVarC.e(gdd.b)).booleanValue()) {
                hmlVarC.v(-158828768);
                jA = dthk.a(hmlVarC);
                hmwVar.ab();
            } else {
                hmlVarC.v(-158763172);
                jA = glz.a(hmlVarC).F;
                hmwVar.ab();
            }
            icsVar2 = icoVar;
            dtho.a(iC, null, null, jA, 0L, 0.0f, hxe.d(-871345373, new dlez(hriVar), hmlVarC), dlcz.a, 0.0f, hxe.d(1469818682, new dlfd(dleoVar, hriVar), hmlVarC), hmlVarC, 819658752, 278);
            if (dlv.a(hmlVarC)) {
                hmlVarC.v(-157658332);
                j = dljt.f(hmlVarC).F;
                hmwVar.ab();
            } else {
                hmlVarC.v(-157597045);
                j = dljt.f(hmlVarC).S;
                hmwVar.ab();
            }
            dtev.a(null, 0.0f, j, hmlVarC, 0, 3);
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dler
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dleo dleoVar2 = dleoVar;
                    int i6 = i;
                    dlfe.b(dleoVar2, icsVar2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

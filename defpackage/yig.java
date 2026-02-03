package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yig {
    public static final void a(dlpy dlpyVar, hml hmlVar, final int i) {
        int i2;
        final dlpy dlpyVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-412515771);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlpyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            dlpyVar2 = dlpyVar;
        } else {
            ics icsVarJ = efy.j(egq.g(ics.e, 26.0f), 12.0f, 0.0f, 0.0f, 4.0f, 6);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = yia.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
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
            dlpyVar2 = dlpyVar;
            dlpw.a(dlpyVar2, null, 0L, hmlVarC, i2 & 14, 6);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yib
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    yig.a(dlpyVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final yhz yhzVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1343627670);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(yhzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (yhzVar.f.a) {
            hmlVarC.v(1083435450);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new ikz(ila.a(0.2f, 0.9f));
                hmwVar.af(objS);
            }
            long j = ((ikz) objS).b;
            hmwVar.ab();
            Object objA = hro.a(yhzVar.a, hmlVarC).a();
            aadk aadkVar = aadk.a;
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = dae.s(new dtgd().b(), ibw.g, 8).a(dae.n(new dtgd().b(), 0.0f, j, 2));
                hmwVar.af(objS2);
            }
            dap dapVar = (dap) objS2;
            hmwVar.ab();
            hmlVarC.v(5004770);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = dae.t(new dtgd().b(), ibw.g, 8).a(dae.o(new dtgd().b(), 0.0f, j, 2));
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            diig.a(objA, aadkVar, dapVar, (dar) objS3, "typing indicator footer", ygu.a, hmlVarC, 224640, 0);
            hmwVar.ab();
        } else {
            hmlVarC.v(1084272946);
            dlpy dlpyVar = (dlpy) hro.a(yhzVar.a, hmlVarC).a();
            if (dlpyVar != null) {
                a(dlpyVar, hmlVarC, 0);
            }
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yic
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    yig.b(yhzVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final yhz yhzVar, final eais eaisVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1602905444);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(yhzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(eaisVar) : hmlVarC.F(eaisVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ecq ecqVar = ecr.c;
            ibx ibxVar = ibw.j;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVarC, 0);
            int iA = yia.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            ecj ecjVarG = ecr.g(4.0f);
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA2 = edl.a(ecjVarG, ibxVar, hmlVarC, 6);
            int iA2 = yia.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarD);
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
            b(yhzVar, hmlVarC, i2 & 14);
            dldx dldxVar = (dldx) hro.a(yhzVar.b, hmlVarC).a();
            hpt hptVar = dldw.a;
            hmlVarC.v(950565104);
            ije ijeVar = new ije(dljt.a(hmlVarC).d.a);
            hmlVarC.v(950565743);
            boolean z = !((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() && dljt.h(hmlVarC);
            hmwVar.ab();
            Boolean.valueOf(z).getClass();
            if (true != z) {
                ijeVar = null;
            }
            hmwVar.ab();
            hnj.a(hptVar.c(ijeVar), hxe.d(-1436726984, new yif(yhzVar, dldxVar), hmlVarC), hmlVarC, 56);
            ahes ahesVar = (ahes) hro.a(yhzVar.c, hmlVarC).a();
            hmlVarC.v(950613903);
            if (ahesVar != null) {
                ahew.a(ahesVar, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.v(950615053);
            if (yhzVar.f.b) {
                Optional optional = yhzVar.d;
                if (optional.isPresent()) {
                    ((zty) optional.get()).b().a(hmlVarC, 0);
                }
            }
            hmwVar.ab();
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yid
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yhz yhzVar2 = yhzVar;
                    int i4 = i;
                    yig.c(yhzVar2, eaisVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

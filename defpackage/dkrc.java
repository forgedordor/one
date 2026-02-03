package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkrc implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdau b;

    public dkrc(boolean z, fdau fdauVar) {
        this.a = z;
        this.b = fdauVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVarC;
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            if (this.a) {
                hmlVar.v(-886622736);
                final float fEn = ((kio) hmlVar.e(jmh.e)).en(edkVar.c()) * 0.07f;
                hmlVar.v(5004770);
                boolean zA = hmlVar.A(fEn);
                Object objF = hmlVar.f();
                if (zA || objF == hmk.a) {
                    ind indVar = new ind(fEn, 0.0f, 0, 0, 30);
                    hmlVar.y(indVar);
                    objF = indVar;
                }
                final ind indVar2 = (ind) objF;
                hmlVar.o();
                ico icoVar = ics.e;
                hmlVar.v(-1633490746);
                boolean zA2 = hmlVar.A(fEn) | hmlVar.F(indVar2);
                Object objF2 = hmlVar.f();
                if (zA2 || objF2 == hmk.a) {
                    objF2 = new fdap() { // from class: dkra
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            imw imwVar = (imw) obj4;
                            imwVar.getClass();
                            imwVar.p();
                            long j = ije.a;
                            float fB = ihz.b(imwVar.b()) / 2.0f;
                            imy.e(imwVar, j, fB - (fEn / 2.0f), iia.b(imwVar.b()), indVar2, 0, 40);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                ics icsVarC2 = ifb.c(icoVar, (fdap) objF2);
                hmlVar.v(1849434622);
                Object objF3 = hmlVar.f();
                if (objF3 == hmk.a) {
                    objF3 = new fdap() { // from class: dkrb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            ikl iklVar = (ikl) obj4;
                            iklVar.getClass();
                            iklVar.r(true);
                            iklVar.A(evn.a);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF3);
                }
                hmlVar.o();
                icsVarC = ijn.a(icsVarC2, (fdap) objF3);
                hmlVar.o();
            } else {
                hmlVar.v(-886049732);
                icsVarC = dkr.c(ics.e, edkVar.c() * 0.07f, glz.a(hmlVar).n, evn.a);
                hmlVar.o();
            }
            ics icsVarD = efy.d(egq.h(ics.e, edkVar.c()).a(icsVarC), 1.0f);
            fdau fdauVar = this.b;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdauVar.a(edf.a, hmlVar, 6);
            hmlVar.n();
        }
        return fctx.a;
    }
}

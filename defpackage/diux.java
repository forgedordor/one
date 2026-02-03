package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diux implements fdau {
    final /* synthetic */ divf a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ gsp c;

    public diux(divf divfVar, fdjx fdjxVar, gsp gspVar) {
        this.a = divfVar;
        this.b = fdjxVar;
        this.c = gspVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edp edpVar = (edp) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edpVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1872214327);
            final divf divfVar = this.a;
            boolean z = divfVar.g;
            if (z) {
                hmlVar.v(-1746271574);
                final fdjx fdjxVar = this.b;
                boolean zF = hmlVar.F(fdjxVar);
                final gsp gspVar = this.c;
                boolean zD = zF | hmlVar.D(gspVar) | hmlVar.D(divfVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: diuv
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdlr fdlrVarD = fdil.d(fdjxVar, null, null, new diuw(gspVar, null), 3);
                            final divf divfVar2 = divfVar;
                            fdlrVarD.hK(new fdap() { // from class: diuu
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj4) {
                                    divfVar2.h.invoke();
                                    return fctx.a;
                                }
                            });
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                diuy.f(edpVar, (fdae) objF, hmlVar, iIntValue & 14);
            }
            hmlVar.o();
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 24.0f, 0.0f, 2);
            ibx ibxVar = ibw.k;
            ecq ecqVar = ecr.c;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVar, 48);
            int iA = diut.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            ics icsVarC = dpc.c(edp.b(icoVar, 1.0f, false), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVar, 48);
            int iA2 = diut.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarC);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            dkts dktsVar = divfVar.f;
            hmlVar.v(285692022);
            float f = 8.0f;
            if (dktsVar != null) {
                egt.a(egq.e(icoVar, z ? 8.0f : 24.0f), hmlVar);
                diuy.j(dktsVar, null, hmlVar, 0);
            }
            hmlVar.o();
            if (dktsVar != null) {
                f = 16.0f;
            } else if (!z) {
                f = 48.0f;
            }
            egt.a(egq.e(icoVar, f), hmlVar);
            diuy.k(divfVar.a, null, hmlVar, 0);
            String str = divfVar.d;
            hmlVar.v(285705023);
            if (str != null) {
                egt.a(egq.e(icoVar, 16.0f), hmlVar);
                diuy.b(str, divfVar.e, hmlVar, 0);
            }
            hmlVar.o();
            egt.a(egq.e(icoVar, 28.0f), hmlVar);
            hmlVar.n();
            diuy.h(divfVar.i, divfVar.b, false, null, divfVar.c, null, hmlVar, 0, 40);
            hmlVar.n();
        }
        return fctx.a;
    }
}

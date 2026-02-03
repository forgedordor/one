package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aacv implements fdau {
    final /* synthetic */ aabu a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ gsp c;
    final /* synthetic */ hsf d;
    final /* synthetic */ hox e;

    public aacv(aabu aabuVar, fdjx fdjxVar, gsp gspVar, hsf hsfVar, hox hoxVar) {
        this.a = aabuVar;
        this.b = fdjxVar;
        this.c = gspVar;
        this.d = hsfVar;
        this.e = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Integer numA;
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
            hmlVar.v(9280242);
            final aabu aabuVar = this.a;
            if (aabuVar.k) {
                hmlVar.v(-1746271574);
                final fdjx fdjxVar = this.b;
                boolean zF = hmlVar.F(fdjxVar);
                final gsp gspVar = this.c;
                boolean zD = zF | hmlVar.D(gspVar) | hmlVar.D(aabuVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: aact
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdlr fdlrVarK = auvw.k(fdjxVar, null, null, new aacu(gspVar, null), 3);
                            final aabu aabuVar2 = aabuVar;
                            fdlrVarK.hK(new fdap() { // from class: aacs
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj4) {
                                    aabuVar2.l.invoke();
                                    return fctx.a;
                                }
                            });
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                aacz.i(edpVar, (fdae) objF, hmlVar, iIntValue & 14);
            }
            hmlVar.o();
            ico icoVar = ics.e;
            ics icsVarC = dpc.c(edp.b(efy.i(icoVar, 24.0f, 0.0f, 2), 1.0f, false), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            hsf hsfVar = this.d;
            ibx ibxVar = ibw.k;
            ecq ecqVar = ecr.c;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVar, 48);
            int iA = aacr.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
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
            ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVar, 48);
            int iA2 = aacr.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icoVar);
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
            aacz.n(aabuVar.a, null, hmlVar, 0);
            String str = aabuVar.b;
            hmlVar.v(-1974201239);
            if (str != null) {
                egt.a(egq.e(icoVar, 16.0f), hmlVar);
                aacz.b(str, aabuVar.c, hmlVar, 0);
            }
            hmlVar.o();
            egt.a(egq.e(icoVar, 16.0f), hmlVar);
            hmlVar.n();
            hmlVar.v(355342344);
            int i = 0;
            for (Object obj4 : aabuVar.e) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                djzw djzwVar = (djzw) obj4;
                String str2 = djzwVar.a;
                String str3 = djzwVar.b;
                Integer numA2 = aacz.a(hsfVar);
                aacz.o(new djzw(str2, str3, djzwVar.c, numA2 != null && i == numA2.intValue(), djzwVar.e), null, hmlVar, 0);
                hmlVar.v(355350644);
                Integer num = aabuVar.f;
                if (num != null && fdbq.f(aacz.a(hsfVar), num) && (numA = aacz.a(hsfVar)) != null && i == numA.intValue()) {
                    aacz.m(djwc.a(aabuVar.g, null, null, null, false, null, ibw.m, 191), efy.j(edp.a(icoVar, ibxVar), 42.0f, 0.0f, 0.0f, 0.0f, 14), hmlVar, 0);
                }
                hmlVar.o();
                i = i2;
            }
            hmlVar.o();
            hmlVar.v(355363748);
            if (fdbq.f(aacz.a(hsfVar), aabuVar.h)) {
                dkeo.b(aabuVar.i, efy.j(edp.a(icoVar, ibxVar), 0.0f, 0.0f, 0.0f, 4.0f, 7), hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
            if (aacz.a(hsfVar) != null) {
                this.e.b(true);
            }
            egt.a(egq.e(icoVar, 8.0f), hmlVar);
            aacz.k(aabuVar.j, ((Boolean) this.e.a()).booleanValue(), efy.i(icoVar, 24.0f, 0.0f, 2), this.b, hmlVar, 384);
        }
        return fctx.a;
    }
}

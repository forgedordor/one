package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haz implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ hbl b;
    final /* synthetic */ jfw c;
    final /* synthetic */ gyq d;
    final /* synthetic */ hox e;

    public haz(hox hoxVar, hbl hblVar, jfw jfwVar, gyq gyqVar, hox hoxVar2) {
        this.a = hoxVar;
        this.b = hblVar;
        this.c = jfwVar;
        this.d = gyqVar;
        this.e = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final hox hoxVar = this.a;
            final hbl hblVar = this.b;
            final jfw jfwVar = this.c;
            gyq gyqVar = this.d;
            final hox hoxVar2 = this.e;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Object objValueOf = Integer.valueOf(iA);
                hmlVar.y(objValueOf);
                hmlVar.h(objValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            boolean zD = hmlVar.D(hoxVar) | hmlVar.F(hblVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new hax(hblVar, hoxVar);
                hmlVar.y(objF);
            }
            ics icsVarA = iqk.a(icoVar, (fdap) objF);
            kew kewVarG = hbj.g(hoxVar);
            boolean zF = hmlVar.F(hblVar) | hmlVar.D(hoxVar) | hmlVar.F(jfwVar);
            Object objF2 = hmlVar.f();
            if (zF || objF2 == hmk.a) {
                objF2 = new fdap() { // from class: hat
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        hbl hblVar2 = hblVar;
                        kew kewVar = (kew) obj3;
                        final hox hoxVar3 = hoxVar;
                        hbj.z(0, hblVar2, kewVar, hbj.g(hoxVar3), true != ((hbo) hblVar2).a ? 12 : 23, jfwVar, new fdap() { // from class: har
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                hbj.s(hoxVar3, (kew) obj4);
                                return fctx.a;
                            }
                        });
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdap fdapVar = (fdap) objF2;
            fae faeVar = new fae(0, null, 3, 6, 115);
            boolean zF2 = hmlVar.F(hblVar);
            Object objF3 = hmlVar.f();
            if (zF2 || objF3 == hmk.a) {
                objF3 = new fdap() { // from class: hau
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        hblVar.j(1);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            hbj.F(icsVarA, kewVarG, fdapVar, hblVar, 0, faeVar, new fad(null, (fdap) objF3, null, null, 59), gyqVar, hmlVar, 24576);
            hbj.n(egq.m(icoVar, 24.0f, 72.0f), hmlVar, 6);
            boolean zD2 = hmlVar.D(hoxVar2) | hmlVar.F(hblVar);
            Object objF4 = hmlVar.f();
            if (zD2 || objF4 == hmk.a) {
                objF4 = new hay(hblVar, hoxVar2);
                hmlVar.y(objF4);
            }
            ics icsVarB2 = iqk.b(icoVar, (fdap) objF4);
            kew kewVarH = hbj.h(hoxVar2);
            boolean zF3 = hmlVar.F(hblVar) | hmlVar.D(hoxVar2) | hmlVar.F(jfwVar);
            Object objF5 = hmlVar.f();
            if (zF3 || objF5 == hmk.a) {
                objF5 = new fdap() { // from class: hav
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        final hox hoxVar3 = hoxVar2;
                        kew kewVarH2 = hbj.h(hoxVar3);
                        fdap fdapVar2 = new fdap() { // from class: has
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                hbj.t(hoxVar3, (kew) obj4);
                                return fctx.a;
                            }
                        };
                        hbj.z(1, hblVar, (kew) obj3, kewVarH2, 59, jfwVar, fdapVar2);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF5);
            }
            fdap fdapVar2 = (fdap) objF5;
            fae faeVar2 = new fae(0, null, 3, 7, 115);
            boolean zF4 = hmlVar.F(hblVar);
            Object objF6 = hmlVar.f();
            if (zF4 || objF6 == hmk.a) {
                objF6 = new fdap() { // from class: haw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        hblVar.j(1);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF6);
            }
            hbj.F(icsVarB2, kewVarH, fdapVar2, hblVar, 1, faeVar2, new fad(null, (fdap) objF6, null, null, 59), gyqVar, hmlVar, 24576);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

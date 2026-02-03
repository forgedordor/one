package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftf implements fdau {
    final /* synthetic */ List a;
    final /* synthetic */ fpx b;
    final /* synthetic */ String c;
    final /* synthetic */ ftl d;
    final /* synthetic */ ftl e;

    public ftf(ftl ftlVar, ftl ftlVar2, List list, fpx fpxVar, String str) {
        this.d = ftlVar;
        this.e = ftlVar2;
        this.a = list;
        this.b = fpxVar;
        this.c = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object ftiVar;
        Boolean bool;
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final ftl ftlVar = this.d;
            final boolean zF = fdbq.f(ftlVar, this.e);
            int i = true != zF ? 75 : 150;
            int i2 = (!zF || kjw.b(this.a).size() == 1) ? 0 : 75;
            dia diaVar = new dia(i, i2, dev.d);
            boolean zF2 = hmlVar.F(ftlVar);
            final fpx fpxVar = this.b;
            boolean zF3 = zF2 | hmlVar.F(fpxVar);
            Object objF = hmlVar.f();
            if (zF3 || objF == hmk.a) {
                objF = new fdae() { // from class: ftd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        final ftl ftlVar2 = ftlVar;
                        fpx fpxVar2 = fpxVar;
                        if (!fdbq.f(ftlVar2, fpxVar2.a)) {
                            fcva.x(fpxVar2.b, new fdap() { // from class: ftc
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj4) {
                                    return Boolean.valueOf(fdbq.f(((fpw) obj4).a, ftlVar2));
                                }
                            });
                            hpx hpxVar = fpxVar2.c;
                            if (hpxVar != null) {
                                hpxVar.a();
                            }
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            Object objF2 = hmlVar.f();
            Object obj4 = hmk.a;
            if (objF2 == obj4) {
                objF2 = ddq.a(true != zF ? 1.0f : 0.0f);
                hmlVar.y(objF2);
            }
            ddp ddpVar = (ddp) objF2;
            Boolean boolValueOf = Boolean.valueOf(zF);
            boolean zF4 = hmlVar.F(ddpVar) | hmlVar.E(zF) | hmlVar.F(diaVar) | hmlVar.D(fdaeVar);
            Object objF3 = hmlVar.f();
            if (zF4 || objF3 == obj4) {
                bool = boolValueOf;
                ftiVar = new fti(ddpVar, zF, diaVar, fdaeVar, null);
                hmlVar.y(ftiVar);
            } else {
                bool = boolValueOf;
                ftiVar = objF3;
            }
            hob.g(bool, (fdat) ftiVar, hmlVar);
            deb debVar = ddpVar.a;
            dia diaVar2 = new dia(i, i2, dev.a);
            Object objF4 = hmlVar.f();
            if (objF4 == obj4) {
                objF4 = ddq.a(true == zF ? 0.8f : 1.0f);
                hmlVar.y(objF4);
            }
            ddp ddpVar2 = (ddp) objF4;
            boolean zF5 = hmlVar.F(ddpVar2) | hmlVar.E(zF) | hmlVar.F(diaVar2);
            Object objF5 = hmlVar.f();
            if (zF5 || objF5 == obj4) {
                objF5 = new ftj(ddpVar2, zF, diaVar2, null);
                hmlVar.y(objF5);
            }
            hob.g(bool, (fdat) objF5, hmlVar);
            deb debVar2 = ddpVar2.a;
            ics icsVarB = ijn.b(ics.e, ((Number) debVar2.a()).floatValue(), ((Number) debVar2.a()).floatValue(), ((Number) debVar.a()).floatValue(), 0.0f, null, 131064);
            boolean zE = hmlVar.E(zF);
            final String str = this.c;
            boolean zD = zE | hmlVar.D(str) | hmlVar.F(ftlVar);
            Object objF6 = hmlVar.f();
            if (zD || objF6 == obj4) {
                objF6 = new fdap() { // from class: fte
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        jto jtoVar = (jto) obj5;
                        if (zF) {
                            jtk.n(jtoVar, 0);
                        }
                        final ftl ftlVar2 = ftlVar;
                        jtk.o(jtoVar, str);
                        jtk.d(jtoVar, null, new fdae() { // from class: ftb
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                ftlVar2.a();
                                return true;
                            }
                        });
                        return fctx.a;
                    }
                };
                hmlVar.y(objF6);
            }
            ics icsVarC = jsh.c(icsVarB, false, (fdap) objF6);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarC);
            fdae fdaeVar2 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar2);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Object objValueOf = Integer.valueOf(iA);
                hmlVar.y(objValueOf);
                hmlVar.h(objValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB2, jbb.c);
            fdatVar.a(hmlVar, Integer.valueOf(iIntValue & 14));
            hmlVar.n();
        }
        return fctx.a;
    }
}

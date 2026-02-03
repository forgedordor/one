package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gue implements fdau {
    final /* synthetic */ gjj a;
    final /* synthetic */ String b;
    final /* synthetic */ guk c;
    final /* synthetic */ guk d;

    public gue(guk gukVar, guk gukVar2, gjj gjjVar, String str) {
        this.c = gukVar;
        this.d = gukVar2;
        this.a = gjjVar;
        this.b = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            final guk gukVar = this.c;
            final boolean zF = fdbq.f(gukVar, this.d);
            dew dewVarB = gpg.b(5, hmlVar);
            boolean zD = hmlVar.D(gukVar);
            final gjj gjjVar = this.a;
            boolean zF2 = zD | hmlVar.F(gjjVar);
            Object objF = hmlVar.f();
            if (zF2 || objF == hmk.a) {
                objF = new fdae() { // from class: guc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        final guk gukVar2 = gukVar;
                        gjj gjjVar2 = gjjVar;
                        if (!fdbq.f(gukVar2, gjjVar2.a)) {
                            fcva.x(gjjVar2.b, new fdap() { // from class: gub
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj4) {
                                    return Boolean.valueOf(fdbq.f(((gji) obj4).a, gukVar2));
                                }
                            });
                            hpx hpxVar = gjjVar2.c;
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
            boolean zF3 = hmlVar.F(ddpVar) | hmlVar.E(zF) | hmlVar.F(dewVarB) | hmlVar.D(fdaeVar);
            Object objF3 = hmlVar.f();
            if (zF3 || objF3 == obj4) {
                Object guhVar = new guh(ddpVar, zF, dewVarB, fdaeVar, null);
                hmlVar.y(guhVar);
                objF3 = guhVar;
            }
            hob.g(boolValueOf, (fdat) objF3, hmlVar);
            deb debVar = ddpVar.a;
            dew dewVarB2 = gpg.b(2, hmlVar);
            Object objF4 = hmlVar.f();
            if (objF4 == obj4) {
                objF4 = ddq.a(true == zF ? 0.8f : 1.0f);
                hmlVar.y(objF4);
            }
            ddp ddpVar2 = (ddp) objF4;
            boolean zF4 = hmlVar.F(ddpVar2) | hmlVar.E(zF) | hmlVar.F(dewVarB2);
            Object objF5 = hmlVar.f();
            if (zF4 || objF5 == obj4) {
                objF5 = new gui(ddpVar2, zF, dewVarB2, null);
                hmlVar.y(objF5);
            }
            hob.g(boolValueOf, (fdat) objF5, hmlVar);
            deb debVar2 = ddpVar2.a;
            ics icsVarB = ijn.b(ics.e, ((Number) debVar2.a()).floatValue(), ((Number) debVar2.a()).floatValue(), ((Number) debVar.a()).floatValue(), 0.0f, null, 131064);
            boolean zE = hmlVar.E(zF) | hmlVar.D(gukVar);
            final String str = this.b;
            boolean zD2 = zE | hmlVar.D(str);
            Object objF6 = hmlVar.f();
            if (zD2 || objF6 == obj4) {
                objF6 = new fdap() { // from class: gud
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        jto jtoVar = (jto) obj5;
                        if (zF) {
                            jtk.n(jtoVar, 0);
                        }
                        final guk gukVar2 = gukVar;
                        String str2 = str;
                        jtk.d(jtoVar, null, new fdae() { // from class: gua
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                gukVar2.a();
                                return true;
                            }
                        });
                        jtk.o(jtoVar, str2);
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
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

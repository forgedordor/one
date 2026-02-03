package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwey {
    public static dwsa a(final dwje dwjeVar, final Context context, eyuw eyuwVar, final String str, final dwhr dwhrVar) {
        dwiv dwivVar = new dwiv();
        dwivVar.b(dvib.c(eyuwVar.b, new ejvr() { // from class: dweu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eyuo eyuoVar = (eyuo) obj;
                dwix dwixVar = new dwix();
                dwixVar.e(eyuoVar.c);
                dwixVar.f(eyuoVar.g);
                int i = eyuoVar.b & 1;
                final dwje dwjeVar2 = dwjeVar;
                final String str2 = str;
                final dwhr dwhrVar2 = dwhrVar;
                if (i != 0) {
                    eyva eyvaVar = eyuoVar.d;
                    if (eyvaVar == null) {
                        eyvaVar = eyva.a;
                    }
                    dwru dwruVarA = dwru.a(eyvaVar.b);
                    if (dwruVarA.equals(dwru.UNKNOWN)) {
                        dwhp dwhpVarR = dwhq.r();
                        dwhpVarR.g(24);
                        dwhpVarR.n(dwjeVar2.c().f());
                        dwhpVarR.o(dwjeVar2.d().E());
                        dwhpVarR.p(str2);
                        dwhpVarR.f(114);
                        dwhrVar2.b(dwhpVarR.a());
                    }
                    dwixVar.d(dwruVarA);
                }
                if (eyuoVar.e.size() != 0) {
                    dwixVar.c(dvib.c(eyuoVar.e, new ejvr() { // from class: dwen
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eyuy eyuyVar = (eyuy) obj2;
                            int i2 = eyuyVar.d;
                            int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 4 : 3 : 2;
                            if (i3 == 0) {
                                i3 = 1;
                            }
                            int i4 = i3 - 2;
                            if (i4 == 1) {
                                return new dwlj((eyuyVar.b == 2 ? (eyuu) eyuyVar.c : eyuu.a).b);
                            }
                            if (i4 == 2) {
                                return dwli.a;
                            }
                            dwhr dwhrVar3 = dwhrVar2;
                            String str3 = str2;
                            dwje dwjeVar3 = dwjeVar2;
                            dwhp dwhpVarR2 = dwhq.r();
                            dwhpVarR2.g(24);
                            dwhpVarR2.n(dwjeVar3.c().f());
                            dwhpVarR2.o(dwjeVar3.d().E());
                            dwhpVarR2.p(str3);
                            dwhpVarR2.f(115);
                            dwhrVar3.b(dwhpVarR2.a());
                            return dwlk.a;
                        }
                    }));
                }
                if (eyuoVar.f.size() != 0) {
                    dwixVar.b(dvib.c(eyuoVar.f, new ejvr() { // from class: dweo
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eyuq eyuqVar = (eyuq) obj2;
                            dwiz dwizVar = new dwiz();
                            dwizVar.c(eyuqVar.b);
                            dwizVar.b(eyuqVar.c);
                            evtg evtgVar = eyuqVar.d;
                            final dwje dwjeVar3 = dwjeVar2;
                            final String str3 = str2;
                            final dwhr dwhrVar3 = dwhrVar2;
                            dwizVar.d(dvib.c(evtgVar, new ejvr() { // from class: dwem
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    int i2;
                                    int i3;
                                    eyvc eyvcVar = (eyvc) obj3;
                                    switch (eyvcVar.d) {
                                        case 0:
                                            i2 = 2;
                                            break;
                                        case 1:
                                            i2 = 3;
                                            break;
                                        case 2:
                                            i2 = 4;
                                            break;
                                        case 3:
                                            i2 = 5;
                                            break;
                                        case 4:
                                            i2 = 6;
                                            break;
                                        case 5:
                                            i2 = 7;
                                            break;
                                        case 6:
                                            i2 = 8;
                                            break;
                                        case 7:
                                            i2 = 9;
                                            break;
                                        case 8:
                                            i2 = 10;
                                            break;
                                        case 9:
                                            i2 = 11;
                                            break;
                                        case 10:
                                            i2 = 12;
                                            break;
                                        case 11:
                                            i2 = 13;
                                            break;
                                        case 12:
                                            i2 = 14;
                                            break;
                                        case 13:
                                            i2 = 15;
                                            break;
                                        default:
                                            i2 = 0;
                                            break;
                                    }
                                    if (i2 == 0) {
                                        i2 = 1;
                                    }
                                    final dwhr dwhrVar4 = dwhrVar3;
                                    final String str4 = str3;
                                    final dwje dwjeVar4 = dwjeVar3;
                                    switch (i2 - 2) {
                                        case 1:
                                            return new dwln();
                                        case 2:
                                            return new dwlr();
                                        case 3:
                                            return new dwlx();
                                        case 4:
                                            return new dwlt();
                                        case 5:
                                            return new dwlv();
                                        case 6:
                                            return new dwlu();
                                        case 7:
                                            return new dwlo(dwdw.a(eyvcVar.b == 8 ? (eyax) eyvcVar.c : eyax.a));
                                        case 8:
                                            return new dwlm(dwdw.a(eyvcVar.b == 9 ? (eyax) eyvcVar.c : eyax.a));
                                        case 9:
                                            return new dwls(eyvcVar.b == 10 ? ((Integer) eyvcVar.c).intValue() : 0);
                                        case 10:
                                            return dwma.a(dvib.c((eyvcVar.b == 11 ? (eyve) eyvcVar.c : eyve.a).b, new ejvr() { // from class: dwew
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj4) {
                                                    dwrz dwrzVarA = dwrz.a(((eyvg) obj4).b);
                                                    if (dwrzVarA.equals(dwrz.UNKNOWN)) {
                                                        dwhr dwhrVar5 = dwhrVar4;
                                                        String str5 = str4;
                                                        dwje dwjeVar5 = dwjeVar4;
                                                        dwhp dwhpVarR2 = dwhq.r();
                                                        dwhpVarR2.g(24);
                                                        dwhpVarR2.n(dwjeVar5.c().f());
                                                        dwhpVarR2.o(dwjeVar5.d().E());
                                                        dwhpVarR2.p(str5);
                                                        dwhpVarR2.f(113);
                                                        dwhrVar5.b(dwhpVarR2.a());
                                                    }
                                                    return dwrzVarA;
                                                }
                                            }));
                                        case 11:
                                            if (eyvcVar.b == 12) {
                                                int iIntValue = ((Integer) eyvcVar.c).intValue();
                                                i3 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? 0 : 4 : 3 : 2;
                                                if (i3 == 0) {
                                                    i3 = 1;
                                                }
                                            } else {
                                                i3 = 2;
                                            }
                                            int i4 = i3 - 2;
                                            if (i4 == 1) {
                                                i = 1;
                                            } else if (i4 == 2) {
                                                i = 2;
                                            }
                                            return new dwlp(i);
                                        case 12:
                                            eyus eyusVar = eyvcVar.b == 13 ? (eyus) eyvcVar.c : eyus.a;
                                            dwoi dwoiVar = new dwoi();
                                            dwoiVar.b(eyusVar.b);
                                            return new dwlq(dwoiVar.a());
                                        default:
                                            dwhp dwhpVarR2 = dwhq.r();
                                            dwhpVarR2.g(24);
                                            dwhpVarR2.n(dwjeVar4.c().f());
                                            dwhpVarR2.o(dwjeVar4.d().E());
                                            dwhpVarR2.p(str4);
                                            dwhpVarR2.f(116);
                                            dwhrVar4.b(dwhpVarR2.a());
                                            return new dwly();
                                    }
                                }
                            }));
                            return dwizVar.a();
                        }
                    }));
                }
                return dwixVar.a();
            }
        }));
        return dwivVar.a();
    }

    public static eyuw b(dwsa dwsaVar) {
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        ekgb ekgbVarC = dvib.c(dwsaVar.a(), new ejvr() { // from class: dwet
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final dwrl dwrlVar = (dwrl) obj;
                final eyun eyunVar = (eyun) eyuo.a.createBuilder();
                String strE = dwrlVar.e();
                eyunVar.copyOnWrite();
                ((eyuo) eyunVar.instance).c = strE;
                dvhx.b(dwrlVar.d(), new lbz() { // from class: dwep
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        boolean zBooleanValue = ((Boolean) dwrlVar.d().c()).booleanValue();
                        eyun eyunVar2 = eyunVar;
                        eyunVar2.copyOnWrite();
                        eyuo eyuoVar = (eyuo) eyunVar2.instance;
                        eyuo eyuoVar2 = eyuo.a;
                        eyuoVar.g = zBooleanValue;
                    }
                });
                dvhx.b(dwrlVar.c(), new lbz() { // from class: dweq
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        int i = ((dwru) obj2).g;
                        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 7 : 6 : 5 : 4 : 3 : 2;
                        eyun eyunVar2 = eyunVar;
                        eyuz eyuzVar = (eyuz) eyva.a.createBuilder();
                        eyuzVar.copyOnWrite();
                        ((eyva) eyuzVar.instance).b = i2 - 2;
                        eyva eyvaVar = (eyva) eyuzVar.build();
                        eyunVar2.copyOnWrite();
                        eyuo eyuoVar = (eyuo) eyunVar2.instance;
                        eyuo eyuoVar2 = eyuo.a;
                        eyvaVar.getClass();
                        eyuoVar.d = eyvaVar;
                        eyuoVar.b |= 1;
                    }
                });
                ejwi ejwiVarB = dwrlVar.b();
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                ekgb ekgbVar2 = (ekgb) ejwiVarB.e(ekgbVar);
                if (!ekgbVar2.isEmpty()) {
                    ekgb ekgbVarC2 = dvib.c(ekgbVar2, new ejvr() { // from class: dwer
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            dwrq dwrqVar = (dwrq) obj2;
                            int iOrdinal = dwrqVar.a().ordinal();
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    dvhv.f("RichTextProtoConvUtils", "Unable to convert rich text line style to proto: ".concat(String.valueOf(String.valueOf(dwrqVar.a()))));
                                    return eyuy.a;
                                }
                                eyux eyuxVar = (eyux) eyuy.a.createBuilder();
                                eyuxVar.copyOnWrite();
                                ((eyuy) eyuxVar.instance).d = eyrk.a(4);
                                eyum eyumVar = eyum.a;
                                eyuxVar.copyOnWrite();
                                eyuy eyuyVar = (eyuy) eyuxVar.instance;
                                eyumVar.getClass();
                                eyuyVar.c = eyumVar;
                                eyuyVar.b = 3;
                                return (eyuy) eyuxVar.build();
                            }
                            eyux eyuxVar2 = (eyux) eyuy.a.createBuilder();
                            eyuxVar2.copyOnWrite();
                            ((eyuy) eyuxVar2.instance).d = eyrk.a(3);
                            eyut eyutVar = (eyut) eyuu.a.createBuilder();
                            int iB = dwrqVar.b();
                            eyutVar.copyOnWrite();
                            ((eyuu) eyutVar.instance).b = iB;
                            eyuxVar2.copyOnWrite();
                            eyuy eyuyVar2 = (eyuy) eyuxVar2.instance;
                            eyuu eyuuVar = (eyuu) eyutVar.build();
                            eyuuVar.getClass();
                            eyuyVar2.c = eyuuVar;
                            eyuyVar2.b = 2;
                            return (eyuy) eyuxVar2.build();
                        }
                    });
                    eyunVar.copyOnWrite();
                    eyuo eyuoVar = (eyuo) eyunVar.instance;
                    evtg evtgVar = eyuoVar.e;
                    if (!evtgVar.c()) {
                        eyuoVar.e = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(ekgbVarC2, eyuoVar.e);
                }
                ekgb ekgbVar3 = (ekgb) dwrlVar.a().e(ekgbVar);
                if (!ekgbVar3.isEmpty()) {
                    ekgb ekgbVarC3 = dvib.c(ekgbVar3, new ejvr() { // from class: dwes
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            dwrn dwrnVar = (dwrn) obj2;
                            eyup eyupVar = (eyup) eyuq.a.createBuilder();
                            int iB = dwrnVar.b();
                            eyupVar.copyOnWrite();
                            ((eyuq) eyupVar.instance).b = iB;
                            int iA = dwrnVar.a();
                            eyupVar.copyOnWrite();
                            ((eyuq) eyupVar.instance).c = iA;
                            ekgb ekgbVarC4 = dvib.c(dwrnVar.c(), new ejvr() { // from class: dwex
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    dwrv dwrvVar = (dwrv) obj3;
                                    int i2 = 4;
                                    switch (dwrvVar.b().ordinal()) {
                                        case 1:
                                            eyvb eyvbVar = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar.copyOnWrite();
                                            ((eyvc) eyvbVar.instance).d = eyrl.a(3);
                                            eyvbVar.copyOnWrite();
                                            eyvc eyvcVar = (eyvc) eyvbVar.instance;
                                            eyvcVar.b = 2;
                                            eyvcVar.c = true;
                                            return (eyvc) eyvbVar.build();
                                        case 2:
                                            eyvb eyvbVar2 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar2.copyOnWrite();
                                            ((eyvc) eyvbVar2.instance).d = eyrl.a(4);
                                            eyvbVar2.copyOnWrite();
                                            eyvc eyvcVar2 = (eyvc) eyvbVar2.instance;
                                            eyvcVar2.b = 3;
                                            eyvcVar2.c = true;
                                            return (eyvc) eyvbVar2.build();
                                        case 3:
                                            eyvb eyvbVar3 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar3.copyOnWrite();
                                            ((eyvc) eyvbVar3.instance).d = eyrl.a(5);
                                            eyvbVar3.copyOnWrite();
                                            eyvc eyvcVar3 = (eyvc) eyvbVar3.instance;
                                            eyvcVar3.b = 4;
                                            eyvcVar3.c = true;
                                            return (eyvc) eyvbVar3.build();
                                        case 4:
                                            eyvb eyvbVar4 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar4.copyOnWrite();
                                            ((eyvc) eyvbVar4.instance).d = eyrl.a(6);
                                            eyvbVar4.copyOnWrite();
                                            eyvc eyvcVar4 = (eyvc) eyvbVar4.instance;
                                            eyvcVar4.b = 5;
                                            eyvcVar4.c = true;
                                            return (eyvc) eyvbVar4.build();
                                        case 5:
                                            eyvb eyvbVar5 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar5.copyOnWrite();
                                            ((eyvc) eyvbVar5.instance).d = eyrl.a(7);
                                            eyvbVar5.copyOnWrite();
                                            eyvc eyvcVar5 = (eyvc) eyvbVar5.instance;
                                            eyvcVar5.b = 6;
                                            eyvcVar5.c = true;
                                            return (eyvc) eyvbVar5.build();
                                        case 6:
                                            eyvb eyvbVar6 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar6.copyOnWrite();
                                            ((eyvc) eyvbVar6.instance).d = eyrl.a(8);
                                            eyvbVar6.copyOnWrite();
                                            eyvc eyvcVar6 = (eyvc) eyvbVar6.instance;
                                            eyvcVar6.b = 7;
                                            eyvcVar6.c = true;
                                            return (eyvc) eyvbVar6.build();
                                        case 7:
                                            eyvb eyvbVar7 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar7.copyOnWrite();
                                            ((eyvc) eyvbVar7.instance).d = eyrl.a(9);
                                            eyax eyaxVarB = dwdw.b(dwrvVar.d());
                                            eyvbVar7.copyOnWrite();
                                            eyvc eyvcVar7 = (eyvc) eyvbVar7.instance;
                                            eyaxVarB.getClass();
                                            eyvcVar7.c = eyaxVarB;
                                            eyvcVar7.b = 8;
                                            return (eyvc) eyvbVar7.build();
                                        case 8:
                                            eyvb eyvbVar8 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar8.copyOnWrite();
                                            ((eyvc) eyvbVar8.instance).d = eyrl.a(10);
                                            eyax eyaxVarB2 = dwdw.b(dwrvVar.a());
                                            eyvbVar8.copyOnWrite();
                                            eyvc eyvcVar8 = (eyvc) eyvbVar8.instance;
                                            eyaxVarB2.getClass();
                                            eyvcVar8.c = eyaxVarB2;
                                            eyvcVar8.b = 9;
                                            return (eyvc) eyvbVar8.build();
                                        case 9:
                                            eyvb eyvbVar9 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar9.copyOnWrite();
                                            ((eyvc) eyvbVar9.instance).d = eyrl.a(11);
                                            int iH = dwrvVar.h();
                                            eyvbVar9.copyOnWrite();
                                            eyvc eyvcVar9 = (eyvc) eyvbVar9.instance;
                                            eyvcVar9.b = 10;
                                            eyvcVar9.c = Integer.valueOf(iH);
                                            return (eyvc) eyvbVar9.build();
                                        case 10:
                                            eyvb eyvbVar10 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar10.copyOnWrite();
                                            ((eyvc) eyvbVar10.instance).d = eyrl.a(12);
                                            eyvd eyvdVar = (eyvd) eyve.a.createBuilder();
                                            ekgb ekgbVarC5 = dvib.c(dwrvVar.l(), new ejvr() { // from class: dwev
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj4) {
                                                    int i3;
                                                    dwrz dwrzVar = (dwrz) obj4;
                                                    switch (dwrzVar.j) {
                                                        case 0:
                                                            i3 = 2;
                                                            break;
                                                        case 1:
                                                            i3 = 3;
                                                            break;
                                                        case 2:
                                                            i3 = 4;
                                                            break;
                                                        case 3:
                                                            i3 = 5;
                                                            break;
                                                        case 4:
                                                            i3 = 6;
                                                            break;
                                                        case 5:
                                                            i3 = 7;
                                                            break;
                                                        case 6:
                                                            i3 = 8;
                                                            break;
                                                        case 7:
                                                            i3 = 9;
                                                            break;
                                                        default:
                                                            i3 = 0;
                                                            break;
                                                    }
                                                    if (i3 == 0) {
                                                        dvhv.f("RichTextProtoConvUtils", "Unrecognized typeface with weight type: ".concat(String.valueOf(String.valueOf(dwrzVar))));
                                                        return eyvg.a;
                                                    }
                                                    eyvf eyvfVar = (eyvf) eyvg.a.createBuilder();
                                                    eyvfVar.copyOnWrite();
                                                    ((eyvg) eyvfVar.instance).b = i3 - 2;
                                                    return (eyvg) eyvfVar.build();
                                                }
                                            });
                                            eyvdVar.copyOnWrite();
                                            eyve eyveVar = (eyve) eyvdVar.instance;
                                            evtg evtgVar2 = eyveVar.b;
                                            if (!evtgVar2.c()) {
                                                eyveVar.b = evsn.mutableCopy(evtgVar2);
                                            }
                                            evpz.addAll(ekgbVarC5, eyveVar.b);
                                            eyvbVar10.copyOnWrite();
                                            eyvc eyvcVar10 = (eyvc) eyvbVar10.instance;
                                            eyve eyveVar2 = (eyve) eyvdVar.build();
                                            eyveVar2.getClass();
                                            eyvcVar10.c = eyveVar2;
                                            eyvcVar10.b = 11;
                                            return (eyvc) eyvbVar10.build();
                                        case 11:
                                            eyvb eyvbVar11 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar11.copyOnWrite();
                                            ((eyvc) eyvbVar11.instance).d = eyrl.a(13);
                                            int iE = dwrvVar.e();
                                            if (iE == 1) {
                                                i2 = 3;
                                            } else if (iE != 2) {
                                                i2 = 2;
                                            }
                                            eyvbVar11.copyOnWrite();
                                            eyvc eyvcVar11 = (eyvc) eyvbVar11.instance;
                                            eyvcVar11.c = Integer.valueOf(i2 - 2);
                                            eyvcVar11.b = 12;
                                            return (eyvc) eyvbVar11.build();
                                        case 12:
                                            eyvb eyvbVar12 = (eyvb) eyvc.a.createBuilder();
                                            eyvbVar12.copyOnWrite();
                                            ((eyvc) eyvbVar12.instance).d = eyrl.a(14);
                                            String str = ((dwoj) dwrvVar.f()).a;
                                            eyur eyurVar = (eyur) eyus.a.createBuilder();
                                            eyurVar.copyOnWrite();
                                            ((eyus) eyurVar.instance).b = str;
                                            eyus eyusVar = (eyus) eyurVar.build();
                                            eyvbVar12.copyOnWrite();
                                            eyvc eyvcVar12 = (eyvc) eyvbVar12.instance;
                                            eyusVar.getClass();
                                            eyvcVar12.c = eyusVar;
                                            eyvcVar12.b = 13;
                                            return (eyvc) eyvbVar12.build();
                                        default:
                                            dvhv.f("RichTextProtoConvUtils", "Unable to convert rich text style to proto: ".concat(String.valueOf(String.valueOf(dwrvVar.b()))));
                                            return eyvc.a;
                                    }
                                }
                            });
                            eyupVar.copyOnWrite();
                            eyuq eyuqVar = (eyuq) eyupVar.instance;
                            evtg evtgVar2 = eyuqVar.d;
                            if (!evtgVar2.c()) {
                                eyuqVar.d = evsn.mutableCopy(evtgVar2);
                            }
                            evpz.addAll(ekgbVarC4, eyuqVar.d);
                            return (eyuq) eyupVar.build();
                        }
                    });
                    eyunVar.copyOnWrite();
                    eyuo eyuoVar2 = (eyuo) eyunVar.instance;
                    evtg evtgVar2 = eyuoVar2.f;
                    if (!evtgVar2.c()) {
                        eyuoVar2.f = evsn.mutableCopy(evtgVar2);
                    }
                    evpz.addAll(ekgbVarC3, eyuoVar2.f);
                }
                return (eyuo) eyunVar.build();
            }
        });
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        evtg evtgVar = eyuwVar.b;
        if (!evtgVar.c()) {
            eyuwVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(ekgbVarC, eyuwVar.b);
        return (eyuw) eyuvVar.build();
    }
}

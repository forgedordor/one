package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtp {
    static final int a = (int) fbfm.a.get().f();
    public static final /* synthetic */ int b = 0;

    static dwvz a(dwje dwjeVar, Context context, eyty eytyVar, String str, dwhr dwhrVar) {
        Object dwtyVar;
        ekfw ekfwVar = new ekfw();
        for (eyug eyugVar : eytyVar.b) {
            int i = eyugVar.d;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            int i3 = i2 - 2;
            if (i3 == 1) {
                eyua eyuaVar = eyugVar.b == 101 ? (eyua) eyugVar.c : eyua.a;
                ekfw ekfwVar2 = new ekfw();
                Iterator<E> it = eyuaVar.b.iterator();
                while (it.hasNext()) {
                    ekfwVar2.h(b(dwjeVar, context, (eyui) it.next(), str, dwhrVar));
                }
                dwvc dwvcVar = new dwvc();
                dwvcVar.b(ekfwVar2.g());
                dwtyVar = new dwty(dwvcVar.a());
            } else {
                if (i3 != 2) {
                    throw new dwdx(a.g(i, "Got unknown UI component: "), 222);
                }
                dwtyVar = new dwtz(b(dwjeVar, context, eyugVar.b == 102 ? (eyui) eyugVar.c : eyui.a, str, dwhrVar));
            }
            ekfwVar.h(dwtyVar);
        }
        int i4 = dwvz.c;
        dwuw dwuwVar = new dwuw();
        dwuwVar.b(ekfwVar.g());
        int i5 = eytyVar.c;
        if (i5 > 0) {
            dwuwVar.c(i5);
        }
        return dwuwVar.a();
    }

    static dwwm b(dwje dwjeVar, Context context, eyui eyuiVar, final String str, dwhr dwhrVar) throws dwdx {
        dwwi dwwiVarG = dwwm.g();
        dwwiVarG.e(eyuiVar.e);
        dwwiVarG.f(eyuiVar.f);
        dwwiVarG.d(eyuiVar.g);
        dwwiVarG.c(eyuiVar.h);
        dwwiVarG.g(eyuiVar.i);
        int i = eyuiVar.d;
        int iB = eyrj.b(i);
        if (iB == 0) {
            iB = 1;
        }
        switch (iB - 2) {
            case 1:
                dwwiVarG.n(dwey.a(dwjeVar, context, eyuiVar.b == 101 ? (eyuw) eyuiVar.c : eyuw.a, str, dwhrVar));
                return dwwiVarG.a();
            case 2:
            default:
                int iB2 = eyrj.b(i);
                throw new dwdx("Got unknown UI element: " + eyrj.a(iB2 != 0 ? iB2 : 1), 223);
            case 3:
                eyue eyueVar = eyuiVar.b == 103 ? (eyue) eyuiVar.c : eyue.a;
                dwva dwvaVar = new dwva();
                dwvaVar.c(eyueVar.c);
                eyax eyaxVar = eyueVar.d;
                if (eyaxVar == null) {
                    eyaxVar = eyax.a;
                }
                dwvaVar.b(dwdw.a(eyaxVar));
                eyax eyaxVar2 = eyueVar.e;
                if (eyaxVar2 == null) {
                    eyaxVar2 = eyax.a;
                }
                dwvaVar.d(dwdw.a(eyaxVar2));
                dwwiVarG.o(dwvaVar.a());
                return dwwiVarG.a();
            case 4:
                eytm eytmVar = eyuiVar.b == 104 ? (eytm) eyuiVar.c : eytm.a;
                if ((eytmVar.b & 2) == 0) {
                    throw new dwdx("Got invalid image proto.", 228);
                }
                dwvo dwvoVarG = dwvp.g();
                dwsq dwsqVar = new dwsq();
                eysb eysbVar = eytmVar.c;
                if (eysbVar == null) {
                    eysbVar = eysb.a;
                }
                ezop ezopVar = eysbVar.b;
                if (ezopVar == null) {
                    ezopVar = ezop.a;
                }
                dwsqVar.b(ezopVar.b);
                eysb eysbVar2 = eytmVar.c;
                if (eysbVar2 == null) {
                    eysbVar2 = eysb.a;
                }
                ezop ezopVar2 = eysbVar2.b;
                if (ezopVar2 == null) {
                    ezopVar2 = ezop.a;
                }
                evsp evspVar = ezopVar2.d;
                if (evspVar == null) {
                    evspVar = evsp.a;
                }
                dwsqVar.c(evspVar.b);
                ((dwus) dwvoVarG).a = dwsqVar.a();
                eysb eysbVar3 = eytmVar.c;
                if (eysbVar3 == null) {
                    eysbVar3 = eysb.a;
                }
                dwvo dwvoVarF = dwvoVarG.f(eysbVar3.c.I());
                dwvoVarF.e(eytmVar.d);
                dwvoVarF.c(eytmVar.e);
                dwvoVarF.d(eytmVar.f);
                dwwiVarG.k(dwvoVarF.b());
                return dwwiVarG.a();
            case 5:
                eytw eytwVar = eyuiVar.b == 105 ? (eytw) eyuiVar.c : eytw.a;
                String str2 = dwri.d;
                dwnz dwnzVar = new dwnz();
                if (eytwVar.c == 2) {
                    dwnzVar.c(eytwVar.d);
                }
                dwnzVar.d(eytwVar.c);
                dwnzVar.b(dvib.b(eytwVar.b, new ejvr() { // from class: dwtl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eytu eytuVar = (eytu) obj;
                        int i2 = dwtp.b;
                        dwrg dwrgVarI = dwrh.i();
                        eypr eyprVar = eytuVar.j;
                        if (eyprVar == null) {
                            eyprVar = eypr.a;
                        }
                        if (eyprVar.isInitialized()) {
                            eypr eyprVar2 = eytuVar.j;
                            if (eyprVar2 == null) {
                                eyprVar2 = eypr.a;
                            }
                            dwrgVarI.f(dwef.a(eyprVar2));
                        }
                        if (!eytuVar.d.isEmpty()) {
                            dwrgVarI.b(eytuVar.d);
                        }
                        eypd eypdVar = eytuVar.e;
                        if (eypdVar == null) {
                            eypdVar = eypd.a;
                        }
                        String str3 = str;
                        ejwi ejwiVarB = dwdv.b(eypdVar, ejwi.j(str3), ejwi.j(str3));
                        if (!ejwiVarB.g()) {
                            return ejud.a;
                        }
                        dwrgVarI.g(eytuVar.c);
                        ((dwob) dwrgVarI).a = (dwjr) ejwiVarB.c();
                        eyax eyaxVar3 = eytuVar.f;
                        if (eyaxVar3 == null) {
                            eyaxVar3 = eyax.a;
                        }
                        dwrgVarI.h(dwdw.a(eyaxVar3));
                        eyax eyaxVar4 = eytuVar.g;
                        if (eyaxVar4 == null) {
                            eyaxVar4 = eyax.a;
                        }
                        dwrgVarI.c(dwdw.a(eyaxVar4));
                        eyax eyaxVar5 = eytuVar.h;
                        if (eyaxVar5 == null) {
                            eyaxVar5 = eyax.a;
                        }
                        dwrgVarI.d(dwdw.a(eyaxVar5));
                        dwrgVarI.e(eytuVar.i);
                        return ejwi.j(dwrgVarI.a());
                    }
                }));
                dwwiVarG.m(dwnzVar.a());
                return dwwiVarG.a();
            case 6:
                eytk eytkVar = eyuiVar.b == 106 ? (eytk) eyuiVar.c : eytk.a;
                dwuq dwuqVar = new dwuq();
                eyax eyaxVar3 = eytkVar.c;
                if (eyaxVar3 == null) {
                    eyaxVar3 = eyax.a;
                }
                dwuqVar.b(dwdw.a(eyaxVar3));
                dwuqVar.c(eytkVar.d);
                dwwiVarG.j(dwuqVar.a());
                return dwwiVarG.a();
            case 7:
                eyti eytiVar = eyuiVar.b == 107 ? (eyti) eyuiVar.c : eyti.a;
                dwum dwumVar = new dwum();
                dwumVar.b(dvib.c(eytiVar.b, new ejvr() { // from class: dwtj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eyuk eyukVar = (eyuk) obj;
                        int i2 = dwtp.b;
                        dwuo dwuoVar = new dwuo();
                        dwuoVar.c(eyukVar.d.I());
                        dwuoVar.b(eyukVar.c);
                        eypd eypdVar = eyukVar.e;
                        if (eypdVar == null) {
                            eypdVar = eypd.a;
                        }
                        String str3 = str;
                        dwuoVar.b = (dwjr) dwdv.b(eypdVar, ejwi.j(str3), ejwi.j(str3)).c();
                        eypr eyprVar = eyukVar.f;
                        if (eyprVar == null) {
                            eyprVar = eypr.a;
                        }
                        dwuoVar.a = dwef.a(eyprVar);
                        return dwuoVar.a();
                    }
                }));
                dwwiVarG.i(dwumVar.a());
                return dwwiVarG.a();
            case 8:
                dwwiVarG.h();
                return dwwiVarG.a();
            case 9:
                if (!fbfm.n()) {
                    throw new dwdx("Media Element not supported, please enable direct-download flag.", 229);
                }
                eyts eytsVar = eyuiVar.b == 109 ? (eyts) eyuiVar.c : eyts.a;
                if ((eytsVar.b & 1) == 0) {
                    throw new dwdx("Got invalid media proto.", 229);
                }
                eysd eysdVar = eytsVar.c;
                if (eysdVar == null) {
                    eysdVar = eysd.a;
                }
                if (eysdVar.b == 11) {
                    eysd eysdVar2 = eytsVar.c;
                    if (eysdVar2 == null) {
                        eysdVar2 = eysd.a;
                    }
                    if (!(eysdVar2.b == 11 ? (String) eysdVar2.c : "").isEmpty()) {
                        dwvq dwvqVarG = dwvr.g();
                        eysd eysdVar3 = eytsVar.c;
                        if (eysdVar3 == null) {
                            eysdVar3 = eysd.a;
                        }
                        String str3 = eysdVar3.b == 11 ? (String) eysdVar3.c : "";
                        String str4 = dwvu.a;
                        ((dwuu) dwvqVarG).a = dwtt.a(str3);
                        eysd eysdVar4 = eytsVar.c;
                        if (eysdVar4 == null) {
                            eysdVar4 = eysd.a;
                        }
                        dwvq dwvqVarF = dwvqVarG.f(eysdVar4.d.I());
                        dwvqVarF.e(eytsVar.d);
                        dwvqVarF.c(eytsVar.e);
                        dwvqVarF.d(eytsVar.f);
                        dwwiVarG.l(dwvqVarF.b());
                        return dwwiVarG.a();
                    }
                }
                throw new dwdx("URL must not be empty.", 229);
        }
    }

    static eyui c(dwwm dwwmVar) {
        eyuh eyuhVar = (eyuh) eyui.a.createBuilder();
        int iC = dwwmVar.c();
        eyuhVar.copyOnWrite();
        ((eyui) eyuhVar.instance).e = iC;
        int iD = dwwmVar.d();
        eyuhVar.copyOnWrite();
        ((eyui) eyuhVar.instance).f = iD;
        int iB = dwwmVar.b();
        eyuhVar.copyOnWrite();
        ((eyui) eyuhVar.instance).g = iB;
        int iA = dwwmVar.a();
        eyuhVar.copyOnWrite();
        ((eyui) eyuhVar.instance).h = iA;
        boolean zF = dwwmVar.f();
        eyuhVar.copyOnWrite();
        ((eyui) eyuhVar.instance).i = zF;
        int iOrdinal = dwwmVar.h().ordinal();
        if (iOrdinal == 0) {
            eyuhVar.copyOnWrite();
            ((eyui) eyuhVar.instance).d = eyrj.a(3);
            eyuw eyuwVarB = dwey.b(dwwmVar.e().g());
            eyuhVar.copyOnWrite();
            eyui eyuiVar = (eyui) eyuhVar.instance;
            eyuwVarB.getClass();
            eyuiVar.c = eyuwVarB;
            eyuiVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            return (eyui) eyuhVar.build();
        }
        if (iOrdinal == 2) {
            eyuhVar.copyOnWrite();
            ((eyui) eyuhVar.instance).d = eyrj.a(5);
            dwwd dwwdVarH = dwwmVar.e().h();
            eyud eyudVar = (eyud) eyue.a.createBuilder();
            dwvb dwvbVar = (dwvb) dwwdVarH;
            String str = dwvbVar.a;
            eyudVar.copyOnWrite();
            ((eyue) eyudVar.instance).c = str;
            eyax eyaxVarB = dwdw.b(dwvbVar.b);
            eyudVar.copyOnWrite();
            eyue eyueVar = (eyue) eyudVar.instance;
            eyaxVarB.getClass();
            eyueVar.d = eyaxVarB;
            eyueVar.b |= 1;
            eyax eyaxVarB2 = dwdw.b(dwvbVar.c);
            eyudVar.copyOnWrite();
            eyue eyueVar2 = (eyue) eyudVar.instance;
            eyaxVarB2.getClass();
            eyueVar2.e = eyaxVarB2;
            eyueVar2.b |= 2;
            eyue eyueVar3 = (eyue) eyudVar.build();
            eyuhVar.copyOnWrite();
            eyui eyuiVar2 = (eyui) eyuhVar.instance;
            eyueVar3.getClass();
            eyuiVar2.c = eyueVar3;
            eyuiVar2.b = 103;
            return (eyui) eyuhVar.build();
        }
        if (iOrdinal == 3) {
            eyuhVar.copyOnWrite();
            ((eyui) eyuhVar.instance).d = eyrj.a(7);
            dwri dwriVarF = dwwmVar.e().f();
            eytv eytvVar = (eytv) eytw.a.createBuilder();
            dwoa dwoaVar = (dwoa) dwriVarF;
            int i = dwoaVar.b;
            if (i == 1) {
                eytvVar.copyOnWrite();
                ((eytw) eytvVar.instance).c = eyrh.a(3);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(a.e(i, "Got unknown buttons orientation integer: ", "."));
                }
                eytvVar.copyOnWrite();
                ((eytw) eytvVar.instance).c = eyrh.a(4);
            }
            ekgb ekgbVarC = dvib.c(dwoaVar.a, new ejvr() { // from class: dwto
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwrh dwrhVar = (dwrh) obj;
                    final eytt eyttVar = (eytt) eytu.a.createBuilder();
                    dvhx.b(dwrhVar.f(), new lbz() { // from class: dwek
                        @Override // defpackage.lbz
                        public final void accept(Object obj2) {
                            eypr eyprVarB = dwef.b((dwqf) obj2);
                            eytt eyttVar2 = eyttVar;
                            eyttVar2.copyOnWrite();
                            eytu eytuVar = (eytu) eyttVar2.instance;
                            eytu eytuVar2 = eytu.a;
                            eyprVarB.getClass();
                            eytuVar.j = eyprVarB;
                            eytuVar.b |= 32;
                        }
                    });
                    ejwi ejwiVarE = dwrhVar.e();
                    eyttVar.getClass();
                    dvhx.b(ejwiVarE, new lbz() { // from class: dwel
                        @Override // defpackage.lbz
                        public final void accept(Object obj2) {
                            eytt eyttVar2 = eyttVar;
                            String str2 = (String) obj2;
                            eyttVar2.copyOnWrite();
                            eytu eytuVar = (eytu) eyttVar2.instance;
                            eytu eytuVar2 = eytu.a;
                            str2.getClass();
                            eytuVar.d = str2;
                        }
                    });
                    String strG = dwrhVar.g();
                    eyttVar.copyOnWrite();
                    ((eytu) eyttVar.instance).c = strG;
                    eypd eypdVarA = dwdv.a(dwrhVar.d());
                    eyttVar.copyOnWrite();
                    eytu eytuVar = (eytu) eyttVar.instance;
                    eypdVarA.getClass();
                    eytuVar.e = eypdVarA;
                    eytuVar.b |= 1;
                    eyax eyaxVarB3 = dwdw.b(dwrhVar.c());
                    eyttVar.copyOnWrite();
                    eytu eytuVar2 = (eytu) eyttVar.instance;
                    eyaxVarB3.getClass();
                    eytuVar2.f = eyaxVarB3;
                    eytuVar2.b |= 2;
                    eyax eyaxVarB4 = dwdw.b(dwrhVar.a());
                    eyttVar.copyOnWrite();
                    eytu eytuVar3 = (eytu) eyttVar.instance;
                    eyaxVarB4.getClass();
                    eytuVar3.g = eyaxVarB4;
                    eytuVar3.b |= 4;
                    eyax eyaxVarB5 = dwdw.b(dwrhVar.b());
                    eyttVar.copyOnWrite();
                    eytu eytuVar4 = (eytu) eyttVar.instance;
                    eyaxVarB5.getClass();
                    eytuVar4.h = eyaxVarB5;
                    eytuVar4.b |= 16;
                    boolean zH = dwrhVar.h();
                    eyttVar.copyOnWrite();
                    ((eytu) eyttVar.instance).i = zH;
                    return (eytu) eyttVar.build();
                }
            });
            eytvVar.copyOnWrite();
            eytw eytwVar = (eytw) eytvVar.instance;
            evtg evtgVar = eytwVar.b;
            if (!evtgVar.c()) {
                eytwVar.b = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(ekgbVarC, eytwVar.b);
            eytw eytwVar2 = (eytw) eytvVar.build();
            eyuhVar.copyOnWrite();
            eyui eyuiVar3 = (eyui) eyuhVar.instance;
            eytwVar2.getClass();
            eyuiVar3.c = eytwVar2;
            eyuiVar3.b = 105;
            return (eyui) eyuhVar.build();
        }
        if (iOrdinal == 4) {
            eyuhVar.copyOnWrite();
            ((eyui) eyuhVar.instance).d = eyrj.a(8);
            dwvn dwvnVarC = dwwmVar.e().c();
            eytj eytjVar = (eytj) eytk.a.createBuilder();
            dwur dwurVar = (dwur) dwvnVarC;
            eyax eyaxVarB3 = dwdw.b(dwurVar.a);
            eytjVar.copyOnWrite();
            eytk eytkVar = (eytk) eytjVar.instance;
            eyaxVarB3.getClass();
            eytkVar.c = eyaxVarB3;
            eytkVar.b |= 1;
            float f = dwurVar.b;
            eytjVar.copyOnWrite();
            ((eytk) eytjVar.instance).d = f;
            eytk eytkVar2 = (eytk) eytjVar.build();
            eyuhVar.copyOnWrite();
            eyui eyuiVar4 = (eyui) eyuhVar.instance;
            eytkVar2.getClass();
            eyuiVar4.c = eytkVar2;
            eyuiVar4.b = 106;
            return (eyui) eyuhVar.build();
        }
        if (iOrdinal == 5) {
            eyuhVar.copyOnWrite();
            ((eyui) eyuhVar.instance).d = eyrj.a(9);
            dwvl dwvlVarB = dwwmVar.e().b();
            eyth eythVar = (eyth) eyti.a.createBuilder();
            ekgb ekgbVarC2 = dvib.c(((dwun) dwvlVarB).a, new ejvr() { // from class: dwtm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwvk dwvkVar = (dwvk) obj;
                    int i2 = dwtp.b;
                    eyuj eyujVar = (eyuj) eyuk.a.createBuilder();
                    eypd eypdVarA = dwdv.a(dwvkVar.a());
                    eyujVar.copyOnWrite();
                    eyuk eyukVar = (eyuk) eyujVar.instance;
                    eypdVarA.getClass();
                    eyukVar.e = eypdVarA;
                    eyukVar.b |= 1;
                    evqs evqsVarX = evqs.x(dwvkVar.d());
                    eyujVar.copyOnWrite();
                    ((eyuk) eyujVar.instance).d = evqsVarX;
                    String strC = dwvkVar.c();
                    eyujVar.copyOnWrite();
                    ((eyuk) eyujVar.instance).c = strC;
                    eypr eyprVarB = dwef.b(dwvkVar.b());
                    eyujVar.copyOnWrite();
                    eyuk eyukVar2 = (eyuk) eyujVar.instance;
                    eyprVarB.getClass();
                    eyukVar2.f = eyprVarB;
                    eyukVar2.b |= 2;
                    return (eyuk) eyujVar.build();
                }
            });
            eythVar.copyOnWrite();
            eyti eytiVar = (eyti) eythVar.instance;
            evtg evtgVar2 = eytiVar.b;
            if (!evtgVar2.c()) {
                eytiVar.b = evsn.mutableCopy(evtgVar2);
            }
            evpz.addAll(ekgbVarC2, eytiVar.b);
            eyti eytiVar2 = (eyti) eythVar.build();
            eyuhVar.copyOnWrite();
            eyui eyuiVar5 = (eyui) eyuhVar.instance;
            eytiVar2.getClass();
            eyuiVar5.c = eytiVar2;
            eyuiVar5.b = 107;
            return (eyui) eyuhVar.build();
        }
        if (iOrdinal == 7) {
            eyuhVar.copyOnWrite();
            ((eyui) eyuhVar.instance).d = eyrj.a(10);
            return (eyui) eyuhVar.build();
        }
        if (iOrdinal != 8) {
            throw new IllegalArgumentException("Got unknown ui element model type: ".concat(String.valueOf(String.valueOf(dwwmVar.h()))));
        }
        if (!fbfm.n()) {
            throw new IllegalArgumentException("Media Element not supported; Please enable direct-download flag.");
        }
        eyuhVar.copyOnWrite();
        ((eyui) eyuhVar.instance).d = eyrj.a(11);
        dwvr dwvrVarE = dwwmVar.e().e();
        eytr eytrVar = (eytr) eyts.a.createBuilder();
        dwvu dwvuVar = ((dwuv) dwvrVarE).a;
        eysc eyscVar = (eysc) eysd.a.createBuilder();
        int iOrdinal2 = dwvuVar.b().ordinal();
        if (iOrdinal2 == 0) {
            throw new IllegalArgumentException("Media ID is not yet supported: ".concat(String.valueOf(String.valueOf(dwvuVar.b()))));
        }
        if (iOrdinal2 == 1) {
            String strC = dwvuVar.c();
            eyscVar.copyOnWrite();
            eysd eysdVar = (eysd) eyscVar.instance;
            eysdVar.b = 11;
            eysdVar.c = strC;
        }
        eysd eysdVar2 = (eysd) eyscVar.build();
        eytrVar.copyOnWrite();
        eyts eytsVar = (eyts) eytrVar.instance;
        eysdVar2.getClass();
        eytsVar.c = eysdVar2;
        eytsVar.b |= 1;
        int i2 = a;
        eytrVar.copyOnWrite();
        ((eyts) eytrVar.instance).e = i2;
        eyts eytsVar2 = (eyts) eytrVar.build();
        eyuhVar.copyOnWrite();
        eyui eyuiVar6 = (eyui) eyuhVar.instance;
        eytsVar2.getClass();
        eyuiVar6.c = eytsVar2;
        eyuiVar6.b = 109;
        return (eyui) eyuhVar.build();
    }
}

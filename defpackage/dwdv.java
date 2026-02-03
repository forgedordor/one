package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdv {
    /* JADX WARN: Multi-variable type inference failed */
    public static eypd a(dwjr dwjrVar) {
        eypc eypcVar = (eypc) eypd.a.createBuilder();
        h(dwjrVar, eypcVar);
        switch (dwjrVar.d()) {
            case UNKNOWN:
                throw new IllegalArgumentException("Got unknown action type integer.");
            case SEND_MESSAGE:
                eyqk eyqkVar = (eyqk) eyql.a.createBuilder();
                String strD = dwjrVar.b().d().d();
                eyqkVar.copyOnWrite();
                ((eyql) eyqkVar.instance).b = strD;
                String strC = dwjrVar.b().d().c();
                eyqkVar.copyOnWrite();
                ((eyql) eyqkVar.instance).d = strC;
                eyqkVar.copyOnWrite();
                ((eyql) eyqkVar.instance).c = false;
                eyql eyqlVar = (eyql) eyqkVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar = (eypd) eypcVar.instance;
                eyqlVar.getClass();
                eypdVar.d = eyqlVar;
                eypdVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                break;
            case PREFILL_MESSAGE:
                eyqk eyqkVar2 = (eyqk) eyql.a.createBuilder();
                String strD2 = dwjrVar.b().c().d();
                eyqkVar2.copyOnWrite();
                ((eyql) eyqkVar2.instance).b = strD2;
                String strC2 = dwjrVar.b().c().c();
                eyqkVar2.copyOnWrite();
                ((eyql) eyqkVar2.instance).d = strC2;
                eyqkVar2.copyOnWrite();
                ((eyql) eyqkVar2.instance).c = true;
                eyql eyqlVar2 = (eyql) eyqkVar2.build();
                eypcVar.copyOnWrite();
                eypd eypdVar2 = (eypd) eypcVar.instance;
                eyqlVar2.getClass();
                eypdVar2.d = eyqlVar2;
                eypdVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                break;
            case CUSTOM_ACTION:
                eyos eyosVar = (eyos) eyot.a.createBuilder();
                String strI = dwjrVar.b().i();
                eyosVar.copyOnWrite();
                ((eyot) eyosVar.instance).b = strI;
                eyot eyotVar = (eyot) eyosVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar3 = (eypd) eypcVar.instance;
                eyotVar.getClass();
                eypdVar3.d = eyotVar;
                eypdVar3.c = 102;
                break;
            case WEB_ACTION:
                eyqw eyqwVar = (eyqw) eyqx.a.createBuilder();
                String strK = dwjrVar.b().k();
                eyqwVar.copyOnWrite();
                ((eyqx) eyqwVar.instance).b = strK;
                eyqx eyqxVar = (eyqx) eyqwVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar4 = (eypd) eypcVar.instance;
                eyqxVar.getClass();
                eypdVar4.d = eyqxVar;
                eypdVar4.c = 103;
                break;
            case OVERLAY_ACTION:
                dwmh dwmhVar = new dwmh();
                dwmhVar.b(dwjrVar.b().f());
                eyqh eyqhVarE = e(dwmhVar.a());
                eypcVar.copyOnWrite();
                eypd eypdVar5 = (eypd) eypcVar.instance;
                eyqhVarE.getClass();
                eypdVar5.d = eyqhVarE;
                eypdVar5.c = 104;
                break;
            case CALL_ACTION:
                eyoo eyooVar = (eyoo) eyop.a.createBuilder();
                String strH = dwjrVar.b().h();
                eyooVar.copyOnWrite();
                ((eyop) eyooVar.instance).b = strH;
                eyop eyopVar = (eyop) eyooVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar6 = (eypd) eypcVar.instance;
                eyopVar.getClass();
                eypdVar6.d = eyopVar;
                eypdVar6.c = 105;
                break;
            case TOMBSTONE_ACTION:
                eyqo eyqoVar = (eyqo) eyqp.a.createBuilder();
                String strJ = dwjrVar.b().j();
                eyqoVar.copyOnWrite();
                ((eyqp) eyqoVar.instance).b = strJ;
                eyqp eyqpVar = (eyqp) eyqoVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar7 = (eypd) eypcVar.instance;
                eyqpVar.getClass();
                eypdVar7.d = eyqpVar;
                eypdVar7.c = 106;
                break;
            case COMPOSED_OVERLAY_ACTION:
                eyqh eyqhVarE2 = e(dwjrVar.b().b());
                eypcVar.copyOnWrite();
                eypd eypdVar8 = (eypd) eypcVar.instance;
                eyqhVarE2.getClass();
                eypdVar8.d = eyqhVarE2;
                eypdVar8.c = 104;
                break;
            case URL_ACTION:
                dwsk dwskVarG = dwjrVar.b().g();
                ArrayList arrayList = new ArrayList();
                ekgb ekgbVarA = dwskVarG.a();
                int i = ((ekoe) ekgbVarA).c;
                for (int i2 = 0; i2 < i; i2++) {
                    dwsj dwsjVar = (dwsj) ekgbVarA.get(i2);
                    eyqu eyquVar = (eyqu) eyqv.a.createBuilder();
                    String strB = dwsjVar.b();
                    eyquVar.copyOnWrite();
                    ((eyqv) eyquVar.instance).b = strB;
                    int iA = dwsjVar.a();
                    eyquVar.copyOnWrite();
                    ((eyqv) eyquVar.instance).c = iA;
                    arrayList.add((eyqv) eyquVar.build());
                }
                eyqs eyqsVar = (eyqs) eyqt.a.createBuilder();
                String strB2 = dwskVarG.b();
                eyqsVar.copyOnWrite();
                ((eyqt) eyqsVar.instance).b = strB2;
                eyqsVar.copyOnWrite();
                eyqt eyqtVar = (eyqt) eyqsVar.instance;
                evtg evtgVar = eyqtVar.c;
                if (!evtgVar.c()) {
                    eyqtVar.c = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(arrayList, eyqtVar.c);
                eyqt eyqtVar2 = (eyqt) eyqsVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar9 = (eypd) eypcVar.instance;
                eyqtVar2.getClass();
                eypdVar9.d = eyqtVar2;
                eypdVar9.c = 107;
                break;
            case DECORATION_TRANSITION_ACTION:
                eyoy eyoyVar = (eyoy) eyoz.a.createBuilder();
                eyow eyowVar = (eyow) eyox.a.createBuilder();
                ekgb ekgbVarA2 = dwjrVar.b().e().a();
                eyowVar.copyOnWrite();
                eyox eyoxVar = (eyox) eyowVar.instance;
                evtg evtgVar2 = eyoxVar.b;
                if (!evtgVar2.c()) {
                    eyoxVar.b = evsn.mutableCopy(evtgVar2);
                }
                evpz.addAll(ekgbVarA2, eyoxVar.b);
                ekgb ekgbVarB = dwjrVar.b().e().b();
                eyowVar.copyOnWrite();
                eyox eyoxVar2 = (eyox) eyowVar.instance;
                evtg evtgVar3 = eyoxVar2.c;
                if (!evtgVar3.c()) {
                    eyoxVar2.c = evsn.mutableCopy(evtgVar3);
                }
                evpz.addAll(ekgbVarB, eyoxVar2.c);
                eyoyVar.copyOnWrite();
                eyoz eyozVar = (eyoz) eyoyVar.instance;
                eyox eyoxVar3 = (eyox) eyowVar.build();
                eyoxVar3.getClass();
                eyozVar.c = eyoxVar3;
                eyozVar.b |= 1;
                eyoz eyozVar2 = (eyoz) eyoyVar.build();
                eypcVar.copyOnWrite();
                eypd eypdVar10 = (eypd) eypcVar.instance;
                eyozVar2.getClass();
                eypdVar10.d = eyozVar2;
                eypdVar10.c = 108;
                break;
        }
        int iOrdinal = dwjrVar.e().ordinal();
        if (iOrdinal != 6) {
            if (iOrdinal != 8) {
                throw new IllegalArgumentException("Got unknown callback failure action type integer: " + dwjrVar.e().m);
            }
            eyqo eyqoVar2 = (eyqo) eyqp.a.createBuilder();
            String strJ2 = dwjrVar.c().j();
            eyqoVar2.copyOnWrite();
            ((eyqp) eyqoVar2.instance).b = strJ2;
            eyqp eyqpVar2 = (eyqp) eyqoVar2.build();
            eypcVar.copyOnWrite();
            eypd eypdVar11 = (eypd) eypcVar.instance;
            eyqpVar2.getClass();
            eypdVar11.f = eyqpVar2;
            eypdVar11.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        }
        return (eypd) eypcVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ejwi b(defpackage.eypd r7, defpackage.ejwi r8, defpackage.ejwi r9) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwdv.b(eypd, ejwi, ejwi):ejwi");
    }

    public static int c(int i) {
        switch (dwjj.a(i).ordinal()) {
            case 1:
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 9:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                return 2;
        }
    }

    private static ejwi d(eyqj eyqjVar) {
        eypd eypdVar = eyqjVar.c;
        if (eypdVar == null) {
            eypdVar = eypd.a;
        }
        int iB = eyra.b(eypdVar.j);
        if (iB == 0 || iB != 7) {
            return ejud.a;
        }
        dwjk dwjkVarF = dwjr.f();
        eypd eypdVar2 = eyqjVar.c;
        if (eypdVar2 == null) {
            eypdVar2 = eypd.a;
        }
        ejud ejudVar = ejud.a;
        g(dwjkVarF, eypdVar2, ejudVar, ejudVar);
        dwjkVarF.t();
        dwqr dwqrVarK = dwqs.k();
        dwqrVarK.e(eyqjVar.e);
        dwqrVarK.d(eyqjVar.d);
        dwqrVarK.k(eyqjVar.f);
        dwqrVarK.b(dwjkVarF.a());
        eypr eyprVar = eyqjVar.g;
        if (eyprVar == null) {
            eyprVar = eypr.a;
        }
        dwqrVarK.i(dwef.a(eyprVar));
        dwqrVarK.j(eyqjVar.h);
        dwqrVarK.h(eyqjVar.i);
        dwqrVarK.c(eyqjVar.k);
        dwqrVarK.g(eyqjVar.j);
        return ejwi.j(dwqrVarK.a());
    }

    private static eyqh e(dwjo dwjoVar) {
        eyqg eyqgVar = (eyqg) eyqh.a.createBuilder();
        if (dwjoVar.a().g()) {
            eyqj eyqjVarF = f((dwqs) dwjoVar.a().c());
            eyqgVar.copyOnWrite();
            eyqh eyqhVar = (eyqh) eyqgVar.instance;
            eyqjVarF.getClass();
            eyqhVar.c = eyqjVarF;
            eyqhVar.b |= 1;
        }
        if (dwjoVar.b().g()) {
            Object objC = dwjoVar.b().c();
            eyou eyouVar = (eyou) eyov.a.createBuilder();
            dwqa dwqaVar = (dwqa) objC;
            String strB = dwqaVar.b();
            eyouVar.copyOnWrite();
            ((eyov) eyouVar.instance).d = strB;
            eyqj eyqjVarF2 = f(dwqaVar.a());
            eyouVar.copyOnWrite();
            eyov eyovVar = (eyov) eyouVar.instance;
            eyqjVarF2.getClass();
            eyovVar.c = eyqjVarF2;
            eyovVar.b |= 1;
            eyqgVar.copyOnWrite();
            eyqh eyqhVar2 = (eyqh) eyqgVar.instance;
            eyov eyovVar2 = (eyov) eyouVar.build();
            eyovVar2.getClass();
            eyqhVar2.d = eyovVar2;
            eyqhVar2.b |= 2;
        }
        return (eyqh) eyqgVar.build();
    }

    private static eyqj f(dwqs dwqsVar) {
        eypc eypcVar = (eypc) eypd.a.createBuilder();
        if (dwqsVar.c().g()) {
            h((dwjr) dwqsVar.c().c(), eypcVar);
        }
        eyqi eyqiVar = (eyqi) eyqj.a.createBuilder();
        int iA = dwqsVar.a();
        eyqiVar.copyOnWrite();
        ((eyqj) eyqiVar.instance).h = iA;
        if (dwqsVar.d().g()) {
            Object objC = dwqsVar.d().c();
            eyqiVar.copyOnWrite();
            ((eyqj) eyqiVar.instance).d = (evqs) objC;
        }
        if (dwqsVar.e().g()) {
            Object objC2 = dwqsVar.e().c();
            eyqiVar.copyOnWrite();
            ((eyqj) eyqiVar.instance).e = (String) objC2;
        }
        eypcVar.copyOnWrite();
        ((eypd) eypcVar.instance).j = eyra.a(7);
        eypd eypdVar = (eypd) eypcVar.build();
        eyqiVar.copyOnWrite();
        eyqj eyqjVar = (eyqj) eyqiVar.instance;
        eypdVar.getClass();
        eyqjVar.c = eypdVar;
        eyqjVar.b |= 1;
        int iB = dwqsVar.b();
        eyqiVar.copyOnWrite();
        ((eyqj) eyqiVar.instance).f = iB;
        int iA2 = dwqsVar.a();
        eyqiVar.copyOnWrite();
        ((eyqj) eyqiVar.instance).h = iA2;
        return (eyqj) eyqiVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(defpackage.dwjk r2, defpackage.eypd r3, defpackage.ejwi r4, defpackage.ejwi r5) {
        /*
            long r0 = r3.i
            r2.c(r0)
            java.lang.String r0 = r3.g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.lang.String r0 = r3.g
            r2.j(r0)
        L12:
            eypt r3 = r3.h
            if (r3 != 0) goto L18
            eypt r3 = defpackage.eypt.a
        L18:
            dwpj r0 = defpackage.dwpj.UNKNOWN
            int r0 = r3.b
            int r0 = defpackage.eyrf.b(r0)
            r1 = 1
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            int r0 = r0 + (-2)
            if (r0 == r1) goto L54
            r1 = 2
            if (r0 == r1) goto L54
            r1 = 3
            if (r0 == r1) goto L54
            r1 = 4
            if (r0 == r1) goto L37
            r1 = 5
            if (r0 == r1) goto L54
            ejud r3 = defpackage.ejud.a
            goto L61
        L37:
            dwit r0 = new dwit
            r0.<init>()
            java.lang.String r1 = r3.c
            r0.c(r1)
            java.lang.String r3 = r3.e
            r0.b(r3)
            dwpr r3 = r0.a()
            dwki r0 = new dwki
            r0.<init>(r3)
            ejwi r3 = defpackage.ejwi.j(r0)
            goto L61
        L54:
            dwpk r3 = defpackage.dweg.a(r3)
            dwkh r0 = new dwkh
            r0.<init>(r3)
            ejwi r3 = defpackage.ejwi.j(r0)
        L61:
            boolean r0 = r3.g()
            if (r0 == 0) goto L70
            java.lang.Object r3 = r3.c()
            dwjl r3 = (defpackage.dwjl) r3
            r2.g(r3)
        L70:
            boolean r3 = r4.g()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r4.c()
            java.lang.String r3 = (java.lang.String) r3
            r2.o(r3)
        L7f:
            boolean r3 = r5.g()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r5.c()
            java.lang.String r3 = (java.lang.String) r3
            r2.k(r3)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwdv.g(dwjk, eypd, ejwi, ejwi):void");
    }

    private static void h(dwjr dwjrVar, eypc eypcVar) {
        long jA = dwjrVar.a();
        eypcVar.copyOnWrite();
        eypd eypdVar = (eypd) eypcVar.instance;
        eypd eypdVar2 = eypd.a;
        eypdVar.i = jA;
        if (dwjrVar.h().g()) {
            Object objC = dwjrVar.h().c();
            eypcVar.copyOnWrite();
            ((eypd) eypcVar.instance).g = (String) objC;
        }
        if (dwjrVar.g().g()) {
            eypt eyptVarC = dweg.c((dwjl) dwjrVar.g().c());
            eypcVar.copyOnWrite();
            eypd eypdVar3 = (eypd) eypcVar.instance;
            eyptVarC.getClass();
            eypdVar3.h = eyptVarC;
            eypdVar3.b |= 1;
        }
        int iC = c(dwjrVar.d().m);
        eypcVar.copyOnWrite();
        ((eypd) eypcVar.instance).j = eyra.a(iC);
        int iOrdinal = dwjj.a(dwjrVar.e().m).ordinal();
        int i = iOrdinal != 6 ? iOrdinal != 8 ? 1 : 3 : 2;
        eypcVar.copyOnWrite();
        eypd eypdVar4 = (eypd) eypcVar.instance;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        eypdVar4.k = i - 2;
    }
}

package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbzp implements cfrk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/CreateMlsConversationRpcHandler");
    private final cbzu b;
    private final cenj c;
    private final auau d;
    private final ccrj e;
    private final eprb f;
    private final cbum g;
    private final cfre h;
    private final ezol i;
    private final ccep j;
    private final int k;
    private String l;

    public cbzp(cbzu cbzuVar, cenj cenjVar, auau auauVar, ccrj ccrjVar, eprb eprbVar, cbum cbumVar, cfre cfreVar, ezol ezolVar, ccep ccepVar, int i) {
        cbzuVar.getClass();
        cenjVar.getClass();
        auauVar.getClass();
        ccrjVar.getClass();
        eprbVar.getClass();
        cbumVar.getClass();
        ccepVar.getClass();
        this.b = cbzuVar;
        this.c = cenjVar;
        this.d = auauVar;
        this.e = ccrjVar;
        this.f = eprbVar;
        this.g = cbumVar;
        this.h = cfreVar;
        this.i = ezolVar;
        this.j = ccepVar;
        this.k = i;
        this.l = "";
    }

    @Override // defpackage.cfrk
    public final cfrh a() {
        return this.h;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object b(evuh evuhVar, fcxy fcxyVar) {
        eyxo eyxoVar = (eyxo) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "CreateMlsConversationRpcHandler");
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/CreateMlsConversationRpcHandler", "executeRpc", 120, "CreateMlsConversationRpcHandler.kt");
        ezpp ezppVar = eyxoVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        ekrdVar2.t("Executing CreateMlsConversationRequest: requestId=%s", ezppVar.c);
        cbzu cbzuVar = this.b;
        String str = this.h.b;
        str.getClass();
        return cbzuVar.a(str).a().c(eyxoVar, new fbrg(), fcxyVar);
    }

    @Override // defpackage.cfrk
    public final Object c(ezns eznsVar) {
        ezpo ezpoVarA = this.c.a("RCS");
        evqs evqsVar = eznsVar.b;
        ezpoVarA.copyOnWrite();
        ezpp ezppVar = (ezpp) ezpoVarA.instance;
        ezpp ezppVar2 = ezpp.a;
        evqsVar.getClass();
        ezppVar.f = evqsVar;
        evsn evsnVarBuild = ezpoVarA.build();
        evsnVarBuild.getClass();
        ezpp ezppVar3 = (ezpp) evsnVarBuild;
        String str = ezppVar3.c;
        str.getClass();
        this.l = str;
        String strF = this.d.a().f();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.S, "CreateMlsConversationRpcHandler");
        ekrdVar.X(cqnc.e, strF);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/CreateMlsConversationRpcHandler", "createRequest", 86, "CreateMlsConversationRpcHandler.kt")).q("Creating createMlsConversationRequest.");
        enae enaeVar = (enae) enao.a.createBuilder();
        enaeVar.getClass();
        enaf enafVar = (enaf) enag.a.createBuilder();
        enafVar.getClass();
        evsn evsnVarBuild2 = enafVar.build();
        evsnVarBuild2.getClass();
        enaeVar.copyOnWrite();
        enao enaoVar = (enao) enaeVar.instance;
        enaoVar.c = (enag) evsnVarBuild2;
        enaoVar.b = 1;
        this.e.a(emzv.a(enaeVar), strF, this.j.a, this.k, 0, enba.OPEN_CONVERSATION);
        eyxn eyxnVar = (eyxn) eyxo.a.createBuilder();
        eyxnVar.getClass();
        eyxnVar.copyOnWrite();
        eyxo eyxoVar = (eyxo) eyxnVar.instance;
        eyxoVar.c = ezppVar3;
        eyxoVar.b |= 1;
        eyxnVar.copyOnWrite();
        eyxo eyxoVar2 = (eyxo) eyxnVar.instance;
        eyxoVar2.d = this.i;
        eyxoVar2.b |= 2;
        eyxh eyxhVar = (eyxh) eyxi.a.createBuilder();
        eyxhVar.getClass();
        eylg.b(strF, eyxhVar);
        eyxj eyxjVar = (eyxj) eyxk.a.createBuilder();
        eyxjVar.getClass();
        eyyd eyydVar = (eyyd) eyye.a.createBuilder();
        eyydVar.getClass();
        eprb eprbVar = this.f;
        evqs evqsVar2 = eprbVar.b;
        evqsVar2.getClass();
        cbum cbumVar = this.g;
        epwr epwrVar = (epwr) epws.a.createBuilder();
        epwrVar.getClass();
        epvu epvuVar = (epvu) epvv.a.createBuilder();
        epvuVar.getClass();
        DesugarCollections.unmodifiableList(((epvv) epvuVar.instance).b).getClass();
        epvw.b(evqsVar2, epvuVar);
        epwt.b(epvw.a(epvuVar), epwrVar);
        evqs evqsVarA = evwm.a(cbumVar.u(epwt.a(epwrVar)));
        eyydVar.copyOnWrite();
        ((eyye) eyydVar.instance).b = evqsVarA;
        evqs evqsVar3 = eprbVar.c;
        evqsVar3.getClass();
        eyydVar.copyOnWrite();
        ((eyye) eyydVar.instance).c = evqsVar3;
        eprj eprjVar = eprbVar.d;
        if (eprjVar == null) {
            eprjVar = eprj.a;
        }
        evqs evqsVar4 = eprjVar.b;
        evqsVar4.getClass();
        eyydVar.copyOnWrite();
        ((eyye) eyydVar.instance).d = evqsVar4;
        eprj eprjVar2 = eprbVar.d;
        if (eprjVar2 == null) {
            eprjVar2 = eprj.a;
        }
        evqs evqsVar5 = eprjVar2.c;
        evqsVar5.getClass();
        eyydVar.copyOnWrite();
        ((eyye) eyydVar.instance).e = evqsVar5;
        eprj eprjVar3 = eprbVar.d;
        if (eprjVar3 == null) {
            eprjVar3 = eprj.a;
        }
        evqs evqsVar6 = eprjVar3.e;
        evqsVar6.getClass();
        eyydVar.copyOnWrite();
        ((eyye) eyydVar.instance).f = evqsVar6;
        evsn evsnVarBuild3 = eyydVar.build();
        evsnVarBuild3.getClass();
        eyxjVar.copyOnWrite();
        eyxk eyxkVar = (eyxk) eyxjVar.instance;
        eyxkVar.c = (eyye) evsnVarBuild3;
        eyxkVar.b = 2;
        eylg.c(eylh.a(eyxjVar), eyxhVar);
        eyxi eyxiVarA = eylg.a(eyxhVar);
        eyxnVar.copyOnWrite();
        eyxo eyxoVar3 = (eyxo) eyxnVar.instance;
        eyxoVar3.e = eyxiVarA;
        eyxoVar3.b |= 4;
        evsn evsnVarBuild4 = eyxnVar.build();
        evsnVarBuild4.getClass();
        return (eyxo) evsnVarBuild4;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object d(evuh evuhVar) {
        eyxq eyxqVar = (eyxq) evuhVar;
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar2 = cqnc.S;
        ekrdVar.X(ekrzVar2, "CreateMlsConversationRpcHandler");
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/CreateMlsConversationRpcHandler", "handleResponse", 133, "CreateMlsConversationRpcHandler.kt");
        String str = this.l;
        ezpr ezprVar = eyxqVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        ekrdVar2.C("Received result for CreateMlsConversationRequest: requestId=%s, responseId=%d", str, ezprVar.b);
        ekrw ekrwVarE = ekrgVar.e();
        ekrwVarE.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar3 = (ekrd) ekrwVarE;
        ekrdVar3.X(ekrzVar2, "CreateMlsConversationRpcHandler");
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/CreateMlsConversationRpcHandler", "handleResponse", 141, "CreateMlsConversationRpcHandler.kt")).t("CreateMlsConversationResponse is %s", eyxqVar);
        return eyxqVar;
    }

    @Override // defpackage.cfrk
    public final Object e(Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/CreateMlsConversationRpcHandler", "onRpcFailure", 149, "CreateMlsConversationRpcHandler.kt")).t("CreateMlsConversationRequest failed. RequestId is %s", this.l);
        return fctx.a;
    }
}

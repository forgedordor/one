package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbzn implements cfrk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/ApplyMlsControlMessageRpcHandler");
    private final cbzu b;
    private final cenj c;
    private final cccw d;
    private final cfre e;
    private final ezol f;
    private String g;

    public cbzn(cbzu cbzuVar, cenj cenjVar, cccw cccwVar, cfre cfreVar, ezol ezolVar) {
        cbzuVar.getClass();
        cenjVar.getClass();
        cccwVar.getClass();
        ezolVar.getClass();
        this.b = cbzuVar;
        this.c = cenjVar;
        this.d = cccwVar;
        this.e = cfreVar;
        this.f = ezolVar;
        this.g = "";
    }

    @Override // defpackage.cfrk
    public final cfrh a() {
        return this.e;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object b(evuh evuhVar, fcxy fcxyVar) {
        eyxe eyxeVar = (eyxe) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "ApplyMlsControlMessageRpcHandler");
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/ApplyMlsControlMessageRpcHandler", "executeRpc", 77, "ApplyMlsControlMessageRpcHandler.kt");
        ezpp ezppVar = eyxeVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        ekrdVar2.t("Executing ApplyMlsControlMessageRequest: requestId=%s", ezppVar.c);
        cbzu cbzuVar = this.b;
        String str = this.e.b;
        str.getClass();
        return cbzuVar.a(str).a().b(eyxeVar, new fbrg(), fcxyVar);
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
        this.g = str;
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.S, "ApplyMlsControlMessageRpcHandler");
        ekrz ekrzVar = cqnc.e;
        cccw cccwVar = this.d;
        ekrdVar.X(ekrzVar, cccwVar.a());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/ApplyMlsControlMessageRpcHandler", "createRequest", 62, "ApplyMlsControlMessageRpcHandler.kt")).q("Creating ApplyMlsControlMessageRequest.");
        eyxd eyxdVar = (eyxd) eyxe.a.createBuilder();
        eyxdVar.getClass();
        eyxdVar.copyOnWrite();
        eyxe eyxeVar = (eyxe) eyxdVar.instance;
        eyxeVar.c = ezppVar3;
        eyxeVar.b |= 1;
        eyxdVar.copyOnWrite();
        eyxe eyxeVar2 = (eyxe) eyxdVar.instance;
        eyxeVar2.d = this.f;
        eyxeVar2.b |= 2;
        eyxdVar.copyOnWrite();
        eyxe eyxeVar3 = (eyxe) eyxdVar.instance;
        eyxeVar3.e = cccwVar.a;
        eyxeVar3.b |= 4;
        evsn evsnVarBuild2 = eyxdVar.build();
        evsnVarBuild2.getClass();
        return (eyxe) evsnVarBuild2;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object d(evuh evuhVar) {
        eyxg eyxgVar = (eyxg) evuhVar;
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar2 = cqnc.S;
        ekrdVar.X(ekrzVar2, "ApplyMlsControlMessageRpcHandler");
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/ApplyMlsControlMessageRpcHandler", "handleResponse", 90, "ApplyMlsControlMessageRpcHandler.kt");
        String str = this.g;
        ezpr ezprVar = eyxgVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        ekrdVar2.C("Received result for ApplyMlsControlMessageRequest: requestId=%s, responseId=%d", str, ezprVar.b);
        ekrw ekrwVarE = ekrgVar.e();
        ekrwVarE.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar3 = (ekrd) ekrwVarE;
        ekrdVar3.X(ekrzVar2, "ApplyMlsControlMessageRpcHandler");
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/ApplyMlsControlMessageRpcHandler", "handleResponse", 98, "ApplyMlsControlMessageRpcHandler.kt")).t("ApplyMlsControlMessageResponse is %s", eyxgVar);
        return eyxgVar;
    }

    @Override // defpackage.cfrk
    public final Object e(Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/ApplyMlsControlMessageRpcHandler", "onRpcFailure", 106, "ApplyMlsControlMessageRpcHandler.kt")).t("ApplyMlsControlMessageRequest failed. RequestId is %s", this.g);
        return fctx.a;
    }
}

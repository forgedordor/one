package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbzr implements cfrk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/GetMlsGroupInfoRpcHandler");
    private final cbzu b;
    private final cenj c;
    private final cfre d;
    private final ezol e;
    private String f;

    public cbzr(cbzu cbzuVar, cenj cenjVar, cfre cfreVar, ezol ezolVar) {
        cbzuVar.getClass();
        cenjVar.getClass();
        this.b = cbzuVar;
        this.c = cenjVar;
        this.d = cfreVar;
        this.e = ezolVar;
        this.f = "";
    }

    @Override // defpackage.cfrk
    public final cfrh a() {
        return this.d;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object b(evuh evuhVar, fcxy fcxyVar) {
        eyxs eyxsVar = (eyxs) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "GetMlsGroupInfoRpcHandler");
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/GetMlsGroupInfoRpcHandler", "executeRpc", 63, "GetMlsGroupInfoRpcHandler.kt");
        ezpp ezppVar = eyxsVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        ekrdVar2.t("Executing GetMlsGroupInfoRequest: requestId=%s", ezppVar.c);
        cbzu cbzuVar = this.b;
        String str = this.d.b;
        str.getClass();
        return cbzuVar.a(str).a().d(eyxsVar, new fbrg(), fcxyVar);
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
        this.f = str;
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.S, "GetMlsGroupInfoRpcHandler");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/GetMlsGroupInfoRpcHandler", "createRequest", 51, "GetMlsGroupInfoRpcHandler.kt")).q("Creating getMlsGroupInfoRequest.");
        eyxr eyxrVar = (eyxr) eyxs.a.createBuilder();
        eyxrVar.getClass();
        eyxrVar.copyOnWrite();
        eyxs eyxsVar = (eyxs) eyxrVar.instance;
        eyxsVar.c = ezppVar3;
        eyxsVar.b |= 1;
        eyxrVar.copyOnWrite();
        eyxs eyxsVar2 = (eyxs) eyxrVar.instance;
        eyxsVar2.d = this.e;
        eyxsVar2.b |= 2;
        evsn evsnVarBuild2 = eyxrVar.build();
        evsnVarBuild2.getClass();
        return (eyxs) evsnVarBuild2;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object d(evuh evuhVar) {
        eyxu eyxuVar = (eyxu) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "GetMlsGroupInfoRpcHandler");
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/GetMlsGroupInfoRpcHandler", "handleResponse", 74, "GetMlsGroupInfoRpcHandler.kt");
        String str = this.f;
        ezpr ezprVar = eyxuVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        ekrdVar2.C("Received result for GetMlsGroupInfoRequest: requestId=%s, responseId=%d", str, ezprVar.b);
        return eyxuVar;
    }

    @Override // defpackage.cfrk
    public final Object e(Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/e2ee/mls/conversation/client/GetMlsGroupInfoRpcHandler", "onRpcFailure", 86, "GetMlsGroupInfoRpcHandler.kt")).t("GetMlsGroupInfoRequest failed. RequestId is %s", this.f);
        return fctx.a;
    }
}

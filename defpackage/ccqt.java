package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqt implements cfrk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/kds/ClaimKeyPackagesRpcHandler");
    private final cenj b;
    private final ccrf c;
    private final cccv d;
    private final cfre e;
    private final List f;
    private String g;

    public ccqt(cenj cenjVar, ccrf ccrfVar, cccv cccvVar, cfre cfreVar, List list) {
        cenjVar.getClass();
        cccvVar.getClass();
        cfreVar.getClass();
        list.getClass();
        this.b = cenjVar;
        this.c = ccrfVar;
        this.d = cccvVar;
        this.e = cfreVar;
        this.f = list;
        this.g = "";
    }

    @Override // defpackage.cfrk
    public final cfrh a() {
        return this.e;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object b(evuh evuhVar, fcxy fcxyVar) {
        facu facuVar = (facu) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/kds/ClaimKeyPackagesRpcHandler", "executeRpc", 62, "ClaimKeyPackagesRpcHandler.kt");
        ezpp ezppVar = facuVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        cccv cccvVar = this.d;
        ekrdVar.D("Executing ClaimKeyPackagesRpc: requestId=%s, url=%s", ezppVar.c, cccvVar);
        return this.c.a(cccvVar).b(facuVar, new fbrg(), fcxyVar);
    }

    @Override // defpackage.cfrk
    public final Object c(ezns eznsVar) {
        ezpo ezpoVarA = this.b.a("RCS");
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
        fact factVar = (fact) facu.a.createBuilder();
        factVar.getClass();
        factVar.copyOnWrite();
        facu facuVar = (facu) factVar.instance;
        facuVar.c = ezppVar3;
        facuVar.b |= 1;
        DesugarCollections.unmodifiableList(facuVar.d).getClass();
        factVar.copyOnWrite();
        facu facuVar2 = (facu) factVar.instance;
        evtg evtgVar = facuVar2.d;
        if (!evtgVar.c()) {
            facuVar2.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(this.f, facuVar2.d);
        epvr epvrVar = ccda.a;
        epvrVar.getClass();
        factVar.copyOnWrite();
        ((facu) factVar.instance).e = epvrVar.a();
        factVar.copyOnWrite();
        ((facu) factVar.instance).f = 1;
        evsn evsnVarBuild2 = factVar.build();
        evsnVarBuild2.getClass();
        return (facu) evsnVarBuild2;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object d(evuh evuhVar) {
        facw facwVar = (facw) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/kds/ClaimKeyPackagesRpcHandler", "handleResponse", 76, "ClaimKeyPackagesRpcHandler.kt");
        String str = this.g;
        ezpr ezprVar = facwVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        ekrdVar.C("Received result for ClaimKeyPackagesRpc: requestId=%s, responseId=%d", str, ezprVar.b);
        return facwVar;
    }

    @Override // defpackage.cfrk
    public final Object e(Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/e2ee/mls/kds/ClaimKeyPackagesRpcHandler", "onRpcFailure", 85, "ClaimKeyPackagesRpcHandler.kt")).t("ClaimKeyPackagesRpc failed. RequestId is %s", this.g);
        return fctx.a;
    }
}

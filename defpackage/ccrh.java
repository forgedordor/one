package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrh implements cfrk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/kds/UploadKeyPackagesRpcHandler");
    private final cenj b;
    private final ccrf c;
    private final ccrj d;
    private final String e;
    private final cccv f;
    private final cfre g;
    private final List h;
    private final ccfw i;
    private String j;

    public ccrh(cenj cenjVar, ccrf ccrfVar, ccrj ccrjVar, String str, cccv cccvVar, cfre cfreVar, List list, ccfw ccfwVar) {
        cenjVar.getClass();
        ccrjVar.getClass();
        cccvVar.getClass();
        cfreVar.getClass();
        list.getClass();
        ccfwVar.getClass();
        this.b = cenjVar;
        this.c = ccrfVar;
        this.d = ccrjVar;
        this.e = str;
        this.f = cccvVar;
        this.g = cfreVar;
        this.h = list;
        this.i = ccfwVar;
        this.j = "";
    }

    @Override // defpackage.cfrk
    public final cfrh a() {
        return this.g;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object b(evuh evuhVar, fcxy fcxyVar) {
        fado fadoVar = (fado) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.af, this.e);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/kds/UploadKeyPackagesRpcHandler", "executeRpc", 99, "UploadKeyPackagesRpcHandler.kt");
        ezpp ezppVar = fadoVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        cccv cccvVar = this.f;
        ekrdVar2.D("Executing UploadKeyPackageRpc: requestId=%s, url=%s", ezppVar.c, cccvVar);
        return this.c.a(cccvVar).c(fadoVar, new fbrg(), fcxyVar);
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
        this.j = str;
        List<ccfw> list = this.h;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (ccfw ccfwVar : list) {
            fadd faddVar = (fadd) fade.a.createBuilder();
            faddVar.getClass();
            fady.b(ccfwVar.a, faddVar);
            arrayList.add(fady.a(faddVar));
        }
        fadd faddVar2 = (fadd) fade.a.createBuilder();
        faddVar2.getClass();
        fady.b(this.i.a, faddVar2);
        fade fadeVarA = fady.a(faddVar2);
        fadn fadnVar = (fadn) fado.a.createBuilder();
        fadnVar.getClass();
        fadnVar.copyOnWrite();
        fado fadoVar = (fado) fadnVar.instance;
        fadoVar.c = ezppVar3;
        fadoVar.b |= 1;
        DesugarCollections.unmodifiableList(fadoVar.d).getClass();
        fadnVar.copyOnWrite();
        fado fadoVar2 = (fado) fadnVar.instance;
        evtg evtgVar = fadoVar2.d;
        if (!evtgVar.c()) {
            fadoVar2.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList, fadoVar2.d);
        fadnVar.copyOnWrite();
        fado fadoVar3 = (fado) fadnVar.instance;
        fadoVar3.e = fadeVarA;
        fadoVar3.b |= 2;
        evsn evsnVarBuild2 = fadnVar.build();
        evsnVarBuild2.getClass();
        return (fado) evsnVarBuild2;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object d(evuh evuhVar) {
        fadq fadqVar = (fadq) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.af;
        String str = this.e;
        ekrdVar.X(ekrzVar, str);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/kds/UploadKeyPackagesRpcHandler", "handleResponse", 80, "UploadKeyPackagesRpcHandler.kt");
        String str2 = this.j;
        ezpr ezprVar = fadqVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        ekrdVar2.C("Received result for UploadKeyPackageRpc: requestId=%s, responseId=%d", str2, ezprVar.b);
        if (str != null) {
            ccrj.d(this.d, str, emey.RCS_MLS_PROVISIONING_KDS_UPLOAD_KEY_PACKAGE_SUCCESS, 0, this.j, null, null, 52);
        }
        return fadqVar;
    }

    @Override // defpackage.cfrk
    public final Object e(Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrz ekrzVar = cqnc.af;
        String str = this.e;
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.g(th).h("com/google/android/apps/messaging/shared/e2ee/mls/kds/UploadKeyPackagesRpcHandler", "onRpcFailure", 113, "UploadKeyPackagesRpcHandler.kt")).t("UploadKeyPackagesRpc failed. RequestId is %s", this.j);
        int iValue = cems.a(th).value();
        if (str != null) {
            ccrj.d(this.d, str, emey.RCS_MLS_PROVISIONING_KDS_UPLOAD_KEY_PACKAGE_FAILURE, 6, this.j, new Integer(iValue), null, 32);
        }
        return fctx.a;
    }
}

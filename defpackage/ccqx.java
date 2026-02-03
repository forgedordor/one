package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqx implements cfrk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/kds/CreateCertificateRpcHandler");
    private final cenj b;
    private final ccqr c;
    private final ccrj d;
    private final String e;
    private final cccv f;
    private final cfre g;
    private final evqs h;
    private final Instant i;
    private final ccqv j;
    private String k;

    public ccqx(cenj cenjVar, ccqr ccqrVar, ccrj ccrjVar, String str, cccv cccvVar, cfre cfreVar, evqs evqsVar, Instant instant, ccqv ccqvVar) {
        cenjVar.getClass();
        ccrjVar.getClass();
        str.getClass();
        cccvVar.getClass();
        cfreVar.getClass();
        evqsVar.getClass();
        instant.getClass();
        ccqvVar.getClass();
        this.b = cenjVar;
        this.c = ccqrVar;
        this.d = ccrjVar;
        this.e = str;
        this.f = cccvVar;
        this.g = cfreVar;
        this.h = evqsVar;
        this.i = instant;
        this.j = ccqvVar;
        this.k = "";
    }

    @Override // defpackage.cfrk
    public final cfrh a() {
        return this.g;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object b(evuh evuhVar, fcxy fcxyVar) {
        facy facyVar = (facy) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.af, this.e);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/kds/CreateCertificateRpcHandler", "executeRpc", 122, "CreateCertificateRpcHandler.kt");
        ezpp ezppVar = facyVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        cccv cccvVar = this.f;
        ekrdVar2.D("Executing CreateCertificateRpc: requestId=%s, url=%s", ezppVar.c, cccvVar);
        ccqr ccqrVar = this.c;
        String str = cccvVar.a;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("KDS url must not be empty");
        }
        fcrn fcrnVarD = ceqb.d(ccqrVar.a, ccqrVar.b.b(), str);
        fcrnVarD.getClass();
        return ((fadt) fcrnVarD).b(facyVar, new fbrg(), fcxyVar);
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
        this.k = str;
        facx facxVar = (facx) facy.a.createBuilder();
        facxVar.getClass();
        facxVar.copyOnWrite();
        facy facyVar = (facy) facxVar.instance;
        facyVar.c = ezppVar3;
        facyVar.b |= 1;
        fadl fadlVar = (fadl) fadm.a.createBuilder();
        fadlVar.getClass();
        fadi fadiVar = fadi.a;
        fadh fadhVar = (fadh) fadiVar.createBuilder();
        fadhVar.getClass();
        fadz.c(fadhVar);
        ccqv ccqvVar = this.j;
        fadz.b(ccqvVar.a, fadhVar);
        fadi fadiVarA = fadz.a(fadhVar);
        fadlVar.copyOnWrite();
        fadm fadmVar = (fadm) fadlVar.instance;
        fadmVar.c = fadiVarA;
        fadmVar.b |= 1;
        evsn evsnVarBuild2 = fadlVar.build();
        evsnVarBuild2.getClass();
        facxVar.copyOnWrite();
        facy facyVar2 = (facy) facxVar.instance;
        facyVar2.e = (fadm) evsnVarBuild2;
        facyVar2.b |= 4;
        fadf fadfVar = (fadf) fadg.a.createBuilder();
        fadfVar.getClass();
        fadj fadjVar = (fadj) fadk.a.createBuilder();
        fadjVar.getClass();
        evvp evvpVar = evvp.a;
        evvo evvoVar = (evvo) evvpVar.createBuilder();
        evvoVar.getClass();
        evvq.b(ccqvVar.d, evvoVar);
        evvp evvpVarA = evvq.a(evvoVar);
        fadjVar.copyOnWrite();
        fadk fadkVar = (fadk) fadjVar.instance;
        fadkVar.c = evvpVarA;
        fadkVar.b |= 1;
        evvo evvoVar2 = (evvo) evvpVar.createBuilder();
        evvoVar2.getClass();
        evvq.b(ccqvVar.e, evvoVar2);
        evvp evvpVarA2 = evvq.a(evvoVar2);
        fadjVar.copyOnWrite();
        fadk fadkVar2 = (fadk) fadjVar.instance;
        fadkVar2.d = evvpVarA2;
        fadkVar2.b |= 2;
        evsn evsnVarBuild3 = fadjVar.build();
        evsnVarBuild3.getClass();
        fadfVar.copyOnWrite();
        fadg fadgVar = (fadg) fadfVar.instance;
        fadgVar.e = (fadk) evsnVarBuild3;
        fadgVar.b |= 2;
        evqs evqsVar2 = ccqvVar.b;
        fadfVar.copyOnWrite();
        ((fadg) fadfVar.instance).d = evqsVar2;
        fadh fadhVar2 = (fadh) fadiVar.createBuilder();
        fadhVar2.getClass();
        fadz.c(fadhVar2);
        fadz.b(ccqvVar.c, fadhVar2);
        fadi fadiVarA2 = fadz.a(fadhVar2);
        fadfVar.copyOnWrite();
        fadg fadgVar2 = (fadg) fadfVar.instance;
        fadgVar2.c = fadiVarA2;
        fadgVar2.b |= 1;
        evsn evsnVarBuild4 = fadfVar.build();
        evsnVarBuild4.getClass();
        facxVar.copyOnWrite();
        facy facyVar3 = (facy) facxVar.instance;
        facyVar3.d = (fadg) evsnVarBuild4;
        facyVar3.b |= 2;
        facr facrVar = (facr) facs.a.createBuilder();
        facrVar.getClass();
        evqs evqsVar3 = this.h;
        facrVar.copyOnWrite();
        ((facs) facrVar.instance).b = evqsVar3;
        long epochSecond = this.i.getEpochSecond();
        facrVar.copyOnWrite();
        ((facs) facrVar.instance).c = epochSecond;
        evsn evsnVarBuild5 = facrVar.build();
        evsnVarBuild5.getClass();
        facxVar.copyOnWrite();
        facy facyVar4 = (facy) facxVar.instance;
        facyVar4.f = (facs) evsnVarBuild5;
        facyVar4.b |= 8;
        evsn evsnVarBuild6 = facxVar.build();
        evsnVarBuild6.getClass();
        return (facy) evsnVarBuild6;
    }

    @Override // defpackage.cfrk
    public final /* bridge */ /* synthetic */ Object d(evuh evuhVar) {
        fada fadaVar = (fada) evuhVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.af;
        String str = this.e;
        ekrdVar.X(ekrzVar, str);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/kds/CreateCertificateRpcHandler", "handleResponse", 105, "CreateCertificateRpcHandler.kt");
        String str2 = this.k;
        ezpr ezprVar = fadaVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        ekrdVar2.C("Received result for CreateCertificateRpc: requestId=%s, responseId=%d", str2, ezprVar.b);
        ccrj.d(this.d, str, emey.RCS_MLS_PROVISIONING_KDS_CERTIFICATE_CHAIN_RESPONSE_SUCCESS, 0, this.k, null, null, 52);
        return fadaVar;
    }

    @Override // defpackage.cfrk
    public final Object e(Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrz ekrzVar = cqnc.af;
        String str = this.e;
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.g(th).h("com/google/android/apps/messaging/shared/e2ee/mls/kds/CreateCertificateRpcHandler", "onRpcFailure", 136, "CreateCertificateRpcHandler.kt")).t("CreateCertificateRpc failed. RequestId is %s", this.k);
        int iValue = cems.a(th).value();
        ccrj.d(this.d, str, emey.RCS_MLS_PROVISIONING_KDS_CERTIFICATE_CHAIN_RESPONSE_FAILURE, 5, this.k, new Integer(iValue), null, 32);
        return fctx.a;
    }
}

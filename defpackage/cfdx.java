package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdx implements cfrj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/GetRcsAccountInfoRpcHandler");
    private final cfre b;
    private String c = "";
    private long d;

    public cfdx(cfre cfreVar) {
        this.b = cfreVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.d;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "GetAccountInfoRcsHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfrj
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final eiju c(ezpp ezppVar) {
        ezppVar.getClass();
        String str = ezppVar.c;
        str.getClass();
        this.c = str;
        ezip ezipVar = (ezip) eziq.a.createBuilder();
        ezipVar.getClass();
        ezipVar.copyOnWrite();
        eziq eziqVar = (eziq) ezipVar.instance;
        eziqVar.c = ezppVar;
        eziqVar.b |= 1;
        evsn evsnVarBuild = ezipVar.build();
        evsnVarBuild.getClass();
        eiju eijuVarE = eijx.e((eziq) evsnVarBuild);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final eiju d(cezv cezvVar, eziq eziqVar) {
        cezvVar.getClass();
        eziqVar.getClass();
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.getClass();
        String str = this.b.b;
        str.getClass();
        eymt.c(str, ezokVar);
        eiju eijuVarA = cezvVar.d(eymt.a(ezokVar)).a(eziqVar);
        eijuVarA.getClass();
        return eijuVarA;
    }

    @Override // defpackage.cfrj
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final eiju e(ezis ezisVar) {
        ezisVar.getClass();
        ezpr ezprVar = ezisVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.d = ezprVar.b;
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/net/handler/GetRcsAccountInfoRpcHandler", "handleResponse", 51, "GetRcsAccountInfoRpcHandler.kt")).t("GetAccountInfoResponse is %s", ezisVar);
        eiju eijuVarE = eijx.e(ezisVar);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}

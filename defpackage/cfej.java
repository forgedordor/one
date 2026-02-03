package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfej implements cfrj {
    private static final eksp a = eksp.c("BugleAlphaverse");
    private final fcsu b;
    private final cfre c;
    private final String d;
    private String e = null;
    private long f = 0;

    public cfej(fcsu fcsuVar, cfre cfreVar, String str) {
        this.b = fcsuVar;
        this.c = cfreVar;
        this.d = str;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "LinkIdentityHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        String str = this.e;
        return str != null ? str : "";
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
        this.e = ezppVar.c;
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        String str = ezppVar.e;
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        str.getClass();
        ezolVar.d = str;
        felm felmVar = felm.EMAIL;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        ezokVar.copyOnWrite();
        ezol ezolVar2 = (ezol) ezokVar.instance;
        String str2 = this.d;
        str2.getClass();
        ezolVar2.c = str2;
        ezol ezolVar3 = (ezol) ezokVar.build();
        ezjo ezjoVar = (ezjo) ezjp.a.createBuilder();
        ezjoVar.copyOnWrite();
        ezjp ezjpVar = (ezjp) ezjoVar.instance;
        ezppVar.getClass();
        ezjpVar.c = ezppVar;
        ezjpVar.b |= 1;
        ezjoVar.copyOnWrite();
        ezjp ezjpVar2 = (ezjp) ezjoVar.instance;
        ezolVar3.getClass();
        ezjpVar2.d = ezolVar3;
        ezjpVar2.b |= 2;
        return eijx.e((ezjp) ezjoVar.build());
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final eiju d(cezv cezvVar, ezjp ezjpVar) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/net/handler/LinkIdentityRpcHandler", "executeRpc", 66, "LinkIdentityRpcHandler.java")).t("Link identity Request Id is [%s]", this.e);
        try {
            eson esonVarB = ((esol) this.b.b()).b(new esoo(this.d, "google"), new ekph("https://www.googleapis.com/auth/tachyon"));
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            cfre cfreVar = this.c;
            ezokVar.copyOnWrite();
            ezol ezolVar = (ezol) ezokVar.instance;
            String str = cfreVar.b;
            str.getClass();
            ezolVar.c = str;
            return cezvVar.d((ezol) ezokVar.build()).c(ezjpVar, esonVarB);
        } catch (esom | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.cfrj
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final eiju e(ezjr ezjrVar) {
        ezpr ezprVar = ezjrVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.f = ezprVar.b;
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/net/handler/LinkIdentityRpcHandler", "handleResponse", 90, "LinkIdentityRpcHandler.java")).t("Link identity response is [%s]", ezjrVar);
        return eijx.e(ezjrVar);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdv implements cfrj {
    public final ceta a;
    public final cfrd b;
    private final fdjx c;
    private final cert d;
    private String e;
    private long f;

    public cfdv(fdjx fdjxVar, String str, cert certVar, ceta cetaVar) {
        fdjxVar.getClass();
        this.c = fdjxVar;
        this.d = certVar;
        this.a = cetaVar;
        this.e = "";
        this.b = new cfrd(str);
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ cfrh b() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "GetGaiaDeviceInfoRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.e;
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
        this.e = str;
        return auvw.c(this.c, fcyi.a, fdjz.a, new cfdu(this, ezppVar, null));
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final eiju d(cezv cezvVar, eziu eziuVar) {
        cezvVar.getClass();
        eziuVar.getClass();
        eiju eijuVarA = this.d.a(eziuVar);
        eijuVarA.getClass();
        return eijuVarA;
    }

    @Override // defpackage.cfrj
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final eiju e(eziw eziwVar) {
        eziwVar.getClass();
        ezpr ezprVar = eziwVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.f = ezprVar.b;
        eiju eijuVarE = eijx.e(eziwVar);
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

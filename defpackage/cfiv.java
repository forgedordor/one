package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfiv implements cfiu {
    private final aqbt a;

    public cfiv(aqbt aqbtVar) {
        this.a = aqbtVar;
    }

    @Override // defpackage.cfiu
    public final eiju a(ezob ezobVar) {
        ezobVar.getClass();
        if (!((eoth) ((aplv) this.a).a.b()).a("bugle.enable24hr_auth_token")) {
            ezobVar.a(felh.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN);
            eiju eijuVarE = eijx.e(ezobVar);
            eijuVarE.getClass();
            return eijuVarE;
        }
        ezobVar.a(felh.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN);
        ezobVar.a(felh.SUPPORTS_24_HOUR_RCS_AUTH_TOKEN);
        eiju eijuVarE2 = eijx.e(ezobVar);
        eijuVarE2.getClass();
        return eijuVarE2;
    }
}

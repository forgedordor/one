package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjc implements cdfg {
    public elic a = elic.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_UNKNOWN;

    public final String a() {
        int iOrdinal = this.a.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "unknown" : "false" : "true" : "not required";
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        cdew cdewVar = new cdew();
        cdewVar.b("share_with_partner_consent");
        cdewVar.c(a());
        return eijx.e(ekgb.r(cdewVar.a()));
    }
}

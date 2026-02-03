package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfnq {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;
    public final dfoa e;
    public final dfoa f;
    public final dfoa g;
    public final dfoa h;
    public final dfoa i;
    public final dfoa j;
    public final dfoa k;
    public final dfoa l;

    public dfnq(dfnr dfnrVar) {
        this.a = dfnrVar.i("verifier_info_enabled", false);
        this.b = dfnrVar.i("verified_sms_token_enabled", true);
        this.c = dfnrVar.h("bot_info_request_version", "1.5");
        this.d = dfnrVar.h("debug_business_info_domain", "");
        this.e = dfnrVar.h("nonstandard_rbm_phone_numbers_regex", "^(tel:)?\\+[0-9]{7,15}$");
        this.f = dfnrVar.g("client_timeout_sec", 120L);
        this.g = dfnrVar.g("client_ringing_period_sec", 30L);
        this.h = dfnrVar.g("immediate_retry_backoff_sec", 2L);
        this.i = dfnrVar.g("immediate_retry_backoff_rate_sec", 2L);
        this.j = dfnrVar.g("max_immediate_retries", 5L);
        this.k = dfnrVar.g("server_retry_backoff_sec", 300L);
        this.l = dfnrVar.g("server_retry_backoff_rate", 3L);
    }
}

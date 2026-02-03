package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbp {
    final dfbr A;
    final dfap B;
    final dfap C;
    final dfap D;
    final dfbr a;
    final dfbr b;
    final dfbr c;
    final dfbr d;
    final dfbr e;
    final dfbr f;
    final dfbr g;
    final dfbr h;
    final dfbr i;
    final dfbr j;
    final dfbr k;
    final dfbr l;
    final dfbr m;
    final dfbr n;
    final dfbr o;
    final dfbr p;
    final dfbr q;
    final dfbr r;
    final dfbr s;
    final dfbr t;
    final dfbr u;
    final dfbr v;
    final dfbr w;
    final dfbr x;
    final dfbr y;
    final dfbr z;

    protected dfbp(dzzf dzzfVar) {
        this.a = new dfbr(dzzfVar.h("acs_url", ""));
        dfaq.c.booleanValue();
        this.b = new dfbr(dzzfVar.i("allow_overrides", true));
        dfaq.d.booleanValue();
        this.c = new dfbr(dzzfVar.i("clear_sip_register_auth_digest", true));
        this.e = new dfbr(dzzfVar.g("initial_message_revocation_delay_in_millis", dfaq.e.longValue()));
        this.f = new dfbr(dzzfVar.g("max_message_revocation_delay_in_millis", dfaq.f.longValue()));
        dfaq.g.intValue();
        this.g = new dfbr(dzzfVar.f("max_thumbnail_download_size_bytes", 102400));
        dfaq.h.intValue();
        this.h = new dfbr(dzzfVar.f("max_thumbnail_download_size_pre_up_bytes", 10240));
        this.i = new dfbr(dzzfVar.h("mcc_mnc", "00101"));
        this.j = new dfbr(dzzfVar.h("mcc_url_format", ""));
        this.k = new dfbr(dzzfVar.h("otp_pattern", ""));
        this.l = new dfbr(dzzfVar.h("sms_ignore_pattern", "Google is verifying your number for Chat features \\d+|Google Chat features code [a-zA-Z0-9_-]+ \\d+"));
        this.m = new dfbr(dzzfVar.f("otp_wait_timeout_ms", dfaq.i.intValue()));
        this.n = new dfbr(dzzfVar.f("provisioning_imei_format", 2));
        this.o = new dfbr(dzzfVar.f("provisioning_imsi_format", 2));
        this.p = new dfbr(dzzfVar.h("provisioning_rcs_profile", "UP_T"));
        this.q = new dfbr(dzzfVar.h("provisioning_rcs_version", "5.1B"));
        this.r = new dfbr(dzzfVar.g("provisioning_retry_max_delay_in_millis", dfaq.w));
        this.s = new dfbr(dzzfVar.g("provisioning_retry_min_delay_in_millis", dfaq.v));
        this.t = new dfbr(dzzfVar.g("sip_register_retry_max_delay_in_seconds", dfaq.j.longValue()));
        dfaq.k.longValue();
        this.u = new dfbr(dzzfVar.g("sip_register_retry_min_delay_in_seconds", 5L));
        dfaq.l.intValue();
        this.v = new dfbr(dzzfVar.f("sms_port", -1));
        dfaq.o.booleanValue();
        this.x = new dfbr(dzzfVar.i("allow_seamless_authorized_provisioning", false));
        dfaq.p.booleanValue();
        this.y = new dfbr(dzzfVar.i("allow_manual_phone_number_input", false));
        dfaq.q.booleanValue();
        this.z = new dfbr(dzzfVar.i("show_google_tos", false));
        dfaq.r.booleanValue();
        this.A = new dfbr(dzzfVar.i("enable_instance_id_in_provisioning", false));
        dfaq.s.booleanValue();
        this.B = new dfbr(dzzfVar.i("show_rcs_enabled_by_carrier_in_settings", false));
        dfaq.t.booleanValue();
        this.C = new dfbr(dzzfVar.i("rcs_provisioning_enabled", true));
        dfaq.u.booleanValue();
        this.D = new dfbr(dzzfVar.i("notify_backend_rcs_is_unavailable", false));
        dfaq.n.booleanValue();
        this.d = new dfbr(dzzfVar.i("enable_analytics", true));
        dfaq.m.intValue();
        this.w = new dfbr(dzzfVar.f("testing_device_id", -1));
    }
}

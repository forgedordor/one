package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbx {
    public static final dbhd a;
    public static final dbhd b;
    public static final dbhd c;

    static {
        Boolean bool = false;
        bool.getClass();
        a = dfbv.e("carrier_services_sip_flags_update_local_port_from_rport", false);
        a("retry_count_on_service_unavailable");
        b = dfbv.d("carrier_services_sip_flags_avoid_checking_duplicate_for_request_methods", "CANCEL,");
        c = a("resend_200ok_max_times");
    }

    private static dbhd a(String str) {
        return dfbv.c("carrier_services_sip_flags_".concat(str), 1);
    }
}

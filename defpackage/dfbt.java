package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbt {
    public static final dbhd a = a("enable_carrier_services_apk", true);

    static {
        a("enable_debug_info", false);
    }

    private static dbhd a(String str, Boolean bool) {
        return dfbv.e("carrier_services_apk_flags_".concat(str), bool.booleanValue());
    }
}

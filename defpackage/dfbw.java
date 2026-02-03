package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbw {
    public static final dbhd a = a("white_listed_packages", "com.google.android.apps.messaging");
    public static final dbhd b = a("test_service_white_listed_packages", "com.google.android.ims.mobly.snippets");
    public static final dbhd c = a("white_listed_signatures", "B28C3EDB665DF32686224DF800F603E9959BBE4E,0980A12BE993528C19107BC21AD811478C63CEFC");
    public static final dbhd d = a("test_service_white_listed_signatures", "AE41481F52E0F58DF2806D5A38EB3DBCA5AE02B0,E165542B31953CC282AA4EF2F4D5F07F7663A2A2");
    public static final dbhd e;

    static {
        Boolean bool = false;
        bool.getClass();
        e = dfbv.e("carrier_services_security_flags_allow_http_urls", false);
    }

    private static dbhd a(String str, String str2) {
        return dfbv.d("carrier_services_security_flags_".concat(str), str2);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajkb {
    public static final ejxr a = cdag.x("cobalt_logger_enabled");
    public static final ejxr b = cdag.x("app_install_action_metric_enabled");
    public static final ejxr c = cdag.x("active_user_action_metric_enabled");
    public static final cczi d;
    public static final ejxr e;
    public static final ejxr f;
    public static final cczv g;
    public static final cczv h;

    static {
        cdag.e(cdag.b, "cobalt_logger_uploading_interval_in_hours", 1);
        d = cdag.e(cdag.b, "cobalt_init_sync_interval_in_hours", 8);
        e = cdag.x("use_blocking_executor");
        f = cdag.x("use_background_executor");
        dzzf dzzfVar = cdag.b;
        ewtn ewtnVar = (ewtn) ewto.a.createBuilder();
        ewtnVar.a(ekgb.C("US", "GB", "DE", "FR", "IN", "ES", "IT", "ZA", "BR", "MX", "CA", "AU", new String[0]));
        g = cdag.t(dzzfVar, "am_top_slice_country_codes", (ewto) ewtnVar.build(), new dzze() { // from class: ajka
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewto) evsn.parseFrom(ewto.a, bArr);
            }
        });
        dzzf dzzfVar2 = cdag.b;
        ewtn ewtnVar2 = (ewtn) ewto.a.createBuilder();
        ewtnVar2.a(ekgb.A("LG", "SAMSUNG", "GOOGLE", "XIAOMI", "OPPO", "VIVO", "MOTOROLA", "TECNOMOBILELIMITED", "ONEPLUS", "HMDGLOBAL"));
        h = cdag.t(dzzfVar2, "am_top_slice_manufacturers", (ewto) ewtnVar2.build(), new dzze() { // from class: ajka
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewto) evsn.parseFrom(ewto.a, bArr);
            }
        });
    }
}

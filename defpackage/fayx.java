package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fayx implements fayw {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.o("cslib_phenotype__enable_open_url_webview_actions_v3", false);
        b = dzzfVarA.o("cslib_phenotype__remove_sim_info_provider_from_provisioning_engine_network_utils_v1", true);
    }

    @Override // defpackage.fayw
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fayw
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}

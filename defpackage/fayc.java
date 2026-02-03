package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fayc implements fayb {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.o("cslib_phenotype__cslib_deprecate_always_on_system_binding_v1", true);
        b = dzzfVarA.o("cslib_phenotype__remove_sim_info_provider_from_provisioning_engine_config_utils_v1", false);
    }

    @Override // defpackage.fayb
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fayb
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}

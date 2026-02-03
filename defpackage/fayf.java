package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fayf implements faye {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.o("cslib_phenotype__remove_config_state_check_in_availability_check_v1", false);
        b = dzzfVarA.o("cslib_phenotype__remove_contexts_from_private_suspends_in_smv2_v1", false);
    }

    @Override // defpackage.faye
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.faye
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}

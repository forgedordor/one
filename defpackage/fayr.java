package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fayr implements fayq {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.o("cslib_phenotype__enable_consent_free_provisioning_v2", false);
        b = dzzfVarA.o("cslib_phenotype__enable_mls_for_imdn_v1", true);
    }

    @Override // defpackage.fayq
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fayq
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}

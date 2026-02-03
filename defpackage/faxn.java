package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faxn implements faxm {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.o("cslib_phenotype__enable_welcome_message_suppression_v1", true);
        b = dzzfVarA.o("cslib_phenotype__test_ramp_down_v2", false);
    }

    @Override // defpackage.faxm
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.faxm
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fazm implements fazl {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        a = dzzfVarA.o("FiMultiSync__enable_fi_multi_sync_help_article_in_rcs_settings", false);
        b = dzzfVarA.o("FiMultiSync__enable_grpc_to_tycho_for_fi_multi_sync_status", false);
        c = dzzfVarA.o("FiMultiSync__log_fi_multi_device_sync_sign_out", false);
        d = dzzfVarA.o("FiMultiSync__remove_unnecessary_grpc_to_tycho", false);
    }

    @Override // defpackage.fazl
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fazl
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fazl
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fazl
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }
}

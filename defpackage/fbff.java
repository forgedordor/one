package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbff implements fbfe {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.m("max_token_validity_window_in_millis", 604800000L);
        b = dzzfVarB.m("token_expiry_window_in_millis", 3600000L);
    }

    @Override // defpackage.fbfe
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbfe
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}

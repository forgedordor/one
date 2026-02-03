package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfl implements fbfk {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.m("incoming_typing_indicator_expiry_ms", 60000L);
        b = dzzfVarB.m("typing_indicators_max_typers", 5L);
        c = dzzfVarB.m("typing_indicator_timeout_ms", 5000L);
    }

    @Override // defpackage.fbfk
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbfk
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbfk
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}

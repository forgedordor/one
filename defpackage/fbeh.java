package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbeh implements fbeg {
    public static final dzzh a;
    public static final dzzh b;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        dzzfVarB.m("delay_to_pull_messages_if_stream_open_millis", 3000L);
        dzzfVarB.m("minimum_pull_period_seconds", 60L);
        a = dzzfVarB.m("stop_stream_grace_period_ms", 15000L);
        b = dzzfVarB.m("stream_check_interval_millis", 30000L);
    }

    @Override // defpackage.fbeg
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbeg
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}

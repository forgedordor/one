package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fben implements fbem {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;
    public static final dzzh e;
    public static final dzzh f;
    public static final dzzh g;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.m("ack_batch_time_ms", 3000L);
        b = dzzfVarB.m("block_list_refresh_interval_millis", 86400000L);
        dzzfVarB.m("conversation_properties_freshness_interval_millis", 86400000L);
        dzzfVarB.m("conversation_properties_refresh_jitter_millis", 7200000L);
        c = dzzfVarB.o("enable_conversation_profile_fallback", false);
        d = dzzfVarB.o("enable_get_open_conversation", false);
        e = dzzfVarB.o("enable_message_snippet_fallback", false);
        f = dzzfVarB.o("enable_periodic_pull_messages", false);
        g = dzzfVarB.m("sending_message_time_offset_ms", 30000L);
        dzzfVarB.o("should_handle_read_notifications", false);
        dzzfVarB.m("stale_sending_time_ms", 180000L);
    }

    @Override // defpackage.fbem
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbem
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbem
    public final long c() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.fbem
    public final boolean d() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fbem
    public final boolean e() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.fbem
    public final boolean f() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.fbem
    public final boolean g() {
        return ((Boolean) f.b()).booleanValue();
    }
}

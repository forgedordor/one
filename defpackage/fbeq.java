package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbeq implements fbep {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.m("default_blocks_query_limit", 40L);
        dzzfVarB.m("default_message_query_limit", 40L);
        dzzfVarB.o("enable_store_deleted_conversations_in_db", false);
        dzzfVarB.m("filtered_query_batch_multiplier", 1L);
        dzzfVarB.m("fixed_filtered_query_batch_size", 15L);
        b = dzzfVarB.m("monitor_cache_size_support_0", 0L);
        c = dzzfVarB.o("registration_execute_in_transaction_fix", true);
    }

    @Override // defpackage.fbep
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbep
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbep
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }
}

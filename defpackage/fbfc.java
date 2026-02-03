package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfc implements fbfb {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.lighter.android")).a().b();
        a = dzzfVarB.m("delivery_receipt_retry_time_ms", 900000L);
        b = dzzfVarB.m("max_stale_receipt_retry_time_ms", 3600000L);
        c = dzzfVarB.m("receipt_batch_time_ms", 3000L);
    }

    @Override // defpackage.fbfb
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbfb
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fbfb
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}

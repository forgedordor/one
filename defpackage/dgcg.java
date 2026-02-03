package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgcg {
    public final dbho a;
    public final dbho b;
    public final dbho c;
    public final dbho d;
    private final dbhq e;

    public dgcg(String str) {
        dbhq dbhqVar = new dbhq(str);
        this.e = dbhqVar;
        this.a = new dbhm(dbhqVar, "retries", 0);
        this.b = new dbhm(dbhqVar, "throttle_counter", 0);
        this.c = new dbhj(dbhqVar, "last_throttle_counter_reset_timestamp", 0L);
        this.d = new dbhk(dbhqVar, "last_registration_engine_id", "");
    }

    public final long a() {
        return ((Long) this.c.d()).longValue();
    }

    public final void b(int i) {
        this.a.e(Integer.valueOf(i));
    }

    public final void c(int i) {
        this.b.e(Integer.valueOf(i));
    }
}

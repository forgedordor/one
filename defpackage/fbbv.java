package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbbv implements fbbt {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;
    public static final dzzh e;
    public static final dzzh f;
    public static final dzzh g;
    public static final dzzh h;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.android.gms.icing.mdd")).c().b();
        dzzfVarB.m("PeriodicTaskFlags__cellular_charging_gcm_task_cadence", 5L);
        dzzfVarB.o("PeriodicTaskFlags__cellular_charging_gcm_task_enabled", true);
        a = dzzfVarB.m("cellular_charging_gcm_task_period", 21600L);
        b = dzzfVarB.p("cellular_task_constraint_overrides", new dzze() { // from class: fbbu
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtnf) evsn.parseFrom(dtnf.a, bArr);
            }
        }, "CAEQARgA");
        dzzfVarB.m("PeriodicTaskFlags__charging_gcm_task_cadence", 5L);
        dzzfVarB.o("PeriodicTaskFlags__charging_gcm_task_enabled", true);
        c = dzzfVarB.m("charging_gcm_task_period", 21600L);
        dzzfVarB.m("PeriodicTaskFlags__maintenance_gcm_task_cadence", 0L);
        dzzfVarB.o("PeriodicTaskFlags__maintenance_gcm_task_enabled", true);
        d = dzzfVarB.m("maintenance_gcm_task_period", 86400L);
        e = dzzfVarB.p("maintenance_task_constraint_overrides", new dzze() { // from class: fbbu
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtnf) evsn.parseFrom(dtnf.a, bArr);
            }
        }, "CAEQARgA");
        f = dzzfVarB.p("routine_task_constraint_overrides", new dzze() { // from class: fbbu
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtnf) evsn.parseFrom(dtnf.a, bArr);
            }
        }, "CAEQARgA");
        dzzfVarB.m("PeriodicTaskFlags__wifi_charging_gcm_task_cadence", 5L);
        dzzfVarB.o("PeriodicTaskFlags__wifi_charging_gcm_task_enabled", true);
        g = dzzfVarB.m("wifi_charging_gcm_task_period", 21600L);
        h = dzzfVarB.p("wifi_task_constraint_overrides", new dzze() { // from class: fbbu
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtnf) evsn.parseFrom(dtnf.a, bArr);
            }
        }, "CAEQARgA");
    }

    @Override // defpackage.fbbt
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fbbt
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fbbt
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fbbt
    public final long d() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.fbbt
    public final dtnf e() {
        return (dtnf) b.b();
    }

    @Override // defpackage.fbbt
    public final dtnf f() {
        return (dtnf) e.b();
    }

    @Override // defpackage.fbbt
    public final dtnf g() {
        return (dtnf) f.b();
    }

    @Override // defpackage.fbbt
    public final dtnf h() {
        return (dtnf) h.b();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qka extends pdn {
    public qka(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pdn
    protected final /* synthetic */ void b(pkl pklVar, Object obj) {
        qjn qjnVar = (qjn) obj;
        pklVar.g(1, qjnVar.c);
        pklVar.e(2, qkr.c(qjnVar.d));
        pklVar.g(3, qjnVar.e);
        pklVar.g(4, qjnVar.f);
        pzs pzsVar = qjnVar.g;
        pzs pzsVar2 = pzs.a;
        pklVar.c(5, pzo.a(pzsVar));
        pklVar.c(6, pzo.a(qjnVar.h));
        pklVar.e(7, qjnVar.i);
        pklVar.e(8, qjnVar.j);
        pklVar.e(9, qjnVar.k);
        pklVar.e(10, qjnVar.m);
        pklVar.e(11, qkr.a(qjnVar.n));
        pklVar.e(12, qjnVar.o);
        pklVar.e(13, qjnVar.p);
        pklVar.e(14, qjnVar.q);
        pklVar.e(15, qjnVar.r);
        pklVar.e(16, qjnVar.s ? 1L : 0L);
        pklVar.e(17, qkr.b(qjnVar.t));
        pklVar.e(18, qjnVar.u);
        pklVar.e(19, qjnVar.v);
        pklVar.e(20, qjnVar.w);
        pklVar.e(21, qjnVar.x);
        pklVar.e(22, qjnVar.y);
        String str = qjnVar.z;
        if (str == null) {
            pklVar.f(23);
        } else {
            pklVar.g(23, str);
        }
        Boolean bool = qjnVar.A;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            pklVar.f(24);
        } else {
            pklVar.e(24, r0.intValue());
        }
        pzj pzjVar = qjnVar.l;
        pklVar.e(25, qkr.k(pzjVar.j));
        pklVar.c(26, qkr.i(pzjVar.b));
        pklVar.e(27, pzjVar.c ? 1L : 0L);
        pklVar.e(28, pzjVar.d ? 1L : 0L);
        pklVar.e(29, pzjVar.e ? 1L : 0L);
        pklVar.e(30, pzjVar.f ? 1L : 0L);
        pklVar.e(31, pzjVar.g);
        pklVar.e(32, pzjVar.h);
        pklVar.c(33, qkr.j(pzjVar.i));
    }

    @Override // defpackage.pfn
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}

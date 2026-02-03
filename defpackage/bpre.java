package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpre extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bprd(this);
    }

    public final void b(String str) {
        ap(new dqpj("generic_worker_queue._id", 1, String.valueOf(str)));
    }

    public final void c(String... strArr) {
        ap(new dqpm("generic_worker_queue._id", 3, au(strArr), false));
    }

    public final void d(boolean z) {
        ap(new dqty("generic_worker_queue.in_flight", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void e() {
        int iIntValue = bprf.c().intValue();
        if (iIntValue < 34000) {
            dqru.x("next_execute_timestamp", iIntValue);
        }
        ap(new dqty("generic_worker_queue.next_execute_timestamp", 7, 0L));
    }

    public final void f(long j) {
        int iIntValue = bprf.c().intValue();
        if (iIntValue < 34000) {
            dqru.x("next_execute_timestamp", iIntValue);
        }
        ap(new dqty("generic_worker_queue.next_execute_timestamp", 10, Long.valueOf(j)));
    }

    public final void g(int i) {
        ap(new dqty("generic_worker_queue.retry_count", 9, Integer.valueOf(i)));
    }

    public final void h(int i) {
        ap(new dqty("generic_worker_queue.retry_count", 8, Integer.valueOf(i)));
    }

    public final void i(int i) {
        ap(new dqty("generic_worker_queue.retry_count", 10, Integer.valueOf(i)));
    }

    public final void j(int i) {
        ap(new dqty("generic_worker_queue.worker_type", 1, Integer.valueOf(i)));
    }

    public final void k(int... iArr) {
        ap(new dqpm("generic_worker_queue.worker_type", 3, at(iArr), true));
    }
}

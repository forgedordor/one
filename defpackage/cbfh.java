package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfh extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new cbfg(this);
    }

    public final void b(Iterable iterable) {
        int iIntValue = cbfi.c().intValue();
        if (iIntValue < 42050) {
            dqru.x("deduplication_tag", iIntValue);
        }
        ap(new dqpm("work_queue.deduplication_tag", 4, as(iterable), false));
    }

    public final void c(long j) {
        ap(new dqty("work_queue._id", 1, Long.valueOf(j)));
    }

    public final void d(Iterable iterable) {
        ap(new dqpm("work_queue._id", 3, as(iterable), true));
    }

    public final void e(Date date) {
        int iIntValue = cbfi.c().intValue();
        if (iIntValue < 46070) {
            dqru.x("minimum_start_time", iIntValue);
        }
        ap(new dqpj("work_queue.minimum_start_time", 8, Long.valueOf(barp.a(date))));
    }

    public final void f(Date date) {
        int iIntValue = cbfi.c().intValue();
        if (iIntValue < 46070) {
            dqru.x("minimum_start_time", iIntValue);
        }
        ap(new dqpj("work_queue.minimum_start_time", 10, Long.valueOf(barp.a(date))));
    }

    public final void g(String str) {
        int iIntValue = cbfi.c().intValue();
        if (iIntValue < 41030) {
            dqru.x("queue", iIntValue);
        }
        ap(new dqpj("work_queue.queue", 1, String.valueOf(str)));
    }

    public final void h(Iterable iterable) {
        int iIntValue = cbfi.c().intValue();
        if (iIntValue < 41030) {
            dqru.x("queue", iIntValue);
        }
        ap(new dqpm("work_queue.queue", 3, as(iterable), false));
    }

    public final void i(String str) {
        ap(new dqpj("work_queue.type", 1, String.valueOf(str)));
    }
}

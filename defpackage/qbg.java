package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbg extends qbt {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbg(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        this.c.b(timeUnit.toMillis(j));
    }

    @Override // defpackage.qbt
    public final /* bridge */ /* synthetic */ qbu a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        if (this.c.s) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new qbh(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbg(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        timeUnit.getClass();
        timeUnit2.getClass();
        this.c.c(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbg(Class cls, Duration duration) {
        super(cls);
        duration.getClass();
        this.c.b(duration.toMillis());
    }
}

package defpackage;

import defpackage.koe;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esdy extends koe implements ScheduledFuture {
    private final ScheduledFuture c;

    public esdy(esdx esdxVar) {
        this.c = esdxVar.a(new esdw(this));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // defpackage.koe
    protected final void e() {
        Object obj = this.value;
        boolean z = false;
        if ((obj instanceof koe.b) && ((koe.b) obj).c) {
            z = true;
        }
        this.c.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }
}

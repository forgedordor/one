package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eosz extends eoqs {
    public ListenableFuture a;
    public ScheduledFuture b;

    public eosz(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    @Override // defpackage.eooi
    protected final String gu() {
        ListenableFuture listenableFuture = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (listenableFuture == null) {
            return null;
        }
        String strB = a.b(listenableFuture, "inputFuture=[", "]");
        if (scheduledFuture == null) {
            return strB;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strB;
        }
        return strB + ", remaining delay=[" + delay + " ms]";
    }

    @Override // defpackage.eooi
    protected final void gv() {
        m(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}

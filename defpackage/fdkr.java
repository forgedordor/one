package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdkr implements fdks {
    private final Future a;

    public fdkr(Future future) {
        this.a = future;
    }

    @Override // defpackage.fdks
    public final void hz() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}

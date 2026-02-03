package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdio implements fdiq {
    private final Future a;

    public fdio(Future future) {
        this.a = future;
    }

    @Override // defpackage.fdiq
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + "]";
    }
}

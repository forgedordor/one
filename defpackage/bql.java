package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bql extends bqo {
    private final Throwable a;

    public bql(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.bqo, java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        throw new ExecutionException(this.a);
    }

    public final String toString() {
        return super.toString() + "[status=FAILURE, cause=[" + this.a + "]]";
    }
}

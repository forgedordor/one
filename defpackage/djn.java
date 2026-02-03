package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class djn extends CancellationException {
    public djn() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(djo.a);
        return this;
    }
}

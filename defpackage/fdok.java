package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdok {
    public static final void a(fdou fdouVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = fdle.a("Channel was consumed, consumer had failed", th);
            }
        }
        fdouVar.t(cancellationExceptionA);
    }
}

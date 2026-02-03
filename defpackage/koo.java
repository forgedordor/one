package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koo {
    public static final Object a(ListenableFuture listenableFuture, fcxy fcxyVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return koe.c(listenableFuture);
            }
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            listenableFuture.b(new koq(listenableFuture, fdiuVar), kom.a);
            fdiuVar.d(new kon(listenableFuture));
            return fdiuVar.m();
        } catch (ExecutionException e) {
            throw b(e);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}

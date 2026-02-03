package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfc {
    public static final String a = qas.d("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, qaq qaqVar, fcxy fcxyVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return b(listenableFuture);
            }
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            listenableFuture.b(new qdg(listenableFuture, fdiuVar), pzx.a);
            fdiuVar.d(new qfb(qaqVar, listenableFuture));
            return fdiuVar.m();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}

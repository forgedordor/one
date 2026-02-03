package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcrw {
    public static final fbnb a;
    private static final Logger b = Logger.getLogger(fcrw.class.getName());

    static {
        if (!ejwk.c(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new fbnb("internal-stub-type", null);
    }

    private fcrw() {
    }

    public static ListenableFuture a(fbnh fbnhVar, Object obj) {
        fcrr fcrrVar = new fcrr(fbnhVar);
        b(fbnhVar, obj, new fcrv(fcrrVar));
        return fcrrVar;
    }

    public static void b(fbnh fbnhVar, Object obj, fcrs fcrsVar) {
        fbnhVar.a(fcrsVar, new fbrg());
        fcrsVar.e();
        try {
            fbnhVar.f(obj);
            fbnhVar.d();
        } catch (Error | RuntimeException e) {
            throw c(fbnhVar, e);
        }
    }

    private static RuntimeException c(fbnh fbnhVar, Throwable th) {
        try {
            fbnhVar.c(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esoy implements esrw {
    private static final fbrb a;
    private ListenableFuture b;
    private final esox c;

    static {
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        a = new fbqw("X-Goog-Spatula", fbqxVar);
    }

    public esoy(esox esoxVar) {
        this.c = esoxVar;
    }

    @Override // defpackage.esrw
    public final estb a(esrs esrsVar) {
        try {
            esrsVar.a.h(a, (String) eork.q(this.b));
            return estb.a;
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return estb.b(code.a().d(e.getCause()).withDescription("Could not retrieve spatula header"), new fbrg());
        }
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        eieu eieuVarK = eiiy.k("AsyncSpatulaInterceptor#headerFuture");
        try {
            ListenableFuture listenableFutureA = drgi.a(((dbra) this.c.a.b()).a());
            eieuVarK.b(listenableFutureA);
            this.b = listenableFutureA;
            estb estbVarC = estb.c(listenableFutureA);
            eieuVarK.close();
            return estbVarC;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb e() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void d(esrr esrrVar) {
    }
}

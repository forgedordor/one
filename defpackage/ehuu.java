package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehuu implements esrw {
    final /* synthetic */ ehuy a;
    final /* synthetic */ efwo b;
    private ListenableFuture c;

    public ehuu(ehuy ehuyVar, efwo efwoVar) {
        this.a = ehuyVar;
        this.b = efwoVar;
    }

    @Override // defpackage.esrw
    public final estb a(esrs esrsVar) {
        try {
            return new estb(1, null, null, esrsVar.b.f(esoi.a, (esoi) eork.q(this.c)));
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return estb.b(code.a().d(e).withDescription("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(this.b)))), new fbrg());
        }
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        ejwl.m(esrsVar.b.h(esoi.a) == null, "xrpc AuthContext should not be set on a TikTok RPC stub");
        ListenableFuture listenableFutureC = this.a.a.c();
        this.c = listenableFutureC;
        return estb.c(listenableFutureC);
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

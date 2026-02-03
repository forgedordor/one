package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehud implements esrw {
    private ListenableFuture a;

    static {
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        new fbqw("Authorization", fbqxVar);
        new fbqw("X-Auth-Time", fbrg.c);
    }

    @Override // defpackage.esrw
    public final estb a(esrs esrsVar) {
        try {
            throw null;
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNKNOWN;
            List list = Status.a;
            return estb.b(code.a().d(e.getCause()).withDescription("Could not obtain auth token"), new fbrg());
        }
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        fbnc fbncVar = esrsVar.b;
        ListenableFuture listenableFuture = (ListenableFuture) fbncVar.h(ehtx.a);
        fbnc fbncVarF = fbncVar.f(esor.a, new esor());
        if (listenableFuture == null) {
            return new estb(1, null, null, fbncVarF);
        }
        this.a = listenableFuture;
        listenableFuture.getClass();
        return new estb(4, null, listenableFuture, fbncVarF);
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

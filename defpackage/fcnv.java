package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcnv extends fbsl {
    final /* synthetic */ fdlr a;
    final /* synthetic */ fdoa b;
    final /* synthetic */ fbsm c;
    final /* synthetic */ fcnq d;
    private boolean e = true;

    public fcnv(fdlr fdlrVar, fdoa fdoaVar, fbsm fbsmVar, fcnq fcnqVar) {
        this.a = fdlrVar;
        this.b = fdoaVar;
        this.c = fbsmVar;
        this.d = fcnqVar;
    }

    @Override // defpackage.fbsl
    public final void a() {
        fdlw.e(this.a, "Cancellation received from client", null);
    }

    @Override // defpackage.fbsl
    public final void c() {
        this.b.e(null);
    }

    @Override // defpackage.fbsl
    public final void d(Object obj) throws StatusException {
        if (this.e) {
            Object objB = this.b.b(obj);
            this.e = fdog.c(objB);
            if (objB instanceof fdof) {
                Throwable thB = fdog.b(objB);
                if (!(thB instanceof CancellationException)) {
                    throw Status.o.withDescription("onMessage should never be called when requestsChannel is unready").d(thB).asException();
                }
            }
        }
        if (this.e) {
            return;
        }
        this.c.g(1);
    }

    @Override // defpackage.fbsl
    public final void e() throws Throwable {
        this.d.b();
    }
}

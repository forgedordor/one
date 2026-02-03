package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcnc extends fbng {
    final /* synthetic */ fdoa a;
    final /* synthetic */ fcnq b;

    public fcnc(fdoa fdoaVar, fcnq fcnqVar) {
        this.a = fdoaVar;
        this.b = fcnqVar;
    }

    @Override // defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        status.getClass();
        fbrgVar.getClass();
        this.a.e(status.f() ? null : new StatusException(status, fbrgVar));
    }

    @Override // defpackage.fbng
    public final void c(Object obj) throws Throwable {
        Object objB = this.a.b(obj);
        if (objB instanceof fdof) {
            Throwable thB = fdog.b(objB);
            if (thB != null) {
                throw thB;
            }
            throw new AssertionError("onMessage should never be called until responses is ready");
        }
    }

    @Override // defpackage.fbng
    public final void d() throws Throwable {
        this.b.b();
    }
}

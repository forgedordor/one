package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esqp extends fbou {
    final /* synthetic */ esqq a;
    private fbrg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esqp(esqq esqqVar, fbng fbngVar) {
        super(fbngVar);
        this.a = esqqVar;
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        Status.Code code = status.getCode();
        if (!code.equals(Status.Code.UNAUTHENTICATED) && !code.equals(Status.Code.PERMISSION_DENIED)) {
            fbrg fbrgVar2 = this.b;
            if (fbrgVar2 != null) {
                this.f.b(fbrgVar2);
                this.b = null;
            }
            this.f.a(status, fbrgVar);
            return;
        }
        esqq esqqVar = this.a;
        synchronized (esqqVar.a) {
            esqqVar.c = esqqVar.d.a(esqqVar.e, esqqVar.f.f(esok.a, true));
            Iterator it = esqqVar.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void b(fbrg fbrgVar) {
        this.b = fbrgVar;
    }

    @Override // defpackage.fbov, defpackage.fbng
    public final void c(Object obj) {
        fbrg fbrgVar = this.b;
        if (fbrgVar != null) {
            this.f.b(fbrgVar);
            this.b = null;
        }
        this.f.c(obj);
    }
}

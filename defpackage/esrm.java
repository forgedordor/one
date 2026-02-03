package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esrm implements eora {
    final /* synthetic */ fbng a;
    final /* synthetic */ esrn b;

    public esrm(esrn esrnVar, fbng fbngVar) {
        this.a = fbngVar;
        this.b = esrnVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fbnh fbnhVar = (fbnh) obj;
        try {
            esrn esrnVar = this.b;
            esrnVar.b = fbnhVar;
            Iterator it = esrnVar.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } catch (Throwable th) {
            hi(th);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.b.d = true;
        this.a.a(Status.c(th), new fbrg());
    }
}

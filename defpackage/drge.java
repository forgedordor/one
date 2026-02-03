package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drge implements eora {
    final /* synthetic */ defr a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ deep c;

    public drge(defr defrVar, ListenableFuture listenableFuture, deep deepVar) {
        this.a = defrVar;
        this.b = listenableFuture;
        this.c = deepVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.a.b(obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (this.b.isCancelled()) {
            this.c.a();
        } else if (th instanceof Exception) {
            this.a.a((Exception) th);
        } else {
            this.a.a(new ExecutionException(th));
        }
    }
}

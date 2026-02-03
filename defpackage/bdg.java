package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdg implements bpu {
    final /* synthetic */ kog a;
    final /* synthetic */ ListenableFuture b;

    public bdg(kog kogVar, ListenableFuture listenableFuture) {
        this.a = kogVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        if (th instanceof bdl) {
            lcg.c(this.b.cancel(false));
        } else {
            lcg.c(this.a.b(null));
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        lcg.c(this.a.b(null));
    }
}

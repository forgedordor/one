package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzy implements bpu {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cad c;

    public bzy(cad cadVar, ListenableFuture listenableFuture, boolean z) {
        this.c = cadVar;
        this.a = listenableFuture;
        this.b = z;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        bbs.d("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cad cadVar = this.c;
        if (this.a != cadVar.d || cadVar.g == 3) {
            return;
        }
        cadVar.r(true != this.b ? 2 : 1);
    }
}

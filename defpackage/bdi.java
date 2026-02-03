package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdi implements bpu {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ kog b;
    final /* synthetic */ String c;

    public bdi(ListenableFuture listenableFuture, kog kogVar, String str) {
        this.a = listenableFuture;
        this.b = kogVar;
        this.c = str;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            lcg.c(this.b.c(new bdl(this.c.concat(" cancelled."), th)));
        } else {
            this.b.b(null);
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bqk.j(this.a, this.b);
    }
}

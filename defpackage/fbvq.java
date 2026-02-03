package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvq implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ fbvr c;

    public fbvq(fbvr fbvrVar, String str, ListenableFuture listenableFuture) {
        this.a = str;
        this.b = listenableFuture;
        this.c = fbvrVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.c.b.remove(this.a, this.b);
    }
}

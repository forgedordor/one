package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eota extends eory {
    final /* synthetic */ eotc a;
    private final eooy b;

    public eota(eotc eotcVar, eooy eooyVar) {
        this.a = eotcVar;
        eooyVar.getClass();
        this.b = eooyVar;
    }

    @Override // defpackage.eory
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture listenableFutureA = this.b.a();
        listenableFutureA.getClass();
        return listenableFutureA;
    }

    @Override // defpackage.eory
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.eory
    public final void d(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.eory
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.o((ListenableFuture) obj);
    }

    @Override // defpackage.eory
    public final boolean g() {
        return this.a.isDone();
    }
}

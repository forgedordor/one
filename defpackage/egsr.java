package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsr implements egsu {
    private final qmy a;
    private final qbr b;

    public egsr(qmy qmyVar, qbr qbrVar) {
        this.a = qmyVar;
        this.b = qbrVar;
    }

    @Override // defpackage.egsu
    public final ListenableFuture a(String str) {
        return this.a.a();
    }

    @Override // defpackage.egsu
    public final ListenableFuture b(String str) {
        return this.a.b();
    }

    @Override // defpackage.egsu
    public final ListenableFuture c(UUID uuid) {
        return this.a.c();
    }

    @Override // defpackage.egsu
    public final ListenableFuture d(qbu qbuVar) {
        return this.a.d();
    }

    @Override // defpackage.egsu
    public final ListenableFuture e(String str, pzy pzyVar, qbh qbhVar) {
        return this.a.e();
    }

    @Override // defpackage.egsu
    public final /* synthetic */ ListenableFuture f(String str, pzz pzzVar, qav qavVar) {
        return egst.a(this, str, pzzVar, qavVar);
    }

    @Override // defpackage.egsu
    public final ListenableFuture g(String str, pzz pzzVar, List list) {
        return this.a.f();
    }

    @Override // defpackage.egsu
    public final ListenableFuture h(qbs qbsVar) {
        return this.a.g();
    }

    @Override // defpackage.egsu
    public final ListenableFuture i() {
        return egst.b(((qbb) this.b.i()).c);
    }
}

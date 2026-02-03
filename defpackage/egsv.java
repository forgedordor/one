package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsv implements egsu {
    private final qbr a;

    public egsv(qbr qbrVar) {
        this.a = qbrVar;
    }

    @Override // defpackage.egsu
    public final ListenableFuture a(String str) {
        return egst.b(((qbb) this.a.a(str)).c);
    }

    @Override // defpackage.egsu
    public final ListenableFuture b(String str) {
        return egst.b(((qbb) this.a.b(str)).c);
    }

    @Override // defpackage.egsu
    public final ListenableFuture c(UUID uuid) {
        return egst.b(((qbb) this.a.c(uuid)).c);
    }

    @Override // defpackage.egsu
    public final ListenableFuture d(qbu qbuVar) {
        return egst.b(((qbb) this.a.d(qbuVar)).c);
    }

    @Override // defpackage.egsu
    public final ListenableFuture e(String str, pzy pzyVar, qbh qbhVar) {
        return egst.b(((qbb) this.a.f(str, pzyVar, qbhVar)).c);
    }

    @Override // defpackage.egsu
    public final /* synthetic */ ListenableFuture f(String str, pzz pzzVar, qav qavVar) {
        return egst.a(this, str, pzzVar, qavVar);
    }

    @Override // defpackage.egsu
    public final ListenableFuture g(String str, pzz pzzVar, List list) {
        return egst.b(((qbb) this.a.h(str, pzzVar, list)).c);
    }

    @Override // defpackage.egsu
    public final ListenableFuture h(qbs qbsVar) {
        return this.a.l(qbsVar);
    }

    @Override // defpackage.egsu
    public final ListenableFuture i() {
        return egst.b(((qbb) this.a.i()).c);
    }
}

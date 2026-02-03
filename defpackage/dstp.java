package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstp implements ehlj {
    private final dssy a;

    public dstp(dssy dssyVar) {
        this.a = dssyVar;
    }

    @Override // defpackage.ehlj
    public final ListenableFuture a() {
        ListenableFuture listenableFutureA = this.a.a();
        egoc.d("com/google/android/libraries/internal/growth/growthkit/tiktok/GrowthKitStartupAfterPackageReplacedListener", "onStartupAfterPackageReplaced", 23, listenableFutureA, "Failed to start GrowthKit after package replaced", new Object[0]);
        return listenableFutureA;
    }
}

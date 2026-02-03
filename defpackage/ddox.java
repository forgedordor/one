package defpackage;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddox extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ defr a;
    final /* synthetic */ ILocationCallback b;

    public ddox(defr defrVar, ILocationCallback iLocationCallback) {
        this.a = defrVar;
        this.b = iLocationCallback;
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
        dcjb.a(fusedLocationProviderResult.a, this.a);
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onRequestRemoved() {
        this.b.onRemoved();
    }
}

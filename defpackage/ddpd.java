package defpackage;

import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpd extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ defr a;
    final /* synthetic */ ILocationListener b;

    public ddpd(defr defrVar, ILocationListener iLocationListener) {
        this.a = defrVar;
        this.b = iLocationListener;
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

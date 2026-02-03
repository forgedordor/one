package defpackage;

import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpc extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ Object a;
    final /* synthetic */ defr b;

    public ddpc(Object obj, defr defrVar) {
        this.a = obj;
        this.b = defrVar;
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
        dcjb.b(fusedLocationProviderResult.a, this.a, this.b);
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onRequestRemoved() {
    }
}

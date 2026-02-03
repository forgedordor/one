package defpackage;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddql extends IOnMapReadyCallback.Stub {
    final /* synthetic */ ddqq a;

    public ddql(ddqq ddqqVar) {
        this.a = ddqqVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMapReadyCallback
    public final void onMapReady(IGoogleMapDelegate iGoogleMapDelegate) {
        this.a.H(new ddqj(iGoogleMapDelegate));
    }
}

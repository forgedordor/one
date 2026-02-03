package defpackage;

import com.google.android.gms.wearable.internal.GetFdForAssetResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dets extends deto {
    public dets(dcgq dcgqVar) {
        super(dcgqVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse) {
        a(new deqv(detm.a(getFdForAssetResponse.a), getFdForAssetResponse.b));
    }
}

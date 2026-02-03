package defpackage;

import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detp extends deto {
    public detp(dcgq dcgqVar) {
        super(dcgqVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse) {
        a(new dequ(detm.a(deleteDataItemsResponse.a), deleteDataItemsResponse.b));
    }
}

package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deqs extends dept {
    final /* synthetic */ Asset a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deqs(dcfq dcfqVar, Asset asset) {
        super(dcfqVar);
        this.a = asset;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dcfx a(Status status) {
        return new deqv(status, null);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ((IWearableService) ((dety) dcevVar).w()).getFdForAsset(new dets(this), this.a);
    }
}

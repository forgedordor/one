package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deqp extends dept {
    public deqp(dcfq dcfqVar) {
        super(dcfqVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dcfx a(Status status) {
        return new denx(new DataHolder(DataHolder.a, status.g));
    }

    @Override // defpackage.dcgp
    protected final /* synthetic */ void b(dcev dcevVar) {
        ((IWearableService) ((dety) dcevVar).w()).getDataItems(new detr(this));
    }
}

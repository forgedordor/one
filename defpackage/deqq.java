package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deqq extends dept {
    final /* synthetic */ Uri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deqq(dcfq dcfqVar, Uri uri) {
        super(dcfqVar);
        this.a = uri;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dcfx a(Status status) {
        return new denx(new DataHolder(DataHolder.a, status.g));
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ((IWearableService) ((dety) dcevVar).w()).getDataItemsByUriFilter(new detr(this), this.a, 0);
    }
}

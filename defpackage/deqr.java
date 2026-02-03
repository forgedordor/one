package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deqr extends dept {
    final /* synthetic */ Uri a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deqr(dcfq dcfqVar, Uri uri, int i) {
        super(dcfqVar);
        this.a = uri;
        this.h = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dcfx a(Status status) {
        return new dequ(status, 0);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ((IWearableService) ((dety) dcevVar).w()).deleteDataItemsByUriFilter(new detp(this), this.a, this.h);
    }
}

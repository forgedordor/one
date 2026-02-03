package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class desq extends dept {
    final /* synthetic */ String a;
    final /* synthetic */ String h;
    final /* synthetic */ byte[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public desq(dcfq dcfqVar, String str, String str2, byte[] bArr) {
        super(dcfqVar);
        this.a = str;
        this.h = str2;
        this.i = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dcfx a(Status status) {
        return new desr(status, -1);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ((IWearableService) ((dety) dcevVar).w()).sendMessage(new detv(this), this.a, this.h, this.i);
    }
}

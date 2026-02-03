package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.ChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deqb extends dept {
    final /* synthetic */ ChannelImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deqb(ChannelImpl channelImpl, dcfq dcfqVar) {
        super(dcfqVar);
        this.a = channelImpl;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ dcfx a(Status status) {
        return new deqc(status, null);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ChannelStreamCallbacks channelStreamCallbacks = new ChannelStreamCallbacks();
        ((IWearableService) ((dety) dcevVar).w()).getChannelOutputStream(new detq(this, channelStreamCallbacks), channelStreamCallbacks, this.a.a);
    }
}

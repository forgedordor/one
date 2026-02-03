package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.ChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detq extends deto {
    private final ChannelStreamCallbacks a;

    public detq(dcgq dcgqVar, ChannelStreamCallbacks channelStreamCallbacks) {
        super(dcgqVar);
        this.a = channelStreamCallbacks;
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        deqf deqfVar;
        ParcelFileDescriptor parcelFileDescriptor = getChannelOutputStreamResponse.b;
        if (parcelFileDescriptor != null) {
            deqfVar = new deqf(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor));
            this.a.setListener(new deqe(deqfVar));
        } else {
            deqfVar = null;
        }
        a(new deqc(new Status(getChannelOutputStreamResponse.a), deqfVar));
    }
}

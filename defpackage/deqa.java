package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        ChannelImpl channelImpl = null;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                channelImpl = (ChannelImpl) dclv.n(parcel, i, ChannelImpl.CREATOR);
            } else if (iD == 3) {
                iF = dclv.f(parcel, i);
            } else if (iD == 4) {
                iF3 = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iF2 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ChannelEventParcelable(channelImpl, iF, iF3, iF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dena implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 4) {
                timeInterval = (TimeInterval) dclv.n(parcel, i, TimeInterval.CREATOR);
            } else if (iD == 5) {
                uriData = (UriData) dclv.n(parcel, i, UriData.CREATOR);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                uriData2 = (UriData) dclv.n(parcel, i, UriData.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new WalletObjectMessage(strT, strT2, timeInterval, uriData, uriData2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}

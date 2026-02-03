package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        UserAddress userAddress = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT3 = dclv.t(parcel, i);
            } else if (iD == 4) {
                iF = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                userAddress = (UserAddress) dclv.n(parcel, i, UserAddress.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CardInfo(strT, strT2, strT3, iF, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}

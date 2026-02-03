package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String strT2 = null;
        Bundle bundleK = null;
        String strT3 = null;
        Bundle bundleK2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    cardInfo = (CardInfo) dclv.n(parcel, i, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) dclv.n(parcel, i, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) dclv.n(parcel, i, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 7:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 8:
                    bundleK2 = dclv.k(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PaymentData(strT, cardInfo, userAddress, paymentMethodToken, strT2, bundleK, strT3, bundleK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}

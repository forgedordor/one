package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.ProxyCard;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        ProxyCard proxyCard = null;
        String strT3 = null;
        Address address = null;
        Address address2 = null;
        String[] strArrK = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    proxyCard = (ProxyCard) dclv.n(parcel, i, ProxyCard.CREATOR);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    address = (Address) dclv.n(parcel, i, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) dclv.n(parcel, i, Address.CREATOR);
                    break;
                case 8:
                    strArrK = dclv.K(parcel, i);
                    break;
                case 9:
                    userAddress = (UserAddress) dclv.n(parcel, i, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) dclv.n(parcel, i, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) dclv.J(parcel, i, InstrumentInfo.CREATOR);
                    break;
                case 12:
                    paymentMethodToken = (PaymentMethodToken) dclv.n(parcel, i, PaymentMethodToken.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new FullWallet(strT, strT2, proxyCard, strT3, address, address2, strArrK, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWallet[i];
    }
}

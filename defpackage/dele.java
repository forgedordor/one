package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dele implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        Cart cart = null;
        CountrySpecification[] countrySpecificationArr = null;
        ArrayList arrayListZ = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayListW = null;
        String strT5 = null;
        boolean zD = true;
        boolean zD2 = true;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        boolean zD6 = false;
        boolean zD7 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 4:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 5:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 6:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 9:
                    cart = (Cart) dclv.n(parcel, i, Cart.CREATOR);
                    break;
                case 10:
                    zD6 = dclv.D(parcel, i);
                    break;
                case 11:
                    zD7 = dclv.D(parcel, i);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) dclv.J(parcel, i, CountrySpecification.CREATOR);
                    break;
                case 13:
                    zD = dclv.D(parcel, i);
                    break;
                case 14:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 15:
                    arrayListZ = dclv.z(parcel, i, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) dclv.n(parcel, i, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayListW = dclv.w(parcel, i);
                    break;
                case 18:
                    strT5 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new MaskedWalletRequest(strT, zD3, zD4, zD5, strT2, strT3, strT4, cart, zD6, zD7, countrySpecificationArr, zD, zD2, arrayListZ, paymentMethodTokenizationParameters, arrayListW, strT5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}

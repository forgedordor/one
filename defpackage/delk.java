package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList arrayListW = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String strT = null;
        byte[] bArrE = null;
        Bundle bundleK = null;
        boolean zD = true;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 2:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) dclv.n(parcel, i, CardRequirements.CREATOR);
                    break;
                case 4:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) dclv.n(parcel, i, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayListW = dclv.w(parcel, i);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) dclv.n(parcel, i, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) dclv.n(parcel, i, TransactionInfo.CREATOR);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    strT = dclv.t(parcel, i);
                    break;
                case 11:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 12:
                    bArrE = dclv.E(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PaymentDataRequest(zD2, zD3, cardRequirements, zD4, shippingAddressRequirements, arrayListW, paymentMethodTokenizationParameters, transactionInfo, zD, strT, bArrE, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Cart cart = null;
        String strT = null;
        String strT2 = null;
        byte[] bArrE = null;
        Bundle bundleK = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    cart = (Cart) dclv.n(parcel, i, Cart.CREATOR);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 6:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 7:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new WebPaymentDataRequest(cart, strT, strT2, bArrE, zD, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebPaymentDataRequest[i];
    }
}

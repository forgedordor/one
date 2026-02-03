package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWalletRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        Cart cart = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                cart = (Cart) dclv.n(parcel, i, Cart.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new FullWalletRequest(strT, strT2, cart);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWalletRequest[i];
    }
}

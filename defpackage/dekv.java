package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) dclv.n(parcel, i, LoyaltyWalletObject.CREATOR);
            } else if (iD == 3) {
                offerWalletObject = (OfferWalletObject) dclv.n(parcel, i, OfferWalletObject.CREATOR);
            } else if (iD == 4) {
                giftCardWalletObject = (GiftCardWalletObject) dclv.n(parcel, i, GiftCardWalletObject.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dekv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new dekv();
    LoyaltyWalletObject a;
    OfferWalletObject b;
    GiftCardWalletObject c;
    int d;

    CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.i(parcel, 5, this.d);
        dclw.c(parcel, iA);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
        this.c = giftCardWalletObject;
        this.d = i;
    }
}

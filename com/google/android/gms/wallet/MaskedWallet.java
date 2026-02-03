package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.dclw;
import defpackage.deld;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new deld();
    String a;
    String b;
    String[] c;
    String d;
    Address e;
    Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    UserAddress i;
    UserAddress j;
    InstrumentInfo[] k;

    private MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.C(parcel, 4, this.c);
        dclw.m(parcel, 5, this.d, false);
        dclw.k(parcel, 6, this.e, i, false);
        dclw.k(parcel, 7, this.f, i, false);
        dclw.E(parcel, 8, this.g, i);
        dclw.E(parcel, 9, this.h, i);
        dclw.k(parcel, 10, this.i, i, false);
        dclw.k(parcel, 11, this.j, i, false);
        dclw.E(parcel, 12, this.k, i);
        dclw.c(parcel, iA);
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = loyaltyWalletObjectArr;
        this.h = offerWalletObjectArr;
        this.i = userAddress;
        this.j = userAddress2;
        this.k = instrumentInfoArr;
    }
}

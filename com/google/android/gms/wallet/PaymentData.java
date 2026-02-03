package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.dclw;
import defpackage.delj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentData> CREATOR = new delj();
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    private PaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.p(parcel, 6, this.f);
        dclw.m(parcel, 7, this.g, false);
        dclw.p(parcel, 8, this.h);
        dclw.c(parcel, iA);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }
}

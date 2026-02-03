package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dell;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new dell();
    int a;
    String b;

    private PaymentMethodToken() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }

    public PaymentMethodToken(int i, String str) {
        this.a = i;
        this.b = str;
    }
}

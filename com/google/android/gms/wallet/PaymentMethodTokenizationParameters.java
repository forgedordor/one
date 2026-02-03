package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new delm();
    int a;
    final Bundle b;

    private PaymentMethodTokenizationParameters() {
        this.b = new Bundle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.p(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.a = i;
        this.b = bundle;
    }
}

package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebPaymentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WebPaymentData> CREATOR = new delq();
    String a;
    Bundle b;

    private WebPaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.p(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}

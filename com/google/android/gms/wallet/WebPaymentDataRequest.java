package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WebPaymentDataRequest> CREATOR = new delr();
    Cart a;
    String b;
    String c;
    byte[] d;
    boolean e;
    Bundle f;

    private WebPaymentDataRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.p(parcel, 5, this.f);
        dclw.f(parcel, 6, this.d, false);
        dclw.d(parcel, 7, this.e);
        dclw.c(parcel, iA);
    }

    public WebPaymentDataRequest(Cart cart, String str, String str2, byte[] bArr, boolean z, Bundle bundle) {
        this.a = cart;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = z;
        this.f = bundle;
    }
}

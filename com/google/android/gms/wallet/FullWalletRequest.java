package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dekx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FullWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWalletRequest> CREATOR = new dekx();
    String a;
    String b;
    Cart c;

    FullWalletRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.c(parcel, iA);
    }

    public FullWalletRequest(String str, String str2, Cart cart) {
        this.a = str;
        this.b = str2;
        this.c = cart;
    }
}

package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbuy;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FrpUnlockResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrpUnlockResponse> CREATOR = new dbuy();
    public final String a;

    public FrpUnlockResponse(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.c(parcel, iA);
    }
}

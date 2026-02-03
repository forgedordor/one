package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsi;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new dbsi();
    final int a;
    String b;

    public ClearTokenRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }

    public ClearTokenRequest(int i, String str) {
        this.a = i;
        this.b = str;
    }
}

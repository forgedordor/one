package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.derw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCompanionPackageForNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCompanionPackageForNodeResponse> CREATOR = new derw();
    public final int a;
    public final String b;

    public GetCompanionPackageForNodeResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}

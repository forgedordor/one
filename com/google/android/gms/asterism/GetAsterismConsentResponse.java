package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbli;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAsterismConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAsterismConsentResponse> CREATOR = new dbli();
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public GetAsterismConsentResponse(int i, int i2, String str, String str2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.i(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}

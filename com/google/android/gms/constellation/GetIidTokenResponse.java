package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcof;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetIidTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIidTokenResponse> CREATOR = new dcof();
    public final String a;
    public final String b;
    public final byte[] c;
    public final long d;

    public GetIidTokenResponse(String str, String str2, byte[] bArr, long j) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.f(parcel, 3, this.c, false);
        dclw.j(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbip;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PIMEUpdateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PIMEUpdateResponse> CREATOR = new dbip();
    final String a;
    public final byte[] b;
    public final PIMEUpdate[] c;

    public PIMEUpdateResponse(String str, byte[] bArr, PIMEUpdate[] pIMEUpdateArr) {
        this.a = str;
        this.b = bArr;
        this.c = pIMEUpdateArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.f(parcel, 2, this.b, false);
        dclw.E(parcel, 3, this.c, i);
        dclw.c(parcel, iA);
    }
}

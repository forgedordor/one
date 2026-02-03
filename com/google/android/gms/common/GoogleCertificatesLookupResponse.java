package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcdr;
import defpackage.dcei;
import defpackage.dcem;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupResponse> CREATOR = new dcei();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = dcem.a(i) - 1;
        this.d = dcdr.a(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return dcem.a(this.c);
    }

    public final void b() {
        dcdr.a(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.j(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}

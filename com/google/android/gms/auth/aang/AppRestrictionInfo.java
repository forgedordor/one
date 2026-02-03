package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbng;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRestrictionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRestrictionInfo> CREATOR = new dbng();
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public AppRestrictionInfo(String str, String str2, String str3, String str4, byte[] bArr) {
        this.a = str;
        this.d = str3;
        this.c = str2;
        this.e = str4;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.f(parcel, 6, this.b, false);
        dclw.c(parcel, iA);
    }
}

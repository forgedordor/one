package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbmh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetHubTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetHubTokenRequest> CREATOR = new dbmh();
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public GetHubTokenRequest(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.i(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}

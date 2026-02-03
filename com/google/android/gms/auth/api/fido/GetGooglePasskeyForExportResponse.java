package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbph;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGooglePasskeyForExportResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGooglePasskeyForExportResponse> CREATOR = new dbph();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public GetGooglePasskeyForExportResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetGooglePasskeyForExportResponse) {
            GetGooglePasskeyForExportResponse getGooglePasskeyForExportResponse = (GetGooglePasskeyForExportResponse) obj;
            if (dclc.a(this.a, getGooglePasskeyForExportResponse.a) && dclc.a(this.b, getGooglePasskeyForExportResponse.b) && dclc.a(this.c, getGooglePasskeyForExportResponse.c) && dclc.a(this.d, getGooglePasskeyForExportResponse.d) && dclc.a(this.e, getGooglePasskeyForExportResponse.e) && dclc.a(this.f, getGooglePasskeyForExportResponse.f) && dclc.a(this.g, getGooglePasskeyForExportResponse.g) && dclc.a(this.h, getGooglePasskeyForExportResponse.h) && dclc.a(this.i, getGooglePasskeyForExportResponse.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 5, this.d, false);
        dclw.m(parcel, 6, this.e, false);
        dclw.m(parcel, 7, this.f, false);
        dclw.m(parcel, 8, this.g, false);
        dclw.m(parcel, 9, this.h, false);
        dclw.m(parcel, 10, this.i, false);
        dclw.c(parcel, iA);
    }
}

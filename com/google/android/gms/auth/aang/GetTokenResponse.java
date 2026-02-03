package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnl;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetTokenResponse> CREATOR = new dbnl();
    public final String a;
    public final Oauth2TokenMetadata b;

    public GetTokenResponse(String str, Oauth2TokenMetadata oauth2TokenMetadata) {
        this.a = str;
        this.b = oauth2TokenMetadata;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}

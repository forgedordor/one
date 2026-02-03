package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnp;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReauthRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReauthRequest> CREATOR = new dbnp();
    public final GoogleAccount a;
    public final String b;
    public final String c;

    public ReauthRequest(GoogleAccount googleAccount, String str, String str2) {
        this.a = googleAccount;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, googleAccount, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}

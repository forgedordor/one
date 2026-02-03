package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FetchAppRestrictionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FetchAppRestrictionRequest> CREATOR = new dbnh();
    public final GoogleAccount a;
    public final String b;

    public FetchAppRestrictionRequest(GoogleAccount googleAccount, String str) {
        this.a = googleAccount;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, googleAccount, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}

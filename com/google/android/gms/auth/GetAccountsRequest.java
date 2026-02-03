package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbmf;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsRequest> CREATOR = new dbmf();
    public final String a;
    public final String[] b;

    public GetAccountsRequest(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.C(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}

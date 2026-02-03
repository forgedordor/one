package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbif;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRecentContextCall$Request> CREATOR = new dbif();
    public final Account a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.a = account;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.d(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.m(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }

    public GetRecentContextCall$Request() {
        this(null, false, false, false, null);
    }
}

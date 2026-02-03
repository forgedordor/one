package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtj;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountCredentials> CREATOR = new dbtj();
    final int a;
    boolean b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    final String i;

    public AccountCredentials(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.m(parcel, 7, this.g, false);
        dclw.m(parcel, 8, this.h, false);
        dclw.m(parcel, 9, this.i, false);
        dclw.c(parcel, iA);
    }

    @Deprecated
    public AccountCredentials() {
        this.a = 2;
        dclh.l("com.google", "Account type can't be empty.");
        this.i = "com.google";
    }
}

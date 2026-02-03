package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dblw;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new dblw();
    final int a;
    int b;

    @Deprecated
    String c;
    Account d;

    public AccountChangeEventsRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.c(parcel, iA);
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }
}

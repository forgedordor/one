package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbrz;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountNameCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountNameCheckRequest> CREATOR = new dbrz();
    final int a;

    @Deprecated
    String b;
    String c;
    String d;
    AppDescription e;
    CaptchaSolution f;
    Account g;

    public AccountNameCheckRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.k(parcel, 7, this.g, i, false);
        dclw.c(parcel, iA);
    }

    public AccountNameCheckRequest(int i, String str, String str2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = appDescription;
        this.f = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }
}

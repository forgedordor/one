package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtd;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConfirmCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConfirmCredentialsWorkflowRequest> CREATOR = new dbtd();
    final int a;

    @Deprecated
    String b;
    AppDescription c;
    final Bundle d;
    Account e;
    AccountAuthenticatorResponse f;

    public ConfirmCredentialsWorkflowRequest() {
        this.a = 3;
        this.d = new Bundle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.p(parcel, 4, this.d);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.c(parcel, iA);
    }

    public ConfirmCredentialsWorkflowRequest(int i, String str, AppDescription appDescription, Bundle bundle, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        this.b = str;
        this.c = appDescription;
        this.d = bundle;
        if (account != null || TextUtils.isEmpty(str)) {
            this.e = account;
        } else {
            this.e = new Account(str, "com.google");
        }
        this.f = accountAuthenticatorResponse;
    }
}

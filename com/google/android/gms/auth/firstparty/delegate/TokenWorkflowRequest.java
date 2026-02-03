package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbth;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TokenWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenWorkflowRequest> CREATOR = new dbth();
    String a;

    @Deprecated
    String b;
    final Bundle c;
    FACLConfig d;
    PACLConfig e;
    boolean f;
    AppDescription g;
    Account h;
    AccountAuthenticatorResponse i;
    boolean j;

    public TokenWorkflowRequest() {
        this.j = true;
        this.c = new Bundle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.p(parcel, 4, this.c);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.k(parcel, 6, this.e, i, false);
        dclw.d(parcel, 7, this.f);
        dclw.k(parcel, 8, this.g, i, false);
        dclw.k(parcel, 9, this.h, i, false);
        dclw.k(parcel, 10, this.i, i, false);
        dclw.d(parcel, 11, this.j);
        dclw.c(parcel, iA);
    }

    public TokenWorkflowRequest(String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, AppDescription appDescription, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z2) {
        this.j = true;
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = fACLConfig;
        this.e = pACLConfig;
        this.f = z;
        this.g = appDescription;
        if (account != null || TextUtils.isEmpty(str2)) {
            this.h = account;
        } else {
            this.h = new Account(str2, "com.google");
        }
        this.i = accountAuthenticatorResponse;
        this.j = z2;
    }
}

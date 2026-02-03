package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtc;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountRemovalAllowedWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountRemovalAllowedWorkflowRequest> CREATOR = new dbtc();
    final AccountAuthenticatorResponse a;
    final Account b;
    final boolean c;

    public AccountRemovalAllowedWorkflowRequest(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z) {
        dclh.n(account, "account cannot be null");
        this.b = account;
        dclh.n(accountAuthenticatorResponse, "amResponse cannot be null");
        this.a = accountAuthenticatorResponse;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}

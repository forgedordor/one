package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpo;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountWithZuulKeyRetrievalIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithZuulKeyRetrievalIntent> CREATOR = new dbpo();
    public final Account a;
    public final PendingIntent b;

    public AccountWithZuulKeyRetrievalIntent(Account account, PendingIntent pendingIntent) {
        dclh.m(account);
        this.a = account;
        dclh.m(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, account, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}

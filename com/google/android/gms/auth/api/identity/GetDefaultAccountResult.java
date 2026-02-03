package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpz;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetDefaultAccountResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetDefaultAccountResult> CREATOR = new dbpz();
    public final Account a;

    public GetDefaultAccountResult(Account account) {
        this.a = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, account, i, false);
        dclw.c(parcel, iA);
    }
}

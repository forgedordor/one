package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvu;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountWithDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithDataSet> CREATOR = new ddvu();
    public final Account a;
    public final String b;

    @Deprecated
    private final boolean c;

    public AccountWithDataSet(Account account, String str, boolean z) {
        this.a = account;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithDataSet)) {
            return false;
        }
        AccountWithDataSet accountWithDataSet = (AccountWithDataSet) obj;
        return this.c == accountWithDataSet.c && ejwh.a(this.a, accountWithDataSet.a) && ejwh.a(this.b, accountWithDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, account, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, account == null);
        dclw.c(parcel, iA);
    }
}

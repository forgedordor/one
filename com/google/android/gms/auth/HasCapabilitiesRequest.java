package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbmu;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HasCapabilitiesRequest> CREATOR = new dbmu();
    public final Account a;
    public final String[] b;
    public final Bundle c;

    public HasCapabilitiesRequest(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.b = strArr;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, account, i, false);
        dclw.C(parcel, 2, this.b);
        dclw.p(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}

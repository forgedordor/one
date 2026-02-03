package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dedt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordConsentRequest> CREATOR = new dedt();
    final int a;
    public final Account b;
    public final Scope[] c;
    public final String d;

    public RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.a = i;
        this.b = account;
        this.c = scopeArr;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.E(parcel, 3, this.c, i);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }
}

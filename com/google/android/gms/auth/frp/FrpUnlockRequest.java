package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbux;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FrpUnlockRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrpUnlockRequest> CREATOR = new dbux();
    public final String a;
    public final Account b;
    public final boolean c;

    public FrpUnlockRequest(String str, Account account, boolean z) {
        this.a = str;
        this.b = account;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcjs;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new dcjs();
    final int a;

    @Deprecated
    final IBinder b;
    final Scope[] c;
    final Integer d;
    final Integer e;
    final Account f;
    final boolean g;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account, boolean z) {
        this.a = i;
        this.b = iBinder;
        this.c = scopeArr;
        this.d = num;
        this.e = num2;
        this.f = account;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.u(parcel, 2, this.b);
        dclw.E(parcel, 3, this.c, i);
        dclw.x(parcel, 4, this.d);
        dclw.x(parcel, 5, this.e);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.d(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }
}

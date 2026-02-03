package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbte;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FinishSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FinishSessionWorkflowRequest> CREATOR = new dbte();
    public final int a;
    public final AppDescription b;
    public final String c;
    public final AccountAuthenticatorResponse d;
    private final Bundle e;

    public FinishSessionWorkflowRequest(int i, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        dclh.n(bundle, "sessionBundle cannot be null");
        this.e = bundle;
        dclh.n(appDescription, "callingAppDescription cannot be null");
        this.b = appDescription;
        dclh.l(str, "accountType must be provided");
        this.c = str;
        this.d = accountAuthenticatorResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.p(parcel, 2, new Bundle(this.e));
        dclw.k(parcel, 3, this.b, i, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.c(parcel, iA);
    }
}

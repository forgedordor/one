package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsd;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountSignInRequest> CREATOR = new dbsd();
    final int a;
    AppDescription b;
    boolean c;
    boolean d;
    CaptchaSolution e;
    AccountCredentials f;

    public AccountSignInRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.d(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.c(parcel, iA);
    }

    public AccountSignInRequest(int i, AppDescription appDescription, boolean z, boolean z2, CaptchaSolution captchaSolution, AccountCredentials accountCredentials) {
        this.a = i;
        this.b = appDescription;
        this.c = z;
        this.d = z2;
        this.e = captchaSolution;
        this.f = accountCredentials;
    }
}

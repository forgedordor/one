package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsk;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConfirmCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConfirmCredentialsRequest> CREATOR = new dbsk();
    final int a;
    AccountCredentials b;
    CaptchaSolution c;

    public ConfirmCredentialsRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }

    public ConfirmCredentialsRequest(int i, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        this.a = i;
        this.b = accountCredentials;
        this.c = captchaSolution;
    }
}

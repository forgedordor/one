package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsp;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GplusInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GplusInfoRequest> CREATOR = new dbsp();
    final int a;

    @Deprecated
    String b;
    CaptchaSolution c;
    Account d;

    public GplusInfoRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.c(parcel, iA);
    }

    public GplusInfoRequest(int i, String str, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }
}

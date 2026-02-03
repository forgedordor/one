package com.google.android.gms.auth.api.accounttransfer.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbor;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UserChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserChallengeRequest> CREATOR = new dbor();
    public final String a;
    public final PendingIntent b;

    public UserChallengeRequest(String str, PendingIntent pendingIntent) {
        dclh.m(str);
        this.a = str;
        dclh.m(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, 1);
        dclw.m(parcel, 2, this.a, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}

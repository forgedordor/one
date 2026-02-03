package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbmg;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetHubTokenInternalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetHubTokenInternalResponse> CREATOR = new dbmg();
    public final TokenData a;
    public final String b;
    public final Intent c;
    public final PendingIntent d;

    public GetHubTokenInternalResponse(TokenData tokenData, String str, Intent intent, PendingIntent pendingIntent) {
        this.a = tokenData;
        this.b = str;
        this.c = intent;
        this.d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.c(parcel, iA);
    }
}

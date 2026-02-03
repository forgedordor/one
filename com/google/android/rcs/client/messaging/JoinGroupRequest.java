package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efen;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class JoinGroupRequest implements Parcelable {
    public static final Parcelable.Creator<JoinGroupRequest> CREATOR = new efen();

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.B(parcel, a());
        dclw.k(parcel, 2, b(), i, false);
        dclw.c(parcel, iA);
    }
}

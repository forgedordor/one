package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efds;
import defpackage.ekgb;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GetGroupNotificationsResponse implements Parcelable {
    public static final Parcelable.Creator<GetGroupNotificationsResponse> CREATOR = new efds();

    public abstract MessagingResult a();

    public abstract ekgb b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        dclw.n(parcel, 2, b(), false);
        dclw.c(parcel, iA);
    }
}

package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.effm;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class RemoveUserFromGroupResponse implements Parcelable {
    public static final Parcelable.Creator<RemoveUserFromGroupResponse> CREATOR = new effm();

    public abstract MessagingResult a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        dclw.c(parcel, iA);
    }
}

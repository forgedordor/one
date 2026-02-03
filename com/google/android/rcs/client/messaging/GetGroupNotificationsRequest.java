package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efbv;
import defpackage.efdq;
import defpackage.efdr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GetGroupNotificationsRequest implements Parcelable {
    public static final GetGroupNotificationsRequest a = b().a();
    public static final Parcelable.Creator<GetGroupNotificationsRequest> CREATOR = new efdq();

    public static efdr b() {
        efbv efbvVar = new efbv();
        efbvVar.b(-1);
        return efbvVar;
    }

    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, a());
        dclw.c(parcel, iA);
    }
}

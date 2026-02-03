package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efji;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupRemoteCapabilities implements Parcelable {
    public static final Parcelable.Creator<GroupRemoteCapabilities> CREATOR = new efji();

    public abstract Optional a();

    public abstract Optional b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, c());
        if (b().isPresent()) {
            dclw.d(parcel, 2, ((Boolean) b().get()).booleanValue());
        }
        if (a().isPresent()) {
            dclw.d(parcel, 3, ((Boolean) a().get()).booleanValue());
        }
        dclw.c(parcel, iA);
    }
}

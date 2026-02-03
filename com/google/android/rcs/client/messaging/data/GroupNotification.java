package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dfpg;
import defpackage.efjg;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupNotification implements Parcelable {
    public static final Parcelable.Creator<GroupNotification> CREATOR = new efjg();

    public abstract Conversation a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        if (c().isPresent()) {
            dclw.k(parcel, 2, c().get(), i, false);
        }
        if (dfpg.n() && b().isPresent()) {
            dclw.k(parcel, 3, b().get(), i, false);
        }
        dclw.c(parcel, iA);
    }
}

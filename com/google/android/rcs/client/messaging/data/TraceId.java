package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efif;
import defpackage.efkz;
import defpackage.efla;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class TraceId implements Parcelable {
    public static final Parcelable.Creator<TraceId> CREATOR = new efkz();

    public static efla b() {
        efif efifVar = new efif();
        efifVar.c("");
        return efifVar;
    }

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, a(), false);
        dclw.c(parcel, iA);
    }
}

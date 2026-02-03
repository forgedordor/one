package com.google.android.ims.rcsservice.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.dhdw;
import defpackage.ewwv;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class StopAllRcsTransportsExceptRequest implements Parcelable {
    public static final Parcelable.Creator<StopAllRcsTransportsExceptRequest> CREATOR = new dhdw();

    public abstract ewwv a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProtoParsers.h(parcel, a());
    }
}

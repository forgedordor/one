package com.google.android.ims.rcsservice.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.dhdv;
import defpackage.ewwr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class InitializeAndStartRcsTransportRequest implements Parcelable {
    public static final Parcelable.Creator<InitializeAndStartRcsTransportRequest> CREATOR = new dhdv();

    public abstract ewwr a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProtoParsers.h(parcel, a());
    }
}

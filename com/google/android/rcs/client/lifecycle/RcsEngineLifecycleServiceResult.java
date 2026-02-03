package com.google.android.rcs.client.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dstt;
import defpackage.efay;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RcsEngineLifecycleServiceResult extends dstt {
    public static final Parcelable.Creator<RcsEngineLifecycleServiceResult> CREATOR = new efay();

    public RcsEngineLifecycleServiceResult(int i) {
        this.code = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
    }

    public RcsEngineLifecycleServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
    }
}

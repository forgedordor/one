package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.dclw;
import defpackage.efbx;
import defpackage.efdu;
import defpackage.efdv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GetMessagesRequest implements Parcelable {
    public static final GetMessagesRequest a = c().a();
    public static final Parcelable.Creator<GetMessagesRequest> CREATOR = new efdu();

    public static efdv c() {
        efbx efbxVar = new efbx();
        efbxVar.b(-1);
        efbxVar.c(TraceId.b().d());
        return efbxVar;
    }

    public abstract int a();

    public abstract TraceId b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, a());
        dclw.k(parcel, 2, b(), i, false);
        dclw.c(parcel, iA);
    }
}

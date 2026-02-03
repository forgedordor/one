package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efkp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class RcsDestinationId implements Parcelable {
    public static final Parcelable.Creator<RcsDestinationId> CREATOR = new efkp();

    public abstract String a();

    public abstract int b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("RcsDestinationId {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dhiz.PHONE_NUMBER.c(a())), String.format("type=%s", b() != 1 ? "SIP_URI" : "PHONE"))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, b() - 1);
        dclw.m(parcel, 2, a(), false);
        dclw.c(parcel, iA);
    }
}

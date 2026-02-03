package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efin;
import defpackage.efip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new efin();

    public abstract RcsDestinationId a();

    public abstract String b();

    public abstract int c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Conversation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", b()), String.format("destination=%s", dhiz.PHONE_NUMBER.c(a())), String.format("type=%s", efip.a(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, c() - 1);
        dclw.m(parcel, 2, b(), false);
        dclw.k(parcel, 3, a(), i, false);
        dclw.c(parcel, iA);
    }
}

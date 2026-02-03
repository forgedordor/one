package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efjz;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageExtensionHeader implements Parcelable {
    public static final Parcelable.Creator<MessageExtensionHeader> CREATOR = new efjz();

    public abstract String a();

    public abstract String b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = String.format("namespace=%s", b());
        dhiz dhizVar = dhiz.GENERIC;
        return String.format("MessageExtensionHeader {%s}", TextUtils.join(",", Arrays.asList(str, String.format("name=%s", dhizVar.c(a())), String.format("value=%s", dhizVar.c(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, b(), false);
        dclw.m(parcel, 2, a(), false);
        dclw.m(parcel, 3, c(), false);
        dclw.c(parcel, iA);
    }
}

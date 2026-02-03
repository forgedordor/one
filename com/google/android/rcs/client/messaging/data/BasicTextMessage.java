package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efig;
import defpackage.efkl;
import defpackage.eflb;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class BasicTextMessage implements Parcelable, eflb {
    public static final Parcelable.Creator<BasicTextMessage> CREATOR = new efig();

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eflb
    public final void hl(efkl efklVar) {
        efklVar.b(this);
    }

    public final String toString() {
        return String.format("BasicTextMessage {%s}", String.format("content=%s", dhiz.MESSAGE_CONTENT.c(a())));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, a(), false);
        dclw.c(parcel, iA);
    }
}

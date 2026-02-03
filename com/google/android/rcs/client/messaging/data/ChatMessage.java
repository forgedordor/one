package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efii;
import defpackage.efkl;
import defpackage.eflb;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ChatMessage implements Parcelable, eflb {
    public static final Parcelable.Creator<ChatMessage> CREATOR = new efii();

    public abstract ContentType a();

    public abstract evqs b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eflb
    public final void hl(efkl efklVar) {
        efklVar.c(this);
    }

    public final String toString() {
        return String.format("ChatMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("content=%s", dhiz.MESSAGE_CONTENT.c(b())), String.format("contentType=%s", a()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        dclw.f(parcel, 2, b().I(), false);
        dclw.c(parcel, iA);
    }
}

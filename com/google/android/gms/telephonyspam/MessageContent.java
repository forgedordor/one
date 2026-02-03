package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.degg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessageContent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageContent> CREATOR = new degg();
    public final int a;
    public final String b;
    public final int c;
    public final long d;

    public MessageContent(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}

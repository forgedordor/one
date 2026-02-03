package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deqk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionEvent> CREATOR = new deqk();
    public final String a;
    public final int b;
    public final int c;

    public ConnectionEvent(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return "ConnectionEvent[" + this.a + "," + this.b + "," + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.detg;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestConnectionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestConnectionParcelable> CREATOR = new detg();
    public final String a;
    public final int b;
    public final long c;

    public RequestConnectionParcelable(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final String toString() {
        return "RequestConnection[" + this.a + "," + this.b + "," + String.valueOf(Duration.ofMillis(this.c)) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.j(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}

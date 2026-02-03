package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogTimerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogTimerRequest> CREATOR = new desp();
    public final String a;
    public final long b;
    public final byte[] c;

    public LogTimerRequest(String str, long j, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.j(parcel, 2, this.b);
        dclw.f(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}

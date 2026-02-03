package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogCounterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogCounterRequest> CREATOR = new desn();
    public final String a;
    public final long b;
    public final byte[] c;
    public final long d;
    public final boolean e;

    public LogCounterRequest(String str, long j, byte[] bArr, long j2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = j2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.j(parcel, 2, this.b);
        dclw.f(parcel, 3, this.c, false);
        dclw.j(parcel, 4, this.d);
        dclw.d(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}

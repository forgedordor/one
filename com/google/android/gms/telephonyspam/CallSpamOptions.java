package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.degd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallSpamOptions> CREATOR = new degd();
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;

    public CallSpamOptions(int i, String str, long j, int i2, long j2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.j(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.j(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}

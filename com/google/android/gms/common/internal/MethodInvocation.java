package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcla;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new dcla();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.j(parcel, 5, this.e);
        dclw.m(parcel, 6, this.f, false);
        dclw.m(parcel, 7, this.g, false);
        dclw.i(parcel, 8, this.h);
        dclw.i(parcel, 9, this.i);
        dclw.c(parcel, iA);
    }
}

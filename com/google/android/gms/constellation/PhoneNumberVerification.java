package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcom;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhoneNumberVerification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneNumberVerification> CREATOR = new dcom();
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final Bundle f;
    public final int g;
    public final long h;

    public PhoneNumberVerification(String str, long j, int i, int i2, String str2, Bundle bundle, int i3, long j2) {
        this.a = str;
        this.b = j;
        this.f = bundle;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.g = i3;
        this.h = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.j(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.m(parcel, 5, this.e, false);
        dclw.p(parcel, 6, this.f);
        dclw.i(parcel, 7, this.g);
        dclw.j(parcel, 8, this.h);
        dclw.c(parcel, iA);
    }
}

package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcwo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogOptions> CREATOR = new dcwo();
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final ServiceDumpRequest[] f;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, ServiceDumpRequest[] serviceDumpRequestArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.d(parcel, 3, this.b);
        dclw.d(parcel, 4, this.c);
        dclw.d(parcel, 5, this.d);
        dclw.d(parcel, 6, this.e);
        dclw.E(parcel, 7, this.f, i);
        dclw.c(parcel, iA);
    }
}

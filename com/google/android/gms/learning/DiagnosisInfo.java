package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddiu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DiagnosisInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DiagnosisInfo> CREATOR = new ddiu();
    final int a;
    final int b;
    final int c;
    final int d;
    final long e;

    public DiagnosisInfo(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.j(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}

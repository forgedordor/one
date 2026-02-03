package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddsd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new ddsd();
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final StampStyle e;

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = stampStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int iA = dclw.a(parcel);
        dclw.h(parcel, 2, f);
        dclw.i(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.d(parcel, 5, this.d);
        dclw.k(parcel, 6, this.e, i, false);
        dclw.c(parcel, iA);
    }
}

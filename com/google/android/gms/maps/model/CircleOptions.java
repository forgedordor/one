package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddrh;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new ddrh();
    public final LatLng a;
    public final double b;
    public final float c;
    public final int d;
    public final int e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.g(parcel, 3, this.b);
        dclw.h(parcel, 4, this.c);
        dclw.i(parcel, 5, this.d);
        dclw.i(parcel, 6, this.e);
        dclw.h(parcel, 7, this.f);
        dclw.d(parcel, 8, this.g);
        dclw.d(parcel, 9, this.h);
        dclw.n(parcel, 10, this.i, false);
        dclw.c(parcel, iA);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.a = latLng;
        this.b = d;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}

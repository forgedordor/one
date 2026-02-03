package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.dclw;
import defpackage.ddrc;
import defpackage.ddrl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new ddrl();
    public LatLng a;
    public float b;
    public float c;
    public LatLngBounds d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    private ddrc l;

    public GroundOverlayOptions() {
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.u(parcel, 2, this.l.a.asBinder());
        dclw.k(parcel, 3, this.a, i, false);
        dclw.h(parcel, 4, this.b);
        dclw.h(parcel, 5, this.c);
        dclw.k(parcel, 6, this.d, i, false);
        dclw.h(parcel, 7, this.e);
        dclw.h(parcel, 8, this.f);
        dclw.d(parcel, 9, this.g);
        dclw.h(parcel, 10, this.h);
        dclw.h(parcel, 11, this.i);
        dclw.h(parcel, 12, this.j);
        dclw.d(parcel, 13, this.k);
        dclw.c(parcel, iA);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
        this.l = new ddrc(IObjectWrapper.Stub.asInterface(iBinder));
        this.a = latLng;
        this.b = f;
        this.c = f2;
        this.d = latLngBounds;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = z2;
    }
}

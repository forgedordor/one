package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.dclb;
import defpackage.dclw;
import defpackage.ddqt;
import defpackage.ddqz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new ddqt();
    public StreetViewPanoramaCamera a;
    public String b;
    public LatLng c;
    public Integer d;
    public StreetViewSource e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("PanoramaId", this.b, arrayList);
        dclb.b("Position", this.c, arrayList);
        dclb.b("Radius", this.d, arrayList);
        dclb.b("Source", this.e, arrayList);
        dclb.b("StreetViewPanoramaCamera", this.a, arrayList);
        dclb.b("UserNavigationEnabled", this.f, arrayList);
        dclb.b("ZoomGesturesEnabled", this.g, arrayList);
        dclb.b("PanningGesturesEnabled", this.h, arrayList);
        dclb.b("StreetNamesEnabled", this.i, arrayList);
        dclb.b("UseViewLifecycleInFragment", this.j, arrayList);
        return dclb.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.x(parcel, 5, this.d);
        dclw.e(parcel, 6, ddqz.a(this.f));
        dclw.e(parcel, 7, ddqz.a(this.g));
        dclw.e(parcel, 8, ddqz.a(this.h));
        dclw.e(parcel, 9, ddqz.a(this.i));
        dclw.e(parcel, 10, ddqz.a(this.j));
        dclw.k(parcel, 11, this.e, i, false);
        dclw.c(parcel, iA);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.f = ddqz.b(b);
        this.g = ddqz.b(b2);
        this.h = ddqz.b(b3);
        this.i = ddqz.b(b4);
        this.j = ddqz.b(b5);
        this.e = streetViewSource;
    }
}

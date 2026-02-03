package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.dclb;
import defpackage.dclw;
import defpackage.ddqk;
import defpackage.ddqs;
import defpackage.ddqz;
import defpackage.ddre;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new ddqk();
    private static final Integer i = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public int a;
    public CameraPosition b;
    public Float c;
    public Float d;
    public LatLngBounds e;
    public Integer f;
    public String g;
    public int h;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Boolean u;

    public GoogleMapOptions() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = ddqs.a;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(16)) {
            googleMapOptions.a = typedArrayObtainAttributes.getInt(16, -1);
        }
        if (typedArrayObtainAttributes.hasValue(26)) {
            googleMapOptions.j = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(26, false));
        }
        if (typedArrayObtainAttributes.hasValue(25)) {
            googleMapOptions.k = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(25, false));
        }
        if (typedArrayObtainAttributes.hasValue(17)) {
            googleMapOptions.m = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(17, true));
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            googleMapOptions.q = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(19, true));
        }
        if (typedArrayObtainAttributes.hasValue(21)) {
            googleMapOptions.u = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(21, true));
        }
        if (typedArrayObtainAttributes.hasValue(20)) {
            googleMapOptions.n = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(20, true));
        }
        if (typedArrayObtainAttributes.hasValue(22)) {
            googleMapOptions.p = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(22, true));
        }
        if (typedArrayObtainAttributes.hasValue(24)) {
            googleMapOptions.o = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(24, true));
        }
        if (typedArrayObtainAttributes.hasValue(23)) {
            googleMapOptions.l = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(23, true));
        }
        if (typedArrayObtainAttributes.hasValue(13)) {
            googleMapOptions.r = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(13, false));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            googleMapOptions.s = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(18, true));
        }
        if (typedArrayObtainAttributes.hasValue(0)) {
            googleMapOptions.t = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(0, false));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.c = Float.valueOf(typedArrayObtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.d = Float.valueOf(typedArrayObtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            googleMapOptions.f = Integer.valueOf(typedArrayObtainAttributes.getColor(1, i.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(15) && (string = typedArrayObtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.g = string;
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            googleMapOptions.h = typedArrayObtainAttributes.getInt(14, 0);
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(11) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(11, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(12) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(12, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(9) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(9, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(10) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(10, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.e = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(5) ? typedArrayObtainAttributes3.getFloat(5, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(6) ? typedArrayObtainAttributes3.getFloat(6, 0.0f) : 0.0f);
        ddre ddreVar = new ddre();
        ddreVar.b(latLng);
        if (typedArrayObtainAttributes3.hasValue(8)) {
            ddreVar.a = typedArrayObtainAttributes3.getFloat(8, 0.0f);
        }
        if (typedArrayObtainAttributes3.hasValue(2)) {
            ddreVar.c = typedArrayObtainAttributes3.getFloat(2, 0.0f);
        }
        if (typedArrayObtainAttributes3.hasValue(7)) {
            ddreVar.b = typedArrayObtainAttributes3.getFloat(7, 0.0f);
        }
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.b = ddreVar.a();
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("MapType", Integer.valueOf(this.a), arrayList);
        dclb.b("LiteMode", this.r, arrayList);
        dclb.b("Camera", this.b, arrayList);
        dclb.b("CompassEnabled", this.m, arrayList);
        dclb.b("ZoomControlsEnabled", this.l, arrayList);
        dclb.b("ScrollGesturesEnabled", this.n, arrayList);
        dclb.b("ZoomGesturesEnabled", this.o, arrayList);
        dclb.b("TiltGesturesEnabled", this.p, arrayList);
        dclb.b("RotateGesturesEnabled", this.q, arrayList);
        dclb.b("ScrollGesturesEnabledDuringRotateOrZoom", this.u, arrayList);
        dclb.b("MapToolbarEnabled", this.s, arrayList);
        dclb.b("AmbientEnabled", this.t, arrayList);
        dclb.b("MinZoomPreference", this.c, arrayList);
        dclb.b("MaxZoomPreference", this.d, arrayList);
        dclb.b("BackgroundColor", this.f, arrayList);
        dclb.b("LatLngBoundsForCameraTarget", this.e, arrayList);
        dclb.b("ZOrderOnTop", this.j, arrayList);
        dclb.b("UseViewLifecycleInFragment", this.k, arrayList);
        dclb.b("mapColorScheme", Integer.valueOf(this.h), arrayList);
        return dclb.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = dclw.a(parcel);
        dclw.e(parcel, 2, ddqz.a(this.j));
        dclw.e(parcel, 3, ddqz.a(this.k));
        dclw.i(parcel, 4, this.a);
        dclw.k(parcel, 5, this.b, i2, false);
        dclw.e(parcel, 6, ddqz.a(this.l));
        dclw.e(parcel, 7, ddqz.a(this.m));
        dclw.e(parcel, 8, ddqz.a(this.n));
        dclw.e(parcel, 9, ddqz.a(this.o));
        dclw.e(parcel, 10, ddqz.a(this.p));
        dclw.e(parcel, 11, ddqz.a(this.q));
        dclw.e(parcel, 12, ddqz.a(this.r));
        dclw.e(parcel, 14, ddqz.a(this.s));
        dclw.e(parcel, 15, ddqz.a(this.t));
        dclw.t(parcel, 16, this.c);
        dclw.t(parcel, 17, this.d);
        dclw.k(parcel, 18, this.e, i2, false);
        dclw.e(parcel, 19, ddqz.a(this.u));
        dclw.x(parcel, 20, this.f);
        dclw.m(parcel, 21, this.g, false);
        dclw.i(parcel, 23, this.h);
        dclw.c(parcel, iA);
    }

    public GoogleMapOptions(byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i3) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = ddqz.b(b);
        this.k = ddqz.b(b2);
        this.a = i2;
        this.b = cameraPosition;
        this.l = ddqz.b(b3);
        this.m = ddqz.b(b4);
        this.n = ddqz.b(b5);
        this.o = ddqz.b(b6);
        this.p = ddqz.b(b7);
        this.q = ddqz.b(b8);
        this.r = ddqz.b(b9);
        this.s = ddqz.b(b10);
        this.t = ddqz.b(b11);
        this.c = f;
        this.d = f2;
        this.e = latLngBounds;
        this.u = ddqz.b(b12);
        this.f = num;
        this.g = str;
        this.h = i3;
    }
}

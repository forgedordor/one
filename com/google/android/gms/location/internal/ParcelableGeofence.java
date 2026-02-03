package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclw;
import defpackage.ddpq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ParcelableGeofence extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableGeofence> CREATOR = new ddpq();
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;

    public ParcelableGeofence(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null) {
            throw new IllegalArgumentException("requestId is null");
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
        int i4 = i & 15;
        if (i4 == 0) {
            throw new IllegalArgumentException(a.g(i, "No supported transition specified: "));
        }
        this.c = s;
        this.a = str;
        this.d = d;
        this.e = d2;
        this.f = f;
        this.b = j;
        this.g = i4;
        this.h = i2;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableGeofence) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
            if (this.f == parcelableGeofence.f && this.d == parcelableGeofence.d && this.e == parcelableGeofence.e && this.c == parcelableGeofence.c && this.g == parcelableGeofence.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((((((((int) j) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        short s = this.c;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.g), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.h / 1000), Integer.valueOf(this.i), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.j(parcel, 2, this.b);
        dclw.l(parcel, 3, this.c);
        dclw.g(parcel, 4, this.d);
        dclw.g(parcel, 5, this.e);
        dclw.h(parcel, 6, this.f);
        dclw.i(parcel, 7, this.g);
        dclw.i(parcel, 8, this.h);
        dclw.i(parcel, 9, this.i);
        dclw.c(parcel, iA);
    }
}

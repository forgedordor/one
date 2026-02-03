package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddnr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new ddnr();
    final int a;

    @Deprecated
    public LocationAvailability(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a < 1000;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof LocationAvailability) && this.a == ((LocationAvailability) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "LocationAvailability[" + a() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 4, this.a);
        dclw.d(parcel, 6, a());
        dclw.c(parcel, iA);
    }
}

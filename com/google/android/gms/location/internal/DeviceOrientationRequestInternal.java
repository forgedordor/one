package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddoi;
import defpackage.ejwl;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequestInternal> CREATOR = new ddoi();
    public static final DeviceOrientationRequest a;
    final DeviceOrientationRequest b;

    static {
        ejwl.b(true, "Invalid interval: 20000 should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        a = new DeviceOrientationRequest(20000L, false);
    }

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest) {
        this.b = deviceOrientationRequest;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceOrientationRequestInternal) {
            return dclc.a(this.b, ((DeviceOrientationRequestInternal) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.b, i, false);
        dclw.c(parcel, iA);
    }
}

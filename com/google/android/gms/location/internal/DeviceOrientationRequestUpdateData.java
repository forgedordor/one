package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.IDeviceOrientationListener;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import defpackage.dclw;
import defpackage.ddoj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequestUpdateData> CREATOR = new ddoj();
    final int a;
    final DeviceOrientationRequestInternal b;
    final IDeviceOrientationListener c;
    final IFusedLocationProviderCallback d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        this.c = iBinder == null ? null : IDeviceOrientationListener.Stub.asInterface(iBinder);
        this.d = iBinder2 != null ? IFusedLocationProviderCallback.Stub.asInterface(iBinder2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        IDeviceOrientationListener iDeviceOrientationListener = this.c;
        dclw.u(parcel, 3, iDeviceOrientationListener == null ? null : iDeviceOrientationListener.asBinder());
        IFusedLocationProviderCallback iFusedLocationProviderCallback = this.d;
        dclw.u(parcel, 4, iFusedLocationProviderCallback != null ? iFusedLocationProviderCallback.asBinder() : null);
        dclw.c(parcel, iA);
    }
}

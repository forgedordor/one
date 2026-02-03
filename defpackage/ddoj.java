package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddoj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        int iF = 1;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) dclv.n(parcel, i, DeviceOrientationRequestInternal.CREATOR);
            } else if (iD == 3) {
                iBinderL = dclv.l(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iBinderL2 = dclv.l(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DeviceOrientationRequestUpdateData(iF, deviceOrientationRequestInternal, iBinderL, iBinderL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequestUpdateData[i];
    }
}

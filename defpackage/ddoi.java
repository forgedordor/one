package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddoi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        DeviceOrientationRequest deviceOrientationRequest = DeviceOrientationRequestInternal.a;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                deviceOrientationRequest = (DeviceOrientationRequest) dclv.n(parcel, i, DeviceOrientationRequest.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new DeviceOrientationRequestInternal(deviceOrientationRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequestInternal[i];
    }
}

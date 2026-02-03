package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                jI = dclv.i(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DeviceOrientationRequest(jI, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }
}

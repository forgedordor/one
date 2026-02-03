package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbom implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                zD = dclv.D(parcel, i);
            } else if (iD == 3) {
                jI = dclv.i(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                zD2 = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DeviceMetaData(iF, zD, jI, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}

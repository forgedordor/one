package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.StorageStats;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        long jI2 = 0;
        long jI3 = 0;
        RegisteredPackageInfo[] registeredPackageInfoArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                registeredPackageInfoArr = (RegisteredPackageInfo[]) dclv.J(parcel, i, RegisteredPackageInfo.CREATOR);
            } else if (iD == 2) {
                jI = dclv.i(parcel, i);
            } else if (iD == 3) {
                jI2 = dclv.i(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                jI3 = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new StorageStats(registeredPackageInfoArr, jI, jI2, jI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StorageStats[i];
    }
}

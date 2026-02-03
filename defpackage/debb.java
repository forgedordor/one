package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        long jI2 = 0;
        boolean zD = false;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                jI = dclv.i(parcel, i);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                jI2 = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetStorageStatsCall$PackageStats(strT, jI, zD, jI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetStorageStatsCall$PackageStats[i];
    }
}

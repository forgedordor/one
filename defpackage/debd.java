package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        long jI2 = 0;
        long jI3 = 0;
        Status status = null;
        GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD == 2) {
                getStorageStatsCall$PackageStatsArr = (GetStorageStatsCall$PackageStats[]) dclv.J(parcel, i, GetStorageStatsCall$PackageStats.CREATOR);
            } else if (iD == 3) {
                jI = dclv.i(parcel, i);
            } else if (iD == 4) {
                jI2 = dclv.i(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                jI3 = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetStorageStatsCall$Response(status, getStorageStatsCall$PackageStatsArr, jI, jI2, jI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetStorageStatsCall$Response[i];
    }
}

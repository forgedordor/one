package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        String strT = null;
        String strT2 = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new FileGroupWithDownloadStatus(strT, strT2, iF, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileGroupWithDownloadStatus[i];
    }
}

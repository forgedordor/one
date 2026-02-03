package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deas implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        long jI = 0;
        esav esavVar = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                jI = dclv.i(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                esavVar = (esav) dclv.n(parcel, i, esav.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AppIndexingUserActionInfo(strT, jI, esavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingUserActionInfo[i];
    }
}

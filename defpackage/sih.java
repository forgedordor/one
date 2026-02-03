package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        shu shuVar = null;
        ArrayList arrayListZ2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListZ = dclv.z(parcel, i, sia.CREATOR);
            } else if (iD == 2) {
                shuVar = (shu) dclv.n(parcel, i, shu.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListZ2 = dclv.z(parcel, i, shw.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new sig(arrayListZ, shuVar, arrayListZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sig[i];
    }
}

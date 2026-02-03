package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListY = null;
        shu shuVar = null;
        ArrayList arrayListZ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListY = dclv.y(parcel, i);
            } else if (iD == 2) {
                shuVar = (shu) dclv.n(parcel, i, shu.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, sim.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new shr(arrayListY, shuVar, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new shr[i];
    }
}

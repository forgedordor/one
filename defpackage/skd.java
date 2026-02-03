package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        shu shuVar = null;
        sjw sjwVar = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListZ = dclv.z(parcel, i, sjy.CREATOR);
            } else if (iD == 2) {
                shuVar = (shu) dclv.n(parcel, i, shu.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                sjwVar = (sjw) dclv.n(parcel, i, sjw.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new skc(arrayListZ, shuVar, sjwVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new skc[i];
    }
}

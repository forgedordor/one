package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Flag[] flagArr = null;
        int iF = 0;
        String[] strArrK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                flagArr = (Flag[]) dclv.J(parcel, i, Flag.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strArrK = dclv.K(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new Configuration(iF, flagArr, strArrK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.BrellaInvocationOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddit implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        InAppTrainingConstraints inAppTrainingConstraints = null;
        byte[] bArrE = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 3) {
                iF = dclv.f(parcel, i);
            } else if (iD == 4) {
                inAppTrainingConstraints = (InAppTrainingConstraints) dclv.n(parcel, i, InAppTrainingConstraints.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new BrellaInvocationOptions(strT, strT2, iF, inAppTrainingConstraints, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrellaInvocationOptions[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.ExampleConsumption;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddiv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                iF = dclv.f(parcel, i);
            } else if (iD == 4) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bArrE3 = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ExampleConsumption(strT, bArrE, iF, bArrE2, bArrE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExampleConsumption[i];
    }
}

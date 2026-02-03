package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        String strT = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD == 4) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bArrE3 = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SignResponseData(bArrE, strT, bArrE2, bArrE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignResponseData[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                jI = dclv.i(parcel, i);
            } else if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                bArrE3 = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CableAuthenticationData(jI, bArrE, bArrE2, bArrE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CableAuthenticationData[i];
    }
}

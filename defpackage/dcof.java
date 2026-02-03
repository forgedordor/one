package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.GetIidTokenResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcof implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        String strT = null;
        String strT2 = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 3) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                jI = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetIidTokenResponse(strT, strT2, bArrE, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetIidTokenResponse[i];
    }
}

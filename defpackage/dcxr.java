package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        String[] strArrK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD == 4) {
                bArrE3 = dclv.E(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strArrK = dclv.K(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        dclh.m(bArrE);
        evqs evqsVarX = evqs.x(bArrE);
        dclh.m(bArrE2);
        evqs evqsVarX2 = evqs.x(bArrE2);
        dclh.m(bArrE3);
        return new AuthenticatorAttestationResponse(evqsVarX, evqsVarX2, evqs.x(bArrE3), strArrK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAttestationResponse[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        byte[] bArrE4 = null;
        byte[] bArrE5 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD == 4) {
                bArrE3 = dclv.E(parcel, i);
            } else if (iD == 5) {
                bArrE4 = dclv.E(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                bArrE5 = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        dclh.m(bArrE);
        evqs evqsVarX = evqs.x(bArrE);
        dclh.m(bArrE2);
        evqs evqsVarX2 = evqs.x(bArrE2);
        dclh.m(bArrE3);
        evqs evqsVarX3 = evqs.x(bArrE3);
        dclh.m(bArrE4);
        return new AuthenticatorAssertionResponse(evqsVarX, evqsVarX2, evqsVarX3, evqs.x(bArrE4), bArrE5 != null ? evqs.x(bArrE5) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAssertionResponse[i];
    }
}

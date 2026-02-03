package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AuthenticationExtensionsPrfOutputs(zD, bArrE != null ? evqs.x(bArrE) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsPrfOutputs[i];
    }
}

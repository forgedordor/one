package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsDevicePublicKeyOutputs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bArrE2 = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AuthenticationExtensionsDevicePublicKeyOutputs(bArrE == null ? null : evqs.x(bArrE), bArrE2 != null ? evqs.x(bArrE2) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsDevicePublicKeyOutputs[i];
    }
}

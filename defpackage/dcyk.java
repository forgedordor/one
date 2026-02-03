package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 2) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD == 3) {
                bArrE3 = dclv.E(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new HmacSecretExtension(bArrE == null ? null : evqs.x(bArrE), bArrE2 == null ? null : evqs.x(bArrE2), bArrE3 != null ? evqs.x(bArrE3) : null, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HmacSecretExtension[i];
    }
}

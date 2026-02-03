package defpackage;

import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Signature[] signatureArr = null;
        boolean zD = false;
        boolean zD2 = false;
        Signature[] signatureArr2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD == 2) {
                zD2 = dclv.D(parcel, i);
            } else if (iD == 3) {
                signatureArr = (Signature[]) dclv.J(parcel, i, Signature.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                signatureArr2 = (Signature[]) dclv.J(parcel, i, Signature.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SigningInfoCompat(zD, zD2, signatureArr, signatureArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SigningInfoCompat[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.AttestationVerifier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        byte[][] bArrL = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                bArrL = dclv.L(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AttestationVerifier(bArrL, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AttestationVerifier[i];
    }
}

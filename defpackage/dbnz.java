package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.account.device.AddCastCertificateToDeviceAccountRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[][] bArrL = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bArrL = dclv.L(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AddCastCertificateToDeviceAccountRequest(strT, bArrL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddCastCertificateToDeviceAccountRequest[i];
    }
}

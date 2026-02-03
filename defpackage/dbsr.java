package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.OtpRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        String strT = null;
        AppDescription appDescription = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
            } else if (iD == 4) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new OtpRequest(iF, strT, appDescription, bArrE, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OtpRequest[i];
    }
}

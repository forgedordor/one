package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.asterism.GetAsterismConsentResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        String strT = "";
        String strT2 = strT;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iF3 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetAsterismConsentResponse(iF, iF2, strT, strT2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAsterismConsentResponse[i];
    }
}

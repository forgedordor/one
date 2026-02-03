package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.asterism.SetAsterismConsentResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbll implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = "";
        int iF = 0;
        String strT2 = "";
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SetAsterismConsentResponse(iF, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetAsterismConsentResponse[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carrierauth.EAPAKARequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        String strT = null;
        Integer numR = null;
        Integer numR2 = null;
        Integer numR3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                numR = dclv.r(parcel, i);
            } else if (iD == 3) {
                numR2 = dclv.r(parcel, i);
            } else if (iD == 4) {
                numR3 = dclv.r(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new EAPAKARequest(strT, numR, numR2, numR3, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EAPAKARequest[i];
    }
}

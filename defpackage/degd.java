package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.CallSpamOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        long jI2 = 0;
        int iF = 0;
        int iF2 = 0;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                jI = dclv.i(parcel, i);
            } else if (iD == 4) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                jI2 = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CallSpamOptions(iF, strT, jI, iF2, jI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallSpamOptions[i];
    }
}

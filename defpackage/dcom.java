package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.PhoneNumberVerification;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcom implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        long jI2 = 0;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        String strT = null;
        String strT2 = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    jI = dclv.i(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 7:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 8:
                    jI2 = dclv.i(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PhoneNumberVerification(strT, jI, iF, iF2, strT2, bundleK, iF3, jI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneNumberVerification[i];
    }
}

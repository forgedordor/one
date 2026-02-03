package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.RegistrationInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        int iF2 = 0;
        int iF3 = 0;
        String strT = null;
        String[] strArrK = null;
        byte[] bArrE = null;
        int[] iArrH = null;
        String strT2 = null;
        byte[] bArrE2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    strArrK = dclv.K(parcel, i);
                    break;
                case 4:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 8:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 9:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 10:
                    iF3 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new RegistrationInfo(strT, iF, strArrK, bArrE, zD, iArrH, strT2, bArrE2, iF2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegistrationInfo[i];
    }
}

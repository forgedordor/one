package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        String strT = null;
        int[] iArrH = null;
        byte[] bArrE = null;
        Bundle[] bundleArr = null;
        Bundle[] bundleArr2 = null;
        Bundle[] bundleArr3 = null;
        int[] iArrH2 = null;
        String[] strArrK = null;
        byte[] bArrE2 = null;
        double[] dArrF = null;
        Bundle bundleK = null;
        long[] jArrI = null;
        long[] jArrI2 = null;
        Bundle[] bundleArr4 = null;
        int[] iArrH3 = null;
        byte[] bArrE3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 3:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 4:
                    bundleArr = (Bundle[]) dclv.J(parcel, i, Bundle.CREATOR);
                    break;
                case 5:
                    bundleArr2 = (Bundle[]) dclv.J(parcel, i, Bundle.CREATOR);
                    break;
                case 6:
                    bundleArr3 = (Bundle[]) dclv.J(parcel, i, Bundle.CREATOR);
                    break;
                case 7:
                    iF = dclv.f(parcel, i);
                    break;
                case 8:
                    iArrH2 = dclv.H(parcel, i);
                    break;
                case 9:
                    strArrK = dclv.K(parcel, i);
                    break;
                case 10:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 11:
                    dArrF = dclv.F(parcel, i);
                    break;
                case 12:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 13:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 14:
                    jArrI = dclv.I(parcel, i);
                    break;
                case 15:
                    jArrI2 = dclv.I(parcel, i);
                    break;
                case 16:
                    bundleArr4 = (Bundle[]) dclv.J(parcel, i, Bundle.CREATOR);
                    break;
                case 17:
                    iArrH3 = dclv.H(parcel, i);
                    break;
                case 18:
                    bArrE3 = dclv.E(parcel, i);
                    break;
                case 19:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SearchResults(strT, iArrH, bArrE, bundleArr, bundleArr2, bundleArr3, iF, iArrH2, strArrK, bArrE2, dArrF, bundleK, iF2, jArrI, jArrI2, bundleArr4, iArrH3, bArrE3, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchResults[i];
    }
}

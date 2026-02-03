package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[] bArrE = null;
        byte[][] bArrL = null;
        byte[][] bArrL2 = null;
        byte[][] bArrL3 = null;
        byte[][] bArrL4 = null;
        int[] iArrH = null;
        byte[][] bArrL5 = null;
        int[] iArrH2 = null;
        byte[][] bArrL6 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 4:
                    bArrL = dclv.L(parcel, i);
                    break;
                case 5:
                    bArrL2 = dclv.L(parcel, i);
                    break;
                case 6:
                    bArrL3 = dclv.L(parcel, i);
                    break;
                case 7:
                    bArrL4 = dclv.L(parcel, i);
                    break;
                case 8:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 9:
                    bArrL5 = dclv.L(parcel, i);
                    break;
                case 10:
                    iArrH2 = dclv.H(parcel, i);
                    break;
                case 11:
                    bArrL6 = dclv.L(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ExperimentTokens(strT, bArrE, bArrL, bArrL2, bArrL3, bArrL4, iArrH, bArrL5, iArrH2, bArrL6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}

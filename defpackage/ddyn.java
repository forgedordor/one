package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyn implements Parcelable.Creator {
    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        String strT = null;
        String strT2 = null;
        byte[] bArrE = null;
        double dB = 0.0d;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    jI = dclv.i(parcel, i);
                    break;
                case 4:
                    zD = dclv.D(parcel, i);
                    break;
                case 5:
                    dB = dclv.b(parcel, i);
                    break;
                case 6:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 7:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 8:
                    iF = dclv.f(parcel, i);
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
        return new Flag(strT, jI, zD, dB, strT2, bArrE, iF, iF2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }
}

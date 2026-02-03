package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        int iF5 = 0;
        int iF6 = 0;
        int iF7 = 0;
        int iF8 = 0;
        int iF9 = 0;
        int iF10 = 0;
        int iF11 = 0;
        boolean zD = false;
        int iF12 = 0;
        int iF13 = 0;
        int iF14 = 0;
        int iF15 = 0;
        int iF16 = 0;
        int iF17 = 0;
        int iF18 = 0;
        int iF19 = 0;
        int iF20 = 0;
        int iF21 = 0;
        int iF22 = 0;
        byte[] bArrE = null;
        int[] iArrH = null;
        long jI = 0;
        long jI2 = 0;
        long jI3 = 0;
        long jI4 = 0;
        long jI5 = 0;
        long jI6 = 0;
        long jI7 = 0;
        long jI8 = 0;
        long jI9 = 0;
        long jI10 = 0;
        long jI11 = 0;
        long jI12 = 0;
        int iF23 = -1;
        int iF24 = -1;
        float fC = 0.0f;
        double dB = 0.0d;
        double dB2 = 0.0d;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 3:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 4:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 5:
                    jI = dclv.i(parcel, i);
                    break;
                case 6:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 7:
                    iF6 = dclv.f(parcel, i);
                    break;
                case 8:
                    iF7 = dclv.f(parcel, i);
                    break;
                case 9:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 10:
                    jI3 = dclv.i(parcel, i);
                    break;
                case 11:
                    jI4 = dclv.i(parcel, i);
                    break;
                case 12:
                    jI5 = dclv.i(parcel, i);
                    break;
                case 13:
                    jI6 = dclv.i(parcel, i);
                    break;
                case 14:
                    jI7 = dclv.i(parcel, i);
                    break;
                case 15:
                    iF8 = dclv.f(parcel, i);
                    break;
                case 16:
                    iF9 = dclv.f(parcel, i);
                    break;
                case 17:
                    iF10 = dclv.f(parcel, i);
                    break;
                case 18:
                    iF11 = dclv.f(parcel, i);
                    break;
                case 19:
                    zD = dclv.D(parcel, i);
                    break;
                case 20:
                    iF12 = dclv.f(parcel, i);
                    break;
                case 21:
                    jI8 = dclv.i(parcel, i);
                    break;
                case 22:
                    dB = dclv.b(parcel, i);
                    break;
                case 23:
                    dB2 = dclv.b(parcel, i);
                    break;
                case 24:
                    iF13 = dclv.f(parcel, i);
                    break;
                case 25:
                    fC = dclv.c(parcel, i);
                    break;
                case 26:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 27:
                    iF14 = dclv.f(parcel, i);
                    break;
                case 28:
                    iF15 = dclv.f(parcel, i);
                    break;
                case 29:
                    jI9 = dclv.i(parcel, i);
                    break;
                case 30:
                    jI10 = dclv.i(parcel, i);
                    break;
                case 31:
                    iF23 = dclv.f(parcel, i);
                    break;
                case 32:
                    iF16 = dclv.f(parcel, i);
                    break;
                case 33:
                    iF17 = dclv.f(parcel, i);
                    break;
                case 34:
                    iF18 = dclv.f(parcel, i);
                    break;
                case 35:
                    iF19 = dclv.f(parcel, i);
                    break;
                case 36:
                    iF20 = dclv.f(parcel, i);
                    break;
                case 37:
                    iF24 = dclv.f(parcel, i);
                    break;
                case 38:
                    iF21 = dclv.f(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    jI11 = dclv.i(parcel, i);
                    break;
                case 40:
                    jI12 = dclv.i(parcel, i);
                    break;
                case 41:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 42:
                    iF22 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new shu(iF, iF2, iF3, iF4, jI, iF5, iF6, iF7, jI2, jI3, jI4, jI5, jI6, jI7, iF8, iF9, iF10, iF11, zD, iF12, jI8, dB, dB2, iF13, fC, bArrE, iF14, iF15, jI9, jI10, iF23, iF16, iF17, iF18, iF19, iF20, iF24, iF21, jI11, jI12, iArrH, iF22);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new shu[i];
    }
}

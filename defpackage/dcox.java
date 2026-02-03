package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contactkeys.E2eeContactKeyParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        byte[] bArrE = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        int iF = 0;
        int iF2 = 0;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 3:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 5:
                    jI = dclv.i(parcel, i);
                    break;
                case 6:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 7:
                    iF = dclv.f(parcel, i);
                    break;
                case 8:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 9:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 10:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 11:
                    strT7 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new E2eeContactKeyParcelable(strT, strT2, strT3, strT4, jI, bArrE, iF, iF2, strT5, strT6, strT7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E2eeContactKeyParcelable[i];
    }
}

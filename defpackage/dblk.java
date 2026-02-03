package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblk implements Parcelable.Creator {
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
        String strT = "";
        String strT2 = strT;
        String strT3 = strT2;
        int[] iArrH = null;
        Long lS = null;
        Bundle bundleK = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
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
                    iArrH = dclv.H(parcel, i);
                    break;
                case 5:
                    lS = dclv.s(parcel, i);
                    break;
                case 6:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 7:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 8:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 9:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 10:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 11:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 12:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 13:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 14:
                    strT = dclv.t(parcel, i);
                    break;
                case 15:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 16:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 17:
                    iF6 = dclv.f(parcel, i);
                    break;
                case 18:
                    iF7 = dclv.f(parcel, i);
                    break;
                case 19:
                    iF8 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SetAsterismConsentRequest(iF, iF2, iF3, iArrH, lS, iF4, bundleK, iF5, strT4, strT5, strT6, strT7, strT8, strT, strT2, strT3, iF6, iF7, iF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetAsterismConsentRequest[i];
    }
}

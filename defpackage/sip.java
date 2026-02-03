package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sip implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        ArrayList arrayListY = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        String strT = null;
        Bundle bundleK = null;
        smg smgVar = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        boolean zD = false;
        int iF4 = 0;
        int iF5 = 0;
        int iF6 = 0;
        int iF7 = 0;
        float fC = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    arrayListZ = dclv.z(parcel, i, sik.CREATOR);
                    break;
                case 2:
                    fC = dclv.c(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 5:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 6:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 7:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                case 9:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 10:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 11:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 12:
                    iF6 = dclv.f(parcel, i);
                    break;
                case 13:
                    strT = dclv.t(parcel, i);
                    break;
                case 14:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 15:
                    iF7 = dclv.f(parcel, i);
                    break;
                case 16:
                    smgVar = (smg) dclv.n(parcel, i, smg.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new sio(arrayListZ, fC, iF, arrayListY, iF2, iF3, iBinderL, zD, iF4, iBinderL2, iF5, iF6, strT, bundleK, iF7, smgVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sio[i];
    }
}

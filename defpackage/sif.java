package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sif implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        String strT = null;
        Float fQ = null;
        Integer numR = null;
        smg smgVar = null;
        ArrayList arrayListZ2 = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    arrayListZ = dclv.z(parcel, i, sic.CREATOR);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 4:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 5:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 6:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    fQ = dclv.q(parcel, i);
                    break;
                case 9:
                    numR = dclv.r(parcel, i);
                    break;
                case 10:
                    smgVar = (smg) dclv.n(parcel, i, smg.CREATOR);
                    break;
                case 11:
                    arrayListZ2 = dclv.z(parcel, i, shy.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new sie(arrayListZ, iF, iBinderL, iF2, iF3, iBinderL2, strT, fQ, numR, smgVar, arrayListZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sie[i];
    }
}

package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        IBinder iBinderL = null;
        smg smgVar = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
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
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 5:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 6:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 7:
                    smgVar = (smg) dclv.n(parcel, i, smg.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new siu(strT, iF, iF2, iBinderL, iF3, iF4, smgVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new siu[i];
    }
}

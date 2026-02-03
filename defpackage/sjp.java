package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        ArrayList arrayListY = null;
        String strT3 = null;
        smg smgVar = null;
        int iF = 0;
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
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 5:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 6:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 7:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 8:
                    smgVar = (smg) dclv.n(parcel, i, smg.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new sjo(strT, strT2, iF, iBinderL, iBinderL2, arrayListY, strT3, smgVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sjo[i];
    }
}

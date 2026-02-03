package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sha implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                arrayListY = dclv.y(parcel, i);
            } else if (iD == 3) {
                arrayListY2 = dclv.y(parcel, i);
            } else if (iD == 4) {
                zD = dclv.D(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                zD2 = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new sgz(iF, arrayListY, arrayListY2, zD, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sgz[i];
    }
}

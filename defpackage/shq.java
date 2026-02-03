package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        ArrayList arrayListZ = null;
        IBinder iBinderL = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListZ = dclv.z(parcel, i, Bitmap.CREATOR);
            } else if (iD == 2) {
                iBinderL = dclv.l(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new shp(arrayListZ, iBinderL, strT, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new shp[i];
    }
}

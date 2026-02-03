package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Rect rect = null;
        ArrayList arrayListZ = null;
        String strT2 = null;
        ArrayList arrayListZ2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                rect = (Rect) dclv.n(parcel, i, Rect.CREATOR);
            } else if (iD == 3) {
                arrayListZ = dclv.z(parcel, i, Point.CREATOR);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                arrayListZ2 = dclv.z(parcel, i, evbe.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new evba(strT, rect, arrayListZ, strT2, arrayListZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new evba[i];
    }
}

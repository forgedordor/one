package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Rect rect = null;
        ArrayList arrayListZ = null;
        String strT2 = null;
        ArrayList arrayListZ2 = null;
        float fC = 0.0f;
        float fC2 = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    rect = (Rect) dclv.n(parcel, i, Rect.CREATOR);
                    break;
                case 3:
                    arrayListZ = dclv.z(parcel, i, Point.CREATOR);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    fC = dclv.c(parcel, i);
                    break;
                case 6:
                    fC2 = dclv.c(parcel, i);
                    break;
                case 7:
                    arrayListZ2 = dclv.z(parcel, i, evbk.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new evbc(strT, rect, arrayListZ, strT2, fC, fC2, arrayListZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new evbc[i];
    }
}

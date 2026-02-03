package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListY = dclv.y(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                arrayListY2 = dclv.y(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new skw(arrayListY, arrayListY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new skw[i];
    }
}

package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String[] strArrK = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleK = null;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strArrK = dclv.K(parcel, i);
            } else if (iD == 2) {
                cursorWindowArr = (CursorWindow[]) dclv.J(parcel, i, CursorWindow.CREATOR);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 4) {
                bundleK = dclv.k(parcel, i);
            } else if (iD != 1000) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        DataHolder dataHolder = new DataHolder(iF, strArrK, cursorWindowArr, iF2, bundleK);
        dataHolder.e();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}

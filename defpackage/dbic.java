package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbic implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Bundle bundleK = null;
        Bundle bundleK2 = null;
        Bundle bundleK3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                bundleK = dclv.k(parcel, i);
            } else if (iD == 3) {
                bundleK2 = dclv.k(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                bundleK3 = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DocumentResults(strT, bundleK, bundleK2, bundleK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DocumentResults[i];
    }
}

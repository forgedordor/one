package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Bundle bundleK = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD == 2) {
                zD2 = dclv.D(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD == 4) {
                zD3 = dclv.D(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ParcelableListOptions(zD, zD2, zD3, strT, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableListOptions[i];
    }
}

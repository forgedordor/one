package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.Features;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundleK = null;
        Bundle bundleK2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                bundleK = dclv.k(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bundleK2 = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new Features(bundleK, bundleK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Features[i];
    }
}

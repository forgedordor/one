package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.FeatureStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Integer numR = null;
        Integer numR2 = null;
        Float fQ = null;
        Float fQ2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                numR = dclv.r(parcel, i);
            } else if (iD == 2) {
                numR2 = dclv.r(parcel, i);
            } else if (iD == 3) {
                fQ = dclv.q(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                fQ2 = dclv.q(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new FeatureStyle(numR, numR2, fQ, fQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeatureStyle[i];
    }
}

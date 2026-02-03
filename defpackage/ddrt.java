package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        LatLng latLng = null;
        String strT = null;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PointOfInterest(latLng, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }
}

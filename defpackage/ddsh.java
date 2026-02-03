package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD == 3) {
                latLng2 = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD == 4) {
                latLng3 = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD == 5) {
                latLng4 = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                latLngBounds = (LatLngBounds) dclv.n(parcel, i, LatLngBounds.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) dclv.J(parcel, i, StreetViewPanoramaLink.CREATOR);
            } else if (iD == 3) {
                latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}

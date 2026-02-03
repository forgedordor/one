package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String strT = null;
        LatLng latLng = null;
        Integer numR = null;
        StreetViewSource streetViewSource = null;
        byte bA = 0;
        byte bA2 = 0;
        byte bA3 = 0;
        byte bA4 = 0;
        byte bA5 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) dclv.n(parcel, i, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
                    break;
                case 5:
                    numR = dclv.r(parcel, i);
                    break;
                case 6:
                    bA = dclv.a(parcel, i);
                    break;
                case 7:
                    bA2 = dclv.a(parcel, i);
                    break;
                case 8:
                    bA3 = dclv.a(parcel, i);
                    break;
                case 9:
                    bA4 = dclv.a(parcel, i);
                    break;
                case 10:
                    bA5 = dclv.a(parcel, i);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) dclv.n(parcel, i, StreetViewSource.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, strT, latLng, numR, bA, bA2, bA3, bA4, bA5, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}

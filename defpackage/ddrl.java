package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        float fC = 0.0f;
        float fC2 = 0.0f;
        float fC3 = 0.0f;
        float fC4 = 0.0f;
        float fC5 = 0.0f;
        float fC6 = 0.0f;
        float fC7 = 0.0f;
        IBinder iBinderL = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 3:
                    latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
                    break;
                case 4:
                    fC = dclv.c(parcel, i);
                    break;
                case 5:
                    fC2 = dclv.c(parcel, i);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) dclv.n(parcel, i, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fC3 = dclv.c(parcel, i);
                    break;
                case 8:
                    fC4 = dclv.c(parcel, i);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    fC5 = dclv.c(parcel, i);
                    break;
                case 11:
                    fC6 = dclv.c(parcel, i);
                    break;
                case 12:
                    fC7 = dclv.c(parcel, i);
                    break;
                case 13:
                    zD2 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GroundOverlayOptions(iBinderL, latLng, fC, fC2, latLngBounds, fC3, fC4, zD, fC5, fC6, fC7, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}

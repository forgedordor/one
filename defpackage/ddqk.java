package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        CameraPosition cameraPosition = null;
        Float fQ = null;
        Float fQ2 = null;
        LatLngBounds latLngBounds = null;
        Integer numR = null;
        String strT = null;
        byte bA = -1;
        byte bA2 = -1;
        byte bA3 = -1;
        byte bA4 = -1;
        byte bA5 = -1;
        byte bA6 = -1;
        byte bA7 = -1;
        byte bA8 = -1;
        byte bA9 = -1;
        byte bA10 = -1;
        byte bA11 = -1;
        byte bA12 = -1;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    bA = dclv.a(parcel, i);
                    break;
                case 3:
                    bA2 = dclv.a(parcel, i);
                    break;
                case 4:
                    iF = dclv.f(parcel, i);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) dclv.n(parcel, i, CameraPosition.CREATOR);
                    break;
                case 6:
                    bA3 = dclv.a(parcel, i);
                    break;
                case 7:
                    bA4 = dclv.a(parcel, i);
                    break;
                case 8:
                    bA5 = dclv.a(parcel, i);
                    break;
                case 9:
                    bA6 = dclv.a(parcel, i);
                    break;
                case 10:
                    bA7 = dclv.a(parcel, i);
                    break;
                case 11:
                    bA8 = dclv.a(parcel, i);
                    break;
                case 12:
                    bA9 = dclv.a(parcel, i);
                    break;
                case 13:
                case 22:
                default:
                    dclv.C(parcel, i);
                    break;
                case 14:
                    bA10 = dclv.a(parcel, i);
                    break;
                case 15:
                    bA11 = dclv.a(parcel, i);
                    break;
                case 16:
                    fQ = dclv.q(parcel, i);
                    break;
                case 17:
                    fQ2 = dclv.q(parcel, i);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) dclv.n(parcel, i, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bA12 = dclv.a(parcel, i);
                    break;
                case 20:
                    numR = dclv.r(parcel, i);
                    break;
                case 21:
                    strT = dclv.t(parcel, i);
                    break;
                case 23:
                    iF2 = dclv.f(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GoogleMapOptions(bA, bA2, iF, cameraPosition, bA3, bA4, bA5, bA6, bA7, bA8, bA9, bA10, bA11, fQ, fQ2, latLngBounds, bA12, numR, strT, iF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}

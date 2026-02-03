package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        LatLng latLng = null;
        String strT = null;
        String strT2 = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        String strT3 = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        int iF = 0;
        int iF2 = 0;
        float fC = 0.0f;
        float fC2 = 0.0f;
        float fC3 = 0.0f;
        float fC4 = 0.0f;
        float fC5 = 0.0f;
        float fC6 = 1.0f;
        float fC7 = 0.5f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 6:
                    fC = dclv.c(parcel, i);
                    break;
                case 7:
                    fC2 = dclv.c(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                case 9:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 10:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 11:
                    fC3 = dclv.c(parcel, i);
                    break;
                case 12:
                    fC7 = dclv.c(parcel, i);
                    break;
                case 13:
                    fC4 = dclv.c(parcel, i);
                    break;
                case 14:
                    fC6 = dclv.c(parcel, i);
                    break;
                case 15:
                    fC5 = dclv.c(parcel, i);
                    break;
                case 16:
                default:
                    dclv.C(parcel, i);
                    break;
                case 17:
                    iF = dclv.f(parcel, i);
                    break;
                case 18:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 19:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 20:
                    strT3 = dclv.t(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new MarkerOptions(latLng, strT, strT2, iBinderL, fC, fC2, zD, zD2, zD3, fC3, fC7, fC4, fC6, fC5, iF, iBinderL2, iF2, strT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}

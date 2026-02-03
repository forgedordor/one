package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        LatLng latLng = null;
        ArrayList arrayListZ = null;
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        boolean zD2 = false;
        float fC = 0.0f;
        float fC2 = 0.0f;
        double dB = 0.0d;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    dB = dclv.b(parcel, i);
                    break;
                case 4:
                    fC = dclv.c(parcel, i);
                    break;
                case 5:
                    iF = dclv.f(parcel, i);
                    break;
                case 6:
                    iF2 = dclv.f(parcel, i);
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
                    arrayListZ = dclv.z(parcel, i, PatternItem.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new CircleOptions(latLng, dB, fC, iF, iF2, fC2, zD, zD2, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}

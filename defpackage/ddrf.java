package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        float fC = 0.0f;
        float fC2 = 0.0f;
        LatLng latLng = null;
        float fC3 = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD == 3) {
                fC = dclv.c(parcel, i);
            } else if (iD == 4) {
                fC3 = dclv.c(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                fC2 = dclv.c(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CameraPosition(latLng, fC, fC3, fC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}

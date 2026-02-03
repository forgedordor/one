package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                latLng = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                latLng2 = (LatLng) dclv.n(parcel, i, LatLng.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}

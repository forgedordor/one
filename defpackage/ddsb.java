package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        float fC = 0.0f;
        float fC2 = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                fC = dclv.c(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                fC2 = dclv.c(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new StreetViewPanoramaOrientation(fC, fC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        double dB = 0.0d;
        double dB2 = 0.0d;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                dB = dclv.b(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                dB2 = dclv.b(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new LatLng(dB, dB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}

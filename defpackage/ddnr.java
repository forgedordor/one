package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 1000;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 4) {
                iF = dclv.f(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new LocationAvailability(iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}

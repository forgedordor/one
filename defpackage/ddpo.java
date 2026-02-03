package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = Long.MAX_VALUE;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        LocationRequest locationRequest = null;
        ArrayList arrayListZ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                locationRequest = (LocationRequest) dclv.n(parcel, i, LocationRequest.CREATOR);
            } else if (iD == 5) {
                arrayListZ = dclv.z(parcel, i, ClientIdentity.CREATOR);
            } else if (iD == 8) {
                zD = dclv.D(parcel, i);
            } else if (iD != 9) {
                switch (iD) {
                    case 11:
                        zD3 = dclv.D(parcel, i);
                        break;
                    case 12:
                        zD4 = dclv.D(parcel, i);
                        break;
                    case 13:
                        dclv.t(parcel, i);
                        break;
                    case 14:
                        jI = dclv.i(parcel, i);
                        break;
                    default:
                        dclv.C(parcel, i);
                        break;
                }
            } else {
                zD2 = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new LocationRequestInternal(locationRequest, arrayListZ, zD, zD2, zD3, zD4, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}

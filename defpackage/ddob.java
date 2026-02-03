package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsStates;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddob implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        boolean zD6 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    zD = dclv.D(parcel, i);
                    break;
                case 2:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 3:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 4:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 5:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 6:
                    zD6 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LocationSettingsStates(zD, zD2, zD3, zD4, zD5, zD6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}

package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        float fC = 0.0f;
        float fC2 = 0.0f;
        boolean zD = true;
        boolean zD2 = false;
        IBinder iBinderL = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iBinderL = dclv.l(parcel, i);
            } else if (iD == 3) {
                zD2 = dclv.D(parcel, i);
            } else if (iD == 4) {
                fC = dclv.c(parcel, i);
            } else if (iD == 5) {
                zD = dclv.D(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                fC2 = dclv.c(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new TileOverlayOptions(iBinderL, zD2, fC, zD, fC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        StampStyle stampStyle = null;
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        float fC = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                fC = dclv.c(parcel, i);
            } else if (iD == 3) {
                iF = dclv.f(parcel, i);
            } else if (iD == 4) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 5) {
                zD = dclv.D(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                stampStyle = (StampStyle) dclv.n(parcel, i, StampStyle.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new StrokeStyle(fC, iF, iF2, zD, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StrokeStyle[i];
    }
}

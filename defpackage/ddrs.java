package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.PinConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PinConfig.Glyph glyph = null;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                glyph = (PinConfig.Glyph) dclv.n(parcel, i, PinConfig.Glyph.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new PinConfig(iF, iF2, glyph);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PinConfig[i];
    }
}

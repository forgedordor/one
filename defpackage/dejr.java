package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.SafetyOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                zD = dclv.D(parcel, i);
            } else if (iD == 3) {
                zD2 = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SafetyOptions(zD, zD2, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafetyOptions[i];
    }
}

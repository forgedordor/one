package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte bA = 0;
        byte bA2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                bA = dclv.a(parcel, i);
            } else if (iD == 3) {
                bA2 = dclv.a(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AmsEntityUpdateParcelable(bA, bA2, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }
}

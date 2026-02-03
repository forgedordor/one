package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        float fC = 0.0f;
        ArrayList arrayListZ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                fC = dclv.c(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, sgx.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new sjw(strT, fC, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sjw[i];
    }
}

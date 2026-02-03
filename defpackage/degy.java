package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.trustedtime.dto.GlobalState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        Long lS = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                lS = dclv.s(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GlobalState(lS, strT, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalState[i];
    }
}

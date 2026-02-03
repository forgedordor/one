package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        evbg evbgVar = null;
        shu shuVar = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                evbgVar = (evbg) dclv.n(parcel, i, evbg.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                shuVar = (shu) dclv.n(parcel, i, shu.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new sja(evbgVar, shuVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sja[i];
    }
}

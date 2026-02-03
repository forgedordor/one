package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class desw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        String strT = null;
        String strT2 = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 4) {
                iF = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new NodeParcelable(strT, strT2, iF, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NodeParcelable[i];
    }
}

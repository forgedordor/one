package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        int iF = 0;
        boolean zD2 = false;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 3:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 4:
                    zD = dclv.D(parcel, i);
                    break;
                case 5:
                    iF = dclv.f(parcel, i);
                    break;
                case 6:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new evbi(strT, strT2, strT3, zD, iF, strT4, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new evbi[i];
    }
}

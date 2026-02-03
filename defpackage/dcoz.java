package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contactkeys.E2eeSelfKeyParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        byte[] bArrE = null;
        long jI = 0;
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
                    jI = dclv.i(parcel, i);
                    break;
                case 5:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 6:
                    iF = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new E2eeSelfKeyParcelable(strT, strT2, strT3, jI, bArrE, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E2eeSelfKeyParcelable[i];
    }
}

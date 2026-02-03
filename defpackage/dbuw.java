package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.frp.FrpSnapshot;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbuw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 4:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 5:
                    break;
                case 6:
                    dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new FrpSnapshot(iF, zD, zD2, zD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FrpSnapshot[i];
    }
}

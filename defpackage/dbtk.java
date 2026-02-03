package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AppDescription(iF, iF2, strT, strT2, strT3, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppDescription[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        String strT10 = null;
        String strT11 = null;
        String strT12 = null;
        String strT13 = null;
        String strT14 = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 9:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 10:
                    strT9 = dclv.t(parcel, i);
                    break;
                case 11:
                    strT10 = dclv.t(parcel, i);
                    break;
                case 12:
                    strT11 = dclv.t(parcel, i);
                    break;
                case 13:
                    strT12 = dclv.t(parcel, i);
                    break;
                case 14:
                    zD = dclv.D(parcel, i);
                    break;
                case 15:
                    strT13 = dclv.t(parcel, i);
                    break;
                case 16:
                    strT14 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new UserAddress(strT, strT2, strT3, strT4, strT5, strT6, strT7, strT8, strT9, strT10, strT11, strT12, zD, strT13, strT14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }
}

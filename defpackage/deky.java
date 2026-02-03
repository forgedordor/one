package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deky implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CommonWalletObject commonWalletObject = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        long jI = 0;
        long jI2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    commonWalletObject = (CommonWalletObject) dclv.n(parcel, i, CommonWalletObject.CREATOR);
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
                    jI = dclv.i(parcel, i);
                    break;
                case 7:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 8:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 9:
                    strT5 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GiftCardWalletObject(commonWalletObject, strT, strT2, strT3, jI, strT4, jI2, strT5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }
}

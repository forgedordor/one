package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        Bundle bundleK = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                bundleK = dclv.k(parcel, i);
            } else if (iD == 4) {
                strT = dclv.t(parcel, i);
            } else if (iD == 5) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                iF3 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new WalletCustomTheme(iF, bundleK, strT, iF2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletCustomTheme[i];
    }
}

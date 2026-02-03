package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.WalletFragmentStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 1;
        int iF2 = 0;
        WalletFragmentStyle walletFragmentStyle = null;
        int iF3 = 1;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 4) {
                walletFragmentStyle = (WalletFragmentStyle) dclv.n(parcel, i, WalletFragmentStyle.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iF3 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new WalletFragmentOptions(iF, iF2, walletFragmentStyle, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentOptions[i];
    }
}

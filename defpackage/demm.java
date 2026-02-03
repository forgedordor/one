package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        MaskedWallet maskedWallet = null;
        int iF = -1;
        MaskedWalletRequest maskedWalletRequest = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                maskedWalletRequest = (MaskedWalletRequest) dclv.n(parcel, i, MaskedWalletRequest.CREATOR);
            } else if (iD == 4) {
                iF = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                maskedWallet = (MaskedWallet) dclv.n(parcel, i, MaskedWallet.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new WalletFragmentInitParams(strT, maskedWalletRequest, iF, maskedWallet);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }
}

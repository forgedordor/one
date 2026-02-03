package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        WalletCustomTheme walletCustomTheme = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                bArrE2 = dclv.E(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                walletCustomTheme = (WalletCustomTheme) dclv.n(parcel, i, WalletCustomTheme.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ExecuteBuyFlowRequest(bArrE, bArrE2, walletCustomTheme);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExecuteBuyFlowRequest[i];
    }
}

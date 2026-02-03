package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        double dB = 0.0d;
        double dB2 = 0.0d;
        Account account = null;
        Bundle bundleK = null;
        WalletCustomTheme walletCustomTheme = null;
        int iF4 = 1;
        int iF5 = 1;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 3:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 7:
                    walletCustomTheme = (WalletCustomTheme) dclv.n(parcel, i, WalletCustomTheme.CREATOR);
                    break;
                case 8:
                    iF = dclv.f(parcel, i);
                    break;
                case 9:
                    dB = dclv.b(parcel, i);
                    break;
                case 10:
                    dB2 = dclv.b(parcel, i);
                    break;
                case 11:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 12:
                    iF3 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ApplicationParameters(iF4, account, bundleK, zD, iF5, walletCustomTheme, iF, dB, dB2, iF2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationParameters[i];
    }
}

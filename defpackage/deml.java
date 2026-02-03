package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.setupwizard.SetupWizardInstrumentManagerParams;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deml implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        Account account = null;
        byte[] bArrE = null;
        BuyFlowConfig buyFlowConfig = null;
        String strT = null;
        byte[] bArrE2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 2:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 3:
                    buyFlowConfig = (BuyFlowConfig) dclv.n(parcel, i, BuyFlowConfig.CREATOR);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SetupWizardInstrumentManagerParams(account, bArrE, buyFlowConfig, strT, bArrE2, zD, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupWizardInstrumentManagerParams[i];
    }
}

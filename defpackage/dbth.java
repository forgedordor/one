package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbth implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundle = new Bundle();
        boolean zD = true;
        String strT = null;
        String strT2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        boolean zD2 = false;
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
                    bundle = dclv.k(parcel, i);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) dclv.n(parcel, i, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) dclv.n(parcel, i, PACLConfig.CREATOR);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 8:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 9:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 10:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dclv.n(parcel, i, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 11:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new TokenWorkflowRequest(strT, strT2, bundle, fACLConfig, pACLConfig, zD2, appDescription, account, accountAuthenticatorResponse, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenWorkflowRequest[i];
    }
}

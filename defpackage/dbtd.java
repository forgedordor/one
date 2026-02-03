package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundle = new Bundle();
        String strT = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 4:
                    bundle = dclv.k(parcel, i);
                    break;
                case 5:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dclv.n(parcel, i, AccountAuthenticatorResponse.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ConfirmCredentialsWorkflowRequest(iF, strT, appDescription, bundle, account, accountAuthenticatorResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConfirmCredentialsWorkflowRequest[i];
    }
}

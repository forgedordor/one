package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        Account account = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                accountAuthenticatorResponse = (AccountAuthenticatorResponse) dclv.n(parcel, i, AccountAuthenticatorResponse.CREATOR);
            } else if (iD == 2) {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AccountRemovalAllowedWorkflowRequest(accountAuthenticatorResponse, account, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountRemovalAllowedWorkflowRequest[i];
    }
}

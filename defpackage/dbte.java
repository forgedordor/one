package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbte implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundleK = null;
        AppDescription appDescription = null;
        String strT = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                bundleK = dclv.k(parcel, i);
            } else if (iD == 3) {
                appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
            } else if (iD == 4) {
                strT = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                accountAuthenticatorResponse = (AccountAuthenticatorResponse) dclv.n(parcel, i, AccountAuthenticatorResponse.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new FinishSessionWorkflowRequest(iF, bundleK, appDescription, strT, accountAuthenticatorResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FinishSessionWorkflowRequest[i];
    }
}

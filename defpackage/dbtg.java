package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundle = new Bundle();
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        String strT = "null";
        String strT2 = strT;
        ArrayList arrayListY = null;
        AppDescription appDescription = null;
        String strT3 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 3:
                    bundle = dclv.k(parcel, i);
                    break;
                case 4:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dclv.n(parcel, i, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 7:
                    zD = dclv.D(parcel, i);
                    break;
                case 8:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 9:
                    strT = dclv.t(parcel, i);
                    break;
                case 10:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 11:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 12:
                    zD4 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new StartAddAccountSessionWorkflowRequest(iF, arrayListY, bundle, appDescription, strT3, accountAuthenticatorResponse, zD, zD2, strT, strT2, zD3, zD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StartAddAccountSessionWorkflowRequest[i];
    }
}

package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundle = new Bundle();
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        boolean zD6 = false;
        boolean zD7 = false;
        boolean zD8 = false;
        boolean zD9 = false;
        boolean zD10 = false;
        int iF2 = 0;
        boolean zD11 = false;
        ArrayList arrayListY = null;
        AppDescription appDescription = null;
        String strT = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        String strT2 = null;
        String strT3 = null;
        ManagedAuthOptions managedAuthOptions = null;
        String strT4 = null;
        String strT5 = "null";
        String strT6 = strT5;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 4:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 5:
                    bundle = dclv.k(parcel, i);
                    break;
                case 6:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 7:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 8:
                    strT = dclv.t(parcel, i);
                    break;
                case 9:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dclv.n(parcel, i, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 10:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 11:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 12:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 13:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 14:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 15:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 16:
                    zD6 = dclv.D(parcel, i);
                    break;
                case 17:
                    zD7 = dclv.D(parcel, i);
                    break;
                case 18:
                    zD8 = dclv.D(parcel, i);
                    break;
                case 19:
                    zD9 = dclv.D(parcel, i);
                    break;
                case 20:
                    managedAuthOptions = (ManagedAuthOptions) dclv.n(parcel, i, ManagedAuthOptions.CREATOR);
                    break;
                case 21:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 22:
                    zD10 = dclv.D(parcel, i);
                    break;
                case 23:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 24:
                    zD11 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SetupAccountWorkflowRequest(iF, zD, zD2, arrayListY, bundle, appDescription, zD3, strT, accountAuthenticatorResponse, zD4, zD5, strT5, strT6, strT2, strT3, zD6, zD7, zD8, zD9, managedAuthOptions, strT4, zD10, iF2, zD11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupAccountWorkflowRequest[i];
    }
}

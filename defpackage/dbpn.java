package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.BiometricPromptUiOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        String strT = null;
        String strT2 = null;
        BrowserOptions browserOptions = null;
        Account account = null;
        Bundle bundleK = null;
        ResultReceiver resultReceiver = null;
        BiometricPromptUiOptions biometricPromptUiOptions = null;
        long jI = 0;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) dclv.n(parcel, i, PublicKeyCredentialCreationOptions.CREATOR);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    browserOptions = (BrowserOptions) dclv.n(parcel, i, BrowserOptions.CREATOR);
                    break;
                case 6:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 7:
                    iF = dclv.f(parcel, i);
                    break;
                case 8:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    jI = dclv.i(parcel, i);
                    break;
                case 11:
                    resultReceiver = (ResultReceiver) dclv.n(parcel, i, ResultReceiver.CREATOR);
                    break;
                case 12:
                    biometricPromptUiOptions = (BiometricPromptUiOptions) dclv.n(parcel, i, BiometricPromptUiOptions.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new RegistrationOptions(publicKeyCredentialCreationOptions, strT, strT2, browserOptions, account, iF, bundleK, Boolean.valueOf(zD), jI, resultReceiver, biometricPromptUiOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegistrationOptions[i];
    }
}

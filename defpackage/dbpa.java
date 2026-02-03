package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.BiometricPromptUiOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        String strT = null;
        String strT2 = null;
        BrowserOptions browserOptions = null;
        Bundle bundleK = null;
        ResultReceiver resultReceiver = null;
        BiometricPromptUiOptions biometricPromptUiOptions = null;
        long jI = 0;
        int iF = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) dclv.n(parcel, i, PublicKeyCredentialRequestOptions.CREATOR);
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
                    iF = dclv.f(parcel, i);
                    break;
                case 7:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                case 9:
                    jI = dclv.i(parcel, i);
                    break;
                case 10:
                    resultReceiver = (ResultReceiver) dclv.n(parcel, i, ResultReceiver.CREATOR);
                    break;
                case 11:
                    biometricPromptUiOptions = (BiometricPromptUiOptions) dclv.n(parcel, i, BiometricPromptUiOptions.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AuthenticationOptions(publicKeyCredentialRequestOptions, strT, strT2, browserOptions, iF, bundleK, zD, jI, resultReceiver, biometricPromptUiOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationOptions[i];
    }
}

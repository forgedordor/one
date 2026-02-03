package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSilentVerificationExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleTunnelServerIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.SimpleTransactionAuthorizationExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        CableAuthenticationExtension cableAuthenticationExtension = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        GoogleMultiAssertionExtension googleMultiAssertionExtension = null;
        GoogleSessionIdExtension googleSessionIdExtension = null;
        GoogleSilentVerificationExtension googleSilentVerificationExtension = null;
        DevicePublicKeyExtension devicePublicKeyExtension = null;
        GoogleTunnelServerIdExtension googleTunnelServerIdExtension = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        PrfExtension prfExtension = null;
        SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension = null;
        HmacSecretExtension hmacSecretExtension = null;
        PaymentExtension paymentExtension = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) dclv.n(parcel, i, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    cableAuthenticationExtension = (CableAuthenticationExtension) dclv.n(parcel, i, CableAuthenticationExtension.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) dclv.n(parcel, i, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    googleMultiAssertionExtension = (GoogleMultiAssertionExtension) dclv.n(parcel, i, GoogleMultiAssertionExtension.CREATOR);
                    break;
                case 6:
                    googleSessionIdExtension = (GoogleSessionIdExtension) dclv.n(parcel, i, GoogleSessionIdExtension.CREATOR);
                    break;
                case 7:
                    googleSilentVerificationExtension = (GoogleSilentVerificationExtension) dclv.n(parcel, i, GoogleSilentVerificationExtension.CREATOR);
                    break;
                case 8:
                    devicePublicKeyExtension = (DevicePublicKeyExtension) dclv.n(parcel, i, DevicePublicKeyExtension.CREATOR);
                    break;
                case 9:
                    googleTunnelServerIdExtension = (GoogleTunnelServerIdExtension) dclv.n(parcel, i, GoogleTunnelServerIdExtension.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) dclv.n(parcel, i, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    prfExtension = (PrfExtension) dclv.n(parcel, i, PrfExtension.CREATOR);
                    break;
                case 12:
                    simpleTransactionAuthorizationExtension = (SimpleTransactionAuthorizationExtension) dclv.n(parcel, i, SimpleTransactionAuthorizationExtension.CREATOR);
                    break;
                case 13:
                    hmacSecretExtension = (HmacSecretExtension) dclv.n(parcel, i, HmacSecretExtension.CREATOR);
                    break;
                case 14:
                    paymentExtension = (PaymentExtension) dclv.n(parcel, i, PaymentExtension.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AuthenticationExtensions(fidoAppIdExtension, cableAuthenticationExtension, userVerificationMethodExtension, googleMultiAssertionExtension, googleSessionIdExtension, googleSilentVerificationExtension, devicePublicKeyExtension, googleTunnelServerIdExtension, googleThirdPartyPaymentExtension, prfExtension, simpleTransactionAuthorizationExtension, hmacSecretExtension, paymentExtension);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        AttestationConveyancePreference attestationConveyancePreferenceA = null;
        byte[] bArrE = null;
        String strT = null;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        ArrayList arrayListZ = null;
        Double dP = null;
        ArrayList arrayListZ2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        TokenBinding tokenBinding = null;
        AuthenticationExtensions authenticationExtensions = null;
        ArrayList arrayListY = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) dclv.n(parcel, i, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) dclv.n(parcel, i, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 5:
                    arrayListZ = dclv.z(parcel, i, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dP = dclv.p(parcel, i);
                    break;
                case 7:
                    arrayListZ2 = dclv.z(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) dclv.n(parcel, i, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    tokenBinding = (TokenBinding) dclv.n(parcel, i, TokenBinding.CREATOR);
                    break;
                case 10:
                    strT = dclv.t(parcel, i);
                    break;
                case 11:
                    authenticationExtensions = (AuthenticationExtensions) dclv.n(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                case 12:
                    arrayListY = dclv.y(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        evqs evqsVarX = evqs.x(bArrE);
        if (strT != null) {
            try {
                attestationConveyancePreferenceA = AttestationConveyancePreference.a(strT);
            } catch (dcxk e) {
                throw new IllegalArgumentException(e);
            }
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, evqsVarX, arrayListZ, dP, arrayListZ2, authenticatorSelectionCriteria, tokenBinding, attestationConveyancePreferenceA, authenticationExtensions, arrayListY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}

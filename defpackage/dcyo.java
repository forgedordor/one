package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrE = null;
        ArrayList arrayListZ = null;
        Double dP = null;
        ArrayList arrayListZ2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numR = null;
        TokenBinding tokenBinding = null;
        String strT = null;
        AuthenticationExtensions authenticationExtensions = null;
        String strT2 = null;
        ResultReceiver resultReceiver = null;
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
                    numR = dclv.r(parcel, i);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) dclv.n(parcel, i, TokenBinding.CREATOR);
                    break;
                case 11:
                    strT = dclv.t(parcel, i);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) dclv.n(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                case 13:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) dclv.n(parcel, i, ResultReceiver.CREATOR);
                    break;
                case 15:
                    arrayListY = dclv.y(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrE, arrayListZ, dP, arrayListZ2, authenticatorSelectionCriteria, numR, tokenBinding, strT, authenticationExtensions, strT2, resultReceiver, arrayListY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}

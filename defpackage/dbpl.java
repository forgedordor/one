package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        UserVerificationRequirement userVerificationRequirementA = null;
        byte[] bArrE = null;
        String strT = null;
        Double dP = null;
        String strT2 = null;
        ArrayList arrayListZ = null;
        TokenBinding tokenBinding = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 3:
                    dP = dclv.p(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    arrayListZ = dclv.z(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    tokenBinding = (TokenBinding) dclv.n(parcel, i, TokenBinding.CREATOR);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    authenticationExtensions = (AuthenticationExtensions) dclv.n(parcel, i, AuthenticationExtensions.CREATOR);
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
                userVerificationRequirementA = UserVerificationRequirement.a(strT);
            } catch (dczg e) {
                throw new IllegalArgumentException(e);
            }
        }
        return new PublicKeyCredentialRequestOptions(evqsVarX, dP, strT2, arrayListZ, tokenBinding, userVerificationRequirementA, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}

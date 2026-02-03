package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcys implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        Double dP = null;
        String strT = null;
        ArrayList arrayListZ = null;
        Integer numR = null;
        TokenBinding tokenBinding = null;
        String strT2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long lS = null;
        String strT3 = null;
        ResultReceiver resultReceiver = null;
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
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    arrayListZ = dclv.z(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    numR = dclv.r(parcel, i);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) dclv.n(parcel, i, TokenBinding.CREATOR);
                    break;
                case 8:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 9:
                    authenticationExtensions = (AuthenticationExtensions) dclv.n(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                case 10:
                    lS = dclv.s(parcel, i);
                    break;
                case 11:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 12:
                    resultReceiver = (ResultReceiver) dclv.n(parcel, i, ResultReceiver.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PublicKeyCredentialRequestOptions(bArrE, dP, strT, arrayListZ, numR, tokenBinding, strT2, authenticationExtensions, lS, strT3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}

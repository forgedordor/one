package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsDevicePublicKeyOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        UvmEntries uvmEntries = null;
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                uvmEntries = (UvmEntries) dclv.n(parcel, i, UvmEntries.CREATOR);
            } else if (iD == 2) {
                authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) dclv.n(parcel, i, AuthenticationExtensionsDevicePublicKeyOutputs.CREATOR);
            } else if (iD == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) dclv.n(parcel, i, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (iD == 4) {
                authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) dclv.n(parcel, i, AuthenticationExtensionsPrfOutputs.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, authenticationExtensionsDevicePublicKeyOutputs, authenticationExtensionsCredPropsOutputs, authenticationExtensionsPrfOutputs, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }
}

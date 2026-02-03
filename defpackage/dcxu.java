package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        Uri uri = null;
        byte[] bArrE = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) dclv.n(parcel, i, PublicKeyCredentialCreationOptions.CREATOR);
            } else if (iD == 3) {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            } else if (iD == 4) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrE, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialCreationOptions[i];
    }
}

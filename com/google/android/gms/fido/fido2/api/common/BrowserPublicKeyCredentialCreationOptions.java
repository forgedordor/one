package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcxu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new dcxu();
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;
    public final Bundle d;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr, Bundle bundle) {
        dclh.m(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        dclh.m(uri);
        dclh.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dclh.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
        dclh.b(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return dclc.a(this.a, browserPublicKeyCredentialCreationOptions.a) && dclc.a(this.b, browserPublicKeyCredentialCreationOptions.b) && dclc.a(this.d, browserPublicKeyCredentialCreationOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    public final String toString() {
        Bundle bundle = this.d;
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + dcmw.c(bArr) + ", \n chromeParameters=" + String.valueOf(bundle) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.f(parcel, 4, this.c, false);
        dclw.p(parcel, 5, this.d);
        dclw.c(parcel, iA);
    }
}

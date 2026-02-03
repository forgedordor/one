package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcxv;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new dcxv();
    public final PublicKeyCredentialRequestOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        dclh.m(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        dclh.m(uri);
        dclh.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dclh.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
        dclh.b(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return dclc.a(this.a, browserPublicKeyCredentialRequestOptions.a) && dclc.a(this.b, browserPublicKeyCredentialRequestOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + dcmw.c(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.f(parcel, 4, this.c, false);
        dclw.c(parcel, iA);
    }
}

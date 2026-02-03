package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dcmw;
import defpackage.dcyp;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new dcyp();
    public final String a;
    public final String b;
    public final AuthenticatorAttestationResponse c;
    public final AuthenticatorAssertionResponse d;
    public final AuthenticatorErrorResponse e;
    public final AuthenticationExtensionsClientOutputs f;
    public final String g;
    public String h;
    private final evqs i;

    public PublicKeyCredential(String str, String str2, evqs evqsVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        dclh.b((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse == null && (str == null || evqsVar == null)) {
            z = false;
        }
        dclh.b(z, "Must provide id and rawId if not an error response.");
        this.a = str;
        this.b = str2;
        this.i = evqsVar;
        this.c = authenticatorAttestationResponse;
        this.d = authenticatorAssertionResponse;
        this.e = authenticatorErrorResponse;
        this.f = authenticationExtensionsClientOutputs;
        this.g = str3;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return dclc.a(this.a, publicKeyCredential.a) && dclc.a(this.b, publicKeyCredential.b) && dclc.a(this.i, publicKeyCredential.i) && dclc.a(this.c, publicKeyCredential.c) && dclc.a(this.d, publicKeyCredential.d) && dclc.a(this.e, publicKeyCredential.e) && dclc.a(this.f, publicKeyCredential.f) && dclc.a(this.g, publicKeyCredential.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.d, this.c, this.e, this.f, this.g});
    }

    public final String toString() {
        evqs evqsVar = this.i;
        byte[] bArrI = evqsVar == null ? null : evqsVar.I();
        String str = this.b;
        String str2 = this.a;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.c;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.d;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.e;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f;
        String str3 = this.g;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + dcmw.c(bArrI) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9 A[Catch: extu -> 0x02b2, JSONException -> 0x02f9, TRY_LEAVE, TryCatch #7 {extu -> 0x02b2, blocks: (B:54:0x0196, B:61:0x01b8, B:63:0x01c9, B:68:0x01e1, B:71:0x01fd, B:73:0x0211, B:75:0x0217, B:76:0x0234, B:77:0x0239, B:78:0x023a, B:79:0x023f, B:84:0x024a, B:86:0x0257, B:88:0x0265, B:89:0x027d, B:90:0x0282, B:91:0x0283, B:92:0x0288, B:97:0x02ac, B:98:0x02b1), top: B:163:0x0196, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029d A[Catch: JSONException -> 0x02f9, TRY_LEAVE, TryCatch #8 {JSONException -> 0x02f9, blocks: (B:32:0x00a1, B:33:0x00c4, B:35:0x00cb, B:37:0x00d9, B:39:0x00e4, B:38:0x00df, B:40:0x00e7, B:41:0x00f2, B:42:0x010c, B:44:0x011d, B:45:0x0123, B:46:0x0127, B:48:0x0139, B:49:0x0157, B:50:0x0170, B:54:0x0196, B:93:0x0289, B:95:0x029d, B:61:0x01b8, B:63:0x01c9, B:68:0x01e1, B:71:0x01fd, B:73:0x0211, B:75:0x0217, B:76:0x0234, B:77:0x0239, B:78:0x023a, B:79:0x023f, B:84:0x024a, B:86:0x0257, B:88:0x0265, B:89:0x027d, B:90:0x0282, B:91:0x0283, B:92:0x0288, B:97:0x02ac, B:98:0x02b1, B:100:0x02b3, B:101:0x02ba, B:102:0x02bb, B:103:0x02c0, B:107:0x02c4, B:108:0x02cb, B:109:0x02cc, B:110:0x02d3, B:112:0x02d5, B:113:0x02dc, B:114:0x02dd, B:115:0x02e4, B:117:0x02e6, B:118:0x02ed, B:122:0x02f1, B:123:0x02f8), top: B:164:0x00a1, outer: #9, inners: #0, #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ac A[Catch: extu -> 0x02b2, JSONException -> 0x02f9, TRY_ENTER, TryCatch #7 {extu -> 0x02b2, blocks: (B:54:0x0196, B:61:0x01b8, B:63:0x01c9, B:68:0x01e1, B:71:0x01fd, B:73:0x0211, B:75:0x0217, B:76:0x0234, B:77:0x0239, B:78:0x023a, B:79:0x023f, B:84:0x024a, B:86:0x0257, B:88:0x0265, B:89:0x027d, B:90:0x0282, B:91:0x0283, B:92:0x0288, B:97:0x02ac, B:98:0x02b1), top: B:163:0x0196, outer: #8 }] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r28, int r29) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.writeToParcel(android.os.Parcel, int):void");
    }
}

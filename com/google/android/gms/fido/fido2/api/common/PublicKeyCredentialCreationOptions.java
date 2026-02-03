package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcyo;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new dcyo();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AuthenticationExtensions j;
    public final String k;
    public ResultReceiver l;
    public final List m;
    private final AttestationConveyancePreference n;

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: JSONException -> 0x0208, TryCatch #2 {JSONException -> 0x0208, blocks: (B:5:0x0032, B:7:0x0042, B:9:0x0048, B:11:0x006d, B:13:0x0073, B:14:0x0091, B:16:0x0097, B:17:0x009b, B:19:0x009f, B:21:0x00a7, B:26:0x00bb, B:28:0x00c1, B:29:0x00c8, B:25:0x00b9, B:30:0x00cf, B:32:0x00d7, B:34:0x00eb, B:36:0x00f1, B:37:0x00fb, B:39:0x0101, B:42:0x0114, B:44:0x011a, B:46:0x0124, B:48:0x012a, B:50:0x0130, B:52:0x0136, B:54:0x013c, B:56:0x0146, B:58:0x014c, B:60:0x0152, B:62:0x015c, B:64:0x0162, B:66:0x016f, B:68:0x0177, B:73:0x0190, B:75:0x0196, B:76:0x01a0, B:78:0x01a6, B:81:0x01b5, B:85:0x01c0, B:84:0x01bc, B:71:0x0183), top: B:110:0x0032, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r33, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r34, byte[] r35, java.util.List r36, java.lang.Double r37, java.util.List r38, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r39, java.lang.Integer r40, com.google.android.gms.fido.fido2.api.common.TokenBinding r41, java.lang.String r42, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r43, java.lang.String r44, android.os.ResultReceiver r45, java.util.List r46) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.<init>(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity, byte[], java.util.List, java.lang.Double, java.util.List, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria, java.lang.Integer, com.google.android.gms.fido.fido2.api.common.TokenBinding, java.lang.String, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions, java.lang.String, android.os.ResultReceiver, java.util.List):void");
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        List list3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (dclc.a(this.a, publicKeyCredentialCreationOptions.a) && dclc.a(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && dclc.a(this.e, publicKeyCredentialCreationOptions.e)) {
            List list4 = this.d;
            List list5 = publicKeyCredentialCreationOptions.d;
            if (list4.containsAll(list5) && list5.containsAll(list4) && ((((list = this.f) == null && publicKeyCredentialCreationOptions.f == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f) != null && list.containsAll(list2) && list2.containsAll(list))) && dclc.a(this.g, publicKeyCredentialCreationOptions.g) && dclc.a(this.h, publicKeyCredentialCreationOptions.h) && dclc.a(this.i, publicKeyCredentialCreationOptions.i) && dclc.a(this.n, publicKeyCredentialCreationOptions.n) && dclc.a(this.j, publicKeyCredentialCreationOptions.j) && dclc.a(this.k, publicKeyCredentialCreationOptions.k))) {
                List list6 = this.m;
                if (list6 == null && publicKeyCredentialCreationOptions.m == null) {
                    return true;
                }
                return list6 != null && (list3 = publicKeyCredentialCreationOptions.m) != null && list6.containsAll(list3) && list3.containsAll(list6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.n, this.j, this.k, this.m});
    }

    public final String toString() {
        List list = this.m;
        AuthenticationExtensions authenticationExtensions = this.j;
        AttestationConveyancePreference attestationConveyancePreference = this.n;
        TokenBinding tokenBinding = this.i;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.g;
        List list2 = this.f;
        List list3 = this.d;
        byte[] bArr = this.c;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + this.a.toString() + ", \n user=" + publicKeyCredentialUserEntity.toString() + ", \n challenge=" + dcmw.c(bArr) + ", \n parameters=" + list3.toString() + ", \n timeoutSeconds=" + this.e + ", \n excludeList=" + String.valueOf(list2) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.h + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n attestationFormats=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, publicKeyCredentialRpEntity, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.f(parcel, 4, this.c, false);
        dclw.n(parcel, 5, this.d, false);
        dclw.r(parcel, 6, this.e);
        dclw.n(parcel, 7, this.f, false);
        dclw.k(parcel, 8, this.g, i, false);
        dclw.x(parcel, 9, this.h);
        dclw.k(parcel, 10, this.i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.n;
        dclw.m(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.d, false);
        dclw.k(parcel, 12, this.j, i, false);
        dclw.m(parcel, 13, this.k, false);
        dclw.k(parcel, 14, this.l, i, false);
        dclw.D(parcel, 15, this.m);
        dclw.c(parcel, iA);
    }
}

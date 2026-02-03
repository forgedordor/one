package com.google.android.ims.provisioning.config;

import defpackage.fdbq;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MlsConfiguration implements Serializable {
    private static final long serialVersionUID = 6129112378127823983L;
    public final String acsPublicIdentityKey;
    public final String kdsUrl;
    public final long signedEncryptionIdentityExpirySeconds;
    private final String signedEncryptionIdentityProof;
    public final byte[] signedEncryptionIdentityProofTbs;

    public MlsConfiguration(String str, byte[] bArr, String str2, long j, String str3) {
        bArr.getClass();
        this.signedEncryptionIdentityProof = str;
        this.signedEncryptionIdentityProofTbs = bArr;
        this.acsPublicIdentityKey = str2;
        this.signedEncryptionIdentityExpirySeconds = j;
        this.kdsUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MlsConfiguration)) {
            return false;
        }
        MlsConfiguration mlsConfiguration = (MlsConfiguration) obj;
        return fdbq.f(this.signedEncryptionIdentityProof, mlsConfiguration.signedEncryptionIdentityProof) && fdbq.f(this.signedEncryptionIdentityProofTbs, mlsConfiguration.signedEncryptionIdentityProofTbs) && fdbq.f(this.acsPublicIdentityKey, mlsConfiguration.acsPublicIdentityKey) && this.signedEncryptionIdentityExpirySeconds == mlsConfiguration.signedEncryptionIdentityExpirySeconds && fdbq.f(this.kdsUrl, mlsConfiguration.kdsUrl);
    }

    public final int hashCode() {
        int iHashCode = (this.signedEncryptionIdentityProof.hashCode() * 31) + Arrays.hashCode(this.signedEncryptionIdentityProofTbs);
        String str = this.acsPublicIdentityKey;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        long j = this.signedEncryptionIdentityExpirySeconds;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.kdsUrl.hashCode();
    }

    public final String toString() {
        return "MlsConfiguration(signedEncryptionIdentityProof=" + this.signedEncryptionIdentityProof + ", signedEncryptionIdentityProofTbs=" + Arrays.toString(this.signedEncryptionIdentityProofTbs) + ", acsPublicIdentityKey=" + this.acsPublicIdentityKey + ", signedEncryptionIdentityExpirySeconds=" + this.signedEncryptionIdentityExpirySeconds + ", kdsUrl=" + this.kdsUrl + ")";
    }
}

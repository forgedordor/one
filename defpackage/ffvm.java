package defpackage;

import org.bouncycastle.asn1.ASN1Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvm {
    public static byte[] a(ffiz ffizVar, ASN1Set aSN1Set) {
        if (!ffizVar.a) {
            throw new IllegalArgumentException("public key found");
        }
        try {
            return ffrr.a(ffizVar, aSN1Set).u();
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(ffiz ffizVar) {
        if (ffizVar.a) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return ffsp.a(ffizVar).u();
        } catch (Exception unused) {
            return null;
        }
    }
}

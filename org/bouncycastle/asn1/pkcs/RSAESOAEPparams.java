package org.bouncycastle.asn1.pkcs;

import defpackage.ffjn;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RSAESOAEPparams extends ASN1Object {
    public static final AlgorithmIdentifier a;
    public static final AlgorithmIdentifier b;
    public static final AlgorithmIdentifier c;
    private final AlgorithmIdentifier d = a;
    private final AlgorithmIdentifier e = b;
    private final AlgorithmIdentifier f = c;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(ffjn.a, DERNull.a);
        a = algorithmIdentifier;
        b = new AlgorithmIdentifier(PKCSObjectIdentifiers.wF, algorithmIdentifier);
        c = new AlgorithmIdentifier(PKCSObjectIdentifiers.wG, new DEROctetString(new byte[0]));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        AlgorithmIdentifier algorithmIdentifier = this.d;
        if (!algorithmIdentifier.equals(a)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 0, algorithmIdentifier));
        }
        AlgorithmIdentifier algorithmIdentifier2 = this.e;
        if (!algorithmIdentifier2.equals(b)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 1, algorithmIdentifier2));
        }
        AlgorithmIdentifier algorithmIdentifier3 = this.f;
        if (!algorithmIdentifier3.equals(c)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 2, algorithmIdentifier3));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

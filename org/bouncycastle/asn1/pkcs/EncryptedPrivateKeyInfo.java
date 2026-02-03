package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class EncryptedPrivateKeyInfo extends ASN1Object {
    private final AlgorithmIdentifier a;
    private final ASN1OctetString b;

    public EncryptedPrivateKeyInfo(ASN1Sequence aSN1Sequence) {
        Enumeration enumerationF = aSN1Sequence.f();
        this.a = AlgorithmIdentifier.a(enumerationF.nextElement());
        this.b = ASN1OctetString.f(enumerationF.nextElement());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        return new DERSequence(aSN1EncodableVector);
    }
}

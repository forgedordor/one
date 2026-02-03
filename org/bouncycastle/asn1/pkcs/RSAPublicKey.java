package org.bouncycastle.asn1.pkcs;

import defpackage.a;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RSAPublicKey extends ASN1Object {
    private BigInteger a;
    private BigInteger b;

    public RSAPublicKey(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(new ASN1Integer(this.b));
        return new DERSequence(aSN1EncodableVector);
    }

    public RSAPublicKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() != 2) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        Enumeration enumerationF = aSN1Sequence.f();
        this.a = ASN1Integer.m(enumerationF.nextElement()).i();
        this.b = ASN1Integer.m(enumerationF.nextElement()).i();
    }
}

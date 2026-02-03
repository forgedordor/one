package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X9FieldID extends ASN1Object implements X9ObjectIdentifiers {
    public final ASN1ObjectIdentifier a;
    public final ASN1Primitive b;

    public X9FieldID(ASN1Sequence aSN1Sequence) {
        this.a = ASN1ObjectIdentifier.h(aSN1Sequence.h(0));
        this.b = aSN1Sequence.h(1).p();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        return new DERSequence(aSN1EncodableVector);
    }
}

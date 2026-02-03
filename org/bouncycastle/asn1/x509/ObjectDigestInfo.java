package org.bouncycastle.asn1.x509;

import defpackage.a;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ObjectDigestInfo extends ASN1Object {
    ASN1Enumerated a;
    ASN1ObjectIdentifier b;
    AlgorithmIdentifier c;
    ASN1BitString d;

    private ObjectDigestInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() > 4 || aSN1Sequence.e() < 3) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        int i = 0;
        this.a = ASN1Enumerated.h(aSN1Sequence.h(0));
        if (aSN1Sequence.e() == 4) {
            i = 1;
            this.b = ASN1ObjectIdentifier.h(aSN1Sequence.h(1));
        }
        this.c = AlgorithmIdentifier.a(aSN1Sequence.h(i + 1));
        this.d = ASN1BitString.i(aSN1Sequence.h(i + 2));
    }

    public static ObjectDigestInfo a(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Sequence aSN1SequenceM = ASN1Sequence.m(aSN1TaggedObject, false);
        if (aSN1SequenceM != null) {
            return new ObjectDigestInfo(ASN1Sequence.j(aSN1SequenceM));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.b(this.a);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.b;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.b(aSN1ObjectIdentifier);
        }
        aSN1EncodableVector.b(this.c);
        aSN1EncodableVector.b(this.d);
        return new DERSequence(aSN1EncodableVector);
    }
}

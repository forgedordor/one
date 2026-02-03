package org.bouncycastle.asn1.x509;

import defpackage.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class AttCertValidityPeriod extends ASN1Object {
    ASN1GeneralizedTime a;
    ASN1GeneralizedTime b;

    public AttCertValidityPeriod(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() != 2) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        this.a = ASN1GeneralizedTime.g(aSN1Sequence.h(0));
        this.b = ASN1GeneralizedTime.g(aSN1Sequence.h(1));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        return new DERSequence(aSN1EncodableVector);
    }
}

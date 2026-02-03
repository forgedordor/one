package org.bouncycastle.asn1.x509;

import defpackage.a;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class IssuerSerial extends ASN1Object {
    GeneralNames a;
    ASN1Integer b;
    ASN1BitString c;

    private IssuerSerial(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() != 2 && aSN1Sequence.e() != 3) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        this.a = GeneralNames.a(aSN1Sequence.h(0));
        this.b = ASN1Integer.m(aSN1Sequence.h(1));
        if (aSN1Sequence.e() == 3) {
            this.c = ASN1BitString.i(aSN1Sequence.h(2));
        }
    }

    public static IssuerSerial a(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Sequence aSN1SequenceM = ASN1Sequence.m(aSN1TaggedObject, z);
        if (aSN1SequenceM != null) {
            return new IssuerSerial(ASN1Sequence.j(aSN1SequenceM));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        ASN1BitString aSN1BitString = this.c;
        if (aSN1BitString != null) {
            aSN1EncodableVector.b(aSN1BitString);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

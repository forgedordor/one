package org.bouncycastle.asn1.x509;

import defpackage.a;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class AttributeCertificate extends ASN1Object {
    public AttributeCertificateInfo a;
    AlgorithmIdentifier b;
    ASN1BitString c;

    private AttributeCertificate(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() != 3) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        ASN1Encodable aSN1EncodableH = aSN1Sequence.h(0);
        this.a = aSN1EncodableH instanceof AttributeCertificateInfo ? (AttributeCertificateInfo) aSN1EncodableH : aSN1EncodableH != null ? new AttributeCertificateInfo(ASN1Sequence.j(aSN1EncodableH)) : null;
        this.b = AlgorithmIdentifier.a(aSN1Sequence.h(1));
        this.c = ASN1BitString.i(aSN1Sequence.h(2));
    }

    public static AttributeCertificate a(Object obj) {
        if (obj instanceof AttributeCertificate) {
            return (AttributeCertificate) obj;
        }
        if (obj != null) {
            return new AttributeCertificate(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        aSN1EncodableVector.b(this.c);
        return new DERSequence(aSN1EncodableVector);
    }
}

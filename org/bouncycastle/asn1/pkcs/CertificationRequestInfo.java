package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1Set.AnonymousClass2;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CertificationRequestInfo extends ASN1Object {
    ASN1Integer a;
    X500Name b;
    SubjectPublicKeyInfo c;
    public ASN1Set d;

    public CertificationRequestInfo(ASN1Sequence aSN1Sequence) {
        this.a = new ASN1Integer(0L);
        this.d = null;
        this.a = (ASN1Integer) aSN1Sequence.h(0);
        this.b = X500Name.b(aSN1Sequence.h(1));
        this.c = SubjectPublicKeyInfo.b(aSN1Sequence.h(2));
        if (aSN1Sequence.e() > 3) {
            this.d = ASN1Set.i((ASN1TaggedObject) aSN1Sequence.h(3));
        }
        ASN1Set aSN1Set = this.d;
        if (aSN1Set != null) {
            ASN1Set.AnonymousClass2 anonymousClass2 = aSN1Set.new AnonymousClass2();
            while (anonymousClass2.hasMoreElements()) {
                Attribute attributeA = Attribute.a(anonymousClass2.nextElement());
                if (attributeA.a.w(PKCSObjectIdentifiers.y) && attributeA.b.e() != 1) {
                    throw new IllegalArgumentException("challengePassword attribute must have one value");
                }
            }
        }
        if (this.b == null || this.a == null || this.c == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        aSN1EncodableVector.b(this.c);
        ASN1Set aSN1Set = this.d;
        if (aSN1Set != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 0, aSN1Set));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

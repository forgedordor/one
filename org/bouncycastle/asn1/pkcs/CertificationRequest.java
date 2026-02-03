package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CertificationRequest extends ASN1Object {
    public CertificationRequestInfo a;
    protected AlgorithmIdentifier b;
    protected ASN1BitString c;

    protected CertificationRequest() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        aSN1EncodableVector.b(this.c);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertificationRequest(ASN1Sequence aSN1Sequence) {
        CertificationRequestInfo certificationRequestInfo = null;
        this.a = null;
        this.b = null;
        this.c = null;
        ASN1Encodable aSN1EncodableH = aSN1Sequence.h(0);
        if (aSN1EncodableH instanceof CertificationRequestInfo) {
            certificationRequestInfo = (CertificationRequestInfo) aSN1EncodableH;
        } else if (aSN1EncodableH != null) {
            certificationRequestInfo = new CertificationRequestInfo(ASN1Sequence.j(aSN1EncodableH));
        }
        this.a = certificationRequestInfo;
        this.b = AlgorithmIdentifier.a(aSN1Sequence.h(1));
        this.c = (DERBitString) aSN1Sequence.h(2);
    }
}

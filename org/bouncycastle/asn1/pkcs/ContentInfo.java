package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ContentInfo extends ASN1Object implements PKCSObjectIdentifiers {
    private final ASN1ObjectIdentifier L;
    private ASN1Encodable M;
    private boolean N;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.N = true;
        this.L = aSN1ObjectIdentifier;
        this.M = aSN1Encodable;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.L);
        ASN1Encodable aSN1Encodable = this.M;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.b(new BERTaggedObject(aSN1Encodable, null));
        }
        return this.N ? new BERSequence(aSN1EncodableVector) : new DLSequence(aSN1EncodableVector);
    }

    public ContentInfo(ASN1Sequence aSN1Sequence) {
        this.N = true;
        Enumeration enumerationF = aSN1Sequence.f();
        this.L = (ASN1ObjectIdentifier) enumerationF.nextElement();
        if (enumerationF.hasMoreElements()) {
            this.M = ((ASN1TaggedObject) enumerationF.nextElement()).f();
        }
        this.N = aSN1Sequence instanceof BERSequence;
    }
}

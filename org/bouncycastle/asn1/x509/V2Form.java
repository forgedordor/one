package org.bouncycastle.asn1.x509;

import defpackage.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class V2Form extends ASN1Object {
    GeneralNames a;
    IssuerSerial b;
    ObjectDigestInfo c;

    private V2Form(ASN1Sequence aSN1Sequence) {
        int i;
        if (aSN1Sequence.e() > 3) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        if (aSN1Sequence.h(0) instanceof ASN1TaggedObject) {
            i = 0;
        } else {
            this.a = GeneralNames.a(aSN1Sequence.h(0));
            i = 1;
        }
        while (i != aSN1Sequence.e()) {
            ASN1TaggedObject aSN1TaggedObjectN = ASN1TaggedObject.n(aSN1Sequence.h(i));
            int i2 = aSN1TaggedObjectN.c;
            if (i2 == 0) {
                this.b = IssuerSerial.a(aSN1TaggedObjectN, false);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException(a.g(i2, "Bad tag number: "));
                }
                this.c = ObjectDigestInfo.a(aSN1TaggedObjectN);
            }
            i++;
        }
    }

    public static V2Form a(Object obj) {
        if (obj instanceof V2Form) {
            return (V2Form) obj;
        }
        if (obj != null) {
            return new V2Form(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        GeneralNames generalNames = this.a;
        if (generalNames != null) {
            aSN1EncodableVector.b(generalNames);
        }
        IssuerSerial issuerSerial = this.b;
        if (issuerSerial != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 0, issuerSerial));
        }
        ObjectDigestInfo objectDigestInfo = this.c;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 1, objectDigestInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

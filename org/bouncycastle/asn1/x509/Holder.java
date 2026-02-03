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
public class Holder extends ASN1Object {
    IssuerSerial a;
    GeneralNames b;
    ObjectDigestInfo c;
    private int d;

    public Holder(ASN1Sequence aSN1Sequence) {
        this.d = 1;
        if (aSN1Sequence.e() > 3) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            ASN1TaggedObject aSN1TaggedObjectN = ASN1TaggedObject.n(aSN1Sequence.h(i));
            int i2 = aSN1TaggedObjectN.c;
            if (i2 == 0) {
                this.a = IssuerSerial.a(aSN1TaggedObjectN, false);
            } else if (i2 == 1) {
                this.b = GeneralNames.b(aSN1TaggedObjectN, false);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
                this.c = ObjectDigestInfo.a(aSN1TaggedObjectN);
            }
        }
        this.d = 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        if (this.d != 1) {
            GeneralNames generalNames = this.b;
            return generalNames != null ? new DERTaggedObject(true, 1, generalNames) : new DERTaggedObject(true, 0, this.a);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        IssuerSerial issuerSerial = this.a;
        if (issuerSerial != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 0, issuerSerial));
        }
        GeneralNames generalNames2 = this.b;
        if (generalNames2 != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 1, generalNames2));
        }
        ObjectDigestInfo objectDigestInfo = this.c;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 2, objectDigestInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Holder(ASN1TaggedObject aSN1TaggedObject) {
        this.d = 1;
        int i = aSN1TaggedObject.c;
        if (i == 0) {
            this.a = IssuerSerial.a(aSN1TaggedObject, true);
        } else if (i == 1) {
            this.b = GeneralNames.b(aSN1TaggedObject, true);
        } else {
            throw new IllegalArgumentException("unknown tag in Holder");
        }
        this.d = 0;
    }
}

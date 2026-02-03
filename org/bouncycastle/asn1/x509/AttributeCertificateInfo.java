package org.bouncycastle.asn1.x509;

import defpackage.a;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class AttributeCertificateInfo extends ASN1Object {
    public Extensions a;
    private ASN1Integer b;
    private Holder c;
    private AttCertIssuer d;
    private AlgorithmIdentifier e;
    private ASN1Integer f;
    private AttCertValidityPeriod g;
    private ASN1Sequence h;
    private ASN1BitString i;

    public AttributeCertificateInfo(ASN1Sequence aSN1Sequence) {
        int i;
        Holder holder;
        Holder holder2;
        AttCertIssuer attCertIssuer;
        if (aSN1Sequence.e() < 6 || aSN1Sequence.e() > 9) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        if (aSN1Sequence.h(0) instanceof ASN1Integer) {
            this.b = ASN1Integer.m(aSN1Sequence.h(0));
            i = 1;
        } else {
            this.b = new ASN1Integer(0L);
            i = 0;
        }
        ASN1Encodable aSN1EncodableH = aSN1Sequence.h(i);
        AttCertValidityPeriod attCertValidityPeriod = null;
        if (aSN1EncodableH instanceof Holder) {
            holder = (Holder) aSN1EncodableH;
        } else {
            if (aSN1EncodableH instanceof ASN1TaggedObject) {
                holder2 = new Holder(ASN1TaggedObject.n(aSN1EncodableH));
            } else if (aSN1EncodableH != null) {
                holder2 = new Holder(ASN1Sequence.j(aSN1EncodableH));
            } else {
                holder = null;
            }
            holder = holder2;
        }
        this.c = holder;
        ASN1Encodable aSN1EncodableH2 = aSN1Sequence.h(i + 1);
        if (aSN1EncodableH2 == null || (aSN1EncodableH2 instanceof AttCertIssuer)) {
            attCertIssuer = (AttCertIssuer) aSN1EncodableH2;
        } else if (aSN1EncodableH2 instanceof V2Form) {
            attCertIssuer = new AttCertIssuer(V2Form.a(aSN1EncodableH2));
        } else if (aSN1EncodableH2 instanceof GeneralNames) {
            attCertIssuer = new AttCertIssuer((GeneralNames) aSN1EncodableH2);
        } else if (aSN1EncodableH2 instanceof ASN1TaggedObject) {
            attCertIssuer = new AttCertIssuer(V2Form.a(ASN1Sequence.m((ASN1TaggedObject) aSN1EncodableH2, false)));
        } else {
            if (!(aSN1EncodableH2 instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("unknown object in factory: ".concat(String.valueOf(aSN1EncodableH2.getClass().getName())));
            }
            attCertIssuer = new AttCertIssuer(GeneralNames.a(aSN1EncodableH2));
        }
        this.d = attCertIssuer;
        this.e = AlgorithmIdentifier.a(aSN1Sequence.h(i + 2));
        this.f = ASN1Integer.m(aSN1Sequence.h(i + 3));
        ASN1Encodable aSN1EncodableH3 = aSN1Sequence.h(i + 4);
        if (aSN1EncodableH3 instanceof AttCertValidityPeriod) {
            attCertValidityPeriod = (AttCertValidityPeriod) aSN1EncodableH3;
        } else if (aSN1EncodableH3 != null) {
            attCertValidityPeriod = new AttCertValidityPeriod(ASN1Sequence.j(aSN1EncodableH3));
        }
        this.g = attCertValidityPeriod;
        this.h = ASN1Sequence.j(aSN1Sequence.h(i + 5));
        for (int i2 = i + 6; i2 < aSN1Sequence.e(); i2++) {
            ASN1Encodable aSN1EncodableH4 = aSN1Sequence.h(i2);
            if (aSN1EncodableH4 instanceof ASN1BitString) {
                this.i = ASN1BitString.i(aSN1Sequence.h(i2));
            } else if ((aSN1EncodableH4 instanceof ASN1Sequence) || (aSN1EncodableH4 instanceof Extensions)) {
                this.a = Extensions.c(aSN1Sequence.h(i2));
            }
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        if (!this.b.o(0)) {
            aSN1EncodableVector.b(this.b);
        }
        aSN1EncodableVector.b(this.c);
        aSN1EncodableVector.b(this.d);
        aSN1EncodableVector.b(this.e);
        aSN1EncodableVector.b(this.f);
        aSN1EncodableVector.b(this.g);
        aSN1EncodableVector.b(this.h);
        ASN1BitString aSN1BitString = this.i;
        if (aSN1BitString != null) {
            aSN1EncodableVector.b(aSN1BitString);
        }
        Extensions extensions = this.a;
        if (extensions != null) {
            aSN1EncodableVector.b(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

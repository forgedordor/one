package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class AttCertIssuer extends ASN1Object implements ASN1Choice {
    final ASN1Encodable a;
    final ASN1Primitive b;

    public AttCertIssuer(GeneralNames generalNames) {
        this.a = generalNames;
        this.b = generalNames.p();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.b;
    }

    public AttCertIssuer(V2Form v2Form) {
        this.a = v2Form;
        this.b = new DERTaggedObject(false, 0, v2Form);
    }
}

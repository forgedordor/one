package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RDN extends ASN1Object {
    private final ASN1Set a;

    public RDN(ASN1Set aSN1Set) {
        this.a = aSN1Set;
    }

    public final int a() {
        return this.a.e();
    }

    public final AttributeTypeAndValue b() {
        ASN1Set aSN1Set = this.a;
        if (aSN1Set.e() == 0) {
            return null;
        }
        return AttributeTypeAndValue.a(aSN1Set.f(0));
    }

    public final boolean c() {
        return this.a.e() > 1;
    }

    public final AttributeTypeAndValue[] d() {
        ASN1Set aSN1Set = this.a;
        int iE = aSN1Set.e();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[iE];
        for (int i = 0; i != iE; i++) {
            attributeTypeAndValueArr[i] = AttributeTypeAndValue.a(aSN1Set.f(i));
        }
        return attributeTypeAndValueArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }

    public RDN(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.a = new DERSet(new AttributeTypeAndValue(aSN1ObjectIdentifier, aSN1Encodable));
    }
}

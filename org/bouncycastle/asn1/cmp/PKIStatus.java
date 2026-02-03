package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class PKIStatus extends ASN1Object {
    private final ASN1Integer a;

    static {
        new PKIStatus(0);
        new PKIStatus(1);
        new PKIStatus(2);
        new PKIStatus(3);
        new PKIStatus(4);
        new PKIStatus(5);
        new PKIStatus(6);
    }

    private PKIStatus(int i) {
        this.a = new ASN1Integer(i);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }
}

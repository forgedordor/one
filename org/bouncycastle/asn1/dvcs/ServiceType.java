package org.bouncycastle.asn1.dvcs;

import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ServiceType extends ASN1Object {
    public static final ServiceType a = new ServiceType(1);
    public static final ServiceType b = new ServiceType(2);
    public static final ServiceType c = new ServiceType(3);
    public static final ServiceType d = new ServiceType(4);
    private final ASN1Enumerated e;

    public ServiceType(int i) {
        this.e = new ASN1Enumerated(i);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.e;
    }

    public final String toString() {
        int iE = this.e.e();
        return iE + (iE == a.e.e() ? "(CPD)" : iE == b.e.e() ? "(VSD)" : iE == c.e.e() ? "(VPKC)" : iE == d.e.e() ? "(CCPD)" : "?");
    }
}

package org.bouncycastle.asn1.eac;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CertificateHolderAuthorization extends ASN1Object {
    static final Map a;
    static final BidirectionalMap b;

    static {
        EACObjectIdentifiers.a.f("3.1.2.1");
        HashMap map = new HashMap();
        a = map;
        BidirectionalMap bidirectionalMap = new BidirectionalMap();
        b = bidirectionalMap;
        map.put(2, "RADG4");
        map.put(1, "RADG3");
        bidirectionalMap.put(192, "CVCA");
        bidirectionalMap.put(128, "DV_DOMESTIC");
        bidirectionalMap.put(64, "DV_FOREIGN");
        bidirectionalMap.put(0, "IS");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        throw null;
    }
}

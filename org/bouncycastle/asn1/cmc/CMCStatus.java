package org.bouncycastle.asn1.cmc;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CMCStatus extends ASN1Object {
    public static final CMCStatus a;
    public static final CMCStatus b;
    public static final CMCStatus c;
    public static final CMCStatus d;
    public static final CMCStatus e;
    public static final CMCStatus f;
    public static final CMCStatus g;
    private static final Map h;
    private final ASN1Integer i;

    static {
        CMCStatus cMCStatus = new CMCStatus(new ASN1Integer(0L));
        a = cMCStatus;
        CMCStatus cMCStatus2 = new CMCStatus(new ASN1Integer(2L));
        b = cMCStatus2;
        CMCStatus cMCStatus3 = new CMCStatus(new ASN1Integer(3L));
        c = cMCStatus3;
        CMCStatus cMCStatus4 = new CMCStatus(new ASN1Integer(4L));
        d = cMCStatus4;
        CMCStatus cMCStatus5 = new CMCStatus(new ASN1Integer(5L));
        e = cMCStatus5;
        CMCStatus cMCStatus6 = new CMCStatus(new ASN1Integer(6L));
        f = cMCStatus6;
        CMCStatus cMCStatus7 = new CMCStatus(new ASN1Integer(7L));
        g = cMCStatus7;
        HashMap map = new HashMap();
        h = map;
        map.put(cMCStatus.i, cMCStatus);
        map.put(cMCStatus2.i, cMCStatus2);
        map.put(cMCStatus3.i, cMCStatus3);
        map.put(cMCStatus4.i, cMCStatus4);
        map.put(cMCStatus5.i, cMCStatus5);
        map.put(cMCStatus6.i, cMCStatus6);
        map.put(cMCStatus7.i, cMCStatus7);
    }

    private CMCStatus(ASN1Integer aSN1Integer) {
        this.i = aSN1Integer;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.i;
    }
}

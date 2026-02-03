package org.bouncycastle.asn1.cmc;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CMCFailInfo extends ASN1Object {
    public static final CMCFailInfo a;
    public static final CMCFailInfo b;
    public static final CMCFailInfo c;
    public static final CMCFailInfo d;
    public static final CMCFailInfo e;
    public static final CMCFailInfo f;
    public static final CMCFailInfo g;
    public static final CMCFailInfo h;
    public static final CMCFailInfo i;
    public static final CMCFailInfo j;
    public static final CMCFailInfo k;
    public static final CMCFailInfo l;
    public static final CMCFailInfo m;
    public static final CMCFailInfo n;
    private static final Map o;
    private final ASN1Integer p;

    static {
        CMCFailInfo cMCFailInfo = new CMCFailInfo(new ASN1Integer(0L));
        a = cMCFailInfo;
        CMCFailInfo cMCFailInfo2 = new CMCFailInfo(new ASN1Integer(1L));
        b = cMCFailInfo2;
        CMCFailInfo cMCFailInfo3 = new CMCFailInfo(new ASN1Integer(2L));
        c = cMCFailInfo3;
        CMCFailInfo cMCFailInfo4 = new CMCFailInfo(new ASN1Integer(3L));
        d = cMCFailInfo4;
        CMCFailInfo cMCFailInfo5 = new CMCFailInfo(new ASN1Integer(4L));
        e = cMCFailInfo5;
        CMCFailInfo cMCFailInfo6 = new CMCFailInfo(new ASN1Integer(5L));
        f = cMCFailInfo6;
        CMCFailInfo cMCFailInfo7 = new CMCFailInfo(new ASN1Integer(6L));
        g = cMCFailInfo7;
        CMCFailInfo cMCFailInfo8 = new CMCFailInfo(new ASN1Integer(7L));
        h = cMCFailInfo8;
        CMCFailInfo cMCFailInfo9 = new CMCFailInfo(new ASN1Integer(8L));
        i = cMCFailInfo9;
        CMCFailInfo cMCFailInfo10 = new CMCFailInfo(new ASN1Integer(9L));
        j = cMCFailInfo10;
        CMCFailInfo cMCFailInfo11 = new CMCFailInfo(new ASN1Integer(10L));
        k = cMCFailInfo11;
        CMCFailInfo cMCFailInfo12 = new CMCFailInfo(new ASN1Integer(11L));
        l = cMCFailInfo12;
        CMCFailInfo cMCFailInfo13 = new CMCFailInfo(new ASN1Integer(12L));
        m = cMCFailInfo13;
        CMCFailInfo cMCFailInfo14 = new CMCFailInfo(new ASN1Integer(13L));
        n = cMCFailInfo14;
        HashMap map = new HashMap();
        o = map;
        map.put(cMCFailInfo.p, cMCFailInfo);
        map.put(cMCFailInfo2.p, cMCFailInfo2);
        map.put(cMCFailInfo3.p, cMCFailInfo3);
        map.put(cMCFailInfo4.p, cMCFailInfo4);
        map.put(cMCFailInfo5.p, cMCFailInfo5);
        map.put(cMCFailInfo9.p, cMCFailInfo9);
        map.put(cMCFailInfo6.p, cMCFailInfo6);
        map.put(cMCFailInfo7.p, cMCFailInfo7);
        map.put(cMCFailInfo8.p, cMCFailInfo8);
        map.put(cMCFailInfo9.p, cMCFailInfo9);
        map.put(cMCFailInfo10.p, cMCFailInfo10);
        map.put(cMCFailInfo5.p, cMCFailInfo5);
        map.put(cMCFailInfo9.p, cMCFailInfo9);
        map.put(cMCFailInfo11.p, cMCFailInfo11);
        map.put(cMCFailInfo12.p, cMCFailInfo12);
        map.put(cMCFailInfo13.p, cMCFailInfo13);
        map.put(cMCFailInfo14.p, cMCFailInfo14);
    }

    private CMCFailInfo(ASN1Integer aSN1Integer) {
        this.p = aSN1Integer;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.p;
    }
}

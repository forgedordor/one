package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface CMSObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.wA;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.16");
        a = aSN1ObjectIdentifier2;
        aSN1ObjectIdentifier2.f("2");
        aSN1ObjectIdentifier2.f("4");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.6");
        b = aSN1ObjectIdentifier3;
        aSN1ObjectIdentifier3.f("30");
        aSN1ObjectIdentifier3.f("31");
        aSN1ObjectIdentifier3.f("32");
        aSN1ObjectIdentifier3.f("33");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.13");
        c = aSN1ObjectIdentifier4;
        aSN1ObjectIdentifier4.f("3");
        new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.31");
    }
}

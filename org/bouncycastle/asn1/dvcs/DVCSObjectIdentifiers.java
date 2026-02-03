package org.bouncycastle.asn1.dvcs;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface DVCSObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16");
        b = aSN1ObjectIdentifier2;
        aSN1ObjectIdentifier.f("48.4");
        aSN1ObjectIdentifier.f("3.10");
        aSN1ObjectIdentifier2.f("1.7");
        aSN1ObjectIdentifier2.f("1.8");
        aSN1ObjectIdentifier2.f("2.29");
    }
}

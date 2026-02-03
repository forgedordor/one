package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface X509ObjectIdentifiers {
    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("2.5.4.3").i();
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;

    static {
        new ASN1ObjectIdentifier("2.5.4.6").i();
        new ASN1ObjectIdentifier("2.5.4.7").i();
        new ASN1ObjectIdentifier("2.5.4.8").i();
        new ASN1ObjectIdentifier("2.5.4.10").i();
        new ASN1ObjectIdentifier("2.5.4.11").i();
        b = new ASN1ObjectIdentifier("2.5.4.20").i();
        c = new ASN1ObjectIdentifier("2.5.4.41").i();
        d = new ASN1ObjectIdentifier("2.5.4.97").i();
        new ASN1ObjectIdentifier("1.3.14.3.2.26").i();
        new ASN1ObjectIdentifier("1.3.36.3.2.1").i();
        new ASN1ObjectIdentifier("1.3.36.3.3.1.2").i();
        new ASN1ObjectIdentifier("2.5.8.1.1").i();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        e = aSN1ObjectIdentifier;
        aSN1ObjectIdentifier.f("6.30");
        aSN1ObjectIdentifier.f("6.31");
        aSN1ObjectIdentifier.f("6.32");
        aSN1ObjectIdentifier.f("6.33");
        f = aSN1ObjectIdentifier.f("1");
        g = new ASN1ObjectIdentifier("2.5.29");
        ASN1ObjectIdentifier aSN1ObjectIdentifierF = aSN1ObjectIdentifier.f("48");
        h = aSN1ObjectIdentifierF;
        aSN1ObjectIdentifierF.f("2").i();
        aSN1ObjectIdentifierF.f("1").i();
        new ASN1ObjectIdentifier("1.2.840.113533.7.66.13");
    }
}

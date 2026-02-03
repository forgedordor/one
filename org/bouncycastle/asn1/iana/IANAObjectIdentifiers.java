package org.bouncycastle.asn1.iana;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface IANAObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1");
        a = aSN1ObjectIdentifier;
        aSN1ObjectIdentifier.f("1");
        aSN1ObjectIdentifier.f("2");
        aSN1ObjectIdentifier.f("3");
        aSN1ObjectIdentifier.f("4");
        ASN1ObjectIdentifier aSN1ObjectIdentifierF = aSN1ObjectIdentifier.f("5");
        b = aSN1ObjectIdentifierF;
        aSN1ObjectIdentifier.f("6");
        aSN1ObjectIdentifier.f("7");
        ASN1ObjectIdentifier aSN1ObjectIdentifierF2 = aSN1ObjectIdentifierF.f("5");
        c = aSN1ObjectIdentifierF2;
        aSN1ObjectIdentifierF.f("6");
        aSN1ObjectIdentifierF2.f("6");
        ASN1ObjectIdentifier aSN1ObjectIdentifierF3 = aSN1ObjectIdentifierF2.f("8");
        d = aSN1ObjectIdentifierF3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierF4 = aSN1ObjectIdentifierF3.f("1");
        e = aSN1ObjectIdentifierF4;
        aSN1ObjectIdentifierF4.f("1");
        aSN1ObjectIdentifierF4.f("2");
        aSN1ObjectIdentifierF4.f("3");
        aSN1ObjectIdentifierF4.f("4");
    }
}

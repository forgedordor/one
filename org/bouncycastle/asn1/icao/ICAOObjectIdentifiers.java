package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ICAOObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.23.136");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierF = aSN1ObjectIdentifier.f("1");
        b = aSN1ObjectIdentifierF;
        ASN1ObjectIdentifier aSN1ObjectIdentifierF2 = aSN1ObjectIdentifierF.f("1");
        c = aSN1ObjectIdentifierF2;
        aSN1ObjectIdentifierF2.f("1");
        aSN1ObjectIdentifierF2.f("2");
        aSN1ObjectIdentifierF2.f("3");
        aSN1ObjectIdentifierF2.f("4");
        aSN1ObjectIdentifierF2.f("5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierF3 = aSN1ObjectIdentifierF2.f("6");
        d = aSN1ObjectIdentifierF3;
        aSN1ObjectIdentifierF3.f("1");
    }
}

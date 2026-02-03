package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface CRMFObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierF = aSN1ObjectIdentifier.f("5");
        b = aSN1ObjectIdentifierF;
        ASN1ObjectIdentifier aSN1ObjectIdentifierF2 = aSN1ObjectIdentifierF.f("1");
        c = aSN1ObjectIdentifierF2;
        aSN1ObjectIdentifierF2.f("1");
        aSN1ObjectIdentifierF2.f("2");
        aSN1ObjectIdentifierF2.f("3");
        aSN1ObjectIdentifierF2.f("4");
        PKCSObjectIdentifiers.D.f("21");
        ASN1ObjectIdentifier aSN1ObjectIdentifierF3 = aSN1ObjectIdentifier.f("6");
        d = aSN1ObjectIdentifierF3;
        aSN1ObjectIdentifierF3.f("3");
        aSN1ObjectIdentifierF3.f("4");
    }
}

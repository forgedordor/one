package org.bouncycastle.asn1.iso;

import com.android.vcard.VCardConstants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ISOIECObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.0.10118");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierF = aSN1ObjectIdentifier.f(VCardConstants.VERSION_V30);
        b = aSN1ObjectIdentifierF;
        aSN1ObjectIdentifierF.f("49");
        aSN1ObjectIdentifierF.f("50");
        aSN1ObjectIdentifierF.f("55");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.0.18033.2");
        c = aSN1ObjectIdentifier2;
        aSN1ObjectIdentifier2.f("1.2");
        aSN1ObjectIdentifier2.f("2.4");
    }
}

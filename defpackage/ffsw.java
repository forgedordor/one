package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsw {
    public static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        a = map2;
        map.put("SHA-256", NISTObjectIdentifiers.c);
        map.put("SHA-512", NISTObjectIdentifiers.e);
        map.put("SHAKE128", NISTObjectIdentifiers.m);
        map.put("SHAKE256", NISTObjectIdentifiers.n);
        map2.put(NISTObjectIdentifiers.c, "SHA-256");
        map2.put(NISTObjectIdentifiers.e, "SHA-512");
        map2.put(NISTObjectIdentifiers.m, "SHAKE128");
        map2.put(NISTObjectIdentifiers.n, "SHAKE256");
    }

    static ASN1ObjectIdentifier a(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) b.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(str));
    }

    static ffil b(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.c)) {
            return new ffir();
        }
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.e)) {
            return new ffiu();
        }
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.m)) {
            return new ffiv(128);
        }
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.n)) {
            return new ffiv(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(aSN1ObjectIdentifier.toString()));
    }
}

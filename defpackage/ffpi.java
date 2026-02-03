package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffpi {
    public static ffil a(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        ffil ffivVar;
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.c)) {
            ffivVar = new ffir();
        } else {
            if (!aSN1ObjectIdentifier.w(NISTObjectIdentifiers.o)) {
                throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
            }
            ffivVar = new ffiv(256);
        }
        return (NISTObjectIdentifiers.o.w(aSN1ObjectIdentifier) || ffivVar.b() != i) ? new ffph(ffivVar, i) : ffivVar;
    }

    static ffil b(ffpm ffpmVar) {
        return a(ffpmVar.u, ffpmVar.r);
    }
}

package defpackage;

import org.bouncycastle.asn1.x509.AttributeCertificate;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffms implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws ffhy {
        try {
            return new ffia(AttributeCertificate.a(ffhz.a(ffxfVar.d)));
        } catch (ClassCastException e) {
            throw new ffhy("malformed data: ".concat(String.valueOf(e.getMessage())), e);
        } catch (IllegalArgumentException e2) {
            throw new ffhy("malformed data: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}

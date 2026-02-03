package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrz extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] bArrG = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
        if (ffwp.a(bArrG, 0) == 1) {
            return ffpr.a(ffwk.g(bArrG, 4, bArrG.length));
        }
        if (bArrG.length == 64) {
            bArrG = ffwk.g(bArrG, 4, 64);
        }
        return ffpk.a(bArrG);
    }
}

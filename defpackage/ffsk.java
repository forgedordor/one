package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsk extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            return new ffrp(ffsq.J(subjectPublicKeyInfo.a.a), ffwk.g(bArr, 4, bArr.length));
        } catch (Exception unused) {
            return new ffrp(ffsq.J(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}

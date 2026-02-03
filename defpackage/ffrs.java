package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrs extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return new ffnv(ffsq.w(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
        } catch (Exception unused) {
            return new ffnv(ffsq.w(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}

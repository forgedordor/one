package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrt extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return new ffob(ffsq.x(subjectPublicKeyInfo.a.a), ffnc.a(subjectPublicKeyInfo.a()).b());
        } catch (Exception unused) {
            return new ffob(ffsq.x(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}

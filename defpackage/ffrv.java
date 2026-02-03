package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrv extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] bArrN = subjectPublicKeyInfo.b.n();
        return new ffox(ffsq.A(subjectPublicKeyInfo.a.a), ffwk.g(bArrN, 1, bArrN.length));
    }
}

package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsd extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new ffqb(ffsq.D(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
    }
}

package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsh extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new ffra(ffsq.I(subjectPublicKeyInfo.a.a), ASN1OctetString.f(ASN1Sequence.j(subjectPublicKeyInfo.a()).h(0)).c);
    }
}

package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrw extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new ffpb(ffsq.B(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
    }
}

package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsa extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1Primitive aSN1PrimitiveA = subjectPublicKeyInfo.a();
        ffnh ffnhVar = aSN1PrimitiveA != null ? new ffnh(ASN1Sequence.j(aSN1PrimitiveA)) : null;
        return new ffvw(ffnhVar.a, ffnhVar.b, ffnhVar.c, ffsq.b(ffnhVar.d.a));
    }
}

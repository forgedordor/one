package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsj extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new ffrf(subjectPublicKeyInfo.b.m(), ffsq.c(ffnj.a(subjectPublicKeyInfo.a.b)));
    }
}

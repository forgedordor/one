package defpackage;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmk implements ffxg {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws ffme {
        try {
            byte[] bArr = ffxfVar.d;
            if (bArr instanceof EncryptedPrivateKeyInfo) {
            } else if (bArr != 0) {
                new EncryptedPrivateKeyInfo(ASN1Sequence.j(bArr));
            }
            return new ffmz();
        } catch (Exception e) {
            throw new ffme("problem parsing ENCRYPTED PRIVATE KEY: ".concat(String.valueOf(e.toString())), e);
        }
    }
}

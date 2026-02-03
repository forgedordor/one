package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmr implements ffxg {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws IOException {
        try {
            byte[] bArr = ffxfVar.d;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.wB, DERNull.a), bArr instanceof RSAPublicKey ? (RSAPublicKey) bArr : bArr != 0 ? new RSAPublicKey(ASN1Sequence.j(bArr)) : null);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new ffme("problem extracting key: ".concat(String.valueOf(e2.toString())), e2);
        }
    }
}

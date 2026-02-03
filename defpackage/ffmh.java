package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmh implements ffmg {
    @Override // defpackage.ffmg
    public final ffmf a(byte[] bArr) throws IOException {
        try {
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(bArr);
            if (aSN1SequenceJ.e() != 6) {
                throw new ffme("malformed sequence in DSA private key");
            }
            ASN1Integer aSN1IntegerM = ASN1Integer.m(aSN1SequenceJ.h(1));
            ASN1Integer aSN1IntegerM2 = ASN1Integer.m(aSN1SequenceJ.h(2));
            ASN1Integer aSN1IntegerM3 = ASN1Integer.m(aSN1SequenceJ.h(3));
            ASN1Integer aSN1IntegerM4 = ASN1Integer.m(aSN1SequenceJ.h(4));
            ASN1Integer aSN1IntegerM5 = ASN1Integer.m(aSN1SequenceJ.h(5));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.R;
            new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1IntegerM.j(), aSN1IntegerM2.j(), aSN1IntegerM3.j())), aSN1IntegerM4);
            new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1IntegerM.j(), aSN1IntegerM2.j(), aSN1IntegerM3.j())), aSN1IntegerM5);
            return new ffmf();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new ffme("problem creating DSA private key: ".concat(String.valueOf(e2.toString())), e2);
        }
    }
}

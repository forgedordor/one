package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x9.X9ECParameters;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmi implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws IOException {
        try {
            byte[] bArr = ffxfVar.d;
            ASN1Primitive aSN1PrimitiveV = ASN1Primitive.v(bArr);
            if (aSN1PrimitiveV instanceof ASN1ObjectIdentifier) {
                return ASN1Primitive.v(bArr);
            }
            if (aSN1PrimitiveV instanceof ASN1Sequence) {
                int i = X9ECParameters.a;
                if (aSN1PrimitiveV != null) {
                    return new X9ECParameters(ASN1Sequence.j(aSN1PrimitiveV));
                }
            }
            return null;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new ffme("exception extracting EC named curve: ".concat(String.valueOf(e2.toString())));
        }
    }
}

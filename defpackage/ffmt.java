package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.CertificateList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmt implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws IOException {
        try {
            try {
                try {
                    ASN1Primitive aSN1PrimitiveF = new ASN1InputStream(new ByteArrayInputStream(ffxfVar.d), (byte[]) null).f();
                    if (aSN1PrimitiveF != null) {
                        return new ffib(CertificateList.c(aSN1PrimitiveF));
                    }
                    throw new IOException("no content found");
                } catch (ClassCastException e) {
                    throw new ffhy("malformed data: ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (IllegalArgumentException e2) {
                throw new ffhy("malformed data: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        } catch (Exception e3) {
            throw new ffme("problem parsing cert: ".concat(String.valueOf(e3.toString())), e3);
        }
    }
}

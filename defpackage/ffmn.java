package defpackage;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cms.ContentInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmn implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws ffme {
        try {
            ASN1Primitive aSN1PrimitiveF = new ASN1InputStream(ffxfVar.d).f();
            if (aSN1PrimitiveF != null) {
                return new ContentInfo(ASN1Sequence.j(aSN1PrimitiveF));
            }
            return null;
        } catch (Exception e) {
            throw new ffme("problem parsing PKCS7 object: ".concat(String.valueOf(e.toString())), e);
        }
    }
}

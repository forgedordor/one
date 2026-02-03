package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhz {
    static {
        DesugarCollections.unmodifiableSet(new HashSet());
        DesugarCollections.unmodifiableList(new ArrayList());
    }

    public static ASN1Primitive a(byte[] bArr) throws IOException {
        ASN1Primitive aSN1PrimitiveV = ASN1Primitive.v(bArr);
        if (aSN1PrimitiveV != null) {
            return aSN1PrimitiveV;
        }
        throw new IOException("no content found");
    }
}

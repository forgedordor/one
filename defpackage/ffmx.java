package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmx {
    public ffmx(byte[] bArr) {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        new ffic(aSN1InputStream.f().s());
        ASN1Primitive aSN1PrimitiveF = aSN1InputStream.f();
        if (aSN1PrimitiveF != null) {
            Enumeration enumerationF = ASN1Sequence.j(aSN1PrimitiveF.s()).f();
            while (enumerationF.hasMoreElements()) {
                ASN1Encodable aSN1Encodable = (ASN1Encodable) enumerationF.nextElement();
                if (aSN1Encodable instanceof ASN1Sequence) {
                    ASN1Sequence.j(aSN1Encodable);
                } else if (aSN1Encodable instanceof ASN1TaggedObject) {
                    ASN1Sequence.m((ASN1TaggedObject) aSN1Encodable, false);
                } else if (aSN1Encodable instanceof ASN1UTF8String) {
                    ((ASN1UTF8String) aSN1Encodable).e();
                }
            }
        }
    }
}

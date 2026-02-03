package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnc extends ASN1Object {
    private final byte[] a;

    public ffnc(byte[] bArr) {
        this.a = bArr;
    }

    public static ffnc a(Object obj) {
        if (obj instanceof ffnc) {
            return (ffnc) obj;
        }
        if (obj != null) {
            return new ffnc(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return ffwk.c(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        return new DERSequence(aSN1EncodableVector);
    }

    public ffnc(ASN1Sequence aSN1Sequence) {
        this.a = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(0)).c);
    }
}

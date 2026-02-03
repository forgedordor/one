package defpackage;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnd extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public ffne d;
    private final int e;

    public ffnd(byte[] bArr, byte[] bArr2, byte[] bArr3, ffne ffneVar) {
        this.e = 0;
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = ffneVar;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.e));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.c));
        ffne ffneVar = this.d;
        if (ffneVar != null) {
            aSN1EncodableVector.b(new ffne(ffneVar.a));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ffnd(ASN1Sequence aSN1Sequence) {
        int iF = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.e = iF;
        if (iF != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
        this.b = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(2)).c);
        this.c = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(3)).c);
        if (aSN1Sequence.e() == 5) {
            ASN1Encodable aSN1EncodableH = aSN1Sequence.h(4);
            this.d = aSN1EncodableH instanceof ffne ? (ffne) aSN1EncodableH : aSN1EncodableH != null ? new ffne(ASN1Sequence.j(aSN1EncodableH)) : null;
        }
    }
}

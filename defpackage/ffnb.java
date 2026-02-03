package defpackage;

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
public final class ffnb extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    private final int f;
    private ffnc g;

    public ffnb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, ffnc ffncVar) {
        this.f = 0;
        this.a = ffwk.c(bArr);
        this.b = ffwk.c(bArr2);
        this.c = ffwk.c(bArr3);
        this.d = ffwk.c(bArr4);
        this.e = ffwk.c(bArr5);
        this.g = ffncVar;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.f));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.c));
        aSN1EncodableVector.b(new DEROctetString(this.d));
        aSN1EncodableVector.b(new DEROctetString(this.e));
        ffnc ffncVar = this.g;
        if (ffncVar != null) {
            aSN1EncodableVector.b(new ffnc(ffncVar.b()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ffnb(ASN1Sequence aSN1Sequence) {
        int iF = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.f = iF;
        if (iF == 0) {
            this.a = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
            this.b = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(2)).c);
            this.c = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(3)).c);
            this.d = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(4)).c);
            this.e = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(5)).c);
            if (aSN1Sequence.e() == 7) {
                this.g = ffnc.a(aSN1Sequence.h(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }
}

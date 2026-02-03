package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffno extends ASN1Object {
    public final int a;
    public final long b;
    public final long c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    private final byte[] h;

    public ffno(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = 0;
        this.b = j;
        this.d = ffwk.c(bArr);
        this.e = ffwk.c(bArr2);
        this.f = ffwk.c(bArr3);
        this.g = ffwk.c(bArr4);
        this.h = ffwk.c(bArr5);
        this.c = -1L;
    }

    public final byte[] a() {
        return ffwk.c(this.h);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        long j = this.c;
        if (j >= 0) {
            aSN1EncodableVector.b(new ASN1Integer(1L));
        } else {
            aSN1EncodableVector.b(new ASN1Integer(0L));
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.b(new ASN1Integer(this.b));
        aSN1EncodableVector2.b(new DEROctetString(this.d));
        aSN1EncodableVector2.b(new DEROctetString(this.e));
        aSN1EncodableVector2.b(new DEROctetString(this.f));
        aSN1EncodableVector2.b(new DEROctetString(this.g));
        if (j >= 0) {
            aSN1EncodableVector2.b(new DERTaggedObject(false, 0, new ASN1Integer(j)));
        }
        aSN1EncodableVector.b(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.b(new DERTaggedObject(true, 0, new DEROctetString(this.h)));
        return new DERSequence(aSN1EncodableVector);
    }

    public ffno(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.a = 1;
        this.b = j;
        this.d = ffwk.c(bArr);
        this.e = ffwk.c(bArr2);
        this.f = ffwk.c(bArr3);
        this.g = ffwk.c(bArr4);
        this.h = ffwk.c(bArr5);
        this.c = j2;
    }

    public ffno(ASN1Sequence aSN1Sequence) {
        ASN1Integer aSN1IntegerM = ASN1Integer.m(aSN1Sequence.h(0));
        if (!aSN1IntegerM.o(0) && !aSN1IntegerM.o(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = aSN1IntegerM.f();
        if (aSN1Sequence.e() != 2 && aSN1Sequence.e() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(aSN1Sequence.h(1));
        this.b = ASN1Integer.m(aSN1SequenceJ.h(0)).h();
        this.d = ffwk.c(DEROctetString.f(aSN1SequenceJ.h(1)).c);
        this.e = ffwk.c(DEROctetString.f(aSN1SequenceJ.h(2)).c);
        this.f = ffwk.c(DEROctetString.f(aSN1SequenceJ.h(3)).c);
        this.g = ffwk.c(DEROctetString.f(aSN1SequenceJ.h(4)).c);
        if (aSN1SequenceJ.e() == 6) {
            ASN1TaggedObject aSN1TaggedObjectN = ASN1TaggedObject.n(aSN1SequenceJ.h(5));
            if (aSN1TaggedObjectN.c == 0) {
                this.c = ASN1Integer.n(aSN1TaggedObjectN, false).h();
            } else {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
        } else if (aSN1SequenceJ.e() == 5) {
            this.c = -1L;
        } else {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        }
        if (aSN1Sequence.e() == 3) {
            this.h = ffwk.c(DEROctetString.g(ASN1TaggedObject.n(aSN1Sequence.h(2)), true).c);
        } else {
            this.h = null;
        }
    }
}

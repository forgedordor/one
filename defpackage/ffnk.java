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
public final class ffnk extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public ffnl c;
    private final int d;

    public ffnk(ASN1Sequence aSN1Sequence) {
        int iF = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.d = iF;
        if (iF != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
        this.b = ffwk.c(ASN1OctetString.f(aSN1Sequence.h(2)).c);
        if (aSN1Sequence.e() == 4) {
            ASN1Encodable aSN1EncodableH = aSN1Sequence.h(3);
            this.c = aSN1EncodableH instanceof ffnl ? (ffnl) aSN1EncodableH : aSN1EncodableH != null ? new ffnl(ASN1Sequence.j(aSN1EncodableH)) : null;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.d));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        ffnl ffnlVar = this.c;
        if (ffnlVar != null) {
            aSN1EncodableVector.b(new ffnl(ffnlVar.b(), this.c.a()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

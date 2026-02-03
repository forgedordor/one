package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsz {
    public final int a;
    private final ffil b;

    protected ffsz(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.b = ffsw.b(aSN1ObjectIdentifier);
        this.a = i;
    }

    protected final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.a) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return b(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.a;
        byte[] bArrJ = ffua.j(j, i2);
        int length = bArrJ.length;
        ffil ffilVar = this.b;
        ffilVar.e(bArrJ, 0, length);
        ffilVar.e(bArr, 0, bArr.length);
        ffilVar.e(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (ffilVar instanceof ffiv) {
            ((ffiv) ffilVar).l(bArr3, 0, i2);
            return bArr3;
        }
        ffilVar.a(bArr3, 0);
        return bArr3;
    }
}

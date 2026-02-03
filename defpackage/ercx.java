package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercx implements eqsf {
    private final eqsf a;
    private final byte[] b;

    public ercx(eqsf eqsfVar, byte[] bArr) {
        this.a = eqsfVar;
        this.b = bArr;
    }

    @Override // defpackage.eqsf
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.a.a(bArr, bArr2) : erup.b(bArr3, this.a.a(bArr, bArr2));
    }
}

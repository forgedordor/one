package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elcq extends elct implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public elcq(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.elct
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        ejwl.n(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.elct
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.elct
    public final long c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        ejwl.n(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = bArr[0] & 255;
        for (int i = 1; i < Math.min(bArr.length, 8); i++) {
            j |= (bArr[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.elct
    public final boolean d(elct elctVar) {
        int length = elctVar.f().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == elctVar.f()[i];
        }
        return z;
    }

    @Override // defpackage.elct
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.elct
    public final byte[] f() {
        return this.a;
    }

    @Override // defpackage.elct
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }
}

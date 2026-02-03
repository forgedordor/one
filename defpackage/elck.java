package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class elck implements elcv {
    public void d(char c) {
        c((byte) c);
        c((byte) (c >>> '\b'));
    }

    @Override // defpackage.elcv
    public void f(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.elcv
    public void g(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.elcv
    public void h(int i) {
        throw null;
    }

    @Override // defpackage.elcv
    public void i(long j) {
        for (int i = 0; i < 64; i += 8) {
            c((byte) (j >>> i));
        }
    }

    @Override // defpackage.elcv
    public void j(byte[] bArr) {
        g(bArr, bArr.length);
    }

    @Override // defpackage.elcv
    public elcv k(CharSequence charSequence, Charset charset) {
        j(charSequence.toString().getBytes(charset));
        return this;
    }

    @Override // defpackage.elcv
    public final void l(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            d(charSequence.charAt(i));
        }
    }

    @Override // defpackage.elcv
    public final void m(double d) {
        i(Double.doubleToRawLongBits(d));
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldl extends elck {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    private final void b(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = eldm.i(this.a, eldm.j((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.elcv
    public final void c(byte b) {
        b(1, b & 255);
    }

    @Override // defpackage.elck
    public final void d(char c) {
        b(2, c);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.remaining() >= 4) {
            h(byteBuffer.getInt());
        }
        while (byteBuffer.hasRemaining()) {
            c(byteBuffer.get());
        }
        byteBuffer.order(byteOrderOrder);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void g(byte[] bArr, int i) {
        int i2 = 0;
        ejwl.k(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            b(4, eldm.h(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            c(bArr[i2]);
            i2++;
        }
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void h(int i) {
        b(4, i);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void i(long j) {
        b(4, (int) j);
        b(4, j >>> 32);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final elcv k(CharSequence charSequence, Charset charset) {
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return super.k(charSequence, charset);
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence.charAt(i + 1);
            char cCharAt3 = charSequence.charAt(i + 2);
            char cCharAt4 = charSequence.charAt(i + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            b(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
            i = i2;
        }
        while (i < length) {
            char cCharAt5 = charSequence.charAt(i);
            if (cCharAt5 < 128) {
                b(1, cCharAt5);
            } else if (cCharAt5 < 2048) {
                b(2, eldm.l(cCharAt5));
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                b(3, eldm.k(cCharAt5));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                if (iCodePointAt == cCharAt5) {
                    j(charSequence.subSequence(i, length).toString().getBytes(charset));
                    return this;
                }
                b(4, eldm.m(iCodePointAt));
                i++;
            }
            i++;
        }
        return this;
    }

    @Override // defpackage.elcv
    public final elct r() {
        ejwl.l(!this.e);
        this.e = true;
        int iJ = this.a ^ eldm.j((int) this.b);
        this.a = iJ;
        return eldm.n(iJ, this.d);
    }
}

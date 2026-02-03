package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class evwb {
    static final String c(ByteBuffer byteBuffer, int i, int i2) throws evtj {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (!evwa.e(b)) {
                break;
            }
            i++;
            evwa.b(b, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (evwa.e(b2)) {
                evwa.b(b2, cArr, i6);
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (evwa.e(b3)) {
                        i++;
                        evwa.b(b3, cArr, i6);
                        i6++;
                    }
                }
            } else {
                if (evwa.g(b2)) {
                    if (i7 >= i4) {
                        throw new evtj("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    evwa.d(b2, byteBuffer.get(i7), cArr, i6);
                } else if (evwa.f(b2)) {
                    if (i7 >= i4 - 1) {
                        throw new evtj("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    evwa.c(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new evtj("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    evwa.a(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public abstract int a(int i, byte[] bArr, int i2, int i3);

    public abstract String b(byte[] bArr, int i, int i2);
}

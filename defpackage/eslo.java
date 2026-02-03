package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslo {
    public ByteBuffer a;
    public int b;
    public int c;
    int[] d;
    int e;
    boolean f;
    int g;
    int[] h;
    int i;
    int j;
    eslm k;

    public eslo() {
        this(1024);
    }

    public final int a(CharSequence charSequence) {
        char c;
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        char cCharAt;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c = 2048;
            z = true;
            if (i5 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 < 2048) {
                i6 += (127 - cCharAt2) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                int i7 = 0;
                while (i5 < length2) {
                    char cCharAt3 = charSequence.charAt(i5);
                    if (cCharAt3 < 2048) {
                        i7 += (127 - cCharAt3) >>> 31;
                    } else {
                        i7 += 2;
                        if (cCharAt3 >= 55296 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) < 65536) {
                                throw new esls(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i7;
            }
        }
        if (i6 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
        }
        e((byte) 0);
        p(1, i6, 1);
        ByteBuffer byteBuffer = this.a;
        int i8 = this.b - i6;
        this.b = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i9 = iRemaining + iPosition;
            while (i4 < length3) {
                int i10 = i4 + iPosition;
                if (i10 >= i9 || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                bArrArray[i10] = (byte) cCharAt;
                i4++;
            }
            if (i4 == length3) {
                i = iPosition + length3;
            } else {
                i = iPosition + i4;
                while (i4 < length3) {
                    char cCharAt4 = charSequence.charAt(i4);
                    if (cCharAt4 >= 128 || i >= i9) {
                        if (cCharAt4 < c && i <= i9 - 2) {
                            i2 = i + 2;
                            bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                            bArrArray[i + 1] = (byte) ((cCharAt4 & '?') | 128);
                            z2 = z;
                        } else {
                            if ((cCharAt4 >= 55296 && cCharAt4 <= 57343) || i > i9 - 3) {
                                z2 = z;
                                if (i > i9 - 4) {
                                    if (cCharAt4 >= 55296 && cCharAt4 <= 57343 && ((i3 = i4 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i3)))) {
                                        throw new esls(i4, length3);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i);
                                }
                                int i11 = i4 + 1;
                                if (i11 != charSequence.length()) {
                                    char cCharAt5 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                        int i12 = i + 3;
                                        int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                        bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                        bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i += 4;
                                        bArrArray[i12] = (byte) ((codePoint & 63) | 128);
                                        i4 = i11;
                                    } else {
                                        i4 = i11;
                                    }
                                }
                                throw new esls(i4 - 1, length3);
                            }
                            i2 = i + 3;
                            z2 = z;
                            bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                            bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                            bArrArray[i + 2] = (byte) ((cCharAt4 & '?') | 128);
                        }
                        i = i2;
                    } else {
                        bArrArray[i] = (byte) cCharAt4;
                        z2 = z;
                        i++;
                    }
                    i4++;
                    z = z2;
                    c = 2048;
                }
            }
            byteBuffer2.position(i - iArrayOffset);
        } else {
            eslt.b(charSequence, byteBuffer2);
        }
        return c();
    }

    public final int b() {
        int i;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        h(0);
        int iD = d();
        int i2 = this.e;
        do {
            i2--;
            if (i2 < 0) {
                break;
            }
        } while (this.d[i2] == 0);
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.d[i3];
            j((short) (i4 != 0 ? iD - i4 : 0));
        }
        j((short) (iD - this.g));
        int i5 = i2 + 3;
        j((short) (i5 + i5));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.i) {
                i = 0;
                break;
            }
            int iCapacity = this.a.capacity() - this.h[i6];
            int i7 = this.b;
            short s = this.a.getShort(iCapacity);
            if (s == this.a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.a.getShort(iCapacity + i8) != this.a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.h[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.a.capacity() - iD;
            this.b = iCapacity2;
            this.a.putInt(iCapacity2, i - iD);
        } else {
            int i9 = this.i;
            int[] iArr = this.h;
            if (i9 == iArr.length) {
                this.h = Arrays.copyOf(iArr, i9 + i9);
            }
            int[] iArr2 = this.h;
            int i10 = this.i;
            this.i = i10 + 1;
            iArr2[i10] = d();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - iD, d() - iD);
        }
        this.f = false;
        return iD;
    }

    public final int c() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        m(this.j);
        return d();
    }

    public final int d() {
        return this.a.capacity() - this.b;
    }

    public final void e(byte b) {
        l(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b);
    }

    public final void f(double d) {
        l(8, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putDouble(i, d);
    }

    public final void g(float f) {
        l(4, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 4;
        this.b = i;
        byteBuffer.putFloat(i, f);
    }

    public final void h(int i) {
        l(4, 0);
        m(i);
    }

    public final void i(int i) {
        l(4, 0);
        m((d() - i) + 4);
    }

    public final void j(short s) {
        l(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void k() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void l(int i, int i2) {
        int i3;
        if (i > this.c) {
            this.c = i;
        }
        int i4 = i - 1;
        int i5 = ~((this.a.capacity() - this.b) + i2);
        while (true) {
            int i6 = (i5 + 1) & i4;
            if (this.b >= i6 + i + i2) {
                for (int i7 = 0; i7 < i6; i7++) {
                    ByteBuffer byteBuffer = this.a;
                    int i8 = this.b - 1;
                    this.b = i8;
                    byteBuffer.put(i8, (byte) 0);
                }
                return;
            }
            int iCapacity = this.a.capacity();
            ByteBuffer byteBuffer2 = this.a;
            eslm eslmVar = this.k;
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 + iCapacity2;
                }
            }
            byteBuffer2.position(0);
            ByteBuffer byteBufferA = eslmVar.a(i3);
            byteBufferA.position(byteBufferA.clear().capacity() - iCapacity2);
            byteBufferA.put(byteBuffer2);
            this.a = byteBufferA;
            this.b += byteBufferA.capacity() - iCapacity;
        }
    }

    public final void m(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void n(int i) {
        this.d[i] = d();
    }

    public final void o(int i) {
        k();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.g = d();
    }

    public final void p(int i, int i2, int i3) {
        k();
        this.j = i2;
        int i4 = i * i2;
        l(4, i4);
        l(i3, i4);
        this.f = true;
    }

    public final void q(int i, boolean z) {
        if (z) {
            l(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 1;
            this.b = i2;
            byteBuffer.put(i2, (byte) 1);
            n(i);
        }
    }

    public final void r(int i, byte b) {
        if (b != 0) {
            e(b);
            n(i);
        }
    }

    public final void s(int i, int i2) {
        if (i2 != 0) {
            h(i2);
            n(i);
        }
    }

    public final void t(int i, int i2) {
        if (i2 != 0) {
            i(i2);
            n(i);
        }
    }

    public eslo(int i) {
        esln eslnVar = esln.a;
        eslr.a();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.h = new int[16];
        this.i = 0;
        this.j = 0;
        this.k = eslnVar;
        ByteBuffer byteBufferA = eslnVar.a(i);
        this.a = byteBufferA;
        this.b = byteBufferA.capacity();
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eslp {
    public int a;
    public ByteBuffer b;
    private int c;
    private int d;

    public eslp() {
        eslr.a();
    }

    public final int c(int i) {
        return i + this.b.getInt(i);
    }

    public final int d(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final int e(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int f(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final String g(int i) {
        char[] cArr;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer = this.b;
        int i5 = i + byteBuffer.getInt(i);
        int i6 = byteBuffer.getInt(i5);
        int i7 = i5 + 4;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + i7;
            int length = bArrArray.length;
            if ((iArrayOffset | i6 | ((length - iArrayOffset) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iArrayOffset), Integer.valueOf(i6)));
            }
            int i8 = iArrayOffset + i6;
            cArr = new char[i6];
            int i9 = 0;
            while (iArrayOffset < i8) {
                byte b = bArrArray[iArrayOffset];
                if (!eslq.e(b)) {
                    break;
                }
                iArrayOffset++;
                eslq.b(b, cArr, i9);
                i9++;
            }
            i2 = i9;
            while (iArrayOffset < i8) {
                int i10 = iArrayOffset + 1;
                byte b2 = bArrArray[iArrayOffset];
                if (eslq.e(b2)) {
                    eslq.b(b2, cArr, i2);
                    i2++;
                    iArrayOffset = i10;
                    while (iArrayOffset < i8) {
                        byte b3 = bArrArray[iArrayOffset];
                        if (eslq.e(b3)) {
                            iArrayOffset++;
                            eslq.b(b3, cArr, i2);
                            i2++;
                        }
                    }
                } else {
                    if (eslq.g(b2)) {
                        if (i10 >= i8) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        iArrayOffset += 2;
                        eslq.d(b2, bArrArray[i10], cArr, i2);
                    } else if (eslq.f(b2)) {
                        if (i10 >= i8 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        int i11 = iArrayOffset + 2;
                        iArrayOffset += 3;
                        eslq.c(b2, bArrArray[i10], bArrArray[i11], cArr, i2);
                    } else {
                        if (i10 >= i8 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b4 = bArrArray[i10];
                        int i12 = iArrayOffset + 3;
                        byte b5 = bArrArray[iArrayOffset + 2];
                        iArrayOffset += 4;
                        eslq.a(b2, b4, b5, bArrArray[i12], cArr, i2);
                        i2 += 2;
                    }
                    i2 = i4;
                }
            }
        } else {
            if ((i7 | i6 | ((byteBuffer.limit() - i7) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i6)));
            }
            int i13 = i7 + i6;
            cArr = new char[i6];
            int i14 = 0;
            while (i7 < i13) {
                byte b6 = byteBuffer.get(i7);
                if (!eslq.e(b6)) {
                    break;
                }
                i7++;
                eslq.b(b6, cArr, i14);
                i14++;
            }
            i2 = i14;
            while (i7 < i13) {
                int i15 = i7 + 1;
                byte b7 = byteBuffer.get(i7);
                if (eslq.e(b7)) {
                    eslq.b(b7, cArr, i2);
                    i2++;
                    i7 = i15;
                    while (i7 < i13) {
                        byte b8 = byteBuffer.get(i7);
                        if (eslq.e(b8)) {
                            i7++;
                            eslq.b(b8, cArr, i2);
                            i2++;
                        }
                    }
                } else {
                    if (eslq.g(b7)) {
                        if (i15 >= i13) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        i7 += 2;
                        eslq.d(b7, byteBuffer.get(i15), cArr, i2);
                    } else if (eslq.f(b7)) {
                        if (i15 >= i13 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        int i16 = i7 + 2;
                        i7 += 3;
                        eslq.c(b7, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i2);
                    } else {
                        if (i15 >= i13 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b9 = byteBuffer.get(i15);
                        int i17 = i7 + 3;
                        byte b10 = byteBuffer.get(i7 + 2);
                        i7 += 4;
                        eslq.a(b7, b9, b10, byteBuffer.get(i17), cArr, i2);
                        i2 += 2;
                    }
                    i2 = i3;
                }
            }
        }
        return new String(cArr, 0, i2);
    }

    public final void h(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }
}

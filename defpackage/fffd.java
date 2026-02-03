package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fffd implements Serializable, Comparable {
    public static final fffd a = new fffd(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public fffd(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static final fffd f(byte... bArr) {
        bArr.getClass();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return new fffd(bArrCopyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        fffd fffdVar = new fffd(bArr);
        Field declaredField = fffd.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, fffdVar.b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public final String c() {
        int length;
        int i;
        byte[] bArr = ffer.a;
        byte[] bArr2 = this.b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int i6 = length - i;
        if (i6 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (i6 == 2) {
            int i7 = i2 + 1;
            byte b5 = bArr2[i2];
            byte b6 = bArr2[i7];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return ffge.a(bArr3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fffd fffdVar = (fffd) obj;
        fffdVar.getClass();
        int iB = b();
        int iB2 = fffdVar.b();
        int iMin = Math.min(iB, iB2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = fffdVar.a(i) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iB == iB2) {
            return 0;
        }
        return iB >= iB2 ? 1 : -1;
    }

    public String d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = ffgg.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public final String e() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strA = ffge.a(j());
        this.d = strA;
        return strA;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fffd) {
            fffd fffdVar = (fffd) obj;
            int iB = fffdVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            return iB == length && fffdVar.h(0, bArr, 0, length);
        }
        return false;
    }

    public fffd g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                bArrCopyOf.getClass();
                bArrCopyOf[i] = (byte) (b + 32);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                    i2 = i3;
                }
                return new fffd(bArrCopyOf);
            }
            i = i2;
        }
    }

    public boolean h(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ffes.c(bArr2, i, bArr, i2, i3);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    public final boolean i(fffd fffdVar) {
        fffdVar.getClass();
        return l(fffdVar, fffdVar.b());
    }

    public byte[] j() {
        return this.b;
    }

    public byte[] k() {
        byte[] bArr = this.b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public boolean l(fffd fffdVar, int i) {
        return fffdVar.h(0, this.b, 0, i);
    }

    public void m(ffez ffezVar, int i) {
        char[] cArr = ffgg.a;
        ffezVar.N(this.b, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[PHI: r4 r10
      0x0087: PHI (r4v13 int) = (r4v10 int), (r4v14 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[PHI: r4 r10
      0x008a: PHI (r4v11 int) = (r4v10 int), (r4v14 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fffd.toString():java.lang.String");
    }
}

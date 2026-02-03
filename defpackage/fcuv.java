package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcuv extends fcut {
    public static final List c(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final void d(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static final void e(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static final int[] f(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        iArrCopyOf.getClass();
        return iArrCopyOf;
    }

    public static final Object[] g(Object[] objArr, int i, int i2) {
        objArr.getClass();
        fcur.a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static final Object[] h(Object[] objArr, Object obj) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static final void i(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void j(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static final void k(float[] fArr, float[] fArr2, int i) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static final void l(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static final void m(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static final void n(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void p(float[] fArr, float[] fArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = fArr.length;
        }
        fcur.k(fArr, fArr2, i);
    }

    public static /* synthetic */ void q(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        fcur.l(iArr, iArr2, i, 0, i2);
    }

    public static final byte[] s(byte[] bArr, int i) {
        bArr.getClass();
        fcur.a(i, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static final void t(long[] jArr, long j, int i) {
        jArr.getClass();
        Arrays.fill(jArr, 0, i, j);
    }

    public static /* synthetic */ void x(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        fcur.n(objArr, objArr2, 0, i, i2);
    }
}

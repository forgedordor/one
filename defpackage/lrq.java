package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrq {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public lrq(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static lrq d(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new lrq(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(lru.m);
        return new lrq(1, bytes.length, bytes);
    }

    public static lrq e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(lru.m);
        return new lrq(2, bytes.length, bytes);
    }

    public static lrq f(long j, ByteOrder byteOrder) {
        return g(new long[]{j}, byteOrder);
    }

    public static lrq g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[lru.j[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = jArr.length;
            if (i >= length) {
                return new lrq(4, length, byteBufferWrap.array());
            }
            byteBufferWrap.putInt((int) jArr[i]);
            i++;
        }
    }

    public static lrq h(lrs lrsVar, ByteOrder byteOrder) {
        return i(new lrs[]{lrsVar}, byteOrder);
    }

    public static lrq i(lrs[] lrsVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[lru.j[5] * lrsVarArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = lrsVarArr.length;
            if (i >= length) {
                return new lrq(5, length, byteBufferWrap.array());
            }
            lrs lrsVar = lrsVarArr[i];
            byteBufferWrap.putInt((int) lrsVar.a);
            byteBufferWrap.putInt((int) lrsVar.b);
            i++;
        }
    }

    public static lrq j(int i, ByteOrder byteOrder) {
        return k(new int[]{i}, byteOrder);
    }

    public static lrq k(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[lru.j[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return new lrq(3, length, byteBufferWrap.array());
            }
            byteBufferWrap.putShort((short) iArr[i]);
            i++;
        }
    }

    public final double a(ByteOrder byteOrder) throws Throwable {
        Object objL = l(byteOrder);
        if (objL == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objL instanceof String) {
            return Double.parseDouble((String) objL);
        }
        if (objL instanceof long[]) {
            if (((long[]) objL).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objL instanceof int[]) {
            if (((int[]) objL).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objL instanceof double[]) {
            double[] dArr = (double[]) objL;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objL instanceof lrs[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        lrs[] lrsVarArr = (lrs[]) objL;
        if (lrsVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        lrs lrsVar = lrsVarArr[0];
        return lrsVar.a / lrsVar.b;
    }

    public final int b(ByteOrder byteOrder) throws Throwable {
        Object objL = l(byteOrder);
        if (objL == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objL instanceof String) {
            return Integer.parseInt((String) objL);
        }
        if (objL instanceof long[]) {
            long[] jArr = (long[]) objL;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objL instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objL;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int c() {
        return lru.j[this.a] * this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x013e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:319), block:B:94:0x013e */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [lrs[]] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v14, types: [lrs[]] */
    /* JADX WARN: Type inference failed for: r5v15, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object l(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrq.l(java.nio.ByteOrder):java.lang.Object");
    }

    public final String m(ByteOrder byteOrder) throws Throwable {
        Object objL = l(byteOrder);
        if (objL == null) {
            return null;
        }
        if (objL instanceof String) {
            return (String) objL;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objL instanceof long[]) {
            long[] jArr = (long[]) objL;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (objL instanceof int[]) {
            int[] iArr = (int[]) objL;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (objL instanceof double[]) {
            double[] dArr = (double[]) objL;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(objL instanceof lrs[])) {
                return null;
            }
            lrs[] lrsVarArr = (lrs[]) objL;
            while (true) {
                int length4 = lrsVarArr.length;
                if (i >= length4) {
                    break;
                }
                sb.append(lrsVarArr[i].a);
                sb.append('/');
                sb.append(lrsVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return "(" + lru.i[this.a] + ", data length:" + this.d.length + ")";
    }

    public lrq(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }
}

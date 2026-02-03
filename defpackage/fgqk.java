package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqk extends fgmz {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final fgqi i;

    private fgqk(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, fgqi fgqiVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = fgqiVar;
    }

    static fgqk n(DataInput dataInput, String str) throws IOException {
        int unsignedByte;
        int unsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int i2 = dataInput.readInt();
        long[] jArr = new long[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        String[] strArr2 = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = fgqm.a(dataInput);
            iArr[i3] = (int) fgqm.a(dataInput);
            iArr2[i3] = (int) fgqm.a(dataInput);
            if (unsignedShort < 256) {
                try {
                    unsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                unsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i3] = strArr[unsignedByte];
        }
        return new fgqk(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new fgqi(str, (int) fgqm.a(dataInput), fgql.c(dataInput), fgql.c(dataInput)) : null);
    }

    @Override // defpackage.fgmz
    public final int a(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.f[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            fgqi fgqiVar = this.i;
            return fgqiVar == null ? this.f[i - 1] : fgqiVar.a(j);
        }
        if (i > 0) {
            return this.f[i - 1];
        }
        return 0;
    }

    @Override // defpackage.fgmz
    public final int c(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.g[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            fgqi fgqiVar = this.i;
            return fgqiVar == null ? this.g[i - 1] : fgqiVar.e;
        }
        if (i > 0) {
            return this.g[i - 1];
        }
        return 0;
    }

    @Override // defpackage.fgmz
    public final long e(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        fgqi fgqiVar = this.i;
        if (fgqiVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return fgqiVar.e(j);
    }

    @Override // defpackage.fgmz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgqk) {
            fgqk fgqkVar = (fgqk) obj;
            if (this.c.equals(fgqkVar.c) && Arrays.equals(this.e, fgqkVar.e) && Arrays.equals(this.h, fgqkVar.h) && Arrays.equals(this.f, fgqkVar.f) && Arrays.equals(this.g, fgqkVar.g)) {
                fgqi fgqiVar = this.i;
                fgqi fgqiVar2 = fgqkVar.i;
                if (fgqiVar != null ? fgqiVar.equals(fgqiVar2) : fgqiVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgmz
    public final long f(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            if (j > Long.MIN_VALUE) {
                return j - 1;
            }
            return Long.MIN_VALUE;
        }
        int i = ~iBinarySearch;
        if (i >= jArr.length) {
            fgqi fgqiVar = this.i;
            if (fgqiVar != null) {
                long jF = fgqiVar.f(j);
                if (jF < j) {
                    return jF;
                }
            }
            long j2 = jArr[i - 1];
            if (j2 > Long.MIN_VALUE) {
                return j2 - 1;
            }
        } else if (i > 0) {
            long j3 = jArr[i - 1];
            if (j3 > Long.MIN_VALUE) {
                return j3 - 1;
            }
        }
        return j;
    }

    @Override // defpackage.fgmz
    public final String g(long j) {
        long[] jArr = this.e;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch >= 0) {
            return this.h[iBinarySearch];
        }
        int i = ~iBinarySearch;
        if (i < jArr.length) {
            return i > 0 ? this.h[i - 1] : "UTC";
        }
        fgqi fgqiVar = this.i;
        return fgqiVar == null ? this.h[i - 1] : fgqiVar.g(j);
    }

    @Override // defpackage.fgmz
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.fgmz
    public final boolean k() {
        return false;
    }
}

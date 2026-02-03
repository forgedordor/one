package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzn implements Iterable, fdcn {
    public static final hzn a = new hzn(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private hzn(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final hzn a(hzn hznVar) {
        hzn hznVar2 = a;
        if (hznVar == hznVar2) {
            return this;
        }
        if (this == hznVar2) {
            return hznVar2;
        }
        long j = hznVar.d;
        long j2 = this.d;
        if (j == j2) {
            long[] jArr = hznVar.e;
            long[] jArr2 = this.e;
            if (jArr == jArr2) {
                return new hzn((~hznVar.b) & this.b, this.c & (~hznVar.c), j2, jArr2);
            }
        }
        long[] jArr3 = hznVar.e;
        hzn hznVarB = this;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                hznVarB = hznVarB.b(j3);
            }
        }
        long j4 = hznVar.c;
        if (j4 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j4) != 0) {
                    hznVarB = hznVarB.b(i + j);
                }
            }
        }
        long j5 = hznVar.b;
        if (j5 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != 0) {
                    hznVarB = hznVarB.b(i2 + j + 64);
                }
            }
        }
        return hznVarB;
    }

    public final hzn b(long j) {
        long[] jArr;
        int iA;
        long[] jArr2;
        long j2 = this.d;
        long j3 = j - j2;
        if (fdbq.b(j3, 0L) >= 0 && fdbq.b(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new hzn(this.b, j5 & (~j4), j2, this.e);
            }
        } else if (fdbq.b(j3, 64L) >= 0 && fdbq.b(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new hzn((~j6) & j7, this.c, j2, this.e);
            }
        } else if (fdbq.b(j3, 0L) < 0 && (jArr = this.e) != null && (iA = hzo.a(jArr, j)) >= 0) {
            long j8 = this.b;
            long j9 = this.c;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iA > 0) {
                    fcur.m(jArr, jArr3, 0, 0, iA);
                }
                if (iA < i) {
                    fcur.m(jArr, jArr3, iA, iA + 1, length);
                }
                jArr2 = jArr3;
            }
            return new hzn(j8, j9, j2, jArr2);
        }
        return this;
    }

    public final hzn c(hzn hznVar) {
        hzn hznVarD = hznVar;
        hzn hznVar2 = a;
        if (hznVarD == hznVar2) {
            return this;
        }
        if (this == hznVar2) {
            return hznVarD;
        }
        long j = hznVarD.d;
        long j2 = this.d;
        if (j == j2) {
            long[] jArr = hznVarD.e;
            long[] jArr2 = this.e;
            if (jArr == jArr2) {
                return new hzn(hznVarD.b | this.b, hznVarD.c | this.c, j2, jArr2);
            }
        }
        long j3 = 1;
        int i = 0;
        if (this.e == null) {
            long j4 = this.c;
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        hznVarD = hznVarD.d(i2 + j2);
                    }
                }
            }
            long j5 = this.b;
            if (j5 != 0) {
                while (i < 64) {
                    if (((1 << i) & j5) != 0) {
                        hznVarD = hznVarD.d(i + j2 + 64);
                    }
                    i++;
                }
            }
            return hznVarD;
        }
        long[] jArr3 = hznVarD.e;
        hzn hznVarD2 = this;
        if (jArr3 != null) {
            for (long j6 : jArr3) {
                hznVarD2 = hznVarD2.d(j6);
            }
        }
        long j7 = hznVarD.c;
        if (j7 != 0) {
            int i3 = 0;
            while (i3 < 64) {
                long j8 = j3;
                if ((j7 & (j3 << i3)) != 0) {
                    hznVarD2 = hznVarD2.d(i3 + j);
                }
                i3++;
                j3 = j8;
            }
        }
        long j9 = j3;
        long j10 = hznVarD.b;
        if (j10 != 0) {
            while (i < 64) {
                if (((j9 << i) & j10) != 0) {
                    hznVarD2 = hznVarD2.d(i + j + 64);
                }
                i++;
            }
        }
        return hznVarD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hzn d(long r31) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzn.d(long):hzn");
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (fdbq.b(j2, 0L) < 0 || fdbq.b(j2, 64L) >= 0) {
            if (fdbq.b(j2, 64L) < 0 || fdbq.b(j2, 128L) >= 0) {
                if (fdbq.b(j2, 0L) <= 0 && (jArr = this.e) != null && hzo.a(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j2) - 64)) & this.b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j2)) & this.c) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new fdez(new hzm(this, null)).a();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(fcva.p(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes6.dex */
public final class fdhi implements Comparable {
    public static final long a;
    public static final long b;
    public final long c;

    static {
        int i = fdhj.a;
        a = fdhk.a(4611686018427387903L);
        b = fdhk.a(-4611686018427387903L);
    }

    public static int a(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return fdbq.b(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return t(j) ? -i : i;
    }

    public static final int b(long j) {
        if (s(j)) {
            return 0;
        }
        return (int) (l(j, fdhl.f) % 24);
    }

    public static final int c(long j) {
        if (s(j)) {
            return 0;
        }
        return (int) (l(j, fdhl.e) % 60);
    }

    public static final int d(long j) {
        if (s(j)) {
            return 0;
        }
        boolean zV = v(j);
        long jI = i(j);
        return (int) (zV ? fdhk.d(jI % 1000) : jI % 1000000000);
    }

    public static final int e(long j) {
        if (s(j)) {
            return 0;
        }
        return (int) (h(j) % 60);
    }

    public static final long f(long j) {
        return l(j, fdhl.g);
    }

    public static final long g(long j) {
        return (v(j) && q(j)) ? i(j) : l(j, fdhl.c);
    }

    public static final long h(long j) {
        return l(j, fdhl.d);
    }

    public static final long i(long j) {
        return j >> 1;
    }

    public static final long j(long j, long j2) {
        if (s(j)) {
            if (q(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (s(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return v(j) ? w(i(j), i(j2)) : w(i(j2), i(j));
        }
        long jI = i(j) + i(j2);
        return r(j) ? fdhk.c(jI) : fdhk.b(jI);
    }

    public static final long k(long j, int i) {
        if (s(j)) {
            if (i != 0) {
                return i > 0 ? j : m(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return 0L;
        }
        long jI = i(j);
        long j2 = i;
        long j3 = jI * j2;
        if (!r(j)) {
            return j3 / j2 == jI ? fdhk.a(fddu.l(j3, new fddt())) : Long.signum(jI) * Integer.signum(i) > 0 ? a : b;
        }
        if (jI >= -2147483647L && jI < 2147483648L) {
            int i2 = fdhj.a;
            return j3 + j3;
        }
        if (j3 / j2 == jI) {
            return fdhk.c(j3);
        }
        long jE = fdhk.e(jI);
        long j4 = jE * j2;
        if (j4 / j2 == jE) {
            long jE2 = fdhk.e((jI - fdhk.d(jE)) * j2) + j4;
            if ((jE2 ^ j4) >= 0) {
                return fdhk.a(fddu.l(jE2, new fddt()));
            }
        }
        return Long.signum(jI) * Integer.signum(i) > 0 ? a : b;
    }

    public static final long l(long j, fdhl fdhlVar) {
        fdhlVar.getClass();
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return fdhm.b(i(j), o(j), fdhlVar);
    }

    public static final long m(long j) {
        int i = fdhj.a;
        int i2 = ((int) j) & 1;
        long j2 = -i(j);
        return j2 + j2 + i2;
    }

    public static String n(long j) {
        boolean z;
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == b) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean zT = t(j);
        if (zT) {
            sb.append('-');
        }
        if (t(j)) {
            j = m(j);
        }
        long jF = f(j);
        int i2 = 0;
        boolean z2 = jF != 0;
        int iB = b(j);
        boolean z3 = iB != 0;
        int iC = c(j);
        boolean z4 = iC != 0;
        int iE = e(j);
        int iD = d(j);
        if (iE != 0) {
            z = true;
        } else if (iD != 0) {
            z = true;
            iE = 0;
        } else {
            iD = 0;
            z = false;
            iE = 0;
        }
        if (z2) {
            sb.append(jF);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iB);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iC);
            sb.append('m');
            i = i4;
        }
        if (z) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iE == 0) {
                if (!z2 && !z3 && !z4) {
                    if (iD >= 1000000) {
                        u(sb, iD / 1000000, iD % 1000000, 6, "ms");
                    } else if (iD >= 1000) {
                        u(sb, iD / 1000, iD % 1000, 3, "us");
                    } else {
                        sb.append(iD);
                        sb.append("ns");
                    }
                }
                i = i5;
            } else {
                i2 = iE;
            }
            u(sb, i2, iD, 9, "s");
            i = i5;
        }
        if (zT && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final fdhl o(long j) {
        return r(j) ? fdhl.a : fdhl.c;
    }

    public static final boolean p(long j, long j2) {
        return j == j2;
    }

    public static final boolean q(long j) {
        return !s(j);
    }

    public static final boolean r(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean s(long j) {
        return j == a || j == b;
    }

    public static final boolean t(long j) {
        return j < 0;
    }

    public static final void u(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strQ = fdgn.Q(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strQ.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strQ.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) strQ, 0, i6);
            } else {
                sb.append((CharSequence) strQ, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    private static final boolean v(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final long w(long j, long j2) {
        long jE = fdhk.e(j2);
        long j3 = j + jE;
        if (j3 < -4611686018426L || j3 >= 4611686018427L) {
            return fdhk.a(fddu.m(j3, -4611686018427387903L, 4611686018427387903L));
        }
        long jD = j2 - fdhk.d(jE);
        int i = fdhj.a;
        long jD2 = fdhk.d(j3) + jD;
        return jD2 + jD2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a(this.c, ((fdhi) obj).c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdhi) && this.c == ((fdhi) obj).c;
    }

    public final int hashCode() {
        return fdhh.a(this.c);
    }

    public final String toString() {
        return n(this.c);
    }
}

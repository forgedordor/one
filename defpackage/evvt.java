package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evvt {
    public static final evvt a = new evvt(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private evvt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static evvt b(evvt evvtVar, evvt evvtVar2) {
        int i = evvtVar.b + evvtVar2.b;
        int[] iArrCopyOf = Arrays.copyOf(evvtVar.c, i);
        System.arraycopy(evvtVar2.c, 0, iArrCopyOf, evvtVar.b, evvtVar2.b);
        Object[] objArrCopyOf = Arrays.copyOf(evvtVar.d, i);
        System.arraycopy(evvtVar2.d, 0, objArrCopyOf, evvtVar.b, evvtVar2.b);
        return new evvt(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int iX;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int iA = evwj.a(i4);
            int iB = evwj.b(i4);
            if (iB == 0) {
                iX = evrf.X(iA, ((Long) this.d[i3]).longValue());
            } else if (iB == 1) {
                ((Long) this.d[i3]).longValue();
                iX = evrf.aq(iA);
            } else if (iB == 2) {
                iX = evrf.B(iA, (evqs) this.d[i3]);
            } else if (iB == 3) {
                int iU = evrf.U(iA);
                iX = iU + iU + ((evvt) this.d[i3]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(new evti());
                }
                ((Integer) this.d[i3]).intValue();
                iX = evrf.ap(iA);
            }
            i2 += iX;
        }
        this.e = i2;
        return i2;
    }

    final void c() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void d(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void e() {
        if (this.f) {
            this.f = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof evvt)) {
            return false;
        }
        evvt evvtVar = (evvt) obj;
        int i = this.b;
        if (i == evvtVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = evvtVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = evvtVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    final void f(int i, Object obj) {
        c();
        d(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    final boolean g(int i, evqz evqzVar) throws evti {
        int iM;
        c();
        int iB = evwj.b(i);
        if (iB == 0) {
            f(i, Long.valueOf(evqzVar.p()));
            return true;
        }
        if (iB == 1) {
            f(i, Long.valueOf(evqzVar.o()));
            return true;
        }
        if (iB == 2) {
            f(i, evqzVar.w());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                evqzVar.P();
                return false;
            }
            if (iB != 5) {
                throw new evti();
            }
            f(i, Integer.valueOf(evqzVar.g()));
            return true;
        }
        evvt evvtVar = new evvt();
        do {
            iM = evqzVar.m();
            if (iM == 0) {
                break;
            }
        } while (evvtVar.g(iM, evqzVar));
        evqzVar.z(evwj.c(evwj.a(i), 4));
        f(i, evvtVar);
        return true;
    }

    public final void h(evrg evrgVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int iB = evwj.b(i2);
                int iA = evwj.a(i2);
                if (iB == 0) {
                    evrgVar.j(iA, ((Long) obj).longValue());
                } else if (iB == 1) {
                    evrgVar.f(iA, ((Long) obj).longValue());
                } else if (iB == 2) {
                    evrgVar.b(iA, (evqs) obj);
                } else if (iB == 3) {
                    evrf evrfVar = evrgVar.a;
                    evrfVar.u(iA, 3);
                    ((evvt) obj).h(evrgVar);
                    evrfVar.u(iA, 4);
                } else {
                    if (iB != 5) {
                        throw new RuntimeException(new evti());
                    }
                    evrgVar.e(iA, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public evvt() {
        this(0, new int[8], new Object[8], true);
    }
}

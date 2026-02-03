package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqz {
    public final hra a;
    public final int[] b;
    public final int c;
    public final int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    private final Object[] m;
    private final hog n;

    public hqz(hra hraVar) {
        this.a = hraVar;
        this.b = hraVar.a;
        int i = hraVar.b;
        this.c = i;
        this.m = hraVar.c;
        this.d = hraVar.d;
        this.g = i;
        this.h = -1;
        this.n = new hog();
    }

    private final Object C(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return hmk.a;
        }
        Object[] objArr = this.m;
        int length = iArr.length;
        if (i2 < length) {
            length = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
        }
        return objArr[length];
    }

    public final boolean A() {
        return x() || this.f == this.g;
    }

    public final boolean B(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final int a() {
        int i = this.f;
        if (i < this.g) {
            return this.b[i * 5];
        }
        return 0;
    }

    public final int b(int i) {
        return this.b[i * 5];
    }

    public final int c(int i) {
        return hrc.a(this.b, i);
    }

    public final int d(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final int e(int i) {
        return this.b[(i * 5) + 2];
    }

    public final int f() {
        if (this.i != 0) {
            hmz.j("Cannot skip while in an empty region");
        }
        int[] iArr = this.b;
        int i = this.f;
        int i2 = iArr[(i * 5) + 1];
        int i3 = (1073741824 & i2) == 0 ? 67108863 & i2 : 1;
        this.f = i + hrc.a(iArr, i);
        return i3;
    }

    public final hlv g(int i) {
        ArrayList arrayList = this.a.h;
        int iD = hrc.d(arrayList, i, this.c);
        if (iD >= 0) {
            return (hlv) arrayList.get(iD);
        }
        hlv hlvVar = new hlv(i);
        arrayList.add(-(iD + 1), hlvVar);
        return hlvVar;
    }

    public final Object h() {
        int i = this.f;
        if (i < this.g) {
            return C(this.b, i);
        }
        return 0;
    }

    public final Object i() {
        int i = this.f;
        if (i < this.g) {
            return p(this.b, i);
        }
        return null;
    }

    public final Object j(int i) {
        return C(this.b, i);
    }

    public final Object k(int i) {
        return l(this.f, i);
    }

    public final Object l(int i, int i2) {
        int[] iArr = this.b;
        int iE = hrc.e(iArr, i);
        int i3 = i + 1;
        int i4 = iE + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.d) ? this.m[i4] : hmk.a;
    }

    public final Object m(int i) {
        return p(this.b, i);
    }

    public final Object n() {
        int i;
        if (this.i > 0 || (i = this.j) >= this.k) {
            this.l = false;
            return hmk.a;
        }
        this.l = true;
        Object[] objArr = this.m;
        this.j = i + 1;
        return objArr[i];
    }

    public final Object o(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        if ((iArr[i2 + 1] & 1073741824) != 0) {
            return this.m[iArr[i2 + 4]];
        }
        return null;
    }

    public final Object p(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.m[hrc.c(iArr, i)];
        }
        return null;
    }

    public final void q() {
        this.i++;
    }

    public final void r() {
        this.e = true;
        if (this.a.e <= 0) {
            hmz.j("Unexpected reader close()");
        }
        r0.e--;
    }

    public final void s() {
        if (this.i == 0) {
            if (this.f != this.g) {
                hmz.j("endGroup() not called at the end of a group");
            }
            int[] iArr = this.b;
            int i = iArr[(this.h * 5) + 2];
            this.h = i;
            this.g = i < 0 ? this.c : hrc.a(iArr, i) + i;
            int iB = this.n.b();
            if (iB < 0) {
                this.j = 0;
                this.k = 0;
            } else {
                this.j = iB;
                this.k = i >= this.c + (-1) ? this.d : iArr[((i + 1) * 5) + 4];
            }
        }
    }

    public final void t(int i) {
        if (this.i != 0) {
            hmz.j("Cannot reposition while in an empty region");
        }
        this.f = i;
        int i2 = this.c;
        int i3 = i < i2 ? this.b[(i * 5) + 2] : -1;
        if (i3 != this.h) {
            this.h = i3;
            if (i3 < 0) {
                this.g = i2;
            } else {
                this.g = i3 + hrc.a(this.b, i3);
            }
            this.j = 0;
            this.k = 0;
        }
    }

    public final String toString() {
        return "SlotReader(current=" + this.f + ", key=" + a() + ", parent=" + this.h + ", end=" + this.g + ')';
    }

    public final void u() {
        if (this.i != 0) {
            hmz.j("Cannot skip the enclosing group while in an empty region");
        }
        this.f = this.g;
        this.j = 0;
        this.k = 0;
    }

    public final void v() {
        if (this.i <= 0) {
            int i = this.h;
            int i2 = this.f;
            int[] iArr = this.b;
            if (iArr[(i2 * 5) + 2] != i) {
                hpq.a("Invalid slot table detected");
            }
            hog hogVar = this.n;
            int i3 = this.j;
            int i4 = this.k;
            if (i3 != 0) {
                hogVar.d(i3);
            } else if (i4 == 0) {
                hogVar.d(-1);
            } else {
                i3 = 0;
                hogVar.d(i3);
            }
            this.h = i2;
            this.g = hrc.a(iArr, i2) + i2;
            int i5 = i2 + 1;
            this.f = i5;
            this.j = hrc.e(iArr, i2);
            this.k = i2 >= this.c + (-1) ? this.d : iArr[(i5 * 5) + 4];
        }
    }

    public final boolean w(int i) {
        return (this.b[(i * 5) + 1] & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0;
    }

    public final boolean x() {
        return this.i > 0;
    }

    public final boolean y(int i) {
        return (this.b[(i * 5) + 1] & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0;
    }

    public final boolean z(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }
}

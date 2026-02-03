package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdq {
    public int a;
    public int b;
    public int c = -1;
    public int d = -1;
    private final kem e;

    public kdq(juo juoVar, long j) {
        this.e = new kem(juoVar.b);
        this.a = jyo.d(j);
        this.b = jyo.c(j);
        int iD = jyo.d(j);
        int iC = jyo.c(j);
        if (iD < 0 || iD > juoVar.a()) {
            throw new IndexOutOfBoundsException("start (" + iD + ") offset is outside of text region " + juoVar.a());
        }
        if (iC >= 0 && iC <= juoVar.a()) {
            if (iD > iC) {
                throw new IllegalArgumentException(a.s(iC, iD, "Do not set reversed range: ", " > "));
            }
        } else {
            throw new IndexOutOfBoundsException("end (" + iC + ") offset is outside of text region " + juoVar.a());
        }
    }

    private final void l(int i) {
        if (i < 0) {
            kfq.b(a.g(i, "Cannot set selectionEnd to a negative value: "));
        }
        this.b = i;
    }

    private final void m(int i) {
        if (i < 0) {
            kfq.b(a.g(i, "Cannot set selectionStart to a negative value: "));
        }
        this.a = i;
    }

    public final char a(int i) {
        kem kemVar = this.e;
        kdt kdtVar = kemVar.b;
        if (kdtVar == null) {
            return kemVar.a.charAt(i);
        }
        int i2 = kemVar.c;
        if (i < i2) {
            return kemVar.a.charAt(i);
        }
        int iB = kdtVar.b();
        if (i >= iB + i2) {
            return kemVar.a.charAt(i - ((iB - kemVar.d) + i2));
        }
        int i3 = i - i2;
        int i4 = kdtVar.c;
        if (i3 < i4) {
            return kdtVar.b[i3];
        }
        return kdtVar.b[(i3 - i4) + kdtVar.d];
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return this.e.a();
    }

    public final long d() {
        long jA = jyp.a(this.a, this.b);
        long j = jyo.a;
        return jA;
    }

    public final jyo e() {
        if (k()) {
            return new jyo(jyp.a(this.c, this.d));
        }
        return null;
    }

    public final void f() {
        this.c = -1;
        this.d = -1;
    }

    public final void g(int i, int i2) {
        long jA = jyp.a(i, i2);
        long j = jyo.a;
        this.e.b(i, i2, "");
        long jA2 = kdr.a(jyp.a(this.a, this.b), jA);
        m(jyo.d(jA2));
        l(jyo.c(jA2));
        if (k()) {
            long jA3 = kdr.a(jyp.a(this.c, this.d), jA);
            if (jyo.i(jA3)) {
                f();
            } else {
                this.c = jyo.d(jA3);
                this.d = jyo.c(jA3);
            }
        }
    }

    public final void h(int i, int i2, String str) {
        if (i >= 0) {
            kem kemVar = this.e;
            if (i <= kemVar.a()) {
                if (i2 < 0 || i2 > kemVar.a()) {
                    throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + kemVar.a());
                }
                if (i > i2) {
                    throw new IllegalArgumentException(a.s(i2, i, "Do not set reversed range: ", " > "));
                }
                kemVar.b(i, i2, str);
                m(str.length() + i);
                l(i + str.length());
                this.c = -1;
                this.d = -1;
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void i(int i, int i2) {
        if (i >= 0) {
            kem kemVar = this.e;
            if (i <= kemVar.a()) {
                if (i2 < 0 || i2 > kemVar.a()) {
                    throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + kemVar.a());
                }
                if (i >= i2) {
                    throw new IllegalArgumentException(a.s(i2, i, "Do not set reversed or empty range: ", " > "));
                }
                this.c = i;
                this.d = i2;
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void j(int i, int i2) {
        if (i >= 0) {
            kem kemVar = this.e;
            if (i <= kemVar.a()) {
                if (i2 < 0 || i2 > kemVar.a()) {
                    throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + kemVar.a());
                }
                if (i > i2) {
                    throw new IllegalArgumentException(a.s(i2, i, "Do not set reversed range: ", " > "));
                }
                m(i);
                l(i2);
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final boolean k() {
        return this.c != -1;
    }

    public final String toString() {
        return this.e.toString();
    }
}

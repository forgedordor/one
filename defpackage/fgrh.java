package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrh implements Iterable, Cloneable {
    public int a = 0;
    public String[] b = new String[3];
    public Object[] c = new Object[3];

    static String c(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    public static final boolean o(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    private final void r(int i) {
        fgqz.c(i >= this.a);
        String[] strArr = this.b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = 3;
        if (length >= 3) {
            int i3 = this.a;
            i2 = i3 + i3;
        }
        if (i <= i2) {
            i = i2;
        }
        this.b = (String[]) Arrays.copyOf(strArr, i);
        this.c = Arrays.copyOf(this.c, i);
    }

    final int a(String str) {
        fgqz.g(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equals(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int b(String str) {
        fgqz.g(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equalsIgnoreCase(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final String d(String str) {
        int iA = a(str);
        return iA == -1 ? "" : c(this.c[iA]);
    }

    public final String e(String str) {
        int iB = b(str);
        return iB == -1 ? "" : c(this.c[iB]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgrh fgrhVar = (fgrh) obj;
            if (this.a == fgrhVar.a) {
                for (int i = 0; i < this.a; i++) {
                    int iA = fgrhVar.a(this.b[i]);
                    if (iA == -1) {
                        return false;
                    }
                    Object obj2 = this.c[i];
                    Object obj3 = fgrhVar.c[iA];
                    if (obj2 == null) {
                        if (obj3 != null) {
                            return false;
                        }
                    } else if (!obj2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String f() {
        StringBuilder sbE = fgre.e();
        try {
            j(sbE, new fgrm("").b);
            return fgre.c(sbE);
        } catch (IOException e) {
            throw new fgqv(e);
        }
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final fgrh clone() {
        try {
            fgrh fgrhVar = (fgrh) super.clone();
            fgrhVar.a = this.a;
            fgrhVar.b = (String[]) Arrays.copyOf(this.b, this.a);
            fgrhVar.c = Arrays.copyOf(this.c, this.a);
            return fgrhVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void h(fgrh fgrhVar) {
        int i = fgrhVar.a;
        if (i == 0) {
            return;
        }
        r(this.a + i);
        int i2 = this.a;
        fgrg fgrgVar = new fgrg(fgrhVar);
        while (fgrgVar.hasNext()) {
            fgrf fgrfVarA = fgrgVar.next();
            if (i2 != 0) {
                q(fgrfVarA);
            } else {
                i(fgrfVarA.a, fgrfVarA.getValue());
            }
        }
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    public final void i(String str, Object obj) {
        r(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = obj;
        this.a = i + 1;
    }

    @Override // java.lang.Iterable
    public final Iterator<fgrf> iterator() {
        return new fgrg(this);
    }

    final void j(Appendable appendable, fgrl fgrlVar) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!o(this.b[i2])) {
                String str = this.b[i2];
                int i3 = fgrlVar.g;
                String strD = fgrf.d(str);
                if (strD != null) {
                    fgrf.c(strD, (String) this.c[i2], appendable.append(' '), fgrlVar);
                }
            }
        }
    }

    public final void k(int i) {
        fgqz.b(i >= this.a);
        int i2 = (this.a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.c;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.a - 1;
        this.a = i4;
        this.b[i4] = null;
        this.c[i4] = null;
    }

    public final boolean l(String str) {
        return a(str) != -1;
    }

    public final boolean m(String str) {
        return b(str) != -1;
    }

    public final boolean n() {
        return this.a == 0;
    }

    public final void p(String str, String str2) {
        fgqz.g(str);
        int iA = a(str);
        if (iA != -1) {
            this.c[iA] = str2;
        } else {
            i(str, str2);
        }
    }

    public final void q(fgrf fgrfVar) {
        p(fgrfVar.a, fgrfVar.getValue());
        fgrfVar.b = this;
    }

    public final String toString() {
        return f();
    }
}

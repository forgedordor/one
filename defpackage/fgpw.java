package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpw {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object G() {
        Object fgpjVar = this.b;
        if (fgpjVar == null) {
            ArrayList arrayList = this.a;
            if (arrayList.size() == 2) {
                Object obj = arrayList.get(0);
                Object obj2 = arrayList.get(1);
                if (obj == null) {
                    fgpjVar = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    fgpjVar = obj;
                }
            }
            if (fgpjVar == null) {
                fgpjVar = new fgpj(arrayList);
            }
            this.b = fgpjVar;
        }
        return fgpjVar;
    }

    private static final void H(fgqe fgqeVar) {
        if (fgqeVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static final boolean I(Object obj) {
        if (obj instanceof fgqd) {
            return ((obj instanceof fgpj) && ((fgpj) obj).b == null) ? false : true;
        }
        return false;
    }

    static void b(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    static boolean c(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean d(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = charSequence.length() - i;
        int length2 = str.length();
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            char cCharAt2 = str.charAt(i2);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i) {
        n(fgmu.t, i, 2);
    }

    public final void B(int i) {
        n(fgmu.h, i, 2);
    }

    public final void C(int i) {
        n(fgmu.v, i, 2);
    }

    public final void D(int i) {
        n(fgmu.l, i, 2);
    }

    public final void E(int i, int i2) {
        t(fgmu.k, i, i2);
    }

    public final void F(int i, int i2) {
        t(fgmu.f, i, i2);
    }

    public final fgph a() {
        Object objG = G();
        fgqf fgqfVar = (!(objG instanceof fgqf) || ((objG instanceof fgpj) && ((fgpj) objG).a == null)) ? null : (fgqf) objG;
        fgqd fgqdVar = I(objG) ? (fgqd) objG : null;
        if (fgqfVar == null && fgqdVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new fgph(fgqfVar, fgqdVar);
    }

    public final fgqe e() {
        Object objG = G();
        if (I(objG)) {
            return fgqe.b((fgqd) objG);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object obj) {
        this.b = null;
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    public final void g(fgqf fgqfVar, fgqd fgqdVar) {
        this.b = null;
        ArrayList arrayList = this.a;
        arrayList.add(fgqfVar);
        arrayList.add(fgqdVar);
    }

    public final void h(fgmu fgmuVar) {
        f(new fgpq(fgmuVar, true));
    }

    public final void i(fgmu fgmuVar) {
        f(new fgpq(fgmuVar, false));
    }

    public final void j(boolean z) {
        f(new fgpt(null, "Z", z, 2));
    }

    public final void k(fgph fgphVar) {
        if (fgphVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        g(fgphVar.a, fgphVar.b);
    }

    public final void l(fgqe fgqeVar) {
        H(fgqeVar);
        g(null, fgqa.b(fgqeVar));
    }

    public final void m(fgqe[] fgqeVarArr) {
        int length = fgqeVarArr.length;
        fgqd[] fgqdVarArr = new fgqd[length];
        int i = 0;
        while (i < length - 1) {
            fgqd fgqdVarB = fgqa.b(fgqeVarArr[i]);
            fgqdVarArr[i] = fgqdVarB;
            if (fgqdVarB == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        fgqdVarArr[i] = fgqa.b(fgqeVarArr[i]);
        g(null, new fgpm(fgqdVarArr));
    }

    public final void n(fgmu fgmuVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new fgpv(fgmuVar, i2, false));
                    return;
                } else {
                    f(new fgpo(fgmuVar, i2, false, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void o(fgmu fgmuVar, int i) {
        f(new fgpk(fgmuVar, i));
    }

    public final void p(fgmu fgmuVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                f(new fgpl(fgmuVar, i, i2));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void q(char c) {
        f(new fgpi(c));
    }

    public final void r(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                f(new fgpp(str));
            } else {
                f(new fgpi(str.charAt(0)));
            }
        }
    }

    public final void s(fgqe fgqeVar) {
        H(fgqeVar);
        g(null, new fgpm(new fgqd[]{fgqa.b(fgqeVar), null}));
    }

    public final void t(fgmu fgmuVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new fgpv(fgmuVar, i2, true));
                    return;
                } else {
                    f(new fgpo(fgmuVar, i2, true, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void u(String str, boolean z, int i) {
        f(new fgpt(str, str, z, i));
    }

    public final void v(int i) {
        n(fgmu.i, i, 2);
    }

    public final void w(int i) {
        n(fgmu.m, i, 1);
    }

    public final void x(int i) {
        n(fgmu.g, i, 3);
    }

    public final void y(int i, int i2) {
        p(fgmu.u, i, i2);
    }

    public final void z(int i) {
        n(fgmu.r, i, 2);
    }
}

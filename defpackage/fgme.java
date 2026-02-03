package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgme {
    public final List a;
    public fgly d = new fgly("", null);
    public int e = 0;
    public int b = 0;
    public int c = 0;

    public fgme(List list) {
        this.a = list;
        if (list.isEmpty()) {
            return;
        }
        n(0, 0);
        o((fgly) list.get(0));
    }

    public static fgme g(fglz fglzVar) {
        return new fgme(fglzVar.a);
    }

    private final void n(int i, int i2) {
        if (i >= 0) {
            List list = this.a;
            if (i < list.size()) {
                fgly fglyVar = (fgly) list.get(i);
                if (i2 < 0 || i2 > fglyVar.a.length()) {
                    throw new IllegalArgumentException("Index " + i2 + " out of range, line length: " + fglyVar.a.length());
                }
                return;
            }
        }
        throw new IllegalArgumentException("Line index " + i + " out of range, number of lines: " + this.a.size());
    }

    private final void o(fgly fglyVar) {
        this.d = fglyVar;
        this.e = fglyVar.a.length();
    }

    public final char a() {
        int i = this.c;
        return i < this.e ? this.d.a.charAt(i) : this.b < this.a.size() + (-1) ? '\n' : (char) 0;
    }

    public final int b(char c) {
        int i = 0;
        while (true) {
            char cA = a();
            if (cA == 0) {
                return -1;
            }
            if (cA == c) {
                return i;
            }
            h();
            i++;
        }
    }

    public final int c(char c) {
        int i = 0;
        while (a() == c) {
            h();
            i++;
        }
        return i;
    }

    public final int d() {
        int i = 0;
        while (true) {
            char cA = a();
            if (cA != ' ') {
                switch (cA) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            h();
            i++;
        }
    }

    public final fglz e(fgmd fgmdVar, fgmd fgmdVar2) {
        int i = fgmdVar.a;
        int i2 = fgmdVar2.a;
        if (i == i2) {
            fgly fglyVar = (fgly) this.a.get(i);
            CharSequence charSequenceSubSequence = fglyVar.a.subSequence(fgmdVar.b, fgmdVar2.b);
            fgll fgllVar = fglyVar.b;
            return fglz.c(new fgly(charSequenceSubSequence, null));
        }
        fglz fglzVar = new fglz();
        List list = this.a;
        fgly fglyVar2 = (fgly) list.get(i);
        fglzVar.d(fglyVar2.a(fgmdVar.b, fglyVar2.a.length()));
        while (true) {
            i++;
            if (i >= i2) {
                fglzVar.d(((fgly) list.get(i2)).a(0, fgmdVar2.b));
                return fglzVar;
            }
            fglzVar.d((fgly) list.get(i));
        }
    }

    public final fgmd f() {
        return new fgmd(this.b, this.c);
    }

    public final void h() {
        int i = this.c + 1;
        this.c = i;
        if (i > this.e) {
            int i2 = this.b + 1;
            this.b = i2;
            List list = this.a;
            if (i2 < list.size()) {
                o((fgly) list.get(this.b));
            } else {
                o(new fgly("", null));
            }
            this.c = 0;
        }
    }

    public final void i(fgmd fgmdVar) {
        int i = fgmdVar.a;
        int i2 = fgmdVar.b;
        n(i, i2);
        this.b = i;
        this.c = i2;
        o((fgly) this.a.get(i));
    }

    public final boolean j() {
        return this.c < this.e || this.b < this.a.size() + (-1);
    }

    public final boolean k(char c) {
        if (a() != c) {
            return false;
        }
        h();
        return true;
    }

    public final boolean l(String str) {
        int i = this.c;
        int i2 = this.e;
        if (i < i2 && i + str.length() <= i2) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (this.d.a.charAt(this.c + i3) == str.charAt(i3)) {
                }
            }
            this.c += str.length();
            return true;
        }
        return false;
    }

    public final int m(fgmo fgmoVar) {
        int i = 0;
        while (fgmoVar.c(a())) {
            h();
            i++;
        }
        return i;
    }
}

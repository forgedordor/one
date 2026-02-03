package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rzd {
    protected final String a;
    protected int c;
    protected int b = 0;
    private final rwe d = new rwe();

    public rzd(String str) {
        this.c = 0;
        String strTrim = str.trim();
        this.a = strTrim;
        this.c = strTrim.length();
    }

    protected static final boolean s(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final float b(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        q();
        return c();
    }

    public final float c() {
        rwe rweVar = this.d;
        float fA = rweVar.a(this.a, this.b, this.c);
        if (!Float.isNaN(fA)) {
            this.b = rweVar.a;
        }
        return fA;
    }

    public final float d() {
        q();
        rwe rweVar = this.d;
        float fA = rweVar.a(this.a, this.b, this.c);
        if (!Float.isNaN(fA)) {
            this.b = rweVar.a;
        }
        return fA;
    }

    protected final int e() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return this.a.charAt(i3);
        }
        return -1;
    }

    public final rwu f() {
        float fC = c();
        if (Float.isNaN(fC)) {
            return null;
        }
        int iR = r();
        return iR == 0 ? new rwu(fC, 1) : new rwu(fC, iR);
    }

    public final Boolean g(Object obj) {
        if (obj == null) {
            return null;
        }
        q();
        int i = this.b;
        if (i != this.c) {
            char cCharAt = this.a.charAt(i);
            if (cCharAt != '0') {
                if (cCharAt == '1') {
                    cCharAt = '1';
                }
            }
            this.b++;
            return Boolean.valueOf(cCharAt == '1');
        }
        return null;
    }

    public final Integer h() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = this.a;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public final String i() {
        if (!o()) {
            int i = this.b;
            String str = this.a;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'') {
                if (cCharAt == '\"') {
                    cCharAt = '\"';
                }
            }
            int iE = e();
            while (iE != -1) {
                if (iE == cCharAt) {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return str.substring(i + 1, i2);
                }
                iE = e();
            }
            this.b = i;
            return null;
        }
        return null;
    }

    public final String j() {
        return k(' ');
    }

    public final String k(char c) {
        if (o()) {
            return null;
        }
        String str = this.a;
        char cCharAt = str.charAt(this.b);
        if (s(cCharAt) || cCharAt == c) {
            return null;
        }
        int i = this.b;
        int iE = e();
        while (iE != -1 && iE != c && !s(iE)) {
            iE = e();
        }
        return str.substring(i, this.b);
    }

    public final void l() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !s(this.a.charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public final boolean m(char c) {
        int i = this.b;
        boolean z = false;
        if (i < this.c && this.a.charAt(i) == c) {
            z = true;
        }
        if (z) {
            this.b++;
        }
        return z;
    }

    public final boolean n(String str) {
        int i = this.b;
        int i2 = this.c;
        int length = str.length();
        boolean z = false;
        if (i <= i2 - length && this.a.substring(i, i + length).equals(str)) {
            z = true;
        }
        if (z) {
            this.b += length;
        }
        return z;
    }

    public final boolean o() {
        return this.b == this.c;
    }

    public final boolean p() {
        int i = this.b;
        if (i == this.c) {
            return false;
        }
        char cCharAt = this.a.charAt(i);
        if (cCharAt < 'a' || cCharAt > 'z') {
            return cCharAt >= 'A' && cCharAt <= 'Z';
        }
        return true;
    }

    public final boolean q() {
        l();
        int i = this.b;
        if (i == this.c || this.a.charAt(i) != ',') {
            return false;
        }
        this.b++;
        l();
        return true;
    }

    public final int r() {
        if (o()) {
            return 0;
        }
        String str = this.a;
        if (str.charAt(this.b) == '%') {
            this.b++;
            return 9;
        }
        int i = this.b;
        if (i <= this.c - 2) {
            try {
                int iA = ryh.a(str.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return iA;
            } catch (IllegalArgumentException unused) {
            }
        }
        return 0;
    }
}

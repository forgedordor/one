package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsd {
    public char[] a;
    public int b;
    public int c;
    public int d;
    public int e = -1;
    public String[] f = new String[512];
    public ArrayList g = null;
    public String h;
    public int i;
    private Reader j;
    private int k;
    private boolean l;

    public fgsd(Reader reader, int i) throws IOException {
        fgqz.c(reader.markSupported());
        this.j = reader;
        this.a = new char[Math.min(i, 32768)];
        o();
    }

    public static String e(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 <= 0) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + cArr[i + i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null && i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (i8 != 0) {
                int i9 = i7 + 1;
                int i10 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i8--;
                    i7 = i9;
                    i3 = i10;
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    final boolean A() {
        if (t()) {
            return false;
        }
        char c = this.a[this.d];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    final String B() throws IOException {
        int iC = c("]]>");
        if (iC != -1) {
            String strE = e(this.a, this.f, this.d, iC);
            this.d += iC;
            return strE;
        }
        int i = this.b;
        int i2 = this.d;
        if (i - i2 < 3) {
            return l();
        }
        int i3 = i - 2;
        String strE2 = e(this.a, this.f, i2, i3 - i2);
        this.d = i3;
        return strE2;
    }

    final char a() throws IOException {
        o();
        char c = u() ? (char) 65535 : this.a[this.d];
        this.d++;
        return c;
    }

    public final char b() throws IOException {
        o();
        if (u()) {
            return (char) 65535;
        }
        return this.a[this.d];
    }

    final int c(CharSequence charSequence) throws IOException {
        o();
        char cCharAt = charSequence.charAt(0);
        int i = this.d;
        while (i < this.b) {
            if (cCharAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.b) {
                        break;
                    }
                } while (cCharAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.b;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.d;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int d() {
        return this.k + this.d;
    }

    final String f(boolean z) {
        int i = this.d;
        int i2 = this.b;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&' || c == '\'') {
                    break;
                }
                i3++;
            } else {
                if (!z) {
                    break;
                }
                i3++;
            }
        }
        this.d = i3;
        return i3 > i ? e(this.a, this.f, i, i3 - i) : "";
    }

    final String g() {
        int i = this.d;
        int i2 = this.b;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.d = i3;
        return i3 > i ? e(this.a, this.f, i, i3 - i) : "";
    }

    final String h() throws IOException {
        char c;
        o();
        int i = this.d;
        while (true) {
            int i2 = this.d;
            if (i2 >= this.b || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.d++;
        }
        return e(this.a, this.f, i, this.d - i);
    }

    public final String i(char c) throws IOException {
        int i;
        o();
        int i2 = this.d;
        while (true) {
            if (i2 >= this.b) {
                i = -1;
                break;
            }
            if (c == this.a[i2]) {
                i = i2 - this.d;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return l();
        }
        String strE = e(this.a, this.f, this.d, i);
        this.d += i;
        return strE;
    }

    public final String j(char... cArr) throws IOException {
        o();
        int i = this.d;
        int i2 = this.b;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.d = i3;
        return i3 > i ? e(this.a, this.f, i, i3 - i) : "";
    }

    final String k(char... cArr) throws IOException {
        o();
        int i = this.d;
        int i2 = this.b;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.d = i3;
        return i3 > i ? e(this.a, this.f, i, i3 - i) : "";
    }

    final String l() throws IOException {
        o();
        char[] cArr = this.a;
        String[] strArr = this.f;
        int i = this.d;
        String strE = e(cArr, strArr, i, this.b - i);
        this.d = this.b;
        return strE;
    }

    final String m() {
        return "1:" + (d() + 1);
    }

    public final void n() {
        this.d++;
    }

    public final void o() throws IOException {
        int i;
        int i2;
        boolean z;
        if (this.l || (i = this.d) < this.c) {
            return;
        }
        int i3 = this.e;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.j.skip(j);
            this.j.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.j;
                char[] cArr = this.a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.l = true;
                    i5 = -1;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.j.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                fgqz.c(z);
                this.b = i4;
                this.k += i;
                this.d = i2;
                if (this.e != -1) {
                    this.e = 0;
                }
                this.c = Math.min(i4, 24576);
            }
            this.h = null;
        } catch (IOException e) {
            throw new fgqw(e);
        }
    }

    public final void p() {
        Reader reader = this.j;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.j = null;
            this.a = null;
            this.f = null;
            throw th;
        }
        this.j = null;
        this.a = null;
        this.f = null;
    }

    final void q() {
        int i = this.e;
        if (i == -1) {
            throw new fgqw(new IOException("Mark invalid"));
        }
        this.d = i;
        s();
    }

    final void r() {
        int i = this.d;
        if (i <= 0) {
            throw new fgqw(new IOException("WTF: No buffer left to unconsume."));
        }
        this.d = i - 1;
    }

    final void s() {
        this.e = -1;
    }

    public final boolean t() throws IOException {
        o();
        return this.d >= this.b;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.d;
        int i3 = i - i2;
        return i3 < 0 ? "" : new String(this.a, i2, i3);
    }

    public final boolean u() {
        return this.d >= this.b;
    }

    final boolean v(String str) throws IOException {
        o();
        o();
        int i = this.b - this.d;
        int length = str.length();
        if (length <= i) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) == this.a[this.d + i2]) {
                }
            }
            this.d += str.length();
            return true;
        }
        return false;
    }

    final boolean w(String str) throws IOException {
        o();
        int i = this.b - this.d;
        int length = str.length();
        if (length <= i) {
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.toUpperCase(str.charAt(i2)) == Character.toUpperCase(this.a[this.d + i2])) {
                }
            }
            this.d += str.length();
            return true;
        }
        return false;
    }

    final boolean x(char c) {
        return !t() && this.a[this.d] == c;
    }

    final boolean y(char... cArr) throws IOException {
        if (t()) {
            return false;
        }
        o();
        char c = this.a[this.d];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    final boolean z() {
        if (t()) {
            return false;
        }
        char c = this.a[this.d];
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }
}

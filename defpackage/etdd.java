package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdd implements Closeable, Flushable {
    private static final Pattern e = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] f = new String[128];
    private static final String[] g;
    public final Writer a;
    public boolean b;
    public boolean c;
    public int d;
    private int[] h = new int[32];
    private int i = 0;
    private esxx j;
    private String k;
    private String l;
    private boolean m;
    private String n;

    static {
        for (int i = 0; i <= 31; i++) {
            f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public etdd(Writer writer) {
        q(6);
        this.d = 2;
        this.c = true;
        this.a = writer;
        b(esxx.a);
    }

    private final int o() {
        int i = this.i;
        if (i != 0) {
            return this.h[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void p() throws IOException {
        if (this.m) {
            return;
        }
        Writer writer = this.a;
        writer.write(this.j.b);
        int i = this.i;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.j.c);
        }
    }

    private final void q(int i) {
        int i2 = this.i;
        int[] iArr = this.h;
        if (i2 == iArr.length) {
            this.h = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.h;
        int i3 = this.i;
        this.i = i3 + 1;
        iArr2[i3] = i;
    }

    private final void r(int i) {
        this.h[this.i - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(java.lang.String r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.b
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.etdd.g
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.etdd.f
        L9:
            java.io.Writer r1 = r9.a
            r2 = 34
            r1.write(r2)
            int r3 = r10.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L40
            int r6 = r4 + 1
            char r7 = r10.charAt(r4)
            r8 = 128(0x80, float:1.794E-43)
            if (r7 >= r8) goto L27
            r7 = r0[r7]
            if (r7 == 0) goto L3e
            goto L34
        L27:
            r8 = 8232(0x2028, float:1.1535E-41)
            if (r7 != r8) goto L2e
            java.lang.String r7 = "\\u2028"
            goto L34
        L2e:
            r8 = 8233(0x2029, float:1.1537E-41)
            if (r7 != r8) goto L3e
            java.lang.String r7 = "\\u2029"
        L34:
            if (r5 >= r4) goto L3a
            int r4 = r4 - r5
            r1.write(r10, r5, r4)
        L3a:
            r1.write(r7)
            r5 = r6
        L3e:
            r4 = r6
            goto L16
        L40:
            if (r5 >= r3) goto L46
            int r3 = r3 - r5
            r1.write(r10, r5, r3)
        L46:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etdd.s(java.lang.String):void");
    }

    private final void t(int i, int i2, char c) throws IOException {
        int iO = o();
        if (iO != i2 && iO != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.n;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.i--;
        if (iO == i2) {
            p();
        }
        this.a.write(c);
    }

    private final void u(int i, char c) throws IOException {
        a();
        q(i);
        this.a.write(c);
    }

    public final void a() throws IOException {
        int iO = o();
        if (iO == 1) {
            r(2);
            p();
            return;
        }
        if (iO == 2) {
            this.a.append((CharSequence) this.l);
            p();
        } else {
            if (iO == 4) {
                this.a.append((CharSequence) this.k);
                r(5);
                return;
            }
            if (iO != 6) {
                if (iO != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.d != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            r(7);
        }
    }

    public final void b(esxx esxxVar) {
        esxxVar.getClass();
        this.j = esxxVar;
        this.l = ",";
        if (esxxVar.d) {
            this.k = ": ";
            if (esxxVar.b.isEmpty()) {
                this.l = ", ";
            }
        } else {
            this.k = ":";
        }
        boolean z = false;
        if (this.j.b.isEmpty() && this.j.c.isEmpty()) {
            z = true;
        }
        this.m = z;
    }

    public final void c() throws IOException {
        if (this.n != null) {
            int iO = o();
            if (iO == 5) {
                this.a.write(this.l);
            } else if (iO != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            p();
            r(4);
            s(this.n);
            this.n = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        int i = this.i;
        if (i > 1 || (i == 1 && this.h[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.i = 0;
    }

    public final void d(int i) {
        if (i == 0) {
            throw null;
        }
        this.d = i;
    }

    public final void e() throws IOException {
        c();
        u(1, '[');
    }

    public final void f() throws IOException {
        c();
        u(3, '{');
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final void g() throws IOException {
        t(1, 2, ']');
    }

    public final void h() throws IOException {
        t(3, 5, '}');
    }

    public final void i(String str) {
        str.getClass();
        if (this.n != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iO = o();
        if (iO != 3 && iO != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.n = str;
    }

    public final void j() throws IOException {
        if (this.n != null) {
            if (!this.c) {
                this.n = null;
                return;
            }
            c();
        }
        a();
        this.a.write("null");
    }

    public final void k(long j) throws IOException {
        c();
        a();
        this.a.write(Long.toString(j));
    }

    public final void l(Number number) throws IOException {
        if (number == null) {
            j();
            return;
        }
        c();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.d != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(string)));
                }
            } else if (cls != Float.class && cls != Double.class && !e.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        a();
        this.a.append((CharSequence) string);
    }

    public final void m(String str) throws IOException {
        if (str == null) {
            j();
            return;
        }
        c();
        a();
        s(str);
    }

    public final void n(boolean z) throws IOException {
        c();
        a();
        this.a.write(true != z ? "false" : "true");
    }
}

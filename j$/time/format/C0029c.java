package j$.time.format;

/* renamed from: j$.time.format.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0029c implements InterfaceC0031e {
    public final char a;

    public C0029c(char c) {
        this.a = c;
    }

    @Override // j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (!vVar.b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}

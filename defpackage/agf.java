package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agf implements Iterable {
    private final List a = new ArrayList();

    public agf(String str) {
        try {
            c(str);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + ": " + str);
        }
    }

    private final void c(String str) throws NumberFormatException {
        boolean z;
        String strSubstring;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ']') {
                throw new IllegalArgumentException("Malformed path (no starting '[')");
            }
            if (cCharAt == '[' || cCharAt == '.') {
                z = cCharAt == '[';
                if (i != 0 || str.isEmpty()) {
                    throw new IllegalArgumentException("Malformed path (blank property name)");
                }
                if (i == -1) {
                    this.a.add(new age(str, -1));
                    return;
                }
                if (z) {
                    lcg.i(str);
                    String strSubstring2 = str.substring(0, i);
                    int iIndexOf = str.indexOf(93, i);
                    if (iIndexOf == -1) {
                        throw new IllegalArgumentException("Malformed path (no ending ']')");
                    }
                    int i2 = iIndexOf + 1;
                    if (i2 < str.length() && str.charAt(i2) != '.') {
                        throw new IllegalArgumentException("Malformed path (']' not followed by '.'): ".concat(String.valueOf(str)));
                    }
                    String strSubstring3 = str.substring(i + 1, iIndexOf);
                    try {
                        int i3 = Integer.parseInt(strSubstring3);
                        if (i3 < 0) {
                            throw new IllegalArgumentException("Malformed path (path index less than 0)");
                        }
                        this.a.add(new age(strSubstring2, i3));
                        strSubstring = i2 < str.length() ? str.substring(iIndexOf + 2) : null;
                        if (strSubstring == null) {
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(a.a(strSubstring3, "Malformed path (\"", "\" as path index)"));
                    }
                } else {
                    String strSubstring4 = str.substring(0, i);
                    strSubstring = str.substring(i + 1);
                    this.a.add(new age(strSubstring4, -1));
                }
                c(strSubstring);
                return;
            }
            i++;
        }
        z = false;
        i = -1;
        if (i != 0) {
        }
        throw new IllegalArgumentException("Malformed path (blank property name)");
    }

    public final int a() {
        return this.a.size();
    }

    public final age b(int i) {
        return (age) this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof agf)) {
            return Objects.equals(this.a, ((agf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<age> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i >= this.a.size()) {
                return sb.toString();
            }
            sb.append(b(i).toString());
            if (i < r2.size() - 1) {
                sb.append('.');
            }
            i++;
        }
    }
}

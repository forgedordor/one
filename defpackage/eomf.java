package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomf implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final int b;
    private final boolean c;

    private eomf(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public static eomf a(String str, int i) {
        ejwl.d(d(i), "Port out of range: %s", i);
        eomf eomfVarB = b(str);
        ejwl.f(!eomfVarB.c(), "Host has a port: %s", str);
        return new eomf(eomfVarB.a, i, eomfVarB.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eomf b(java.lang.String r9) {
        /*
            r9.getClass()
            java.lang.String r0 = "["
            boolean r0 = r9.startsWith(r0)
            r1 = -1
            r2 = 58
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L81
            char r0 = r9.charAt(r4)
            r5 = 91
            if (r0 != r5) goto L1a
            r0 = r3
            goto L1b
        L1a:
            r0 = r4
        L1b:
            java.lang.String r5 = "Bracketed host-port string must start with a bracket: %s"
            defpackage.ejwl.f(r0, r5, r9)
            int r0 = r9.indexOf(r2)
            r5 = 93
            int r5 = r9.lastIndexOf(r5)
            if (r0 < 0) goto L30
            if (r5 <= r0) goto L30
            r0 = r3
            goto L31
        L30:
            r0 = r4
        L31:
            java.lang.String r6 = "Invalid bracketed host/port: %s"
            defpackage.ejwl.f(r0, r6, r9)
            java.lang.String r0 = r9.substring(r3, r5)
            int r6 = r5 + 1
            int r7 = r9.length()
            r8 = 2
            if (r6 != r7) goto L4c
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r4] = r0
            java.lang.String r0 = ""
            r2[r3] = r0
            goto L7c
        L4c:
            char r6 = r9.charAt(r6)
            if (r6 != r2) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = r4
        L55:
            java.lang.String r6 = "Only a colon may follow a close bracket: %s"
            defpackage.ejwl.f(r2, r6, r9)
            int r5 = r5 + r8
            r2 = r5
        L5c:
            int r6 = r9.length()
            if (r2 >= r6) goto L72
            char r6 = r9.charAt(r2)
            boolean r6 = java.lang.Character.isDigit(r6)
            java.lang.String r7 = "Port must be numeric: %s"
            defpackage.ejwl.f(r6, r7, r9)
            int r2 = r2 + 1
            goto L5c
        L72:
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r4] = r0
            java.lang.String r0 = r9.substring(r5)
            r2[r3] = r0
        L7c:
            r0 = r2[r4]
            r2 = r2[r3]
            goto L97
        L81:
            int r0 = r9.indexOf(r2)
            if (r0 < 0) goto L9a
            int r5 = r0 + 1
            int r2 = r9.indexOf(r2, r5)
            if (r2 != r1) goto L9a
            java.lang.String r0 = r9.substring(r4, r0)
            java.lang.String r2 = r9.substring(r5)
        L97:
            r5 = r2
            r2 = r4
            goto La3
        L9a:
            if (r0 < 0) goto L9e
            r0 = r3
            goto L9f
        L9e:
            r0 = r4
        L9f:
            r2 = 0
            r5 = r2
            r2 = r0
            r0 = r9
        La3:
            boolean r6 = defpackage.ejwk.c(r5)
            if (r6 == 0) goto Lae
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto Lc9
        Lae:
            java.lang.Integer r1 = defpackage.eonc.g(r5)
            if (r1 == 0) goto Lb5
            goto Lb6
        Lb5:
            r3 = r4
        Lb6:
            java.lang.String r4 = "Unparseable port number: %s"
            defpackage.ejwl.f(r3, r4, r9)
            int r3 = r1.intValue()
            boolean r3 = d(r3)
            java.lang.String r4 = "Port number out of range: %s"
            defpackage.ejwl.f(r3, r4, r9)
            r9 = r1
        Lc9:
            eomf r1 = new eomf
            int r9 = r9.intValue()
            r1.<init>(r0, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eomf.b(java.lang.String):eomf");
    }

    private static boolean d(int i) {
        return i >= 0 && i <= 65535;
    }

    public final boolean c() {
        return this.b >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eomf) {
            eomf eomfVar = (eomf) obj;
            if (ejwh.a(this.a, eomfVar.a) && this.b == eomfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }
}

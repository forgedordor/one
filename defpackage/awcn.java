package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcn {
    private final fcsu f;
    private static final cczi e = cdag.j(cdag.b, "phone_numbers_equal__loose_match__min_match", 7);
    static final cczi a = cdag.m(cdag.b, "phone_numbers_equal__use_lib_phone_number", true);
    static final cczi b = cdag.m(cdag.b, "phone_numbers_equal__use_custom_phone_recognizer", true);
    public static final Pattern c = Pattern.compile("(\\+?[0-9]+[\\- \\.]*)?(\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.]+[0-9])");
    public static final Pattern d = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");

    public awcn(fcsu fcsuVar) {
        this.f = fcsuVar;
    }

    public static int a() {
        return ((Integer) e.e()).intValue();
    }

    public static eiju b() {
        return e.b();
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(2);
            ejyb.e(str);
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (((Boolean) b.e()).booleanValue() ? c : Patterns.PHONE).matcher(str).matches();
    }

    static boolean e(String str, String str2, int i) {
        int length;
        int length2;
        int i2;
        int i3;
        boolean z;
        if (str != null && str.equals(str2)) {
            return true;
        }
        if (!d(str2) || !d(str)) {
            if (c(str)) {
                str = str.toLowerCase(Locale.US);
            }
            if (c(str2)) {
                str2 = str2.toLowerCase(Locale.US);
            }
            return str.equals(str2);
        }
        if (str == null || str2 == null || (length = str.length()) == 0 || (length2 = str2.length()) == 0) {
            return false;
        }
        int i4 = length - 1;
        int i5 = length2 - 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 >= 0 && i5 >= 0) {
            char cCharAt = str.charAt(i4);
            if (h(cCharAt)) {
                z = false;
            } else {
                i4--;
                i6++;
                z = true;
            }
            char cCharAt2 = str2.charAt(i5);
            if (!h(cCharAt2)) {
                i5--;
                i7++;
                z = true;
            }
            if (!z) {
                if (cCharAt2 != cCharAt) {
                    break;
                }
                i4--;
                i5--;
                i8++;
            }
        }
        if (i8 < i) {
            int length3 = str.length() - i6;
            return length3 == str2.length() - i7 && length3 == i8;
        }
        if (i8 >= i && (i4 < 0 || i5 < 0)) {
            return true;
        }
        int i9 = i5 + 1;
        int i10 = i4 + 1;
        if (i(str, i10) && i(str2, i9)) {
            return true;
        }
        if (k(str, i10) && j(str2, i9)) {
            return true;
        }
        if (k(str2, i9) && j(str, i10)) {
            return true;
        }
        boolean z2 = str.charAt(0) == '+';
        boolean z3 = str2.charAt(0) == '+';
        boolean z4 = z2 && (i3 = i4 - i5) >= 0 && i3 <= 1;
        boolean z5 = z3 && (i2 = i5 - i4) >= 0 && i2 <= 1;
        if (i4 < 4 && i5 < 4) {
            if (z4 || z5) {
                return (z2 && z3) ? false : true;
            }
            return false;
        }
        return false;
    }

    private static boolean g(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean h(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '*' || c2 == '#' || c2 == '+';
    }

    private static boolean i(String str, int i) {
        char c2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            char cCharAt = str.charAt(i2);
            if (c2 != 0) {
                if (c2 != 2) {
                    if (c2 != 4) {
                        if (h(cCharAt)) {
                            return false;
                        }
                    } else if (cCharAt == '1') {
                        c2 = 5;
                    } else if (h(cCharAt)) {
                        return false;
                    }
                } else if (cCharAt == '0') {
                    c2 = 3;
                } else if (cCharAt == '1') {
                    c2 = 4;
                } else if (h(cCharAt)) {
                    return false;
                }
            } else if (cCharAt == '+') {
                c2 = 1;
            } else if (cCharAt == '0') {
                c2 = 2;
            } else if (h(cCharAt)) {
                return false;
            }
        }
        return c2 == 1 || c2 == 3 || c2 == 5;
    }

    private static boolean j(String str, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            char cCharAt = str.charAt(i3);
            switch (i2) {
                case 0:
                    if (cCharAt == '+') {
                        i2 = 1;
                        break;
                    } else if (cCharAt == '0') {
                        i2 = 2;
                        break;
                    } else {
                        if (h(cCharAt)) {
                            return false;
                        }
                        break;
                    }
                case 1:
                case 3:
                case 5:
                    if (g(cCharAt)) {
                        i2 = 6;
                        break;
                    } else {
                        if (h(cCharAt)) {
                            return false;
                        }
                        break;
                    }
                case 2:
                    if (cCharAt == '0') {
                        i2 = 3;
                        break;
                    } else if (cCharAt == '1') {
                        i2 = 4;
                        break;
                    } else {
                        if (h(cCharAt)) {
                            return false;
                        }
                        break;
                    }
                case 4:
                    if (cCharAt == '1') {
                        i2 = 5;
                        break;
                    } else {
                        if (h(cCharAt)) {
                            return false;
                        }
                        break;
                    }
                case 6:
                case 7:
                    if (g(cCharAt)) {
                        i2++;
                        break;
                    } else {
                        if (h(cCharAt)) {
                            return false;
                        }
                        break;
                    }
                default:
                    if (h(cCharAt)) {
                        return false;
                    }
                    break;
            }
        }
        return i2 == 6 || i2 == 7 || i2 == 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean k(java.lang.String r5, int r6) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            if (r1 >= r6) goto L1e
            char r3 = r5.charAt(r1)
            r4 = 48
            if (r3 != r4) goto L14
            r3 = 1
            if (r2 != 0) goto L12
            r2 = r3
            goto L1b
        L12:
            r2 = r3
            r3 = r4
        L14:
            boolean r3 = h(r3)
            if (r3 == 0) goto L1b
            return r0
        L1b:
            int r1 = r1 + 1
            goto L3
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcn.k(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10) {
        /*
            r6 = this;
            boolean r0 = r7.equals(r8)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = d(r7)
            r2 = 4
            if (r0 == 0) goto L58
            boolean r0 = d(r8)
            if (r0 == 0) goto L58
            cczi r0 = defpackage.awcn.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
        L23:
            r1 = r2
            goto L54
        L25:
            fcsu r0 = r6.f     // Catch: defpackage.ephe -> L23
            java.lang.Object r3 = r0.b()     // Catch: defpackage.ephe -> L23
            ephj r3 = (defpackage.ephj) r3     // Catch: defpackage.ephe -> L23
            java.lang.String r4 = r7.trim()     // Catch: defpackage.ephe -> L23
            ephf r3 = r3.n(r4, r10)     // Catch: defpackage.ephe -> L23
            java.lang.Object r4 = r0.b()     // Catch: defpackage.ephe -> L23
            ephj r4 = (defpackage.ephj) r4     // Catch: defpackage.ephe -> L23
            java.lang.String r5 = r8.trim()     // Catch: defpackage.ephe -> L23
            ephf r10 = r4.n(r5, r10)     // Catch: defpackage.ephe -> L23
            java.lang.Object r0 = r0.b()     // Catch: defpackage.ephe -> L23
            ephj r0 = (defpackage.ephj) r0     // Catch: defpackage.ephe -> L23
            int r10 = r0.k(r3, r10)     // Catch: defpackage.ephe -> L23
            r0 = 5
            if (r10 != r0) goto L51
            goto L54
        L51:
            if (r10 != r2) goto L23
            r1 = 2
        L54:
            if (r1 != r2) goto L57
            goto L58
        L57:
            return r1
        L58:
            boolean r7 = e(r7, r8, r9)
            if (r7 == 0) goto L60
            r7 = 3
            return r7
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcn.f(java.lang.String, java.lang.String, int, java.lang.String):int");
    }
}

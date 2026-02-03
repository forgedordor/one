package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgux {
    private static final char[] a = {',', '>', '+', '~', ' '};
    private static final String[] b = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern c = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern d = Pattern.compile("([+-])?(\\d+)");

    public static fguu a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            fgqz.e(str);
            String strTrim = str.trim();
            fgsv fgsvVar = new fgsv(strTrim);
            fgsvVar.h();
            char[] cArr = a;
            if (fgsvVar.l(cArr)) {
                arrayList.add(new fgvg());
                c(fgsvVar.a(), fgsvVar, arrayList);
            } else {
                b(fgsvVar, strTrim, arrayList);
            }
            while (!fgsvVar.i()) {
                boolean zH = fgsvVar.h();
                if (fgsvVar.l(cArr)) {
                    c(fgsvVar.a(), fgsvVar, arrayList);
                } else if (zH) {
                    c(' ', fgsvVar, arrayList);
                } else {
                    b(fgsvVar, strTrim, arrayList);
                }
            }
            return arrayList.size() == 1 ? (fguu) arrayList.get(0) : new fgtb(arrayList);
        } catch (IllegalArgumentException e) {
            throw new fguy(e.getMessage());
        }
    }

    private static final void b(fgsv fgsvVar, String str, List list) throws NumberFormatException {
        if (fgsvVar.j("#")) {
            String strC = fgsvVar.c();
            fgqz.e(strC);
            list.add(new fgtw(strC));
            return;
        }
        if (fgsvVar.j(".")) {
            String strC2 = fgsvVar.c();
            fgqz.e(strC2);
            list.add(new fgtp(strC2.trim()));
            return;
        }
        if (fgsvVar.n() || fgsvVar.k("*|")) {
            String strB = fgrb.b(fgsvVar.d(fgsv.a));
            fgqz.e(strB);
            if (strB.startsWith("*|")) {
                list.add(new fgtc(Arrays.asList(new fgus(strB.substring(2)), new fgut(strB.replace("*|", ":")))));
                return;
            }
            if (strB.contains("|")) {
                strB = strB.replace("|", ":");
            }
            list.add(new fgus(strB));
            return;
        }
        if (fgsvVar.k("[")) {
            fgsv fgsvVar2 = new fgsv(fgsvVar.b('[', ']'));
            String[] strArr = b;
            int i = fgsvVar2.c;
            while (!fgsvVar2.i() && !fgsvVar2.m(strArr)) {
                fgsvVar2.c++;
            }
            String strSubstring = fgsvVar2.b.substring(i, fgsvVar2.c);
            fgqz.e(strSubstring);
            fgsvVar2.h();
            if (fgsvVar2.i()) {
                if (strSubstring.startsWith("^")) {
                    list.add(new fgti(strSubstring.substring(1)));
                    return;
                } else {
                    list.add(new fgtg(strSubstring));
                    return;
                }
            }
            if (fgsvVar2.j("=")) {
                list.add(new fgtj(strSubstring, fgsvVar2.e()));
                return;
            }
            if (fgsvVar2.j("!=")) {
                list.add(new fgtn(strSubstring, fgsvVar2.e()));
                return;
            }
            if (fgsvVar2.j("^=")) {
                list.add(new fgto(strSubstring, fgsvVar2.e()));
                return;
            }
            if (fgsvVar2.j("$=")) {
                list.add(new fgtl(strSubstring, fgsvVar2.e()));
                return;
            } else if (fgsvVar2.j("*=")) {
                list.add(new fgtk(strSubstring, fgsvVar2.e()));
                return;
            } else {
                if (!fgsvVar2.j("~=")) {
                    throw new fguy("Could not parse attribute query '%s': unexpected token at '%s'", str, fgsvVar2.e());
                }
                list.add(new fgtm(strSubstring, Pattern.compile(fgsvVar2.e())));
                return;
            }
        }
        if (fgsvVar.j("*")) {
            list.add(new fgtf());
            return;
        }
        if (fgsvVar.j(":lt(")) {
            list.add(new fgua(d(fgsvVar)));
            return;
        }
        if (fgsvVar.j(":gt(")) {
            list.add(new fgtz(d(fgsvVar)));
            return;
        }
        if (fgsvVar.j(":eq(")) {
            list.add(new fgtx(d(fgsvVar)));
            return;
        }
        if (fgsvVar.k(":has(")) {
            fgsvVar.g(":has");
            String strB2 = fgsvVar.b('(', ')');
            fgqz.f(strB2, ":has(selector) sub-select must not be empty");
            list.add(new fgva(a(strB2)));
            return;
        }
        if (fgsvVar.k(":contains(")) {
            e(false, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":containsOwn(")) {
            e(true, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":containsWholeText(")) {
            f(false, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":containsWholeOwnText(")) {
            f(true, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":containsData(")) {
            fgsvVar.g(":containsData");
            String strF = fgsv.f(fgsvVar.b('(', ')'));
            fgqz.f(strF, ":containsData(text) query must not be empty");
            list.add(new fgtq(strF));
            return;
        }
        if (fgsvVar.k(":matches(")) {
            h(false, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":matchesOwn(")) {
            h(true, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":matchesWholeText(")) {
            i(false, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":matchesWholeOwnText(")) {
            i(true, fgsvVar, list);
            return;
        }
        if (fgsvVar.k(":not(")) {
            fgsvVar.g(":not");
            String strB3 = fgsvVar.b('(', ')');
            fgqz.f(strB3, ":not(selector) subselect must not be empty");
            list.add(new fgvd(a(strB3)));
            return;
        }
        if (fgsvVar.j(":nth-child(")) {
            g(false, false, fgsvVar, list);
            return;
        }
        if (fgsvVar.j(":nth-last-child(")) {
            g(true, false, fgsvVar, list);
            return;
        }
        if (fgsvVar.j(":nth-of-type(")) {
            g(false, true, fgsvVar, list);
            return;
        }
        if (fgsvVar.j(":nth-last-of-type(")) {
            g(true, true, fgsvVar, list);
            return;
        }
        if (fgsvVar.j(":first-child")) {
            list.add(new fguc());
            return;
        }
        if (fgsvVar.j(":last-child")) {
            list.add(new fgue());
            return;
        }
        if (fgsvVar.j(":first-of-type")) {
            list.add(new fgud());
            return;
        }
        if (fgsvVar.j(":last-of-type")) {
            list.add(new fguf());
            return;
        }
        if (fgsvVar.j(":only-child")) {
            list.add(new fguk());
            return;
        }
        if (fgsvVar.j(":only-of-type")) {
            list.add(new fgul());
            return;
        }
        if (fgsvVar.j(":empty")) {
            list.add(new fgub());
        } else if (fgsvVar.j(":root")) {
            list.add(new fgum());
        } else {
            if (!fgsvVar.j(":matchText")) {
                throw new fguy("Could not parse query '%s': unexpected token at '%s'", str, fgsvVar.e());
            }
            list.add(new fgun());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void c(char r8, defpackage.fgsv r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgux.c(char, fgsv, java.util.List):void");
    }

    private static final int d(fgsv fgsvVar) {
        String strTrim = fgsvVar.o().trim();
        String[] strArr = fgre.a;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(strTrim.codePointAt(i))) {
                    break;
                }
                i++;
            }
        }
        fgqz.d(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private static final void e(boolean z, fgsv fgsvVar, List list) {
        String str = true != z ? ":contains" : ":containsOwn";
        fgsvVar.g(str);
        String strF = fgsv.f(fgsvVar.b('(', ')'));
        fgqz.f(strF, str.concat("(text) query must not be empty"));
        list.add(z ? new fgtr(strF) : new fgts(strF));
    }

    private static final void f(boolean z, fgsv fgsvVar, List list) {
        String str = true != z ? ":containsWholeText" : ":containsWholeOwnText";
        fgsvVar.g(str);
        String strF = fgsv.f(fgsvVar.b('(', ')'));
        fgqz.f(strF, str.concat("(text) query must not be empty"));
        list.add(z ? new fgtt(strF) : new fgtu(strF));
    }

    private static final void g(boolean z, boolean z2, fgsv fgsvVar, List list) throws NumberFormatException {
        String strB = fgrb.b(fgsvVar.o());
        Matcher matcher = c.matcher(strB);
        Matcher matcher2 = d.matcher(strB);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strB)) {
            if ("even".equals(strB)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    i = i3;
                } else {
                    i = i3;
                    i2 = 0;
                }
            } else {
                if (!matcher2.matches()) {
                    throw new fguy("Could not parse nth-index '%s': unexpected format", strB);
                }
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            }
        }
        if (z2) {
            if (z) {
                list.add(new fgui(i, i2));
                return;
            } else {
                list.add(new fguj(i, i2));
                return;
            }
        }
        if (z) {
            list.add(new fguh(i, i2));
        } else {
            list.add(new fgug(i, i2));
        }
    }

    private static final void h(boolean z, fgsv fgsvVar, List list) {
        String str = true != z ? ":matches" : ":matchesOwn";
        fgsvVar.g(str);
        String strB = fgsvVar.b('(', ')');
        fgqz.f(strB, str.concat("(regex) query must not be empty"));
        list.add(z ? new fgup(Pattern.compile(strB)) : new fguo(Pattern.compile(strB)));
    }

    private static final void i(boolean z, fgsv fgsvVar, List list) {
        String str = true != z ? ":matchesWholeText" : ":matchesWholeOwnText";
        fgsvVar.g(str);
        String strB = fgsvVar.b('(', ')');
        fgqz.f(strB, str.concat("(regex) query must not be empty"));
        list.add(z ? new fguq(Pattern.compile(strB)) : new fgur(Pattern.compile(strB)));
    }
}

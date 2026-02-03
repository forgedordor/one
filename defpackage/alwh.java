package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwh {
    private final eygg k;
    private final eygg l;
    private static final ejxr b = ejxx.a(new ejxr() { // from class: alwa
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("[;,N].*|^\\*67|[^\\d*#+a-zA-Z]+");
        }
    });
    public static final ejxr a = ejxx.a(new ejxr() { // from class: alwb
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("\\p{C}");
        }
    });
    private static final cqbr c = new cqbr(TimeUnit.SECONDS.toMillis(10));
    private static final ejxr d = ejxx.a(new ejxr() { // from class: alwc
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("[\\d*#+]+");
        }
    });
    private static final cqce e = cqce.g("Bugle", "MessagingIdentitySanitizer");
    private static final Pattern f = Pattern.compile("\\A[ -~[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]+?@([0-9a-zA-Z:\\-\\(\\)\\[\\]]+\\.)*[0-9a-zA-Z:\\-\\(\\)\\[\\]]*?[a-zA-Z:\\-\\(\\)\\[\\]][0-9a-zA-Z:\\-\\(\\)\\[\\]]*\\z");
    private static final ejxr g = ejxx.a(new ejxr() { // from class: alwd
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("@([0-9a-zA-Z:\\-\\(\\)\\[\\]]+\\.)*[0-9a-zA-Z:\\-\\(\\)\\[\\]]*?[a-zA-Z:\\-\\(\\)\\[\\]][0-9a-zA-Z:\\-\\(\\)\\[\\]]*\\z");
        }
    });
    private static final ejxr h = ejxx.a(new ejxr() { // from class: alwe
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("^\\+\\d{1,3}\\s");
        }
    });
    private static final ejxr i = ejxx.a(new ejxr() { // from class: alwf
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("^\\+(\\d{1,3})\\s.*");
        }
    });
    private static final ejxr j = ejxx.a(new ejxr() { // from class: alwg
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = alwh.a;
            return Pattern.compile("^\\+(\\d{1,3})\\s(.*)");
        }
    });

    public alwh(eygg eyggVar, eygg eyggVar2) {
        this.k = eyggVar;
        this.l = eyggVar2;
    }

    public static String c(String str) {
        if (!i(str)) {
            return "";
        }
        Matcher matcher = ((Pattern) g.get()).matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group();
        return strGroup.length() > 1 ? strGroup.substring(1) : "";
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c2 : str.toCharArray()) {
            int iDigit = Character.digit(c2, 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    static String g(String str) {
        return ((Pattern) h.get()).matcher(str).replaceFirst("");
    }

    public static boolean h(String str) {
        String strG = g(str);
        boolean z = !TextUtils.isEmpty(strG) && Character.isAlphabetic(Character.codePointAt(strG, 0));
        int i2 = 0;
        int i3 = 0;
        for (char c2 : strG.toCharArray()) {
            if (Character.isDigit(c2)) {
                i2++;
            } else if (!Character.isWhitespace(c2) && Character.getType(c2) != 20) {
                i3++;
            }
        }
        if (i2 < 3 || i3 >= i2) {
            return true;
        }
        return z && i2 <= 6;
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str) || str.length() > 254) {
            return false;
        }
        return f.matcher(str).find();
    }

    @Deprecated
    public static boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strReplace = g(str).replace("-", "");
        if (h(strReplace) || strReplace.length() <= 6) {
            return true;
        }
        if (strReplace.length() <= 8) {
            return strReplace.startsWith("19") || strReplace.startsWith("9");
        }
        return false;
    }

    public final Optional a(String str) {
        Matcher matcher = ((Pattern) i.get()).matcher(str);
        return matcher.find() ? Optional.ofNullable(matcher.group(1)).map(new Function() { // from class: alvz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ejxr ejxrVar = alwh.a;
                return new crnc(Integer.parseInt((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }) : Optional.empty();
    }

    public final Optional b(String str) {
        Matcher matcher = ((Pattern) j.get()).matcher(str);
        return matcher.find() ? Optional.ofNullable(matcher.group(2)) : Optional.empty();
    }

    public final String e(String str) {
        return f(str, true);
    }

    public final String f(String str, boolean z) {
        if (TextUtils.isEmpty(str) || str.trim().length() == 0) {
            return "";
        }
        String strD = d(str);
        if (i(strD)) {
            return str;
        }
        if (k(strD)) {
            ejwl.a(k(strD));
            if (TextUtils.isEmpty(strD)) {
                return "";
            }
            String strReplace = !h(strD) ? strD.replace("-", "") : strD;
            if (!TextUtils.isEmpty(strReplace)) {
                return strReplace;
            }
            cqbd cqbdVarB = e.b();
            cqbdVarB.I("short code could not be sanitized.");
            cqbdVarB.k(strD);
            cqbdVarB.r();
            return strD;
        }
        String strReplaceAll = ((Pattern) b.get()).matcher(strD).replaceAll("");
        if (z) {
            strReplaceAll = ((crmx) this.k.b()).B(strReplaceAll, ephg.E164);
        } else if (str.startsWith("tel:")) {
            strReplaceAll = str.substring(4);
        }
        if (!strReplaceAll.equals(str)) {
            cqbd cqbdVarA = e.a();
            cqbdVarA.K(c, str);
            cqbdVarA.I("sanitize");
            cqbdVarA.k(str);
            cqbdVarA.I("to");
            cqbdVarA.k(strReplaceAll);
            cqbdVarA.r();
        }
        if (!TextUtils.isEmpty(strReplaceAll)) {
            return strReplaceAll;
        }
        cqbd cqbdVarB2 = e.b();
        cqbdVarB2.I("could not sanitize");
        cqbdVarB2.k(str);
        cqbdVarB2.r();
        return str;
    }

    public final boolean j(final String str) {
        return ((Boolean) ((Optional) this.l.b()).map(new Function() { // from class: alvy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ejxr ejxrVar = alwh.a;
                return Boolean.valueOf(((cgsa) obj).r().equals(str));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    public final boolean l(String str) {
        return m(str, true);
    }

    public final boolean m(String str, boolean z) {
        String strF = f(str, z);
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        return Patterns.PHONE.matcher(strF).matches() || ((Pattern) d.get()).matcher(strF).matches();
    }

    public final boolean n(String str) {
        return ((Pattern) i.get()).matcher(str).matches();
    }
}

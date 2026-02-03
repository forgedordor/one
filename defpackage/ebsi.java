package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebsi {
    private static final eksp b = eksp.c("GlobMatcher");
    public final Pattern a;

    private ebsi(String str, Pattern pattern) {
        str.getClass();
        this.a = pattern;
    }

    public static ejwi a(String str) {
        ebsh ebshVar = new ebsh();
        StringBuilder sb = new StringBuilder();
        if (!ebshVar.a(str.toCharArray(), sb, false)) {
            ((eksl) ((eksl) b.i()).h("com/google/android/libraries/saferwebview/GlobMatcher", "create", 49, "GlobMatcher.java")).t("Internal error. Can't parse glob-pattern: %s", str);
            return ejud.a;
        }
        try {
            return ejwi.j(new ebsi(str, Pattern.compile(sb.toString(), 2)));
        } catch (PatternSyntaxException e) {
            ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/libraries/saferwebview/GlobMatcher", "create", 44, "GlobMatcher.java")).t("Internal error. Generated regex is invalid: %s", sb);
            return ejud.a;
        }
    }
}

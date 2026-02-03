package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgre {
    public static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    private static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    private static final ThreadLocal e = new fgrc();

    public static String a(Collection collection, String str) {
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        fgrd fgrdVar = new fgrd(str);
        fgrdVar.a(string);
        while (it.hasNext()) {
            fgrdVar.a(it.next());
        }
        String strC = c(fgrdVar.a);
        fgrdVar.a = null;
        return strC;
    }

    public static String b(String str) {
        StringBuilder sbE = e();
        f(sbE, str, false);
        return c(sbE);
    }

    public static String c(StringBuilder sb) {
        fgqz.g(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = (Stack) e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static String d(String str, String str2) {
        String strJ = j(str);
        String strJ2 = j(str2);
        try {
            try {
                URL url = new URL(strJ);
                String strJ3 = j(strJ2);
                if (strJ3.startsWith("?")) {
                    strJ3 = String.valueOf(url.getPath()).concat(String.valueOf(strJ3));
                }
                URL url2 = new URL(url, strJ3);
                String strReplaceFirst = b.matcher(url2.getFile()).replaceFirst("/");
                if (url2.getRef() != null) {
                    strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
                }
                return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strJ2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return c.matcher(strJ2).find() ? strJ2 : "";
        }
    }

    public static StringBuilder e() {
        Stack stack = (Stack) e.get();
        return stack.empty() ? new StringBuilder(8192) : (StringBuilder) stack.pop();
    }

    public static void f(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!z || z3) && !z2) {
                    sb.append(' ');
                    z2 = true;
                }
            } else if (iCodePointAt != 8203 && iCodePointAt != 173) {
                sb.appendCodePoint(iCodePointAt);
                z2 = false;
                z3 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static boolean g(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean h(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!i(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean i(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    private static String j(String str) {
        return d.matcher(str).replaceAll("");
    }
}

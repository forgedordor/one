package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdgz extends fdgy {
    public static final String i(CharSequence charSequence, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Count 'n' must be non-negative, but was ", "."));
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i != 1) {
            int length = charSequence.length();
            if (length == 0) {
                charSequence = "";
            } else if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (i > 0) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                charSequence = sb.toString();
            } else {
                char cCharAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                for (int i3 = 0; i3 < i; i3++) {
                    cArr[i3] = cCharAt;
                }
                charSequence = new String(cArr);
            }
        }
        return (String) charSequence;
    }

    public static final boolean j(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean k(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(true, i, str2, i2, i3);
    }

    public static final boolean l(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : fdgn.k(str, 0, str2, 0, str2.length(), true);
    }

    public static final boolean m(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : fdgn.k(str, i, str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean n(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.endsWith(str2);
    }

    public static /* synthetic */ String p(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static /* synthetic */ String q(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        int iV = fdgn.v(str, str2, 0, false);
        if (iV < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, iV);
            sb.append(str3);
            i = iV + length;
            if (iV >= str.length()) {
                break;
            }
            iV = fdgn.v(str, str2, iV + fddu.f(length, 1), false);
        } while (iV > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static /* synthetic */ String r(String str) {
        int iO = fdgn.O(str, ":", 0, false, 2);
        return iO < 0 ? str : fdgn.w(str, iO, iO + 1, "://").toString();
    }

    public static /* synthetic */ boolean t(String str, String str2) {
        return fdgn.l(str, str2, false);
    }
}

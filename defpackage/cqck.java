package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqck {
    public static String a(String str) {
        cqce cqceVar = cmvy.a;
        if (alwh.i(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            if (Character.isDigit(sb.charAt(length))) {
                sb.setCharAt(length, 'x');
                i++;
            }
            if (i == 7) {
                break;
            }
        }
        return sb.toString();
    }
}

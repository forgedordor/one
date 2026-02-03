package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexh {
    public static final int a(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (fdgn.J(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }
}

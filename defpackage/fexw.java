package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexw {
    public static final int a(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ') {
                z2 = cCharAt < 127 || (cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':'));
            } else {
                if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                    }
                }
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }
}

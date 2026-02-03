package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feym {
    public static final void a(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt >= 127) {
                throw new IllegalArgumentException(fezr.k("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static final void b(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (cCharAt < ' ' || cCharAt >= 127)) {
                throw new IllegalArgumentException(fezr.k("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(fezr.x(str2) ? "" : ": ".concat(String.valueOf(str))));
            }
        }
    }

    public static final feyn c(String... strArr) {
        if ((strArr.length & 1) != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = fdgn.x(str).toString();
        }
        int iA = fczg.a(0, strArr2.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                a(str2);
                b(str3, str2);
                if (i == iA) {
                    break;
                }
                i += 2;
            }
        }
        return new feyn(strArr2);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfj {
    private final String a;

    public etfj(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String string = obj.toString();
        boolean z = false;
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    z = true;
                    break;
                }
                int iCodePointAt = string.codePointAt(iCharCount);
                if (!Character.isLetterOrDigit(iCodePointAt)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        ejwl.f(z, "Invalid key: %s", string);
        return this.a.concat(String.valueOf(String.valueOf(obj)));
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etej {
    static String a(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int iDigit = Character.digit(charSequence.charAt(i), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }
}

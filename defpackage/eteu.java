package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eteu {
    private final CharSequence a;
    private int b = 0;

    public eteu(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final int a() {
        int i = this.b;
        if (i >= 0) {
            CharSequence charSequence = this.a;
            if (i < charSequence.length()) {
                char cCharAt = charSequence.charAt(this.b);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    this.b++;
                    return cCharAt - '0';
                }
                throw new IllegalArgumentException("non-digit character '" + cCharAt + "' [" + ((int) cCharAt) + "] at index " + this.b + " in: " + String.valueOf(charSequence));
            }
        }
        throw new IndexOutOfBoundsException("index '" + this.b + "' out of bounds for input: " + String.valueOf(this.a));
    }

    public final boolean b() {
        return this.b < this.a.length();
    }
}

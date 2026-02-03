package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzu implements jzr {
    private final CharSequence a;
    private final jzt b;

    public jzu(CharSequence charSequence, jzt jztVar) {
        this.a = charSequence;
        this.b = jztVar;
    }

    @Override // defpackage.jzr
    public final int b(int i) {
        do {
            i = this.b.a(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.jzr
    public final int c(int i) {
        CharSequence charSequence;
        do {
            i = this.b.a(i);
            if (i != -1) {
                charSequence = this.a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.jzr
    public final int e(int i) {
        do {
            i = this.b.b(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.jzr
    public final int f(int i) {
        do {
            i = this.b.b(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasa implements CharSequence {
    public final int a;
    private final String b;
    private final int c;
    private int d;

    public aasa(String str, int i, int i2) {
        ejwl.b(i2 >= i, "end must be greater than start");
        this.b = str;
        this.c = Math.max(0, i);
        this.a = Math.min(str.length(), i2);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(this.c + i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aasa)) {
            return false;
        }
        aasa aasaVar = (aasa) obj;
        if (this == aasaVar) {
            return true;
        }
        if (aasaVar.length() != length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (this.b.charAt(this.c + i) != aasaVar.b.charAt(aasaVar.c + i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iCharAt = 0;
        if (length() > 0) {
            for (int i2 = this.c; i2 < this.a; i2++) {
                iCharAt = (iCharAt * 31) + this.b.charAt(i2);
            }
            this.d = iCharAt;
        }
        return iCharAt;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a - this.c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.c;
        int i4 = this.a;
        return new aasa(this.b, Math.max(i3, Math.min(i4, i + i3)), Math.min(i4, i3 + i2));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.substring(this.c, this.a);
    }
}

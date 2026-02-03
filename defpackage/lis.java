package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lis {
    public final int a;
    public final CharSequence b;

    static {
        fcwa.f(new fcti(5, 5), new fcti(12, 12), new fcti(1, 1), new fcti(7, 7), new fcti(9, 9), new fcti(11, 11), new fcti(14, 14), new fcti(4, 4), new fcti(15, 15), new fcti(3, 3), new fcti(2, 2), new fcti(10, 10), new fcti(8, 8));
    }

    public lis(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lis) {
            lis lisVar = (lis) obj;
            if (this.a == lisVar.a && fdbq.f(this.b, lisVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}

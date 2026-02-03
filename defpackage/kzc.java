package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzc {
    public static final kzc a = new kzc(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private kzc(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static kzc b(kzc kzcVar, kzc kzcVar2) {
        return d(Math.max(kzcVar.b, kzcVar2.b), Math.max(kzcVar.c, kzcVar2.c), Math.max(kzcVar.d, kzcVar2.d), Math.max(kzcVar.e, kzcVar2.e));
    }

    public static kzc c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static kzc d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new kzc(i, i2, i3, i4);
    }

    public static kzc e(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kzc kzcVar = (kzc) obj;
        return this.e == kzcVar.e && this.b == kzcVar.b && this.d == kzcVar.d && this.c == kzcVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}

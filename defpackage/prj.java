package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prj {
    public static final prj a = new prj(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public prj(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        if (i > i3) {
            throw new IllegalArgumentException("Left must be less than or equal to right, left: " + i + ", right: " + i3);
        }
        if (i2 <= i4) {
            return;
        }
        throw new IllegalArgumentException("top must be less than or equal to bottom, top: " + i2 + ", bottom: " + i4);
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final Rect c() {
        return new Rect(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        prj prjVar = (prj) obj;
        return this.b == prjVar.b && this.c == prjVar.c && this.d == prjVar.d && this.e == prjVar.e;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "prj { [" + this.b + ',' + this.c + ',' + this.d + ',' + this.e + "] }";
    }

    public prj(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}

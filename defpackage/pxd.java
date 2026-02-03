package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxd {
    private final prj a;
    private final float b;

    public pxd(prj prjVar, float f) {
        this.a = prjVar;
        this.b = f;
    }

    public final Rect a() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pxd pxdVar = (pxd) obj;
        return fdbq.f(this.a, pxdVar.a) && this.b == pxdVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public pxd(Rect rect, float f) {
        this(new prj(rect), f);
    }
}

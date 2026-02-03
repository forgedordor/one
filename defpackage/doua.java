package defpackage;

import android.content.res.ColorStateList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doua {
    public final int a;
    public final int b;
    public final ColorStateList c;

    public doua(int i, int i2, ColorStateList colorStateList) {
        this.a = i;
        this.b = i2;
        this.c = colorStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doua)) {
            return false;
        }
        doua douaVar = (doua) obj;
        return this.a == douaVar.a && this.b == douaVar.b && fdbq.f(this.c, douaVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TabColors(selected=" + this.a + ", unselected=" + this.b + ", textColors=" + this.c + ")";
    }
}

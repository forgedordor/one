package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwp {
    public final float a;
    public final float b;
    public final float c;

    public gwp(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwp)) {
            return false;
        }
        gwp gwpVar = (gwp) obj;
        return kir.b(this.a, gwpVar.a) && kir.b(this.b, gwpVar.b) && kir.b(this.c, gwpVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TabPosition(left=" + ((Object) kir.a(this.a)) + ", right=" + ((Object) kir.a(a())) + ", width=" + ((Object) kir.a(this.b)) + ", contentWidth=" + ((Object) kir.a(this.c)) + ')';
    }
}

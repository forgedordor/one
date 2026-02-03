package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ind extends ina {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final iil e;

    public /* synthetic */ ind(float f, float f2, int i, int i2, int i3) {
        this.a = 1 == (i3 & 1) ? 0.0f : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ind)) {
            return false;
        }
        ind indVar = (ind) obj;
        if (this.a != indVar.a || this.b != indVar.b || !iku.a(this.c, indVar.c) || !ikv.a(this.d, indVar.d)) {
            return false;
        }
        iil iilVar = indVar.e;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        int i = this.c;
        String str = "Unknown";
        sb.append((Object) (iku.a(i, 0) ? "Butt" : iku.a(i, 1) ? "Round" : iku.a(i, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.d;
        if (ikv.a(i2, 0)) {
            str = "Miter";
        } else if (ikv.a(i2, 1)) {
            str = "Round";
        } else if (ikv.a(i2, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}

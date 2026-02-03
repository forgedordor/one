package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrm {
    public final float a;
    public final float b;
    public final float c;

    public djrm(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djrm)) {
            return false;
        }
        djrm djrmVar = (djrm) obj;
        return kir.b(this.a, djrmVar.a) && kir.b(this.b, djrmVar.b) && kir.b(this.c, djrmVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.c;
        float f2 = this.b;
        return "GalleryDimensions(smallItemSideLength=" + kir.a(this.a) + ", bigItemWidth=" + kir.a(f2) + ", bigItemHeight=" + kir.a(f) + ")";
    }
}

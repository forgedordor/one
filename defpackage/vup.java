package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vup {
    public final boolean a;
    public final int b;
    public final int c;

    public vup(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vup)) {
            return false;
        }
        vup vupVar = (vup) obj;
        return this.a == vupVar.a && this.b == vupVar.b && this.c == vupVar.c;
    }

    public final int hashCode() {
        return ((((true != this.a ? 1237 : 1231) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ImageCompressionInfo(isCompressed=" + this.a + ", longDimension=" + this.b + ", jpegQuality=" + this.c + ")";
    }
}

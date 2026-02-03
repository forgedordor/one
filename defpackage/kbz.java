package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbz {
    public final String a;
    public final float b;

    public kbz(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kbz) {
            kbz kbzVar = (kbz) obj;
            if (fdbq.f(this.a, kbzVar.a) && this.b == kbzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }
}

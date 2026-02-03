package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dky {
    public final float a;
    public final iiy b;

    public dky(float f, iiy iiyVar) {
        this.a = f;
        this.b = iiyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dky)) {
            return false;
        }
        dky dkyVar = (dky) obj;
        return kir.b(this.a, dkyVar.a) && fdbq.f(this.b, dkyVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) kir.a(this.a)) + ", brush=" + this.b + ')';
    }
}

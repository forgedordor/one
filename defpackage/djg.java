package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djg {
    public final deh a;
    public final des b;
    public final int c = 0;

    public djg(deh dehVar, des desVar) {
        this.a = dehVar;
        this.b = desVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djg)) {
            return false;
        }
        djg djgVar = (djg) obj;
        if (!fdbq.f(this.a, djgVar.a) || !fdbq.f(this.b, djgVar.b)) {
            return false;
        }
        int i = djgVar.c;
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvk {
    public final jvl a;
    public final int b;
    public final int c;

    public jvk(jvl jvlVar, int i, int i2) {
        this.a = jvlVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvk)) {
            return false;
        }
        jvk jvkVar = (jvk) obj;
        return fdbq.f(this.a, jvkVar.a) && this.b == jvkVar.b && this.c == jvkVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}

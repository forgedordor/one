package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqn {
    public final ioi a;
    public final int b;

    public jqn(ioi ioiVar, int i) {
        this.a = ioiVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqn)) {
            return false;
        }
        jqn jqnVar = (jqn) obj;
        return fdbq.f(this.a, jqnVar.a) && this.b == jqnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
    }
}

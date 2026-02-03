package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqn {
    public final vvw a;
    private final boolean b;

    public wqn(vvw vvwVar, boolean z) {
        this.a = vvwVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqn)) {
            return false;
        }
        wqn wqnVar = (wqn) obj;
        return fdbq.f(this.a, wqnVar.a) && this.b == wqnVar.b;
    }

    public final int hashCode() {
        vvw vvwVar = this.a;
        return ((vvwVar == null ? 0 : vvwVar.hashCode()) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Result(draft=" + this.a + ", persist=" + this.b + ")";
    }
}

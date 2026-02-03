package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andt implements andu {
    public final eiju a;
    public final int b;

    public andt(eiju eijuVar, int i) {
        this.a = eijuVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof andt)) {
            return false;
        }
        andt andtVar = (andt) obj;
        return fdbq.f(this.a, andtVar.a) && this.b == andtVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Loading(future=" + this.a + ", limit=" + this.b + ")";
    }
}

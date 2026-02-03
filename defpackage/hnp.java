package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnp implements hsl {
    public final fdap a;

    public hnp(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.hsl
    public final Object a(hxi hxiVar) {
        return this.a.invoke(hxiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnp) && fdbq.f(this.a, ((hnp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}

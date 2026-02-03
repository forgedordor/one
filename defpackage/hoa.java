package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoa implements hsl {
    public final hox a;

    public hoa(hox hoxVar) {
        this.a = hoxVar;
    }

    @Override // defpackage.hsl
    public final Object a(hxi hxiVar) {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoa) && fdbq.f(this.a, ((hoa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}

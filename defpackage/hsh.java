package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsh implements hsl {
    public final Object a;

    public hsh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hsl
    public final Object a(hxi hxiVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsh) && fdbq.f(this.a, ((hsh) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}

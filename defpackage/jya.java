package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class jya implements jui {
    public final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof jya) && fdbq.f(this.a, ((jya) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}

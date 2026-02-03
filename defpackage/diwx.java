package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diwx {
    public final dihd a;

    public diwx(dihd dihdVar) {
        this.a = dihdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof diwx) && fdbq.f(this.a, ((diwx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveButtonUiData(callback=" + this.a + ")";
    }
}

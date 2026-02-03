package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdv extends rdx {
    public final rdz a;

    public rdv(rdz rdzVar) {
        this.a = rdzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdv) && fdbq.f(this.a, ((rdv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.a + ")";
    }
}

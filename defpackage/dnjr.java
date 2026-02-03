package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjr extends dnjs {
    public final CharSequence a;

    public dnjr(CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
    }

    @Override // defpackage.dnkf
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnjr) && fdbq.f(this.a, ((dnjr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Plain(literal=" + ((Object) this.a) + ")";
    }
}

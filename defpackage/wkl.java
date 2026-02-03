package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkl {
    public final vvp a;

    public wkl(vvp vvpVar) {
        this.a = vvpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkl) && fdbq.f(this.a, ((wkl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Add(attachment=" + this.a + ")";
    }
}

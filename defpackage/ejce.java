package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejce {
    public final String a;
    public final epiv b;

    public ejce(String str, epiv epivVar) {
        epivVar.getClass();
        this.a = str;
        this.b = epivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejce)) {
            return false;
        }
        ejce ejceVar = (ejce) obj;
        return fdbq.f(this.a, ejceVar.a) && this.b == ejceVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MagicRewriteResponse(message=" + this.a + ", style=" + this.b + ")";
    }
}

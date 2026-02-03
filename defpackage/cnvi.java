package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvi {
    private final cnyz a;
    private final enqq b;

    public cnvi(cnyz cnyzVar, enqq enqqVar) {
        enqqVar.getClass();
        this.a = cnyzVar;
        this.b = enqqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnvi)) {
            return false;
        }
        cnvi cnviVar = (cnvi) obj;
        return fdbq.f(this.a, cnviVar.a) && this.b == cnviVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncRequested(request=" + this.a + ", reason=" + this.b + ")";
    }
}

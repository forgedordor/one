package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvd {
    private final cnyz a;

    public cnvd(cnyz cnyzVar) {
        cnyzVar.getClass();
        this.a = cnyzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnvd) && fdbq.f(this.a, ((cnvd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncAddedToQueue(request=" + this.a + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajmt implements ajmz {
    private final ajmb a;

    public ajmt(ajmb ajmbVar) {
        ajmbVar.getClass();
        this.a = ajmbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajmt) && fdbq.f(this.a, ((ajmt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PreviewSummary(content=" + this.a + ")";
    }
}

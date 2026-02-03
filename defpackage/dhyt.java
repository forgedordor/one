package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyt {
    public final dhyv a;

    public dhyt(dhyv dhyvVar) {
        this.a = dhyvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhyt) && fdbq.f(this.a, ((dhyt) obj).a);
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final String toString() {
        return "ClassificationResult(verdict=" + this.a + ")";
    }
}

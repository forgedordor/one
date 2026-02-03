package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajmj implements ajmz {
    public final amvr a;

    public ajmj(amvr amvrVar) {
        amvrVar.getClass();
        this.a = amvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajmj) && fdbq.f(this.a, ((ajmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageSummary(content=" + this.a + ")";
    }
}

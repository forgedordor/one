package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmcg implements dmck {
    public final dojr a;

    public dmcg(dojr dojrVar) {
        this.a = dojrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmcg) && fdbq.f(this.a, ((dmcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Playback(capturedMedia=" + this.a + ")";
    }
}

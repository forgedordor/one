package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilr {
    public final cilo a;

    public cilr(cilo ciloVar) {
        this.a = ciloVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cilr) && fdbq.f(this.a, ((cilr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OverlappingMention(overlappingMention=" + this.a + ")";
    }
}

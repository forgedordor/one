package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdoe {
    public final Set a;
    public final Set b;

    public cdoe(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdoe)) {
            return false;
        }
        cdoe cdoeVar = (cdoe) obj;
        return fdbq.f(this.a, cdoeVar.a) && fdbq.f(this.b, cdoeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AllowedAndDisallowedParticipants(allowedParticipants=" + this.a + ", disallowedParticipants=" + this.b + ")";
    }
}

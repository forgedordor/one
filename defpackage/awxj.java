package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxj {
    public final Set a;
    private final boolean b;

    public awxj(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awxj)) {
            return false;
        }
        awxj awxjVar = (awxj) obj;
        return fdbq.f(this.a, awxjVar.a) && this.b == awxjVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MyIdentitiesUpdateResult(tokens=" + this.a + ", hasChanges=" + this.b + ")";
    }
}

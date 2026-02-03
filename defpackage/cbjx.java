package defpackage;

import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjx {
    public final Set a;
    public final Duration b;

    public cbjx(Set set, Duration duration) {
        this.a = set;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbjx)) {
            return false;
        }
        cbjx cbjxVar = (cbjx) obj;
        return fdbq.f(this.a, cbjxVar.a) && fdbq.f(this.b, cbjxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JanitorStepResult(affectedQueues=" + this.a + ", queryDuration=" + this.b + ")";
    }
}

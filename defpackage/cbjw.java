package defpackage;

import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjw {
    public final Map a;
    public final Duration b;

    public cbjw(Map map, Duration duration) {
        map.getClass();
        this.a = map;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbjw)) {
            return false;
        }
        cbjw cbjwVar = (cbjw) obj;
        return fdbq.f(this.a, cbjwVar.a) && fdbq.f(this.b, cbjwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JanitorResult(steps=" + this.a + ", rescheduleDuration=" + this.b + ")";
    }
}

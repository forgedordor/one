package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdn implements dqdp {
    public final Duration a;

    public dqdn(Duration duration) {
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqdn) && fdbq.f(this.a, ((dqdn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Recording(elapsedTime=" + this.a + ")";
    }
}

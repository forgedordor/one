package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dome implements domh {
    public final Instant a;
    public final Duration b;

    public dome(Instant instant, Duration duration) {
        duration.getClass();
        this.a = instant;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dome)) {
            return false;
        }
        dome domeVar = (dome) obj;
        return fdbq.f(this.a, domeVar.a) && fdbq.f(this.b, domeVar.b);
    }

    public final int hashCode() {
        Instant instant = this.a;
        return ((instant == null ? 0 : instant.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Audio(dateModified=" + this.a + ", duration=" + this.b + ")";
    }
}

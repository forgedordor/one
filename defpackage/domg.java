package defpackage;

import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domg implements domh {
    public final Instant a;
    public final Size b;
    public final Duration c;

    public domg(Instant instant, Size size, Duration duration) {
        this.a = instant;
        this.b = size;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof domg)) {
            return false;
        }
        domg domgVar = (domg) obj;
        return fdbq.f(this.a, domgVar.a) && fdbq.f(this.b, domgVar.b) && fdbq.f(this.c, domgVar.c);
    }

    public final int hashCode() {
        Instant instant = this.a;
        return ((((instant == null ? 0 : instant.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Video(dateModified=" + this.a + ", dimensions=" + this.b + ", duration=" + this.c + ")";
    }
}

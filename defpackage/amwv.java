package defpackage;

import android.graphics.Point;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amwv {
    public final Point a;
    public final Duration b;

    public amwv(Point point, Duration duration) {
        this.a = point;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amwv)) {
            return false;
        }
        amwv amwvVar = (amwv) obj;
        return fdbq.f(this.a, amwvVar.a) && fdbq.f(this.b, amwvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VideoMetadata(videoSize=" + this.a + ", duration=" + this.b + ")";
    }
}

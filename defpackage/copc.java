package defpackage;

import android.graphics.Point;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class copc extends copz {
    private final Point a;
    private final Duration b;

    public copc(Point point, Duration duration) {
        this.a = point;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.b = duration;
    }

    @Override // defpackage.copz
    public final Point a() {
        return this.a;
    }

    @Override // defpackage.copz
    public final Duration b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof copz) {
            copz copzVar = (copz) obj;
            if (this.a.equals(copzVar.a()) && this.b.equals(copzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Duration duration = this.b;
        return "VideoMetadata{videoSize=" + this.a.toString() + ", duration=" + duration.toString() + "}";
    }
}

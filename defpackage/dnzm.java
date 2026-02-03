package defpackage;

import android.graphics.Bitmap;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzm {
    public final Duration a;
    public final Bitmap b;

    public dnzm(Duration duration, Bitmap bitmap) {
        this.a = duration;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnzm)) {
            return false;
        }
        dnzm dnzmVar = (dnzm) obj;
        return fdbq.f(this.a, dnzmVar.a) && fdbq.f(this.b, dnzmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GifFrame(presentationTime=" + this.a + ", bitmap=" + this.b + ")";
    }
}

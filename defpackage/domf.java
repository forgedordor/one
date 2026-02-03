package defpackage;

import android.util.Size;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domf implements domh {
    public final Instant a;
    public final Size b;

    public domf(Instant instant, Size size) {
        size.getClass();
        this.a = instant;
        this.b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof domf)) {
            return false;
        }
        domf domfVar = (domf) obj;
        return fdbq.f(this.a, domfVar.a) && fdbq.f(this.b, domfVar.b);
    }

    public final int hashCode() {
        Instant instant = this.a;
        return ((instant == null ? 0 : instant.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Image(dateModified=" + this.a + ", dimensions=" + this.b + ")";
    }
}

package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdv implements eqdw {
    public final URI a;

    public eqdv(URI uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqdv) && fdbq.f(this.a, ((eqdv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Valid(uri=" + this.a + ")";
    }
}

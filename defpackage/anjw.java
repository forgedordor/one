package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anjw {
    public final Set a;

    public anjw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anjw) && fdbq.f(this.a, ((anjw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedMessages=" + this.a + ")";
    }

    public /* synthetic */ anjw(byte[] bArr) {
        this.a = new LinkedHashSet();
    }
}

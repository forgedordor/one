package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anuw {
    public final Set a;
    public final AtomicBoolean b;

    public anuw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anuw)) {
            return false;
        }
        anuw anuwVar = (anuw) obj;
        return fdbq.f(this.a, anuwVar.a) && fdbq.f(this.b, anuwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedConversations=" + this.a + ", withSelfParticipants=" + this.b + ")";
    }

    public /* synthetic */ anuw(byte[] bArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = linkedHashSet;
        this.b = atomicBoolean;
    }
}

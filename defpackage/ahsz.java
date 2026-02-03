package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsz {
    public final UUID a;

    public ahsz(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahsz) && fdbq.f(this.a, ((ahsz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "D2DRestoreCompleteEvent(sessionId=" + this.a + ")";
    }
}

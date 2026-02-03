package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anut {
    public final Set a;

    public anut() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anut) && fdbq.f(this.a, ((anut) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedConversations=" + this.a + ")";
    }

    public /* synthetic */ anut(byte[] bArr) {
        this.a = new LinkedHashSet();
    }
}

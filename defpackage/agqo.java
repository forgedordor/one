package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqo {
    public final boolean a;
    public final List b;

    public agqo(boolean z, List list) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agqo)) {
            return false;
        }
        agqo agqoVar = (agqo) obj;
        return this.a == agqoVar.a && fdbq.f(this.b, agqoVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PenpalAvailabilityResult(isAvailable=" + this.a + ", unavailableReasons=" + this.b + ")";
    }
}

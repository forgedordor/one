package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwjk {
    public final Boolean a;
    private final boolean b;

    public cwjk() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwjk)) {
            return false;
        }
        cwjk cwjkVar = (cwjk) obj;
        if (!fdbq.f(this.a, cwjkVar.a)) {
            return false;
        }
        boolean z = cwjkVar.b;
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "ToggleState(isActive=" + this.a + ", isApplyingChange=false)";
    }

    public /* synthetic */ cwjk(Boolean bool, int i) {
        this.a = 1 == (i & 1) ? null : bool;
        this.b = false;
    }
}

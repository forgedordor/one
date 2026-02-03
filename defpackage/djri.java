package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djri {
    public final boolean a;
    private final boolean b;

    public djri(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djri)) {
            return false;
        }
        djri djriVar = (djri) obj;
        return this.a == djriVar.a && this.b == djriVar.b;
    }

    public final int hashCode() {
        return (djrh.a(this.a) * 31) + djrh.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }

    public djri() {
        this(false, false);
    }
}

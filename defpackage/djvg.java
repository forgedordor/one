package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvg {
    public final boolean a;
    private final boolean b;

    public djvg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djvg)) {
            return false;
        }
        djvg djvgVar = (djvg) obj;
        return this.a == djvgVar.a && this.b == djvgVar.b;
    }

    public final int hashCode() {
        return (djvf.a(this.a) * 31) + djvf.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }
}

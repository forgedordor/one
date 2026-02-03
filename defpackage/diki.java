package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diki {
    public final boolean a;
    public final boolean b;

    public diki(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diki)) {
            return false;
        }
        diki dikiVar = (diki) obj;
        return this.a == dikiVar.a && this.b == dikiVar.b;
    }

    public final int hashCode() {
        return (dikh.a(this.a) * 31) + dikh.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypm {
    public final boolean a;
    public final boolean b;

    public ypm(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypm)) {
            return false;
        }
        ypm ypmVar = (ypm) obj;
        return this.a == ypmVar.a && this.b == ypmVar.b;
    }

    public final int hashCode() {
        return (ypl.a(this.a) * 31) + ypl.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }

    public ypm() {
        this(false, false);
    }
}

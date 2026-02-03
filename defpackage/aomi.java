package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aomi extends aomk {
    private final int a;
    private final int b;

    public aomi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aomi)) {
            return false;
        }
        aomi aomiVar = (aomi) obj;
        return this.a == aomiVar.a && this.b == aomiVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "MediaPlayerError(type=" + this.a + ", extra=" + this.b + ")";
    }
}

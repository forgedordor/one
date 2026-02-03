package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egab {
    public final int a;
    public int b;

    public egab(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egab)) {
            return false;
        }
        egab egabVar = (egab) obj;
        return this.a == egabVar.a && this.b == egabVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActiveCallbacks(callbacksId=" + this.a + ", callbacksState=" + this.b + ")";
    }
}

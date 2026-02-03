package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdg {
    public final int a;
    public final int b;

    public cdg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdg)) {
            return false;
        }
        cdg cdgVar = (cdg) obj;
        return this.a == cdgVar.a && this.b == cdgVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "CaptureEncodeRates(captureRate=" + this.a + ", encodeRate=" + this.b + ')';
    }
}

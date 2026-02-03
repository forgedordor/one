package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khw {
    public static final khw a = new khw(2, false);
    private static final khw d = new khw(1, true);
    public final int b;
    public final boolean c;

    public khw(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khw)) {
            return false;
        }
        khw khwVar = (khw) obj;
        return khv.a(this.b, khwVar.b) && this.c == khwVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return fdbq.f(this, a) ? "TextMotion.Static" : fdbq.f(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}

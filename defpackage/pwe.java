package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwe {
    public static final pwe a = new pwe("expandContainers", 0.0f);
    public static final pwe b = pwd.a(0.5f);
    public static final pwe c = new pwe("hinge", -1.0f);
    public final float d;
    private final String e;

    public pwe(String str, float f) {
        this.e = str;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pwe)) {
            return false;
        }
        pwe pweVar = (pwe) obj;
        return this.d == pweVar.d && fdbq.f(this.e, pweVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Float.floatToIntBits(this.d) * 31);
    }

    public final String toString() {
        return this.e;
    }
}

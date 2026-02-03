package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pso {
    public static final pso a = new pso(0);
    public static final pso b = new pso(1);
    private final int c;

    private pso(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pso) && this.c == ((pso) obj).c;
    }

    public final int hashCode() {
        return this.c * 31;
    }

    public final String toString() {
        return this.c != 0 ? "JUMP_CUT" : "DEFAULT";
    }
}

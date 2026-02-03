package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybm implements ybn {
    public final boolean a;

    public ybm(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybm) && this.a == ((ybm) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Projector(useDynamicBackground=" + this.a + ")";
    }

    public ybm() {
        this(false);
    }
}

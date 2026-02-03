package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djro {
    private final boolean a;

    public djro(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djro) && this.a == ((djro) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ")";
    }

    public djro() {
        this(false);
    }
}

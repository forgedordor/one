package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplg extends dplj {
    private final int a;

    public dplg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dplg) && this.a == ((dplg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Closing(currentHeight=" + this.a + ")";
    }
}

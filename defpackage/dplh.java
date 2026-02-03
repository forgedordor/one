package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplh extends dplj {
    private final int a;

    public dplh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dplh) && this.a == ((dplh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Open(height=" + this.a + ")";
    }
}

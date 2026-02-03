package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class dkj {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof dkj) && this.a == ((dkj) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidExternalSurfaceZOrder(zOrder=" + this.a + ')';
    }
}

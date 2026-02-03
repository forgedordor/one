package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class ieq {
    public static final ikp a = ikj.a;
    public final ikp b;

    public final boolean equals(Object obj) {
        return (obj instanceof ieq) && fdbq.f(this.b, ((ieq) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "BlurredEdgeTreatment(shape=" + this.b + ')';
    }
}

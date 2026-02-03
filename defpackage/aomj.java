package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aomj extends aomk {
    private final Throwable a;

    public aomj(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aomj) && fdbq.f(this.a, ((aomj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerNotPrepared(throwable=" + this.a + ")";
    }
}

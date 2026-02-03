package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdoe extends fdof {
    public final Throwable a;

    public fdoe(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdoe) && fdbq.f(this.a, ((fdoe) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fdof
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orm extends orp {
    public final Throwable a;

    public orm(Throwable th) {
        super(false);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof orm)) {
            return false;
        }
        orm ormVar = (orm) obj;
        return this.c == ormVar.c && fdbq.f(this.a, ormVar.a);
    }

    public final int hashCode() {
        boolean z = this.c;
        return (true != z ? 1237 : 1231) + this.a.hashCode();
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.c + ", error=" + this.a + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drad extends drah {
    public final ewun a;
    public final ewur b;

    public drad(ewun ewunVar, ewur ewurVar) {
        if (ewunVar == null) {
            throw new NullPointerException("Null batchSyncRequest");
        }
        this.a = ewunVar;
        if (ewurVar == null) {
            throw new NullPointerException("Null batchSyncResponse");
        }
        this.b = ewurVar;
    }

    @Override // defpackage.drah
    public final ewun a() {
        return this.a;
    }

    @Override // defpackage.drah
    public final ewur b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drah) {
            drah drahVar = (drah) obj;
            if (this.a.equals(drahVar.a()) && this.b.equals(drahVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ewur ewurVar = this.b;
        return "BatchSyncResult{batchSyncRequest=" + this.a.toString() + ", batchSyncResponse=" + ewurVar.toString() + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drer extends dret {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dret)) {
            return false;
        }
        dret dretVar = (dret) obj;
        dretVar.b();
        dretVar.a();
        return true;
    }

    public final int hashCode() {
        return 385623363;
    }

    public final String toString() {
        return "DeleteStatusUpdateParams{markAsUndeleted=false, deleteStatus=PENDING_DELETE}";
    }

    @Override // defpackage.dret
    public final void a() {
    }

    @Override // defpackage.dret
    public final void b() {
    }
}

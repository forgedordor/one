package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvm extends dyvv {
    private final dyvl b;

    public dyvm(dyvl dyvlVar) {
        this.b = dyvlVar;
    }

    @Override // defpackage.dyvv
    public final dyvl b() {
        return this.b;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyvv) {
            return this.b.equals(((dyvv) obj).b());
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}

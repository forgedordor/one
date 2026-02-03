package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqiq extends cqje {
    public final cqjc a;
    public final cqjc b;

    public cqiq(cqjc cqjcVar, cqjc cqjcVar2) {
        this.a = cqjcVar;
        this.b = cqjcVar2;
    }

    @Override // defpackage.cqje
    public final cqjc a() {
        return this.b;
    }

    @Override // defpackage.cqje
    public final cqjc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqje) {
            cqje cqjeVar = (cqje) obj;
            if (this.a.equals(cqjeVar.b()) && this.b.equals(cqjeVar.a())) {
                cqjeVar.c();
                cqjeVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ 1231;
    }

    public final String toString() {
        cqjc cqjcVar = this.b;
        return "FilteredContactCursors{personalDirectoryResult=" + this.a.toString() + ", enterpriseDirectoryResult=" + cqjcVar.toString() + ", nonDefaultDirectoriesResultList=null, sorted=true}";
    }

    @Override // defpackage.cqje
    public final void c() {
    }

    @Override // defpackage.cqje
    public final void d() {
    }
}

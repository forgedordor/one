package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sov extends spc {
    public final smj a;
    public final smq b;
    public final ejcr c;

    public sov(smj smjVar, ejcr ejcrVar, smq smqVar) {
        this.a = smjVar;
        this.c = ejcrVar;
        this.b = smqVar;
    }

    @Override // defpackage.spc
    public final smj a() {
        return this.a;
    }

    @Override // defpackage.spc
    public final smq b() {
        return this.b;
    }

    @Override // defpackage.spc
    public final ejcr c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spc) {
            spc spcVar = (spc) obj;
            if (this.a.equals(spcVar.a()) && this.c.equals(spcVar.c()) && this.b.equals(spcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        smq smqVar = this.b;
        ejcr ejcrVar = this.c;
        return "MagicRewriteServiceOptions{aiCoreClient=" + this.a.toString() + ", downloadCallback=" + ejcrVar.toString() + ", feature=" + smqVar.toString() + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elbc extends elbb implements elbo {
    @Override // defpackage.elbb, defpackage.elca
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elbo)) {
            return false;
        }
        elbo elboVar = (elbo) obj;
        elboVar.g();
        return d().equals(elboVar.d()) && new elba(this).equals(elboVar.c());
    }

    public final int hashCode() {
        return new elba(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + d().toString() + ", edges: " + new elba(this).toString();
    }
}

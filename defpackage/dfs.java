package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfs extends dfr {
    public final int c;

    public dfs(Object obj, des desVar) {
        super(obj, desVar);
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfs)) {
            return false;
        }
        dfs dfsVar = (dfs) obj;
        if (!fdbq.f(dfsVar.a, this.a) || !fdbq.f(dfsVar.b, this.b)) {
            return false;
        }
        int i = dfsVar.c;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}

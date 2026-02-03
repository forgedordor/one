package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbj {
    private final jgb a = new jgb(jbl.a);

    public final jcr a() {
        jcr jcrVar = (jcr) this.a.first();
        e(jcrVar);
        return jcrVar;
    }

    public final void b(jcr jcrVar) {
        if (!jcrVar.d()) {
            itw.d("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(jcrVar);
    }

    public final boolean c(jcr jcrVar) {
        return this.a.contains(jcrVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(jcr jcrVar) {
        if (!jcrVar.d()) {
            itw.d("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(jcrVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}

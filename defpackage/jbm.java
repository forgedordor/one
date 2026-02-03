package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbm {
    public final jbj a = new jbj();
    public final jbj b = new jbj();

    public final void a(jcr jcrVar, boolean z) {
        if (z) {
            this.a.b(jcrVar);
            this.b.b(jcrVar);
        } else {
            if (this.a.c(jcrVar)) {
                return;
            }
            this.b.b(jcrVar);
        }
    }

    public final boolean b() {
        return (this.b.d() && this.a.d()) ? false : true;
    }

    public final boolean c(jcr jcrVar) {
        return this.a.c(jcrVar);
    }

    public final void d(jcr jcrVar) {
        this.a.e(jcrVar);
        this.b.e(jcrVar);
    }
}

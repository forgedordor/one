package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fbry extends fbnh {
    @Override // defpackage.fbnh
    public void c(String str, Throwable th) {
        g().c(str, th);
    }

    @Override // defpackage.fbnh
    public void d() {
        g().d();
    }

    @Override // defpackage.fbnh
    public void e(int i) {
        g().e(i);
    }

    protected abstract fbnh g();

    @Override // defpackage.fbnh
    public final boolean k() {
        return g().k();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", g());
        return ejwfVarB.toString();
    }
}

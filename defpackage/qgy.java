package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qgy implements qhb {
    public final qhp a;

    public qgy(qhp qhpVar) {
        this.a = qhpVar;
    }

    @Override // defpackage.qhb
    public final fdpl a(pzj pzjVar) {
        pzjVar.getClass();
        return new fdpb(new qgx(this, null));
    }

    @Override // defpackage.qhb
    public final boolean c(qjn qjnVar) {
        return b(qjnVar) && e(this.a.b());
    }

    protected abstract int d();

    protected boolean e(Object obj) {
        throw null;
    }
}

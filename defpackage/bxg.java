package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bxg {
    public abstract bxh a();

    public abstract cax b();

    public abstract void c();

    public abstract void d(cax caxVar);

    public final void e(lbz lbzVar) {
        bwy bwyVar = new bwy(b());
        lbzVar.accept(bwyVar);
        d(bwyVar.a());
    }
}

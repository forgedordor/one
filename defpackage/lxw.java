package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxw implements lvh {
    final /* synthetic */ lvb a;
    final /* synthetic */ lvc b;
    final /* synthetic */ fdis c;
    final /* synthetic */ fdae d;

    public lxw(lvb lvbVar, lvc lvcVar, fdis fdisVar, fdae fdaeVar) {
        this.a = lvbVar;
        this.b = lvcVar;
        this.c = fdisVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        Object objA;
        if (lvaVar != luz.c(this.a)) {
            if (lvaVar == lva.ON_DESTROY) {
                this.b.d(this);
                this.c.w(fctl.a(new lvg()));
                return;
            }
            return;
        }
        this.b.d(this);
        fdis fdisVar = this.c;
        try {
            objA = this.d.invoke();
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        fdisVar.w(objA);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhyy implements defb {
    final /* synthetic */ fdis a;

    public dhyy(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // defpackage.defb
    public final void a(defn defnVar) {
        if (defnVar.m()) {
            this.a.w(defnVar.i());
            return;
        }
        fdis fdisVar = this.a;
        Exception excH = defnVar.h();
        excH.getClass();
        fdisVar.w(fctl.a(excH));
    }
}

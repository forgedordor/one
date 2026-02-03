package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class febm implements defb {
    final /* synthetic */ fdis a;

    public febm(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // defpackage.defb
    public final void a(defn defnVar) {
        Exception excH = defnVar.h();
        if (excH != null) {
            this.a.w(fctl.a(excH));
        } else if (((defv) defnVar).d) {
            this.a.h(null);
        } else {
            this.a.w(defnVar.i());
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rid implements rff {
    final /* synthetic */ rlp a;
    final /* synthetic */ rie b;

    public rid(rie rieVar, rlp rlpVar) {
        this.a = rlpVar;
        this.b = rieVar;
    }

    @Override // defpackage.rff
    public final void c(Object obj) {
        rie rieVar = this.b;
        rlp rlpVar = this.a;
        if (rieVar.e(rlpVar)) {
            rha rhaVar = rieVar.a.o;
            if (obj != null && rhaVar.c(rlpVar.c.eX())) {
                rieVar.c = obj;
                ((rgt) rieVar.b).f(2);
            } else {
                rgm rgmVar = rieVar.b;
                res resVar = rlpVar.a;
                rfg rfgVar = rlpVar.c;
                rgmVar.d(resVar, obj, rfgVar, rfgVar.eX(), rieVar.d);
            }
        }
    }

    @Override // defpackage.rff
    public final void f(Exception exc) {
        rie rieVar = this.b;
        rlp rlpVar = this.a;
        if (rieVar.e(rlpVar)) {
            rgk rgkVar = rieVar.d;
            rfg rfgVar = rlpVar.c;
            rieVar.b.c(rgkVar, exc, rfgVar, rfgVar.eX());
        }
    }
}

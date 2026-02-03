package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lwd implements lvh {
    final /* synthetic */ lva a;
    final /* synthetic */ fdci b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ lva d;
    final /* synthetic */ fdis e;
    final /* synthetic */ feav f;
    final /* synthetic */ fdat g;

    public lwd(lva lvaVar, fdci fdciVar, fdjx fdjxVar, lva lvaVar2, fdis fdisVar, feav feavVar, fdat fdatVar) {
        this.a = lvaVar;
        this.b = fdciVar;
        this.c = fdjxVar;
        this.d = lvaVar2;
        this.e = fdisVar;
        this.f = feavVar;
        this.g = fdatVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar == this.a) {
            this.b.a = fdil.d(this.c, null, null, new lwc(this.f, this.g, null), 3);
            return;
        }
        if (lvaVar == this.d) {
            fdci fdciVar = this.b;
            fdlr fdlrVar = (fdlr) fdciVar.a;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            fdciVar.a = null;
        }
        if (lvaVar == lva.ON_DESTROY) {
            this.e.w(fctx.a);
        }
    }
}

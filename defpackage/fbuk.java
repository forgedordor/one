package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbuk implements lvh {
    final /* synthetic */ fbsj a;

    public fbuk(fbsj fbsjVar) {
        this.a = fbsjVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar == lva.ON_DESTROY) {
            lvjVar.P().d(this);
            this.a.b();
        }
    }
}

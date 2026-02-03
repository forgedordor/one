package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kh implements oo {
    final /* synthetic */ kk a;
    private boolean b;

    public kh(kk kkVar) {
        this.a = kkVar;
    }

    @Override // defpackage.oo
    public final void a(oc ocVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        kk kkVar = this.a;
        kkVar.a.g();
        kkVar.b.onPanelClosed(108, ocVar);
        this.b = false;
    }

    @Override // defpackage.oo
    public final boolean b(oc ocVar) {
        this.a.b.onMenuOpened(108, ocVar);
        return true;
    }
}

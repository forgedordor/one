package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clx implements lun {
    final /* synthetic */ cly a;

    public clx(cly clyVar) {
        this.a = clyVar;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        this.a.a.e(lva.ON_PAUSE);
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        this.a.a.e(lva.ON_RESUME);
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        this.a.a.e(lva.ON_STOP);
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        this.a.a.e(lva.ON_DESTROY);
        lvjVar.P().d(this);
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        this.a.a.e(lva.ON_CREATE);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        this.a.a.e(lva.ON_START);
    }
}

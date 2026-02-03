package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdmo extends fdlx {
    private final fdiu a;

    public fdmo(fdiu fdiuVar) {
        this.a = fdiuVar;
    }

    @Override // defpackage.fdlx
    public final void a(Throwable th) {
        Object objE = e().E();
        boolean z = fdkb.a;
        if (objE instanceof fdjg) {
            this.a.w(fctl.a(((fdjg) objE).b));
        } else {
            this.a.w(fdmf.b(objE));
        }
    }

    @Override // defpackage.fdlx
    public final boolean b() {
        return false;
    }
}

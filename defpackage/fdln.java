package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdln extends fdlx {
    private final fdap a;
    private final fdhw b = new fdhw(false, fdia.a);

    public fdln(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdlx
    public final void a(Throwable th) {
        if (this.b.a(false, true)) {
            this.a.invoke(th);
        }
    }

    @Override // defpackage.fdlx
    public final boolean b() {
        return true;
    }
}

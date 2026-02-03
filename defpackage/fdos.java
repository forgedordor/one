package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdos extends fdob implements fdjx, fdow {
    public fdos(fcyh fcyhVar, fdoa fdoaVar) {
        super(fcyhVar, fdoaVar);
    }

    @Override // defpackage.fdic
    protected final void k(Throwable th, boolean z) {
        if (this.b.e(th) || z) {
            return;
        }
        fdjs.b(((fdic) this).a, th);
    }

    @Override // defpackage.fdic
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        this.b.e(null);
    }
}

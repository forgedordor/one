package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxm extends fdic {
    public final fdxl b;

    public fdxm(fcyh fcyhVar) {
        super(fcyhVar, true);
        this.b = new fdxl(this);
    }

    @Override // defpackage.fdic
    protected final void k(Throwable th, boolean z) {
        this.b.c(th);
    }

    @Override // defpackage.fdic
    protected final void l(Object obj) {
        this.b.a(obj);
    }
}

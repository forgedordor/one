package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdql extends fcyz implements fdap {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdql(long j, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = j;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        throw new fdmx("Timed out waiting for ".concat(fdhi.n(this.a)));
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fdql(this.a, (fcxy) obj).b(fctx.a);
    }
}

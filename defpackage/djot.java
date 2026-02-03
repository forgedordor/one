package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djot extends fcyz implements fdat {
    final /* synthetic */ fdce a;
    final /* synthetic */ fdae b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djot(fdce fdceVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdceVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a.a) {
            this.b.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djot(this.a, this.b, fcxyVar);
    }
}

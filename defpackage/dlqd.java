package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqd extends fcyz implements fdat {
    final /* synthetic */ dlqn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlqd(dlqn dlqnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlqnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlqd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dlqn dlqnVar = this.a;
        dlqnVar.b = true;
        dlqnVar.c.d();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlqd(this.a, fcxyVar);
    }
}

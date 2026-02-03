package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awvg extends fcyz implements fdat {
    int a;
    final /* synthetic */ awvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awvg(awvh awvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awvg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        awvh awvhVar = this.b;
        this.a = 1;
        if (awvhVar.j(this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awvg(this.b, fcxyVar);
    }
}

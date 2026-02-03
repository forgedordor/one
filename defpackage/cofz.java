package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cofz extends fcyz implements fdap {
    int a;
    final /* synthetic */ cogh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cofz(cogh coghVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = coghVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cogh coghVar = this.b;
            this.a = 1;
            if (coghVar.j(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cofz(this.b, (fcxy) obj).b(fctx.a);
    }
}

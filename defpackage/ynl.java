package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynl extends fcyz implements fdat {
    int a;
    final /* synthetic */ ynm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynl(ynm ynmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ynmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ynl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fdkj.c(1000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ynl(this.b, fcxyVar);
    }
}

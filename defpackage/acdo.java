package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdo extends fcyz implements fdat {
    int a;
    final /* synthetic */ acec b;
    final /* synthetic */ dayp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acdo(acec acecVar, dayp daypVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acecVar;
        this.c = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acdo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            acec acecVar = this.b;
            lvn lvnVar = ((acdj) acecVar.b.b()).a;
            lvnVar.getClass();
            dayp daypVar = this.c;
            lvb lvbVar = lvb.e;
            acdn acdnVar = new acdn(daypVar, acecVar, null);
            this.a = 1;
            if (lwg.a(lvnVar, lvbVar, acdnVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acdo(this.b, this.c, fcxyVar);
    }
}

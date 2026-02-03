package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class datr extends fcyz implements fdat {
    int a;
    final /* synthetic */ daua b;
    final /* synthetic */ dayp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public datr(daua dauaVar, dayp daypVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dauaVar;
        this.c = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((datr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            daua dauaVar = this.b;
            lvn lvnVar = ((datn) dauaVar.b.b()).a;
            lvnVar.getClass();
            dayp daypVar = this.c;
            lvb lvbVar = lvb.e;
            datq datqVar = new datq(daypVar, dauaVar, null);
            this.a = 1;
            if (lwg.a(lvnVar, lvbVar, datqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new datr(this.b, this.c, fcxyVar);
    }
}

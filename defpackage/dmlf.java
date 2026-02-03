package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmoz b;
    final /* synthetic */ lvj c;
    final /* synthetic */ jfw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmlf(dmoz dmozVar, lvj lvjVar, jfw jfwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmozVar;
        this.c = lvjVar;
        this.d = jfwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmlf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmoz dmozVar = this.b;
            lvj lvjVar = this.c;
            jfw jfwVar = this.d;
            this.a = 1;
            if (dmozVar.l.a(lvjVar, jfwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmlf(this.b, this.c, this.d, fcxyVar);
    }
}

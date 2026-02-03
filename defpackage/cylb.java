package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cylb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cylf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cylb(cylf cylfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cylfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cylb) c((cyfv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cyfv cyfvVar = (cyfv) this.c;
            cylf cylfVar = this.b;
            this.a = 1;
            if (cylfVar.d(cyfvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cylb cylbVar = new cylb(this.b, fcxyVar);
        cylbVar.c = obj;
        return cylbVar;
    }
}

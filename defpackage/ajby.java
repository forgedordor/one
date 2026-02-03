package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajby extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajcb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajby(ajcb ajcbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajcbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajby) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajcb ajcbVar = this.b;
            ajbx ajbxVar = new ajbx(ajcbVar, null);
            this.a = 1;
            if (ajcbVar.a.a(ajbxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajby(this.b, fcxyVar);
    }
}

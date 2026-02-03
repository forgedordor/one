package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajbx extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ ajcb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbx(ajcb ajcbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajcbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajbx) c((ajbr) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ajbr ajbrVar = (ajbr) this.a;
        if ((ajbrVar.b & 1) == 0) {
            return ajbrVar;
        }
        ((ajcg) this.b.c.b()).b(ajbrVar.c);
        ajbq ajbqVar = (ajbq) ajbrVar.toBuilder();
        ajbqVar.getClass();
        ajbqVar.copyOnWrite();
        ajbr ajbrVar2 = (ajbr) ajbqVar.instance;
        ajbrVar2.b &= -2;
        ajbrVar2.c = 0;
        return ajcc.a(ajbqVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajbx ajbxVar = new ajbx(this.b, fcxyVar);
        ajbxVar.a = obj;
        return ajbxVar;
    }
}

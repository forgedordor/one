package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajbz extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ ajcb b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbz(ajcb ajcbVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajcbVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajbz) c((ajbr) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ajbr ajbrVar = (ajbr) this.a;
        ajcb ajcbVar = this.b;
        fcsu fcsuVar = ajcbVar.b;
        ajdy ajdyVar = (ajdy) fcsuVar.b();
        int iR = ((crqx) ajcbVar.d.b()).r();
        fdjx fdjxVar = ajdyVar.b;
        eizx eizxVar = ajdyVar.c;
        fdjx fdjxVarB = fdjy.b(eicg.a(fdjxVar.hE()));
        boolean z = iR == 4;
        int i = ((efwq) this.c).a;
        ejaa.a(fdjxVarB, eizxVar, new ajdq(null, ajdyVar, i, z));
        if (ajbrVar.c == i) {
            return ajbrVar;
        }
        if ((ajbrVar.b & 1) != 0) {
            ((ajcg) ajcbVar.c.b()).b(ajbrVar.c);
        }
        ajdy ajdyVar2 = (ajdy) fcsuVar.b();
        ejaa.a(fdjy.b(eicg.a(ajdyVar2.b.hE())), ajdyVar2.c, new ajdw(null, ajdyVar2, i, ajdyVar2.d.a()));
        ajbq ajbqVar = (ajbq) ajbrVar.toBuilder();
        ajbqVar.getClass();
        ajbqVar.copyOnWrite();
        ajbr ajbrVar2 = (ajbr) ajbqVar.instance;
        ajbrVar2.b |= 1;
        ajbrVar2.c = i;
        return ajcc.a(ajbqVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajbz ajbzVar = new ajbz(this.b, this.c, fcxyVar);
        ajbzVar.a = obj;
        return ajbzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anvp extends fcyz implements fdat {
    int a;
    final /* synthetic */ anvq b;
    final /* synthetic */ alqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvp(anvq anvqVar, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anvqVar;
        this.c = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        anvq anvqVar = this.b;
        alqm alqmVar = this.c;
        this.a = 1;
        Object objE = anvqVar.e(alqmVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anvp(this.b, this.c, fcxyVar);
    }
}

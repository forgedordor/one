package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbl extends fcyz implements fdat {
    int a;
    final /* synthetic */ vbv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbl(fcxy fcxyVar, vbv vbvVar) {
        super(2, fcxyVar);
        this.b = vbvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vbl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vbv vbvVar = this.b;
            vbm vbmVar = vbm.a;
            this.a = 1;
            obj = vbvVar.c.d(vbmVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new Integer(((cwtl) obj).d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vbl vblVar = new vbl(fcxyVar, this.b);
        vblVar.c = obj;
        return vblVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxp extends fcyz implements fdat {
    final /* synthetic */ aokl a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxp(fcxy fcxyVar, aokl aoklVar, String str) {
        super(2, fcxyVar);
        this.a = aoklVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aokl aoklVar = this.a;
        if (aoklVar != null) {
            return aoklVar.a(this.b);
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vxp vxpVar = new vxp(fcxyVar, this.a, this.b);
        vxpVar.c = obj;
        return vxpVar;
    }
}

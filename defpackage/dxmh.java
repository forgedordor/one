package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmh extends fcyz implements fdat {
    final /* synthetic */ dxmj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxmh(dxmj dxmjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dxmjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxmh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            return new dxfx(dxmk.b(this.a.b));
        } catch (Exception e) {
            return dxmj.k(e, 40);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxmh(this.a, fcxyVar);
    }
}

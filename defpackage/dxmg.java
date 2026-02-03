package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmg extends fcyz implements fdat {
    final /* synthetic */ dxmj a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxmg(dxmj dxmjVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dxmjVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxmg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            return new dxfx(dxmk.a(this.a.b, this.b));
        } catch (Exception e) {
            return dxmj.k(e, 41);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxmg(this.a, this.b, fcxyVar);
    }
}

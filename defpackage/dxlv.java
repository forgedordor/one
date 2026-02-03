package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlv extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxlw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxlv(dxlw dxlwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxlwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxlv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxlw dxlwVar = this.b;
        this.a = 1;
        dxmj dxmjVar = (dxmj) dxlwVar;
        Object objA = fdin.a(dxmjVar.c.hE(), new dxmh(dxmjVar, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxlv(this.b, fcxyVar);
    }
}

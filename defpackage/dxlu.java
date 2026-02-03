package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxlw b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxlu(dxlw dxlwVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxlwVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxlu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        String str = this.c;
        this.a = 1;
        dxmj dxmjVar = (dxmj) dxlwVar;
        Object objA = fdin.a(dxmjVar.c.hE(), new dxmg(dxmjVar, str, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxlu(this.b, this.c, fcxyVar);
    }
}

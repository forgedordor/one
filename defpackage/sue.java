package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sue extends fcyz implements fdat {
    int a;
    final /* synthetic */ suh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sue(fcxy fcxyVar, suh suhVar) {
        super(2, fcxyVar);
        this.b = suhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sue) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            suh suhVar = this.b;
            this.a = 1;
            obj = suhVar.c.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        sua suaVar = (sua) obj;
        return Boolean.valueOf((suaVar.b & 1) != 0 ? suaVar.c : true);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        sue sueVar = new sue(fcxyVar, this.b);
        sueVar.c = obj;
        return sueVar;
    }
}

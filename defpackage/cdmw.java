package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdnb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdmw(fcxy fcxyVar, cdnb cdnbVar) {
        super(2, fcxyVar);
        this.b = cdnbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdmw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdnb cdnbVar = this.b;
            this.a = 1;
            obj = cdnbVar.b.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int i2 = ((cdne) obj).d;
        char c = i2 != 0 ? i2 != 1 ? (char) 0 : (char) 3 : (char) 2;
        if (c == 0) {
            c = 1;
        }
        cdnb cdnbVar2 = this.b;
        return Boolean.valueOf(c == ((cdnbVar2.c.a() && cdnbVar2.d.a()) ? (char) 3 : (char) 2));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdmw cdmwVar = new cdmw(fcxyVar, this.b);
        cdmwVar.c = obj;
        return cdmwVar;
    }
}

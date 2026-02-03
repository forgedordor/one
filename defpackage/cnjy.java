package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnjy extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnjz b;
    final /* synthetic */ ezjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnjy(cnjz cnjzVar, ezjj ezjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnjzVar;
        this.c = ezjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnjy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        cnjz cnjzVar = this.b;
        ezjj ezjjVar = this.c;
        this.a = 1;
        if (cnjzVar.b.b(ezjjVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnjy(this.b, this.c, fcxyVar);
    }
}

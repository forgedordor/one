package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypy extends fcyz implements fdat {
    int a;
    final /* synthetic */ yqa b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypy(fcxy fcxyVar, yqa yqaVar) {
        super(2, fcxyVar);
        this.b = yqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yqa yqaVar = this.b;
            ypz ypzVar = new ypz(yqaVar, null);
            this.a = 1;
            if (fdpy.b(yqaVar.g, ypzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ypy ypyVar = new ypy(fcxyVar, this.b);
        ypyVar.c = obj;
        return ypyVar;
    }
}

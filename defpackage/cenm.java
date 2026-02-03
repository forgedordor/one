package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenm extends fcyz implements fdat {
    int a;
    final /* synthetic */ ceno b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cenm(ceno cenoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cenoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cenm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ceno cenoVar = this.b;
            this.a = 1;
            Object objA = fdin.a(eicg.a(cenoVar.c), new cenl(null, cenoVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cenm(this.b, fcxyVar);
    }
}

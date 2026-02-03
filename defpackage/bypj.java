package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bypj extends fcyz implements fdat {
    int a;
    final /* synthetic */ bypl b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bypj(bypl byplVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = byplVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bypj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bypl byplVar = this.b;
            long j = this.c;
            this.a = 1;
            Object objA = fdin.a(eicg.a(byplVar.f), new bypk(null, byplVar, j), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bypj(this.b, this.c, fcxyVar);
    }
}
